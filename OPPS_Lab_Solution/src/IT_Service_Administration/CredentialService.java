package IT_Service_Administration;

import java.util.Random;

public class CredentialService {
	public String generateEmailAddress(Employee employee) {
		String company="greatLearning.com";
		String email = employee.getFirstname()+employee.getLastname()+"@"+employee.getDepartment()+"."+company;
		employee.setEmail(email);
		 return email;
	}

	//Method to Create Password
	public char[] generatePassword(int length) {
		String capitalCaseLetters = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
	      String lowerCaseLetters = "abcdefghijklmnopqrstuvwxyz";
	      String specialCharacters = "!@#$";
	      String numbers = "1234567890";
	      String combinedChars = capitalCaseLetters + lowerCaseLetters + specialCharacters + numbers;
	      Random random = new Random();
	      char[] password = new char[length];

	      password[0] = lowerCaseLetters.charAt(random.nextInt(lowerCaseLetters.length()));
	      password[1] = capitalCaseLetters.charAt(random.nextInt(capitalCaseLetters.length()));
	      password[2] = specialCharacters.charAt(random.nextInt(specialCharacters.length()));
	      password[3] = numbers.charAt(random.nextInt(numbers.length()));
	   
	      for(int i = 4; i< length ; i++) {
	         password[i] = combinedChars.charAt(random.nextInt(combinedChars.length()));
	      }
		return password;

	}

		
	//Method to Show Credentials
	public void ShowCredentials(Employee emp) {
		System.out.println("Dear " +emp.getFirstname()+" your generated Credentials are as follows:");
		System.out.println("email: "+emp.getEmail());
		String password1= String.valueOf(generatePassword(8));
		System.out.println("Password: "+password1);
	
	}



	}



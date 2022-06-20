package IT_Service_Administration;

import java.util.Random;
import java.util.Scanner;

public class Driver {
	
	public static void main(String[] args) {
		String firstname;
		String lastname;
		String department = null;
		try (Scanner input = new Scanner(System.in)) {
			System.out.println("Enter your first name");
			firstname=input.next();
			System.out.println("Enter Last Name:");
			lastname=input.next();
			System.out.print("Please choose the department from the following \n1.technical \n2.Admin \n3.Human Resource \n4.Legal");
			int Dep = input.nextInt();
			switch(Dep) {
			case 1:
				department="tech";
				break;
			case 2:
				department="Admin";
				break;
			case 3:
				department="Human Resource";
				break;
			case 4:
				department="Legal";
				break;
			}
		}
		Employee emp=new Employee(firstname,lastname,department);
		CredentialService empCred=new CredentialService();
		empCred.generateEmailAddress(emp);
		empCred.generatePassword(8);
		empCred.ShowCredentials(emp);
		}

}



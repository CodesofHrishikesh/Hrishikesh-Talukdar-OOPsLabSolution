package IT_Service_Administration;

	import java.util.Arrays;

	public class Employee{
		private String Firstname;
		private String Lastname;
		private String department;
		private char[] password;
		private String email;


		public Employee(String firstname, String lastname, String department) {
			super();
			this.Firstname=firstname;
			this.Lastname=lastname;
			this.department=department;


		}
		public String getFirstname() {
			return Firstname;
		}
		public void setFirstname(String firstname) {
			Firstname = firstname;
		}
		public String getLastname() {
			return Lastname;
		}
		public void setLastname(String lastname) {
			Lastname = lastname;
		}
		public String getDepartment() {
			return department;
		}
		public void setDepartment(String department) {
			this.department = department;
		}
		public char[] getpassword() {
			return password;
		}
		public void setpassword(char[] password) {
			this.password = password;
		}
		public String getEmail() {
			return email;
		}
		public void setEmail(String email) {
			this.email = email;
		}
		@Override
		public String toString() {
			return "Employee [Firstname=" + Firstname + ", Lastname=" + Lastname + ", department=" + department
					+ ", password=" + Arrays.toString(password) + ", email=" + email + "]";
		}


		}



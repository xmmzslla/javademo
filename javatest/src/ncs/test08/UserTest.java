package ncs.test08;

public class UserTest {
	
	public static void main(String[] args) {
		User[] users = new User[3];
		 users[0] = new User("user01", "pass01", "김철수", 32, 'M', "010-1234-5678");
		 users[1] = new User("user02", "pass02", "이영희", 25, 'F', "010-5555-7777");
		 users[2] = new User("user03", "pass03", "황진희", 20, 'F', "010-9874-5632");
		 
		 System.out.println("users list -------------------------------------------------------------------");
		 for(int i = 0 ; i < users.length ; i++)
			 System.out.println(users[i].toString());
		 
		 System.out.println("copyUser -------------------------------------------------------------------");
		 for(User uu : users)
			 System.out.println(uu.toString());
		 
		
	}//m()

}//c

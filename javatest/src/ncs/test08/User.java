package ncs.test08;

public class User {
	String id;
	String password;
	String name;  
	int age;
	char gender;
	String phone;
	
	 public User() {
		 
	 }

	public User(String id, String password, String name, int age, char gender, String phone) {
		super();
		this.id = id;
		this.password = password;
		this.name = name;
		this.age = age;
		this.gender = gender;
		this.phone = phone;
	}
	 
	public String toString() {
		return String.format("%s %s %s %d %c %s", id, password, name, age, gender, phone); 
	}
	 
	 

}

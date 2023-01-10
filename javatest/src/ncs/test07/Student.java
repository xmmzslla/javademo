package ncs.test07;

public class Student extends Human{
	String number;
	String major;
	
	Student() {
		
	}
	
	 Student(String name,int age, int height,int weight,
			 String number, String major) {
		 super();
			this.name = name;
			this.age = age;
			this.height = height;
			this.weight = weight;
			this.number = number;
			this.major = major;
	 }
	 
	 @Override
	public String toString(){
		 return String.format("%s %d %d %d %s %s", name, age, height, weight, number, major);
	}
	 
	 


}

package java009_inheritance.part04;

public class Sun extends Parent {
	String dept;
	
	public Sun() {
		
	}
	
    public Sun(String name, int age, String dept) {
		super(name, age); //생성자 호출은 다른 문장보다 위에 써야함
		this.dept = dept;
	}
    
    public String toString() {
    	return String.format("%s %d %s", name, age, dept);
    }

}

package java014_api;

abstract public class Test {
	
	public static Test getInstance() {
		return new TestExam();
	}
	
	abstract public void display();

}

//Test tt = new TestExam();
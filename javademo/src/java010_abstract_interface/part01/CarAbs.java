package java010_abstract_interface.part01;

//abstract class
abstract public class CarAbs {
	int speed;
	String color;
	
	public CarAbs() {
		
	}
	
	abstract public void word(); //추상메소드

	public void display() {
		System.out.printf("%d %s\n", speed, color);
	}
}

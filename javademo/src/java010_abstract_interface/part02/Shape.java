package java010_abstract_interface.part02;

abstract public class Shape {
	
	private int width;
	private int height;
	
	public Shape() {
	}

	public Shape(int width, int height) {
		this.width = width;
		this.height = height;
	}

	public int getWidth() {
		return width;
	}

	public int getHeight() {
		return height;
	}
	
	abstract double getArea(); //추상메소드
	
	
}

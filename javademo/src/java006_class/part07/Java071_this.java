package java006_class.part07;

public class Java071_this {
	
	public static void main(String[] args) {
		
		Product pn = new Product("s001", "공산품", 40000);
		pn.display();
		
		Product pt = new Product();
		pt.display();
		
	}

}

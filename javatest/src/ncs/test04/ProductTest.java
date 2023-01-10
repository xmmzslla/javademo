package ncs.test04;

public class ProductTest {
	
	public static void main(String[] args) {
		Product p = new Product();
		p.name = "갤럭시 s7";
		p.price = 563500;
		p.quantity = 3;
		
		System.out.println(p.information());
		System.out.println("총 구매 가격 : " + p.price * p.quantity + "원");
		
	}//m()

}//c

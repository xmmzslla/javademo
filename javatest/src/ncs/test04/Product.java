package ncs.test04;

public class Product {
	String name;
	int price;
	int quantity;

	public Product() {

	}

	public Product(String name, int price, int quantity) {
		super();
		this.name = name;
		this.price = price;
		this.quantity = quantity;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	public String information() {
		String data = "상품명 : "+ name + "\n" + "가격 : "+ price + "\n" + "수량 : "+ quantity+ "개";			
		return data;
	}

}// c

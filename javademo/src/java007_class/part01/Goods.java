package java007_class.part01;

public class Goods {
	String name; //상품명
	int price; //상품가격 
	int numberOfStock; //상품 재고
	int sold; //팔린 수량
	
	public Goods(){
		
	}

	public Goods(String name, int price, int numberOfStock, int sold) {
		this.name = name;
		this.price = price;
		this.numberOfStock = numberOfStock;
		this.sold = sold;
	}
	
	public void display() {
		System.out.printf("%-14s %8d %5d %5d\n", name, price, numberOfStock, sold);
	} //%와 14 사이에 '-'는 왼쪽 정렬임 안하면 오른쪽으로 정렬됨

}//c

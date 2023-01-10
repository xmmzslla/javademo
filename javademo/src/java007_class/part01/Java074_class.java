package java007_class.part01;
//"Nikon", 400000, 30, 50
//"sony", 450000, 20, 35
//"Fujifilm", 350000, 10, 25

public class Java074_class {
	
	public static void main(String[] args) {
		
		Goods g1 = new Goods("Nikon", 400000, 30, 50);
		g1.display();
		
		Goods g2 = new Goods("sony", 450000, 20, 35);
		g2.display();
			
		Goods g3 = new Goods("Fujifilm", 350000, 10, 25);
		g3.display();
		
		System.out.println("================================");
		
		Goods[]goods = new Goods[3]; //배열로 생성
		goods[0] = new Goods("Nikon", 400000, 30, 50);
		goods[1] = new Goods("sony", 450000, 20, 35);
		goods[2] = new Goods("Fujifilm", 350000, 10, 25);
		
		goods[0].display();
		goods[1].display();
		goods[2].display();
		
		System.out.println("================================");
		
		for(int i = 0 ; i < goods.length ; i++) {
			goods[i].display();
		}
		
		System.out.println("================================");
		
		process(goods);
	
	}//m()
	
	public static void process(Goods[] goods) {
		for(int i = 0 ; i < goods.length ; i++) {
			goods[i].display();
		}
	}
		
}//c

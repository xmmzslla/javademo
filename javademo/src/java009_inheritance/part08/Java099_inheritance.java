package java009_inheritance.part08;

public class Java099_inheritance {
	
	public static void main(String[] args) {
		
		FireEngine fe = new FireEngine();
		fe.setWater(1000);
		fe.setSpeed(100);
		fe.setColor("Red");
		fe.waterSpread();
		//System.out.println(fe.waterSpread());
		System.out.println(fe.toString());
	}//m()

}//c

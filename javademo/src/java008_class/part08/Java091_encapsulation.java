package java008_class.part08;

public class Java091_encapsulation {

	public static void main(String[] args) {
		Time time = new Time();
		time.setHour(12);
		time.setMinute(10);
		time.setSecond(20);
		
		System.out.printf("%d : %d : %d\n", time.getHour(), time.getMinute(), time.getSecond());
		
	}//m()
}//c

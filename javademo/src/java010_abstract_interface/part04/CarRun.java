package java010_abstract_interface.part04;

public interface CarRun {
	int carCount = 5; //public static final carCount = 5;
	
	//public CarRun() {}
	
	//static {System.out.println("CarRun");} //초기화를 정의할 수 없음
	
	void prn(); //public abstract
	
	//void display() {} // 구현되는 메소드도 못가짐
	
	class Sun{ //public static
		public Sun() {
			System.out.println("Sun constructor");
		}
	} //외부~는 넣을 수 있음
}

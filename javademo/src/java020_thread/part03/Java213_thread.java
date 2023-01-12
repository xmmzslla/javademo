package java020_thread.part03;

public class Java213_thread {

	public static void main(String[] args) {
	
		LifeCycle cc = new LifeCycle();
		System.out.println(cc.getState()); //NEW
		
		cc.start();
		
		try {
			//cc 작업스레드가 종료될때까지 대기하고 있다.
			cc.join();
			
		} catch (InterruptedException e) {
		
			e.printStackTrace();
		}
		
		System.out.printf("%s %s %b\n", cc.getName(), cc.getState(), cc.isAlive());
		
		System.out.println("main end");		
				
	}//end main()

}//end classs

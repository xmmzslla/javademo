package java020_thread.part03;

import java.util.Map;

public class LifeCycle extends Thread{
   public LifeCycle() {

  }
   
   @Override
	public void run() {
	   System.out.println(getState());
	  
	}
}

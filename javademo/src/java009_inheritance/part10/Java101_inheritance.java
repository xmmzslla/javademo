package java009_inheritance.part10;

/*
 ---TV 현재 상태---
전원:true
채널:8
볼륨:10
****************************************
---TV 현재 상태---
전원:true
채널:10
볼륨:15
IP:192.68.24.1
 * 
 */
public class Java101_inheritance {

	public static void main(String[] args) {
		BasicTv btv = new BasicTv();
		btv.isPowerOn = true;
		btv.channel = 8;
		btv.volume = 10;
		btv.display();
		
		System.out.println("****************************************");
		SmartTv stv = new SmartTv();
		stv.isPowerOn = true;
		stv.channel = 10;
		stv.volume = 15;
		stv.ip = "192.68.24.1";
		stv.display();
	
	}//end main()

}//end class

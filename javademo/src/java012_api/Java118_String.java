package java012_api;

/*
 * [출력결과]
 * ip : 127.0.0.1
 * port : 8080
*/

public class Java118_String {
	public static void main(String[] args) {
		String sn = "127.0.01 : 8080";
		
		System.out.println("ip : " + sn.substring(0, 8));
		System.out.println("port : "+ sn.substring(11));
		
		System.out.println("=============================");
		
		int index = sn.indexOf(":");
		System.out.println("ip : " + sn.subSequence(0, index));
		System.out.println("port : " + sn.substring(index + 1));
		
		System.out.println("=============================");
		
		String[] data = sn.split(":");
		System.out.println("ip : " + data[0]);
		System.out.println("port : " + data[1]);
	}//m()

}//c

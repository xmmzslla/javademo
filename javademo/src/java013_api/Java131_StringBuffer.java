package java013_api;

public class Java131_StringBuffer {
	
	public static void main(String[] args) {
		StringBuffer sb = new StringBuffer("java test");
		display(sb.toString().toCharArray()); 
		//display(sd)를 char 배열로 넘겨줘야하기 때문에 .toString().toCharArray()로 만듬
		
	}//m()
	
	public static void display(char[]data) {
		for(char cn : data) {
			System.out.println(cn);
		}
	}

}//c

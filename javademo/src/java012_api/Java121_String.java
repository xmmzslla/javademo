package java012_api;

/*
 * API(Application Programming Interface)
 * 
 * [출력결과]
 * java jps spring
*/

public class Java121_String {

	public static void main(String[] args) {
		String stn = new String("java_jps_Spring");
		char data[] = stn.toCharArray();
		System.out.println(process(data));
	}// m()

	public static char[]process(char[] arr){
		//'_'를 ' '으로 변환 후 리턴하는 프로그램 구현
    for(int i = 0 ; i < arr.length ; i++) {
    	if(arr[i] == '_') {
    		arr[i] = ' ';
    	}
    }
		return arr;
	}

}// c

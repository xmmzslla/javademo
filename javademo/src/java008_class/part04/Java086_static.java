package java008_class.part04;

/*
 * javac -d . Java086_arge.java
 * java java008_static_access.part04.Java086_args hello world 2022
*/
public class Java086_static {

	public static void main(String[] args) {
//		System.out.println(args[0]);
//		System.out.println(args[1]);
//		System.out.println(args[2]);
		
//		for(int i = 0 ; i < args.length ; i++) {
//			System.out.println(args[i]);
//		}
		
		for(String data : args){//개선된 반복문
			System.out.println(data);
		}
	}//m()

}//c

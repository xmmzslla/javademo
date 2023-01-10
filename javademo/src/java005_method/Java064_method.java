package java005_method;

public class Java064_method {

	public static void main(String[] args) {
		char[] data = new char[] { 'a', 'b', 'c' };
		System.out.println(data); //abc
		System.out.printf("%s\n", data); //[C@357246de
		System.out.println("data=" + data); //data=[C@357246de

		int[] num = new int[] { 1, 2, 3 };
		System.out.println(num); //[I@28f67ac7
	}// end main()

}// end class

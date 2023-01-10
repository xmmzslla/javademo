package java012_api;

public class Java116_String {

	public static void main(String[] args) {
		String sn = "java";
		String sg = "java";

		String st = new String("java");
		String ss = new String("java");

		// 주소비교
		System.out.printf("sn == sg : %b\n", sn == sg); //T
		System.out.printf("st == ss : %b\n", st == ss); //F
		
		//메모리에 저장된 문자열 비교
		System.out.printf("sn.equals(sg) : %b\n", sn.equals(sg)); //T
		System.out.printf("st.equals(ss) : %b\n", st.equals(ss)); //T
	
	//메모리에 저장된 문자열 리턴
		System.out.println(sn.toString()); //문자열에 오버로딩한 뭐를 가져옴 = toString
		System.out.println(sn);
	
	}// m()

}// c

//오브젝트에서 equals는 객체를 비교하는 것(주소)
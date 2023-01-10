package java012_api;

public class Java115_String {
	
	public static void main(String[] args) {
		char[] data = {'j', 'a', 'V', 'A'};
		MyString mString = new MyString(data);
		System.out.println(mString.length());
		System.out.println(mString.isUpperCase(2)); //(배열2= 3번째)가 대문자면 - true
		System.out.println(mString.isLowerCase(0)); //0번째가 소문자면 - true
		System.out.println(mString.charAt(0)); //0번째에 뭐가있는지 보여줌
		System.out.println(mString.toString());
		System.out.println(mString);
	}

}

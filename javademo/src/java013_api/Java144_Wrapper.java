package java013_api;

/*
 * 1. 기본자료형을 클래스로 정의해 놓은 것은 Wrapper라 한다.
 * char        -> Character
 * byte        -> Byte 
 * short       -> Short
 * int         -> Intger
 * long        -> Long
 * float       -> Float
 * double      -> Double
 * boolean     -> Boolean
 * 
 * 2.메모리에 저장된 값을 다른 자료형으로 변환해주는 메소드를 제공하기 위해서
 * Wrapper클래스를 제공한다.
 * 
 * 3.auto boxing과 auto nuboxing은 jdk5.0에서 추가된 기능이다.
 *   auto boxing => 스택 -> 힙 영역에 복사
 *   auto unboxing => 힙 -> 스택 영역에 복사
 * 
*/
public class Java144_Wrapper {
	public static void main(String[] args) {

		String data = "123"; // "123.5" 소수점아님 특수문자로 인식함

		// Integer <- String
		Integer it = new Integer(data); // jdk9.0 deprecated

		// int <- Integer
		int num = it.intValue();
		System.out.println(num);

		//////////////////////////////////////

		// Integer <- String
		Integer ig = Integer.valueOf(data);

		// int <- Integer
		int num2 = ig.intValue();
		System.out.println(num2);

		//////////////////////////////////////

		// int <- String
		int num3 = Integer.parseInt(data);
		System.out.println(num3);

		//////////////////////////////////////

		// Double <- String
		Double de = new Double(data);
		// Double <- Double
		double val = de.doubleValue();
		System.out.println(val);

		//////////////////////////////////////

		// Double <- String
		Double db = Double.valueOf(data);

		// double <- Double
		double va12 = db.doubleValue();
		System.out.println(va12);

		//////////////////////////////////////

		Integer ir = Integer.valueOf(data);

		// int <- Integer
		int pro = ir; // auto unboxing(stack <- heap)
		System.out.println(pro);

		//////////////////////////////////////

		int chk = 456;
//		Integer ik = new Integer(chk);
//		Integer ik = Integer.valueOf(chk);
		Integer ik = chk; // autp boxing(heap <- stack)
		System.out.println(ik);

		// cannot convert from int to Short
		// Double dk = chk; //타입이 안맞아서 안됨

		// cannot convert from int to Short
		// Short st = chk; //타입이 안맞아서 안됨

		//////////////////////////////////////

		Double du = Double.valueOf(data);

		double da = du;
		System.out.println(da);
		
		int x = du.intValue();
		System.out.println(x);
		
		// cannot convert from int to Short
		// int x2 = du;
		// System.out.println(x2);

		//////////////////////////////////////
		
		boolean bn = Boolean.parseBoolean("true");
		System.out.println(bn);
		
		bn = Boolean.parseBoolean("false");
		System.out.println(bn);
		
		Boolean ba = new Boolean(true);
		String sa = ba.toString();
		System.out.println(sa);
		
		String sk = String.valueOf(true);
		System.out.println(sk);
		
	}// m()

}// c

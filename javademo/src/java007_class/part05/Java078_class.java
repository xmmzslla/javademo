package java007_class.part05;

/*
 * [출력결과]
 *기업은행 42523 - 52325 100000
 *하나은행 52253 - 22623 153000
 *신한은행 16239 - 95235 256000
 *총납입액 : 509000
*/
public class Java078_class {
	
	public static void main(String[] args) {
		
		Creditcard[]cc = null;
		cc = new Creditcard[3];
		cc[0] = new Creditcard("기업은행", "42523 - 52325", 100000);
		cc[1] = new Creditcard("하나은행", "52253 - 22623", 153000);
		cc[2] = new Creditcard("신한은행", "16239 - 95235", 256000);
		
		process(cc);
		
	}//m()

	public static void process(Creditcard[]cc) {
		
		int sum = 0;
		for(int i = 0 ; i < cc.length ; i++) {
			sum += cc[i].pay;
			System.out.println(cc[i].toString());
		}
		
		System.out.println("총납입액 : " + sum);
	
	}//p()
	
}//c

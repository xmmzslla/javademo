package java007_class.part06;

public class Java079_overloading {
	
	public static void main(String[] args) {
		Calculator cal = new Calculator();
		cal.addValue(4, 8);
		cal.addValue(2, 7, 5);
		cal.addValue(1.0, 2.0); //double 값임
		cal.addValue(1.2f, 4.5f); //float 자동 형변환됨
		cal.addValue(1L, 2L); //long타입이지만 double에 의해 처리됨
		//cal.addValue(1L); - 출력방식이랑 달라서 안됨
		
	}//m()

}//c

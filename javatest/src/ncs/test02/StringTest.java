package ncs.test02;

public class StringTest {

	public static void main(String[] args) {
		
		String str = new String("1.22,4.12,5.93,8.71,9.34");
		
//		 double data[]= new double[5];
		double sum = 0;
		 double average = 0;
		 double data[] = {1.22, 4.12, 5.93, 8.71, 9.34};
		 
		 // str에서 데이터를 분리한다.
		 String[] st = str.split(","); 
		 for(int i = 0 ; i < st.length ; i++){
			sum += data[i];
			average = sum / data.length;
		 }
		 System.out.printf("합계 : %.3f\n", sum);
		 System.out.printf("평균 : %.3f", average);
		 
		 
		
		
		
		
	}// m()

}// c

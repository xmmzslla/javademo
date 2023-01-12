package java016_stream;

import java.io.IOException;
import java.io.InputStream;

/*
 * carriage return : 줄의 처음으로 이동(13)
 * line feed : 다음 줄로 이동(10)
 */
public class Java162_stream {

	public static void main(String[] args) {
		System.out.print("데이터 입력:");
		InputStream is  = System.in;
		int data;
		
		try {
			while((data = is.read()) != 13)
				System.out.println((char)data);
		//	 System.out.println(is.read());
		//  System.out.println(is.read());
		//	System.out.println(is.read());
		//	System.out.println(is.read());
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			//stream 연결 종료(자원 반납)
			try {
				is.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}		
	}//end main()

}//end class

package java016_stream;

import java.io.IOException;
import java.io.InputStream;

public class Java {
	public static void main(String[] args) {

		System.out.print("데이터 입력 : ");
		InputStream is = System.in;
		try {
			int line = is.read();
			System.out.println(line);
			System.out.println((char) line);
		} catch (IOException e) {
			e.printStackTrace();
		}

	}
}

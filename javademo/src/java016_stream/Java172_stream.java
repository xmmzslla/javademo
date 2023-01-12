package java016_stream;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Java172_stream {

	public static void main(String[] args) throws FileNotFoundException {
		// File file = new File("src/java016_stream/temp");
		// File file = new File("src/java016_stream/a/b");

//		if(file.isDirectory()) {
//		    file.delete();
//			
//			//file.deleteOnExit();
//			System.out.println("폴더 삭제");
//		}else {
//			System.out.println("폴더 없음");
//		}

///////////////////////////////////////////////////////////////////////////////////////
		File file = new File("src/java016_stream/sample.txt");
	    //file.delete();
		//시스템이 종료될때 지정된 파일(sample.txt)을 삭제한다.
		file.deleteOnExit();
		Scanner sc = new Scanner(file);
		System.out.println(sc.nextLine());
		sc.close();

	}// end main()

}// end class

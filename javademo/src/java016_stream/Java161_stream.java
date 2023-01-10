package java016_stream;

import java.io.IOException;
import java.io.InputStream;

/*
 * * 입출력 스트림
1 java.io.*; 패키지에서 제공한다.
   줄줄흐르다, 줄을지어 이어지다, 줄기, 개울, 시내
2 스트림 : 한 쪽에서 보내준 입력 데이터를 다른 한쪽으로
   출력하는 데이터의 흐름(순서가 있는 데이터의 흐름)

3 자바에서 스트림은 순서 있는 데이터의 일방적인 흐름
4 스트림 종류
   1) 입력/출력
      입력 스트림 : InputStream, Reader  -InputStream,OutputStream =>한바이트로 처리
      출력 스트림 : OutputStream, Writer -Reader,Writer => 문자, 2바이트 16비트
      
   2)처리 단위로 구분
     바이트 스트림 : 바이트 , 배열바이트, 정수바이트
     문자 스트림 : 문자, 배열문자, 문자열

   3)기능에 따라
    데이터 싱크 스트림(데이터 전달 기능)-목적지에 직접연결        
     FileInput(Output)Stream, ByteArrayInput(Output)Stream
     데이터 처리 스트림(데이터의 조작 기능)-목적지에 간접연결
     BufferedInput(Output)Stream
*/
public class Java161_stream {
	
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
		
		
	}//m()

}//c



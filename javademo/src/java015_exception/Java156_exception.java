package java015_exception;

import jdk.jshell.spi.ExecutionControl.ExecutionControlException;

public class Java156_exception {

	public static void main(String[] args) {
		
		String data1 = "a";
		String data2 = "0";
		
		try {
		int x = Integer.parseInt(data1);
		int y = Integer.parseInt(data2);
		int res = x/y;
		System.out.println(res);
		}catch(ArithmeticException ex) {
			System.out.println(ex.toString());
		}catch(NumberFormatException ex) {
			System.out.println(ex.toString());
		}catch(RuntimeException ex) {
			System.out.println(ex.toString());
		}catch(Exception ex) {
			System.out.println(ex.toString());
		}
		
//		catch 순서 바꿔도 가능
//		Run타임을 알키밋이랑 넘버가 상속받은거라 중복됨 그래서 제일 위에 가면 안됨 아래에 놓아야함
		
	}// m()

}// c

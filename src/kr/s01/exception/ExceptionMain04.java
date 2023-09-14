package kr.s01.exception;

import java.io.IOException;

public class ExceptionMain04 {
	
	public void printData() throws IOException{
		
	}
	public static void main(String[] args) {
		ExceptionMain04 ex = new ExceptionMain04();
		try {
			ex.printData();
		}catch(IOException e) {
			System.out.println("입력시 오류 발생");
		}
	}
}

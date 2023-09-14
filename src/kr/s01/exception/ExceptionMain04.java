package kr.s01.exception;

import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;

public class ExceptionMain04 {
	
	public void printData() throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.print("단 입력:");
		int dan = Integer.parseInt(br.readLine());
		System.out.println(dan + "단");
		System.out.println("----------------");
		for(int i=1;i<=9;i++) {
			System.out.println(dan + "*" + i + "=" + dan*i);
		}
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

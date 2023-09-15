package kr.s02.collections.list;

import java.util.ArrayList;

public class ArrayListMain03 {
	public static void main(String[] args) {
		ArrayList list = new ArrayList();
		list.add("홍길동"); //String -> Object
		list.add("김유신"); //String -> Object
		list.add(1000); //Integer -> Object
		list.add("박문수"); //String -> Object
		
		//반복문을 이용한 요소의 출력
		for(int i=0;i<list.size();i++) {
			String name = (String)list.get(i);
			System.out.println(name);
		}
	}
}

package kr.s11.enumtest;

enum Gender{
	MALE, FEMAIL; // ; 꼭 들어가야됨 (앞쪽의 EnumMain 에서는 생략가능하지만)
	
	//Object의 toString 재정의
	@Override
	public String toString() {
		switch(this) { //this : MALE, FEMAIL을 반환
		case MALE:
			return "남자";
		default:
			return "여자";
		}
	}
}

public class EnumMain04 {
	public static void main(String[] args) {
		System.out.println(Gender.MALE);
		System.out.println(Gender.FEMAIL);
		System.out.println("------------------------");
	
		System.out.println(Gender.MALE.toString());
		System.out.println(Gender.FEMAIL.toString());
	}
}

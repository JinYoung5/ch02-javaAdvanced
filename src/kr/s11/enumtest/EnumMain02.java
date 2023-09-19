package kr.s11.enumtest;

//열거형은 상수를 가지고 생성되는 객체  Enum 은 상수를 많이 사용할 때 이용. 많이 사용 안할 때는 굳이 사용안함.
enum Lesson{
	JAVA,JSP,ORACLE
}
public class EnumMain02 {
	public static void main(String[] args) {
		System.out.println(Lesson.JAVA);
		System.out.println(Lesson.JSP);
		System.out.println(Lesson.ORACLE);
		System.out.println("------------------------");
		
		//열거 객체의 문자열을 반환
		System.out.println(Lesson.JAVA.name());
		System.out.println(Lesson.JSP.name());
		System.out.println(Lesson.ORACLE.name());
		
		//열거 객체의 순번(0부터 시작)을 반환
		System.out.println(Lesson.JAVA.ordinal());
		System.out.println(Lesson.JSP.ordinal());
		System.out.println(Lesson.ORACLE.ordinal());
		
	}
}

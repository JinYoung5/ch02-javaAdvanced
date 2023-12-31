package kr.s02.collections.list3;

import java.util.ArrayList;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class MemberMain {
	/*
	 * [실습]
	 * 1.멤버변수 : ArrayList<Member>, BufferedReader 지정
	 * 2.생성자에서 ArrayList,BufferedReader 생성, callMenu 호출
	 * 3.멤버메서드 : callMenu, register(회원정보입력),printUserInfo(회원정보출력)
	 */

	private ArrayList<Member> list;
	private BufferedReader br;

	public MemberMain() {
		list = new ArrayList<Member>();
		try {
			br = new BufferedReader(new InputStreamReader(System.in));
			callMenu();
		}catch(Exception e) {
			e.printStackTrace();
		}finally {
			if(br!=null)try {br.close();}catch(IOException e) {}
		}
	}

	//메뉴
	public void callMenu() throws IOException {
		while (true) {
			System.out.println("1.회원정보입력, 2.회원정보출력, 3.종료>");
			try {
				int num = Integer.parseInt(br.readLine());
				if(num == 1) { //회원정보 입력
					resister();
				}else if(num == 2) { //회원정보 출력
					printUserInfo();
				}else if(num == 3) { //종료
					System.out.println("종료."); break;
				}else {
					System.out.println("잘못 입력 했습니다.");
				}
			}catch(NumberFormatException e) {
				System.out.println("[숫자만 입력가능!]");
			}
		}
	}

	//회원가입
	public void resister() throws IOException{
		Member mb = new Member();

		System.out.print("이름입력:");
		mb.setName(br.readLine());

		//나이는 1살 이상 입력 가능
		mb.setAge(parseInputData("나이 입력 :"));

		System.out.print("직업입력:");
		mb.setJob(br.readLine());

		System.out.print("주소입력:");
		mb.setAddress(br.readLine());

		System.out.print("핸드폰번호입력:");
		mb.setPhone(br.readLine());

		//Member를 ArrayList에 저장
		list.add(mb);

		System.out.println("회원정보 1건이 추가되었습니다");
	}
	//나이 체크
	public int parseInputData(String item)throws IOException{
		while(true) {
			System.out.print(item);
			try {
				int age = Integer.parseInt(br.readLine());
				if(age<=0) {
					System.out.println("나이는 1살 이상 입력 가능");
					continue;
				}
				return age;
			}catch(NumberFormatException e) {
				System.out.println("[숫자만 입력하세요]");
			}
		}
	}

	//회원정보출력
	public void printUserInfo() {
		System.out.println("총 회원수(" + list.size()+")");
		System.out.println("---------------------------------");
		System.out.println("이름\t나이\t직업\t주소\t전화번호");
		System.out.println("---------------------------------");
		for(Member m : list) {
			System.out.print(m.getName() + "\t");
			System.out.print(m.getAge() + "\t");
			System.out.print(m.getJob() + "\t");
			System.out.print(m.getAddress() + "\t");
			System.out.println(m.getPhone());

		}
	}

	public static void main(String[] args) {
		new MemberMain();

	}
}


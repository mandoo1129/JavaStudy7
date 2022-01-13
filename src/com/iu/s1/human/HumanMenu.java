package com.iu.s1.human;

import java.util.ArrayList;
import java.util.Scanner;

public class HumanMenu {
	
	
	
	//접근지정자 [그외지정자] 리턴타입 메서드명([매개변수 선언들..]) {
	public void select() {
		Scanner sc = new Scanner(System.in);
		HumanService hs = new HumanService();
		ArrayList<HumanDTO> ar = new ArrayList<>();
		boolean check=true;
		while(check) {
			System.out.println("1. 전체 출력");
			System.out.println("2. 정보 검색");
			System.out.println("3. 명단 추가");
			System.out.println("4. 명단 삭제");
			System.out.println("5. 종    료");
			int select = sc.nextInt();
			
			if(select==1) {
				System.out.println("11111");
			}else if(select==2) {
				System.out.println("22222");
			}else if(select==3) {
				System.out.println("33333");
				HumanDTO humanDTO = hs.addHuman();
				ar.add(humanDTO);
				System.out.println(ar);
			}else if(select==4) {
				System.out.println("44444");
			}else {
				System.out.println("Finish");
				break;
			}
		}
	}

}
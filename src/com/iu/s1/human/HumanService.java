package com.iu.s1.human;

import java.util.List;
import java.util.Scanner;

public class HumanService {
	
	private Scanner sc;
	
	public HumanService() {
		sc = new Scanner(System.in);
	}
	
	public HumanDTO searchHuman(List<HumanDTO> ar) {
		System.out.println("이름 입력");
		String name = sc.next();
		
		HumanDTO humanDTO = null;
		
		for(int i=0;i<ar.size();i++) {
			if(name.equals(ar.get(i).getName()))	{
				humanDTO = ar.get(i);
				break;
			}
		}
		
		return humanDTO; //못 찾으면 humanDTO는 null인 상태로 감
		
	}
	//키보드로부터 이름을 입력 받아서 같은 이름이 있는 HumanDTO 찾아서 리턴
	
	public HumanDTO addHuman() {
		HumanDTO humanDTO = new HumanDTO();
		System.out.println("이름 입력");
		humanDTO.setName(sc.next());
		System.out.println("별명 입력");
		humanDTO.setNick(sc.next());
		System.out.println("이메일 입력");
		humanDTO.setEmail(sc.next());
		System.out.println("전화번호 입력");
		humanDTO.setPhone(sc.next());
		System.out.println("생일 입력");
		humanDTO.setBirth(sc.next());
		return humanDTO;
	}

}
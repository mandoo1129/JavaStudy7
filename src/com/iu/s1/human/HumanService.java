package com.iu.s1.human;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.List;
import java.util.Scanner;

public class HumanService {
	
	private Scanner sc;
	
	public HumanService() {
		sc = new Scanner(System.in);
	}
	
	//이름을 입력 받아서 같은 이름이 있는 HumanDTO의 인덱스 번호 찾기
	//찾아서 삭제
	//삭제여부를 리턴 0:성공, 1:실패, S:성공, F:실패, true:성공, false:실패
	
	//키보드로부터 이름을 입력 받아서 같은 이름이 있는 HumanDTO 찾아서 리턴

	public boolean deleteHuman(List<HumanDTO> ar) {
		System.out.println("이름 입력");
		String name = sc.next();
		
		boolean result = false;
		HumanDTO humanDTO = null; //삭제가 실패하면 null로 리턴
		for(int i = 0;i<ar.size();i++) {
			if(name.equals(ar.get(i).getName())) {
				humanDTO = ar.get(i);
				result = ar.remove(ar.get(i));
//				humanDTO = ar.remove(i);
//				result = true;
				break;
			}
		}
		return ar.remove(humanDTO); //result;
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
		System.out.println("생일 입력"); //20001224
		String s = sc.next();
		int year = Integer.parseInt(s.substring(0,4));
		int month = Integer.parseInt(s.substring(4,6));
		int date = Integer.parseInt(s.substring(6));
		
		Calendar calendar = Calendar.getInstance();
		calendar.set(year, month-1, date, 0,0,0);
		
		humanDTO.setBirth(calendar);
		
		return humanDTO; //호출한 곳으로 감
	}

}
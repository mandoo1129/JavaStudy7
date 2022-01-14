package com.iu.s1.human;

import java.util.List;

public class HumanView {
	//한사람의 정보를 출력하는 메서드
	//정보가 있으면 출력, 없으면 정보가 없음 출력
	public void view(HumanDTO humanDTO) {
		
		if(humanDTO !=null) {
			System.out.println("Name: "+ humanDTO.getName());
			System.out.println("Nickname: "+ humanDTO.getNick());
			System.out.println("Email: " + humanDTO.getEmail());
			System.out.println("Phone: "+ humanDTO.getPhone());
			System.out.println("Birth: " + humanDTO.getBirth());		
		}else {
			System.out.println("정보가 없다");
			
		}
	}
			
	public void view(List<HumanDTO> ar) {
	
		for(int i=0;i<ar.size();i++) {
			HumanDTO humanDTO = ar.get(i);
			System.out.println("Name: "+ humanDTO.getName());
			System.out.println("Nickname: "+ humanDTO.getNick());
			System.out.println("Email: " + humanDTO.getEmail());
			System.out.println("Phone: "+ humanDTO.getPhone());
			System.out.println("Birth: " + humanDTO.getBirth());
			
		}
		
		
	}
}

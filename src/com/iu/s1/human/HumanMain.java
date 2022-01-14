package com.iu.s1.human;

import java.util.ArrayList;
import java.util.HashMap;

public class HumanMain {

	public static void main(String[] args) {
		HumanMenu hm = new HumanMenu();
		
		hm.select();
		
		ArrayList<Integer> ar = new ArrayList<Integer>();
		ArrayList<Integer> ar2 = new ArrayList<Integer>();
		
		HashMap<String, ArrayList<Integer>> map = new HashMap<String, ArrayList<Integer>>();
		map.put("a", ar);
		map.put("b", ar2);
		
		
	}

}
package com.davis.level.easy;

import java.util.ArrayList;
import java.util.List;

public class PascalTriangle_118 {

	public static List<List<Integer>> generate(int numRows) {
		if(numRows<1){
			return new ArrayList<List<Integer>>();
		}
		
		List<List<Integer>> result=new ArrayList<List<Integer>>();
		
		List<Integer> previous=new ArrayList<Integer>();
		
		previous.add(1);
		result.add(previous);
		
		for(int i=2;i<=numRows;i++){
			List<Integer> current=new ArrayList<Integer>();
			
			current.add(1);
			
			for(int j=0;j<i-2;j++){
				current.add(previous.get(j)+previous.get(j+1));
			}
			
			current.add(1);
			
			result.add(current);
			previous=current;
		}
		
		return result;
	}

	public static void main(String[] args) {
		System.out.println(generate(0));
	}

}

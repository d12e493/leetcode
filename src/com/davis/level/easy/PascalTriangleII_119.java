package com.davis.level.easy;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class PascalTriangleII_119 {
	
	public static List<Integer> getRow(int rowIndex) {
		
		if(rowIndex<0){
			return new ArrayList<Integer>();
		}
		
		Integer[] result=new Integer[rowIndex+1];
		
		for(int i=0;i<result.length;i++){
			result[i]=1;
			if(i>1){
				for(int j=i-1;j>0;j--){
					result[j]=result[j]+result[j-1];
				}
			}
		}
		
		return Arrays.asList(result);
	}

	public static void main(String[] args) {
		System.out.println(getRow(5));
	}

}

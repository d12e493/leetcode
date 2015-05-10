package leetcode;

import java.math.BigInteger;

public class AddBinary_67 {

	public static String addBinary(String a, String b) {

		BigInteger aa=new BigInteger(a,2);
		BigInteger bb=new BigInteger(b,2);
		
		return aa.add(bb).toString(2);
	}

	public static void main(String[] args) {
		System.out.println(addBinary("1", "11"));
	}
}

package easy;

import java.util.HashMap;
import java.util.Map;

public class RomanToInteger_13 {

	static Map<String, Integer> romanMap = new HashMap<String, Integer>() {
		{
			put("I", 1);
			put("V", 5);
			put("X", 10);
			put("L", 50);
			put("C", 100);
			put("D", 500);
			put("M", 1000);
		}
	};

	public RomanToInteger_13() {

	}

	public static int romanToInt(String s) {

		if (s != null && s.length() > 0) {
			int result = 0;
			String[] strs = s.split("");
			for (int i = 0; i < strs.length; i++) {

				if (i != 0 && romanMap.get(strs[i]) > romanMap.get(strs[i - 1])) {
					result += (romanMap.get(strs[i]) - 2 * romanMap.get(strs[i - 1]));
				} else {
					result += romanMap.get(strs[i]);
				}
//				System.out.println("strs[i] : " + strs[i]);
//				System.out.println("result : " + result);
			}
			return result;
		} else {
			return 0;
		}

	}

	public static void main(String[] args) {
		String testString = "MCD";
		System.out.println("main : " + romanToInt(testString));
	}

}

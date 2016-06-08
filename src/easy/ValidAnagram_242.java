package easy;

import java.util.HashMap;
import java.util.Map;

public class ValidAnagram_242 {

	public static boolean isAnagram(String s, String t) {

		if (s != null && t != null) {
			if (s.length() != t.length()) {
				return false;
			}

			// 計算各字母數量的map
			Map<Character, Integer> sourceMap = new HashMap<Character, Integer>();

			for (int i = 0; i < s.length(); i++) {
				char eachChar = s.charAt(i);

				sourceMap.put(eachChar, sourceMap.get(eachChar) == null ? 1 : (sourceMap.get(eachChar) + 1));
			}

			for (int i = 0; i < t.length(); i++) {
				char eachChar = t.charAt(i);

				// 如果target的字串找不到，表示不符合
				if (sourceMap.get(eachChar) == null) {
					return false;
				} else {
					int eachCharCount = sourceMap.get(eachChar) - 1;
					if (eachCharCount < 0) {
						return false;
					} else if (eachCharCount == 0) {
						sourceMap.remove(eachChar);
					} else {
						sourceMap.put(eachChar, eachCharCount);
					}
				}
			}

			if (sourceMap.size() != 0) {
				return false;
			}
		}

		return true;
	}

	public static void main(String[] args) {
		String source = "ab";
		String target = "ba";
		System.out.println(isAnagram(source, target));
		
		String source1 = "car test";
		String target1 = "tar estc ";
		System.out.println(isAnagram(source1, target1));
	}

}

package leetcode;

public class ValidPalindrome_125 {

	public static boolean isPalindrome(String s) {
		if("".equals(s)){
			return true;
		}
		
		s=s.replaceAll("[^a-zA-Z0-9]", "");
		
		if(s.length()==0){
			return true;
		}
		
		int sArrayLength=s.length();
		
		String first="";
		String last="";
		
		s.substring(0, sArrayLength/2);
		s.substring(sArrayLength/2+1, sArrayLength);
		
		if(sArrayLength%2==0){
			first=s.substring(0, sArrayLength/2);
			last=s.substring(sArrayLength/2, sArrayLength);
		}else{
			first=s.substring(0, sArrayLength/2);
			last=s.substring(sArrayLength/2+1, sArrayLength);
		}
		
		last=new StringBuilder(last).reverse().toString();
		
		if(!first.equalsIgnoreCase(last)){
			return false;
		}
		
		return true;
	}

	public static void main(String[] args) {
		
//		String test1="A man, a plan, a canal: Panama";
//		String test2="race a car";
		String test3=" ";
		String test4="aa";
		
//		System.out.println("test1 : "+isPalindrome(test1));
//		System.out.println("test2 : "+isPalindrome(test2));
		System.out.println("test3 : "+isPalindrome(test3));
		System.out.println("test4 : "+isPalindrome(test4));
	}

}

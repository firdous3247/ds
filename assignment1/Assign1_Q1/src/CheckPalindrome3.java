
public class CheckPalindrome3 {
	
	public static boolean isPalindrome(String str) {
		
		StringBuilder s = new StringBuilder();
		
		for(int i = str.length() - 1; i >= 0; i--) {
			
			s.append(str.charAt(i));
		}
		return str.equals(s.toString());
	}

	public static void main(String[] args) {

        System.out.println(isPalindrome("madam"));  
        System.out.println(isPalindrome("hello"));  
    }
}

//Time Complexity: O(n)
//Space Complexity: O(n)
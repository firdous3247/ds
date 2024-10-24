
public class CheckPalindrome2 {
	
	public static boolean isPalindrome(String str) {
		
		for(int i = 0; i < str.length(); i++) {
			
			if(str.charAt(i) != str.charAt(str.length() - i - 1)) {
				
				return false;
			}
		}
		return true;
	}

	public static void main(String[] args) {
        System.out.println(isPalindrome("madam"));  
        System.out.println(isPalindrome("hello"));  
    }
}

//Time Complexity: O(n)
//Space Complexity: O(1)
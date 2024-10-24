
public class CheckPalindrome1 {
	
	public static boolean isPalindrome(String str) {
		
        String reversed = new StringBuilder(str).reverse().toString();
        
        return reversed.equals(str);
    }

	public static void main(String[] args) {
        System.out.println(isPalindrome("madam"));  
        System.out.println(isPalindrome("hello"));  
    }
}

//Time Complexity: O(n)
//Space Complexity: O(n)


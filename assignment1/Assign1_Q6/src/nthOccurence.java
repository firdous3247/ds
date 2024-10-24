
public class nthOccurence {
	
	private static int findNthOccurrence(int[] arr, int key, int n) {
		
		int count = 0;
		for(int i = 0; i < arr.length; i++) {
			
			if(key == arr[i]) {
				
				count++;
				if(count == n) {
					
					return i;
				}
			}
		}
		
		return -1;
	}

	public static void main(String[] args) {
		
        int[] arr = {1, 2, 3, 2, 4, 2, 5, 2};
        int key = 2;
        
        int n = 3; // Change this to the nth occurrence you want to find
        int index = findNthOccurrence(arr, key, n);

        if (index == -1) {
            System.out.println("The " + n + "th occurrence of key is not found.");
        } else {
            System.out.println("The " + n + "th occurrence of key is found at index " + index);
        }
    }
}

import java.util.Arrays;
import java.util.Stack;

public class reverseArray {
	
	public static void reverseArray(int[] arr) {
		
		Stack<Integer> stack = new Stack<>();
		
		for(int i = 0; i < arr.length; i++) {
			
			stack.push(arr[i]);
		}
		
		for(int j = 0; j < arr.length; j++) {
			
			arr[j] = stack.pop();
		}
	}

	public static void main(String[] args) {
		
        int[] arr = {1, 2, 3, 4, 5};
        System.out.println("Original array: " + Arrays.toString(arr));

        reverseArray(arr);
        
        System.out.println("Reversed array: " + Arrays.toString(arr));
    }
}

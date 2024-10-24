import java.util.Scanner;

public class lastOccurenceOfKey {
	
	private static int findLastOccurrence(int[] arr, int key) {
		
		int lastIndex = -1;
		
		for(int i = 0; i < arr.length; i++) {

			if(key == arr[i]) {

				lastIndex = i;
			}
		}
		return lastIndex;
	}

	public static void main(String[] args) {
		
    int arr[] = {1, 2, 3, 2, 4, 2};
    int key = 2;
    
    int lastIndex = findLastOccurrence(arr, key);

    if (lastIndex == -1) {
        System.out.println("Key is not found");
    } else {
        System.out.println("Key is found at index " + lastIndex);
    }
}
}

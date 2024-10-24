import java.util.Arrays;

public class DescendingInsertSort {
	
	public static void sortDescending(int[] arr) {

		for(int i = 1; i < arr.length; i++) {
			
			int curr = arr[i];
			int prev = i - 1;
			
			while(prev >= 0 && arr[prev] < curr) {
				
				arr[prev + 1] = arr[prev];
				prev--;
			}

			arr[prev + 1] = curr;
		}
	}
	
	public static void main(String[] args) {

		int arr[] = {55, 44, 22, 66, 11, 33};
		System.out.println("Array before sort : " + Arrays.toString(arr));

		sortDescending(arr);
		System.out.println("Array before sort : " + Arrays.toString(arr));
	}
}

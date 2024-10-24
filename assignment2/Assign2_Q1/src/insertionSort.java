import java.util.Arrays;

public class insertionSort {

	public static void sort(int[] arr) {
		
		int count = 0;

		for(int i = 1; i < arr.length; i++) {
			
			int curr = arr[i];
			int prev = i - 1;
			
			while(prev >= 0 && arr[prev] > curr) {
				
				count++;
				
				arr[prev + 1] = arr[prev];
				prev--;
			}
			
			if(prev >= 0) {
				
				count++;
			}
			
			arr[prev + 1] = curr;
		}
		System.out.println("Total no. of comparisions: " + count);
	}
	
	public static void main(String[] args) {

		int arr[] = {55, 44, 22, 66, 11, 33};
		System.out.println("Array before sort : " + Arrays.toString(arr));
		
		sort(arr);
		System.out.println("Array before sort : " + Arrays.toString(arr));
	}
}

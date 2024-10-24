
public class RankOfElement {
	
	public static int findRank(int arr[], int x) {
		
		int count = 0;
		
		for(int i = 0; i < arr.length; i++) {
			
			if(arr[i] <= x) {
				
				count++;
			}
		}
		return count;
	}

	public static void main(String[] args) {
		
		int arr[] = {10, 20, 15, 3, 4, 4, 1};
		int x = 4;
		
		int count = findRank(arr, x);
		System.out.println("Rank of " + x + ": " + count);
	}
}

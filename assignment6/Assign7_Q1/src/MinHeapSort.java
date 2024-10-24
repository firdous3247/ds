import java.util.Arrays;

public class MinHeapSort {

   
    private void heapify(int[] arr, int n, int i) {
        int smallest = i;    
        int left = 2 * i + 1; 
        int right = 2 * i + 2; 

    
        if (left < n && arr[left] < arr[smallest]) {
            smallest = left;
        }

 
        if (right < n && arr[right] < arr[smallest]) {
            smallest = right;
        }


        if (smallest != i) {
            int temp = arr[i];
            arr[i] = arr[smallest];
            arr[smallest] = temp;

           
            heapify(arr, n, smallest);
        }
    }

   
    public void heapSort(int[] arr) {
        int n = arr.length;

  
        for (int i = n / 2 - 1; i >= 0; i--) {
            heapify(arr, n, i);
        }

        
        for (int i = n - 1; i > 0; i--) {
           
            int temp = arr[0];
            arr[0] = arr[i];
            arr[i] = temp;

            
            heapify(arr, i, 0);
        }
    }

    public static void main(String[] args) {
        MinHeapSort heapSort = new MinHeapSort();

        int[] arr = {12, 11, 13, 5, 6, 7};
        System.out.println("Original array:");
        System.out.println(Arrays.toString(arr));

        heapSort.heapSort(arr);

        System.out.println("Sorted array using Min Heap Sort:");
        System.out.println(Arrays.toString(arr));
    }
}

package com.sunbeam.assignments;

import java.util.Scanner;

public class BinarySearch {
	
	public static int binarySearch(int arr[], int key) {
		int left = 0;
		int right = arr.length-1;
		
		int count = 0;
		
		while(left <= right) {
			
			int mid = (left + right) / 2; 
			count++;
			
			if(key == arr[mid]) {
				
				System.out.println("Total no of comparision: " + count);
				return mid;
			}
			else if(key < arr[mid]) {
				right = mid - 1;
			}
			else if(key > arr[mid]) {
				left = mid + 1;
			}
		}
		return -1;
	}

	public static void main(String[] args) {
		
		int arr[] = {11, 22, 33, 44, 55, 66, 77, 88, 99};
		int left = 0;
		int right = arr.length - 1;
		
		Scanner sc = new Scanner(System.in);

		System.out.print("Enter key to be searched : ");
		int key = sc.nextInt();

		int index = binarySearch(arr, key);
		if(index == -1)
			System.out.println("Key is not found");
		else
			System.out.println("Key is found at index " + index);
	}
}

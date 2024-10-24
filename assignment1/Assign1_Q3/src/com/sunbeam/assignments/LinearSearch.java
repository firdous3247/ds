package com.sunbeam.assignments;

import java.util.Scanner;

public class LinearSearch {
	
	private static int linearSearch(int[] arr, int key) {
		
		int count = 0;
		
		for(int i = 0; i < arr.length; i++) {
			
			count++;
			if(key == arr[i]) {
				
				System.out.println("No of comparisions done to search a key: " + count);
				return i;
			}
		}
		return -1;
	}

	public static void main(String[] args) {

		int arr[] = {88, 33, 66, 99, 11, 77, 22, 55, 14};
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter key to be searched : ");
		int key = sc.nextInt();
		
		int index = linearSearch(arr, key);
		if(index == -1)
			System.out.println("Key is not found");
		else
			System.out.println("Key is found at index " + index);
	}
}

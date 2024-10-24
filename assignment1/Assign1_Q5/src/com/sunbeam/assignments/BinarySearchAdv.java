package com.sunbeam.assignments;

import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class BinarySearchAdv {

//	public static int binarySearch(int arr[], int key) {
//		int left = 0;
//		int right = arr.length-1;
//		
//		while(left <= right) {
//			
//			int mid = left + (right - left) / 2; 
//			
//			if(key == arr[mid]) {
//				
//				return mid;
//			}
//			else if(key > arr[mid]) {
//				right = mid - 1;
//			}
//			else if(key < arr[mid]) {
//				left = mid + 1;
//			}
//		}
//		return -1;
//	}
	
	//my method
	public static int binarySearch(int arr[], int key) {
		int left = 0;
		int right = arr.length-1;
		
		while(left <= right) {
			
			int mid = (left + right) / 2; 
			
			if(key == arr[mid]) {
				
				return mid;
			}
			else if(key > arr[mid]) {
				right = mid - 1;
			}
			else if(key < arr[mid]) {
				left = mid + 1;
			}
		}
		return -1;
	}

	public static void main(String[] args) {
		
		int arr[] = {99, 88, 77, 66, 55, 44, 33, 22, 11};
		
		//Arrays.sort(arr);
		
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


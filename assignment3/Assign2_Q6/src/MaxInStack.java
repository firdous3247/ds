import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class MaxInStack {

	private int arr[];
	private int top;
	private final int SIZE;
	
	public MaxInStack(int size) {
		
		SIZE = size;
		arr  = new int[SIZE];
		top = -1;
	}
	
	public boolean isEmpty() {
		
		return top == -1;
	}
	
	public boolean isFull() {
		
		return top == SIZE - 1;
	}
	
	public void push(int value) {
		
		if(isFull()) {
			
			System.out.println("Stack is full");
		}
		else {
			
			top++;
			arr[top] = value;
		}
	}
	
	public int pop() {
		
		if(isEmpty()) {
			
			System.out.println("Stack is empty");
			return -1;
		}
		else {
			
			int temp = arr[top];
			top--;
			
			return temp;
		}
	}
	
	public int peek() {
		
		if(isEmpty()) {
			
			System.out.println("Stack is empty");
			return -1;
		}
		else {
			
			return arr[top];
		}
	}
	
	public int maxValue() {
		
		int max = Integer.MIN_VALUE;
				
		
		if(isEmpty()) {
			
			System.out.println("Stack is empty");
			return -1;
		}
		else {
			
			if(max < arr[top]) {
				
				max = arr[top];
			}
			System.out.println("Max value in stack: " + max);
		}
		return max;
	}
	
	public void printStack() {
        if (isEmpty()) {
            System.out.println("Stack is empty");
            return;
        }
        
        System.out.print("Stack elements (top to bottom): ");
        for (int i = 0; i <= top; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println(); 
    }
	
	public static void main(String[] args) {
		
		MaxInStack max = new MaxInStack(4);
		int choice;
		Scanner sc = new Scanner(System.in);
		
		do {
			System.out.println("0. exit\n1. push\n2. pop\n3. peek\n4. print stack\n5. print max value in stack");
			System.out.println("Enter your choice : ");
			choice = sc.nextInt();
			
			switch(choice) {
			case 1:
				System.out.println("Enter data to be inserted : ");
				int data = sc.nextInt();
				max.push(data);
				break;
				
			case 2:
				int ret = max.pop();
				System.out.println("Poped data : " + ret);
				break;
				
			case 3:
				ret = max.peek();
				System.out.println("Peeked data : " + ret);
				break;
			case 4:
				max.printStack();
                break;
			case 5:
				ret = max.maxValue();
				break;
			case 0:
				System.out.println("Exiting...");
				return;
			}	
		}while(choice != 0);
		
	}
}

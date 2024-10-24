import java.util.Scanner;

public class descendingStack {

	private int arr[];
	private int top;
	private final int SIZE;
	
	public descendingStack(int size) {
		
		SIZE = size;
		arr  = new int[SIZE];
		top = SIZE;
	}
	
	public boolean isEmpty() {
		
		return top == SIZE;
	}
	
	public boolean isFull() {
		
		return top == 0;
	}
	
	public void push(int value) {
		
		if(isFull()) {
			
			System.out.println("Stack is full");
		}
		else {
			
			top--;
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
			top++;
			
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
	
	public void printStack() {
        if (isEmpty()) {
            System.out.println("Stack is empty");
            return;
        }
        
        System.out.print("Stack elements (top to bottom): ");
        for (int i = top; i < SIZE; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println(); 
    }
	
	public static void main(String[] args) {
		
		descendingStack scla = new descendingStack(4);
		int choice;
		Scanner sc = new Scanner(System.in);
		
		do {
			System.out.println("0. exit\n1. push\n2. pop\n3. peek\n4. print stack");
			System.out.println("Enter your choice : ");
			choice = sc.nextInt();
			
			switch(choice) {
			case 1:
				System.out.println("Enter data to be inserted : ");
				int data = sc.nextInt();
				scla.push(data);
				break;
				
			case 2:
				int ret = scla.pop();
				System.out.println("Poped data : " + ret);
				break;
				
			case 3:
				ret = scla.peek();
				System.out.println("Peeked data : " + ret);
				break;
			case 4:
                scla.printStack();
                break;
			case 0:
				System.out.println("Exiting...");
				return;
			}	
		}while(choice != 0);
		
	}
}

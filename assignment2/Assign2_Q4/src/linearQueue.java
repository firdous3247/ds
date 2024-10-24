import java.util.Scanner;

public class linearQueue {

	private int arr[];
	private int front;
	private int rear;
	private final int SIZE;
	
	public linearQueue(int size) {
		
		front = rear = 0;
		SIZE = size;
		arr = new int[SIZE];
	}
	
	public boolean isEmpty() {
		
		return front == rear;
	}
	
	public boolean isFull() {
		
		return rear == SIZE;
	}
	
	public void push(int value) {
		
		arr[rear] = value;
		rear++;
	}
	
	public int pop() {
		
		int temp = arr[front];
		front++;
		
		return temp;
	}
	
	public int peek() {
		
		return arr[front];
	}
	
	public static void main(String[] args) {

		linearQueue que = new linearQueue(5);
		
		Scanner sc = new Scanner(System.in);
		int choice;
		
		do {
			
			System.out.println("1. Push");
			System.out.println("2. Pop");
			System.out.println("3. Peek");
			System.out.println("0. EXIT");
			
			System.out.println("Enter your choice: ");
			choice = sc.nextInt();
			
			switch(choice) {
			
				case 1:
					if(que.isFull()) {
						
						System.out.println("Queue is full");
					}
					else {
						
						System.out.println("Enter data to be pushed: ");
						int value = sc.nextInt();
						que.push(value);
					}
					break;
				case 2:
					if(que.isEmpty()) {
						
						System.out.println("Queue is empty");
					}
					else {
						
						System.out.println("Poped element: " + que.pop());
					}
					break;
				case 3:
					if(que.isEmpty()) {
						
						System.out.println("Queue is empty");
					}
					else {
						
						System.out.println("Peeked element: " + que.peek());
					}
					break;
				case 0:
					System.out.println("Exiting...");
					return;
			}
			
		} while(choice != 0);
	}
}

import java.util.Scanner;

public class circularQueue {
	
    private int[] arr;
    private int front;
    private int rear;
    private int count;
    private final int SIZE;

    public circularQueue(int size) {
    	
        SIZE = size;
        arr = new int[SIZE];
        front = 0;
        rear = -1;
        count = 0;
    }

    public boolean isEmpty() {
    	
        return count == 0;
    }

    public boolean isFull() {
    	
        return count == SIZE;
    }

    public void enqueue(int value) {
    	
        if (isFull()) {
        	
            System.out.println("Queue is full");
            return;
        }
        rear = (rear + 1) % SIZE; 
        arr[rear] = value;
        count++;
        System.out.println("Enqueued: " + value);
    }

    public int dequeue() {
    	
        if (isEmpty()) {
        	
            System.out.println("Queue is empty");
            return -1; 
        }
        int value = arr[front];
        front = (front + 1) % SIZE; 
        count--;
        System.out.println("Dequeued: " + value);
        return value;
    }

    public int peek() {
    	
        if (isEmpty()) {
        	
            System.out.println("Queue is empty");
            return -1; 
        }
        return arr[front];
    }

    public void printQueue() {
    	
        if (isEmpty()) {
        	
            System.out.println("Queue is empty");
            return;
        }
        
        System.out.print("Queue elements: ");
        for (int i = 0; i < count; i++) {
        	
            System.out.print(arr[(front + i) % SIZE] + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
    	
        circularQueue queue = new circularQueue(5);
        Scanner sc = new Scanner(System.in);
        int choice;

        do {
            System.out.println("0. Exit\n1. Enqueue\n2. Dequeue\n3. Peek\n4. Print Queue");
            System.out.print("Enter your choice: ");
            choice = sc.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter value to enqueue: ");
                    int data = sc.nextInt();
                    queue.enqueue(data);
                    break;
                case 2:
                    queue.dequeue();
                    break;
                case 3:
                    int frontValue = queue.peek();
                    System.out.println("Front value: " + frontValue);
                    break;
                case 4:
                    queue.printQueue();
                    break;
                case 0:
                    System.out.println("Exiting...");
                    break;
                default:
                    System.out.println("Invalid choice");
            }
        } while (choice != 0);
    }
}

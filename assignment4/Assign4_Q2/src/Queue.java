
public class Queue {

	static class Node {
		
		private int data;
		private Node next;
		private Node prev;
		
		public Node(int value) {
			
			data = value;
			next = prev = null;
		}
	}
	
	private Node front;
	private Node rear;
	
	public Queue() {
		
		front = null;
		rear = null;
	}
	
	public boolean isEmpty() {
		
		return front == null || rear == null;
	}
	
	public void enqueue(int value) {
		
		Node newNode = new Node(value);
		
		if(isEmpty()) {
			
			front = rear = newNode;
		}
		
		rear.next = newNode;
		newNode.prev = rear;
		rear = newNode;
		
		System.out.println("Enqueued value: " + value);
	}
	
	

//public void enqueue(int value) {
//		
//	Node newNode = new Node(value);
//	
//	if(isEmpty()) {
//			
//			front = rear = newNode;
//		}
//		
//		front.prev=newNode;
//		newNode.next=front;
//		
//		System.out.println("Enqueued value: " + value);
//	}
	
	
	public int dequeue() {
		
		if(isEmpty()) {
			
			System.out.println("Queue is empty");
			return -1;
		}
		
		int popValue = front.data;
		
		front = front.next;
		front.prev = null;
		
		System.out.println("Dequeued value: " + popValue);
		return popValue;
	}
	
	

//	public int dequeue() {
//		
//		if(isEmpty()) {
//			
//			System.out.println("Queue is empty");
//			return -1;
//		}
//		
//		int dequeValue = front.data;
//		
//		rear = rear.prev;
//		rear.next = null;
//		
//		System.out.println("Dequeued value: " + dequeValue);
//		return dequeValue;
//	}
	
	
	public int peek() {
		
		if(isEmpty()) {
			
			System.out.println("Queue is empty");
			return -1;
		}
		
		return front.data;
	}
	
	public void displayQueue() {
		
		if(isEmpty()) {
			
			System.out.println("Queue is empty");
			return;
		}
		
		Node trav = front;
		while(trav != null) {
			
			System.out.print(trav.data + " ");
			trav = trav.next;
		}
		System.out.println();
	}
}

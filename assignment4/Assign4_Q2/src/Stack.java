
public class Stack {

	static class Node {
		
		private int data;
		private Node next;
		
		public Node(int value) {
			
			data = value;
			next = null; 
		}
	}
	
	private Node top;
	
	public Stack() {
		
		top = null;
	}
	
	public boolean isEmpty() {
		
		return top == null;
	}
	
	public void push(int value) {
		
		Node newNode = new Node(value);
		
		newNode.next = top;
		top = newNode;
		
		System.out.println("Pushed value: " + value);
	}
	
	public int pop() {
		
		if(isEmpty()) {
			
			System.out.println("Stack is empty");
			return -1;
		}
		
		int popValue = top.data;
		top = top.next;

		return popValue;
	}
	
	public int peek() {
		
		if(isEmpty()) {
			
			System.out.println("Stack is empty");
			return -1;
		}
		
		int peekValue = top.data;
		return peekValue;
	}
	
	public void displayStack() {
		
		if(isEmpty()) {
			
			System.out.println("Stack is empty");
			return;
		}
		
		Node trav = top;
		while(trav != null){
			
			System.out.print(trav.data + " ");
			trav = trav.next;
		}
		System.out.println();
	}
}
	

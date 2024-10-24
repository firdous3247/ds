package com.sunbeam.assign01;
//
//public class SCircularLL {
//
//	
//	static class Node{
//		private int data;
//		private Node next;
//		
//		
//		public Node() {
//			data=0;
//			next=null;
//		}
//		
//		public Node(int value) {
//			data=value;
//			next=null;
//		}
//	}
//	private Node tail;
//	public SCircularLL() {
//		tail= null;
//	}
//	
//	public boolean isEmpty() {
//		return tail == null;
//	}
//	
//	public void display() {
//		if(isEmpty())
//			throw new RuntimeException("List is Empty");
//		else {
//			Node trav = tail;
//			do {
//				System.out.println(trav.data);
//				trav= trav.next;
//			}while(trav != tail);
//		}
//	}
//	
//	public void addLast(int value) {
//		Node newnode= new Node();
//		if(isEmpty())
//		{
//			tail = newnode;
//			newnode.next=tail;
//		}
//	}
//	
//	public void addFirst(int value) {
//		
//	}
//	
//}

public class SCircularLL {

	static class Node{
		int data;
		Node next;
		public Node(int value) {
			data= value;
			next=null;	
		}
	}
	
	//Node head;
	Node tail;
	
	public SCircularLL() {
		//head=null;
		tail=null;
	}
	
	public boolean isEmpty() {
		return tail==null;
	}
	
	
	
	public void displayList() {
		if(isEmpty())
			System.out.println("List Is Empty");
		Node trav= tail.next;
		System.out.println("List : ");
		do {
			System.out.print(" " + trav.data);
			trav= trav.next;
		}while(trav != tail.next);
		System.out.println("");
	}
	
	public void addFirst(int value) {
		Node newnode= new Node(value);
		if(isEmpty()) {
			tail= newnode;
			tail.next= newnode;
		}
		else {
			newnode.next = tail.next;
			tail.next= newnode;
		}
		
	}
	
	public void addLast(int value) {
		Node newnode = new Node(value);
		if(isEmpty())
		{
			tail = newnode;
			tail.next = newnode;
			
		}
		else {
			newnode.next = tail.next;
			tail.next=newnode;
			tail = newnode;
		}
			
	}
	
	public void addAtPos(int value, int pos) {
		Node newnode = new Node(value);
		Node trav= tail.next;
		
		if(tail.next== null || pos <=1)
			addFirst(value);
		else {
		for(int i=1; i<pos - 1 && trav != tail; i++)
			trav = trav.next;
		}
		newnode.next= trav.next;
		trav.next= newnode;
		
		if(trav == tail) {
			tail = newnode;
		}
	}
	
	public void delFirst() {
		if(isEmpty())
			System.out.println("List is Empty");
		else if(tail.next ==tail)
			tail = null;
		else
			tail.next = tail.next.next;
	}
	
	public void delLast() {
		if(isEmpty())
			System.out.println("List is Empty");
		else  if(tail.next ==tail)
			tail = null;
		else {
			Node trav = tail.next;
			while(trav.next != tail) {
				trav = trav.next;
			}
			
			trav.next = tail.next;
			tail=trav;
		}
	}
	
	public void delAtPos(int pos) {
		if(pos == 1)
			delFirst();
		else if(isEmpty() || pos <1)
			System.out.println("List Is Empty or Invalid Position");
		else {
			Node trav = tail.next;
			for(int i=1; i<pos-1 && trav.next != tail.next; i++) {
				trav = trav.next;
			}
			
            trav.next = trav.next.next; 
            
            if (trav.next == tail.next) {
                tail = trav; 
            }
			
		}
	}
}

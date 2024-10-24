package com.sunbeam.assign03;


public class LinkedList {

	static class Node{
		int data;
		Node next;
		public Node(int value) {
			data= value;
			next=null;	
		}
	}
	
	Node head;
	Node tail;
	
	public LinkedList() {
		head=null;
		tail=null;
	}
	
	public boolean isEmpty() {
		return head==null;
	}
	
	public void displayList() {
		Node trav= head;
		System.out.println("List : ");
		while(trav != null) {
			System.out.print(" " + trav.data);
			trav= trav.next;
		}
		System.out.println("");
	}
	
	public void addFirst(int value) {
		Node newnode= new Node(value);
		if(isEmpty()) {
			head= newnode;
			tail= newnode;
		}
		else {
			newnode.next = head;
			head= newnode;
		}
		
	}
	
	public void addLast(int value) {
		Node newnode = new Node(value);
		if(isEmpty())
		{
			head = newnode;
			tail = newnode;
		}
		else if(tail.next== null)
			tail.next=newnode;			
	}
	
	public void addAtPos(int value, int pos) {
		Node newnode = new Node(value);
		
		if(head== null || pos <=1)
			addFirst(value);
		else {
		Node trav= head;
		for(int i=1; i<pos - 1 && trav.next != null; i++)
			trav = trav.next;
		newnode.next= trav.next;
		trav.next= newnode;
		}
	}
	
	public void delFirst() {
		if(head == null)
			throw new RuntimeException("List Is Empty");
		head = head.next;
	}
	
	public void delLast() {
		if(head == null)
			throw new RuntimeException("List Is Empty");
		else if(head.next == null)
		{
			head = null;
			tail = null;
		}
		else {
			Node temp = null, trav = head;
			while(trav.next != null) {
				temp =trav;
				trav = trav.next;
			}
			
			temp.next = null;
			tail=temp;
		}
	}
	
	public void delAtPos(int pos) {
		if(pos == 1)
			delFirst();
		else if(head== null || pos <1)
			throw new RuntimeException("List Is Empty or Invalid Position");
		else {
			Node trav = head;
			for(int i=1; i<pos-1 && trav.next.next != null; i++) {
				trav = trav.next;
			}
			
            trav.next = trav.next.next; 
			
		}
	}
}

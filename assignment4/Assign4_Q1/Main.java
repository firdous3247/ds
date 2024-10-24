package com.sunbeam.assign01;


public class Main {

	public static void main(String[] args) {
		SCircularLL l1 = new SCircularLL();
		
		l1.addFirst(12);
		l1.addFirst(11);
		l1.addLast(18);
		l1.addLast(20);
		l1.addLast(25);
		System.out.println("Data in list");
		l1.displayList();
		System.out.println("List after delete 3 position value");
		l1.delAtPos(3);
		l1.displayList();
		System.out.println("Add New data at Position 2");
		l1.addAtPos(27, 2);
		l1.displayList();
		l1.delFirst();
		l1.delLast();
		System.out.println("Delete first and Delete Last");
		l1.displayList();

	}

}

package com.connecture.collections.LinkedList;

public class mainClass {
	// TODO Auto-generated constructor stub
	public static void main(String[] args) {
		SinglyLinkedListImplementation linkList = new SinglyLinkedListImplementation();
		linkList.add(10);
		linkList.add(20);
		linkList.add(30);
		linkList.add(40);
		System.out.println(linkList);
		linkList.addAtFirst(12);
		System.out.println(linkList);
		linkList.addAtLast(13);
		System.out.println(linkList);
		linkList.add(45);
		System.out.println(linkList);
		linkList.indexOf(5);
		System.out.println(linkList);
		linkList.reverse();
		System.out.println(linkList);

	}

}

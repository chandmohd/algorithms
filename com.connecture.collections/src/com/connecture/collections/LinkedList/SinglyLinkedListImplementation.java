package com.connecture.collections.LinkedList;

import java.util.LinkedList;

public class SinglyLinkedListImplementation {
	private Node first;
	private Node last;
	private int count;

	// Node class
	class Node {
		int data;
		Node next;

		Node(int data) {
			count++;
			this.data = data;
		}
	}

	public void add(int data) {
		if (first == null) {
			first = new Node(data);
			last = first;
			return;
		}
		last.next = new Node(data);
		last = last.next;
	}

	public void addAtFirst(int data) {
		Node temp = new Node(data);
		temp.next = first;
		first = temp;
	}

	public void addAtLast(int data) {
		last.next = new Node(data);
		last = last.next;
	}

	public int indexOf(int index) {
		if (size() == 0)
			return 0;
		Node temp = first;
		for (int i = 0; i < index; i++) {
			temp = temp.next;
		}
		return temp.data;
	}

	public void addAfter(int value, int toAdd) {
		Node temp = first;
		if (size() != 0) {
			for (int i = 0; i <=size(); i++) {
				if (temp.data == value) {
					temp.next = new Node(toAdd);
					temp.next.next=temp.next;
				}
				else
					temp = temp.next;
			}
		}
	}
	public void reverse() {
		Node current=first;
		Node pre=null;
		Node next=null;
		while(current!=null) {
			next=current.next;
			current.next=pre;
			pre=current;
			current=next;
		}
		first=pre;
	}

	public int size() {
		return count;
	}

	@Override
	public String toString() {
		if (size() == 0)
			return "[ ]";
		Node temp = first;
		String s = "[" + temp.data;
		while (temp.next != null) {
			temp = temp.next;
			s = s + "," + temp.data;

		}
		return s + "]";

	}
}

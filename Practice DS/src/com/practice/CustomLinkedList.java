package com.practice;

public class CustomLinkedList {
	private Node head = null;
	
	// 
	public Node head() {
		return this.head;
	}
	
	//append at the end
	public boolean add(int data) {
		// update head
		if (this.head == null) {
			this.head = new Node(data);
			return true;
		}
		//add at end
		Node tmp = this.head;
		while(tmp.next != null) {
			tmp = tmp.next;
		}
		tmp.next = new Node(data);
		return true;
	}
	
	//insert at the head
	public boolean push(int data) {
		if (this.head == null) {
			this.head = new Node(data);
			return true;
		}
		
		Node tmp = this.head;
		this.head = new Node(data);
		this.head.next = tmp;
		return true;
	}
	
	public int get(int index) {
		Node tmp = this.head;
		int i = 0;
		while (i < index) {
			if (tmp.next == null) return -1;
			tmp = tmp.next;
			i++;
		}
		return tmp.data;
	}
	
	public boolean delete(int value) {
		if (this.head.data == value) {
			this.head = this.head.next;
			return true;
		}
		Node prev = this.head;
		Node tmp = prev.next;
		while(tmp != null) {
			if (tmp.data == value) {
				prev.next = tmp.next;
				return true;
			}
			prev = tmp;
			tmp = tmp.next;
		}
		return false;
	}
	
	
	
	/**
	 * Custom functions over here
	 */
	public double findMiddle() {
		//If Input size = 0
		if (this.head == null) {
			throw new EmptyListException();
		}
		
		Node prev = null;
		Node slow = this.head;
		Node fast = this.head.next;
		//Succeeds for input List of size > 0
		while(true) {
			prev = slow;
			slow = slow.next;
			
			if(fast == null) {
				return prev.data;
			}
			else if (fast.next == null) {
				return (prev.data + slow.data) / 2.0;
			}
			else {
				fast = fast.next.next;
			}
		}
	}
	
	@Override
	public String toString() {
		StringBuilder str = new StringBuilder();
		Node cur = this.head ;
		while(cur != null) {
			str.append(cur.data + " -->");
			cur = cur.next;
		}
		str.append(" null");
		return str.toString();
	}
	
	private class Node {
		int data = 0;
		Node next = null;
		/*public Node () {}
		public Node(Node next) {
			this.next = next;
		}*/
		public Node(int data)  {
			this.data = data;
		}
	}
}

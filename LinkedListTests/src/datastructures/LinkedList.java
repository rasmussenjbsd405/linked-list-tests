package datastructures;

public class LinkedList {
	private int size;
	private Node head;
	
	public LinkedList() {
		this.size = 0;
		this.head = null;
	}
	
	public void push(String value) {
		Node newNode = new Node();
		newNode.value = value;
		newNode.next = this.head;
	
		this.head = newNode;
		
		this.size++;
	}
	
	public String get(int index) {
		Node curr = this.head;
		for (int i = 0; i < index; i++) {
			curr = curr.next;
		}
		
		return curr.value;
	}
	
	public int size() {
		return this.size;
	}

	public String remove(int index) {
		Node curr = this.head;
		for (int i = 0; i < index - 1; i++) {
			curr = curr.next;
		}
	
		Node temp = curr.next;
		curr.next = temp.next;
		
		this.size--;
		return temp.value;
	}
	
	private static class Node {
		public Node next;
		public String value;
	}
}

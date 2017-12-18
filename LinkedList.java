/**
 * This class implements a singly linked list data structure.
 * 
 * @author Michael Ida
 *
 */
public class LinkedList {
	
	private Node head;
	
	/*
	 * The constructor creates an empty list.
	 */
	public LinkedList() {
		head = null;
	}
	
	/*
	 * This method creates a new node and adds it to the head of the list.
	 */
	public void insertFirst(String data) {
		Node newNode = new Node();
		newNode.record = data;
		newNode.next = head; //point towards old node
		head = newNode; //point head pointer to new node
	}
	
	/*
	 * This method deletes the first node in the list.
	 */
	public void deleteFirst() {
		head = head.next;
	}
	
	/*
	 * This method should create a new node containing data and add it following the node 'after'.
	 * If after is null, then it should do nothing.
	 */
	public void insertAfter(String data, Node after) {
		Node newNode = new Node();
		newNode.record = data;
		if (after != null) {
			newNode.next = after.next;
			after.next = newNode;
		}
	}
	
	/*
	 * This method should find the node containing the string data and return a pointer to that node.
	 * If not found, then it should return null.
	 */
	public Node findNode(String data) {
		Node pointer = head;
		while (pointer != null) {
			if (pointer.record == data) {
				return pointer;
			} else {
				pointer = pointer.next;
			}
		}
		return null;
	}
	
	/*
	 * This method should delete the node trash.
	 * If trash is null, then it does nothing.
	 */
	public void deleteNode(Node trash) {
		Node pointer = head;
		while(pointer != null) {
			if (pointer.record == trash.record) {
				pointer.record = null;
				return;
			} else {
				pointer = pointer.next;
			}
		}
	}
	

	
	/*
	 * This method should create a new node and insert it at the end of the list.
	 */
	public void insertLast(String data) {
		Node newNode = new Node();
		newNode.record = data;
		Node pointer = head;
		if (head == null) {
			head = newNode;
			return;
		}
		while(pointer!=null) {
			if (pointer.next == null) {
				pointer.next = newNode;
				return;
			} else {
				pointer = pointer.next;
			}
		}
		return;
	}
	
	/*
	 * This method deletes the last node in the list.
	 * If the list is empty, then it does nothing.
	 */
	public void deleteLast() {
		Node pointer = head;
		while(pointer!=null) {
			if (pointer.next.next == null) {
				pointer.next = null;
				return;
			} else {
				pointer = pointer.next;
			}
		}
	}
	
	/*
	 * This method transverses the list and prints out the record in each node.
	 */
	public void traverseAndPrint() {
		Node pointer = head;
		while (pointer != null) {
			if (pointer.record != null) {
			System.out.println(pointer.record);
			pointer = pointer.next;
			} else {
			pointer = pointer.next;
			}
		}
		System.out.println();
	}
	
}


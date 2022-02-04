package DSA;

import org.w3c.dom.Node;

public class StackImplementationLinkedList {
	
	
	Node head;
	
	class Node{
		int value;
		Node next;
	}
	
	
	StackImplementationLinkedList(){
		head =null;
	}
	
	public void push(int value) {
		
		Node extraHead = head;
		head = new Node(); //create object of Node to create a new node
		head.value = value;  //value will be stored in left side of node
		head.next = extraHead; //next pointer
		
	}
	
	public int pop() {
		
		if(head==null) {
			System.out.println("Stack Empty");
		}
		
		int value = head.value;
		head = head.next;
		return value;
		
	}
	
	public static void printlist(Node head) {
		Node temp = head;
		while(temp!=null) {
			System.out.println(temp.value + " ");
			temp= temp.next;
		}
	}
	
	public static void main(String[] args) {
		
		StackImplementationLinkedList lls = new StackImplementationLinkedList();
//		System.out.println(lls.pop());
		lls.push(400);
		lls.push(500);
		lls.push(600);
		lls.push(401);
		lls.push(501);
		lls.push(601);
		System.out.println("Popped Element   " + lls.pop());
		
		printlist(lls.head);
			
	}

}

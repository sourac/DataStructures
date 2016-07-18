package atul.learning.linkedlist;

public class LinkedListLength {
     //head node of the linkedlist is defined here
	Node head;
	
	//Node class which consist the LinkedList two main functioning part one is data which
	//carries the value and the other is the pointer which points to the next node in the linked list.
	class Node{
		
		int data;
		Node next;
		
		Node(int d){
			data=d;
			next=null;
		}
		
	}
	
	
	
	public static void main(String[] args) {
		
		LinkedListLength lll=new LinkedListLength();
		lll.push(6);
		lll.push(7);
		lll.push(4);
		lll.push(3);
		
		lll.display();
		
	
	}


    // displaying the nodes available in the linked list
	private void display() {
		// TODO Auto-generated method stub
		
		Node tmp=head;
		int count=0;
		while(tmp!=null){
		System.out.print(tmp.data + " ");
		count++;
		tmp=tmp.next;
		}
		System.out.println(" ");
		System.out.println("Count of the nodes in the linked list :" + count);
	} 



	//This push method is basically used to insert new node in the linked list but at the 
	// very beginning of the linked list
	private void push(int i) {
		// TODO Auto-generated method stub
		Node new_node=new Node(i);
		new_node.next=head;
		head=new_node;	
	}
	
	
}

package atul.learning.linkedlist;

public class LinkedList {

	Node head;
	static class Node{
		
		int data;
		Node next;
		
		Node(int d){
			
			data=d;
			next=null;
		}
		
	}
	
	public static void main(String[] args) {
		
		LinkedList llist=new  LinkedList();
		llist.head=new Node(1);
		
		Node second=new Node(2);
		Node third=new Node(3);
		
		llist.head.next=second;
		second.next=third;
		
		llist.printList();
		llist.push(16);
		llist.printList();
		System.out.println("inserting at the given index ");
	   llist.insertAfter(llist.head.next,8);
	   llist.printList();
		
	   System.out.println("inserting at the end of the linkedlist");
	   llist.append(17);
	   llist.printList();
	   
	}
     //insertion of the node at the end of the linked list
	private void append(int i) {
		// TODO Auto-generated method stub
		
		//Allocate the node,put in the data and set next as null
		Node new_node=new Node(i);
		
		//if the linkedlist is empty then make the new node as the head of the linked list
		if(head==null){
			head=new Node(i);
			return;
		}
		
		//traversing till the last node
		new_node.next=null;
		Node last=head;
		while(last.next!=null){
			last=last.next;
		}
		
		
		last.next=new_node;
		return;
		
		
		
	}

	//inserting node at the given position
	private void insertAfter(Node prev_node,int new_data) {
		// TODO Auto-generated method stub
		
		if(prev_node==null){
			System.out.println("this previous node cannot be null");
			return;
		}
		
		Node new_node=new Node(new_data);
		new_node.next=prev_node.next;
		prev_node.next=new_node;
		
		
		
	}

	//printing tht linkedlist element
	private void printList() {
		// TODO Auto-generated method stub
		
		Node n=head;
		while(n!=null){
			System.out.print(n.data+" ");
			n=n.next;
		}
		System.out.println();
		
	}
	
	//insertion of the new node at the beginning of the linkedlist
	public void push(int new_data){
		System.out.println("inserting node at the beginning of the linkedlist :");
		Node new_node=new Node(new_data);
		new_node.next=head;
		head=new_node;
		
	}
	
	
	
	
}

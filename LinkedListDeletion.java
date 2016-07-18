package atul.learning.linkedlist;

public class LinkedListDeletion {

	Node head;
	
	class Node{
		int data;
		Node next;
		Node(int d){
			data=d;
			next=null;
		}
	}
	
	
	public static void main(String[] args) {
		
		LinkedListDeletion lld=new LinkedListDeletion();
		lld.push(6);
		lld.push(60);
		lld.push(16);
		lld.push(69);
		System.out.println("before deleting the node with the  key");

		lld.printList();
		
		lld.deleteNode(16);
		System.out.println(" ");
		System.out.println("after deleting the node with the key");
		lld.printList();
		
	}


	private void deleteNode(int key) {
		// TODO Auto-generated method stub
		
		//stores head node into temporary variable
		Node temp=head;
		Node prev=null;
		//if head node itself holds the key to be deleted
		if(temp!=null && temp.data==key){
			head=temp.next; //head is changed
			return;
		}
		
		//searching for the key to be deleted,keep track of 
		//previous node as we need to change temp.next
		while(temp!=null && temp.data!=key){
			prev=temp;
			temp=temp.next;
		}
		
		//if the key is not present in the linked list
		if(temp==null)return;
		
		//unlink the node from the linked list
		prev.next=temp.next;
		
		
	}


	private void printList() {
		// TODO Auto-generated method stub
		
		Node n=head;
		while(n!=null){
			System.out.print(n.data +" ");
			n=n.next;
		}
		
	}

    //insertion at the beginning of the linkedlist
	private void push(int i) {
		// TODO Auto-generated method stub
		Node new_node=new Node(i);
		new_node.next=head;
		head=new_node;
		
	}
	
	
}

package com.DSA_Assingment_19Apr_to_23Apr;

public class Hw_23_April {
	
static Node head;
	
	
	public static void addFirst(int data) {
		Node newNode = new Node(data);
		
		if(head==null) {
			head=newNode;
		}
		else {
		
		newNode.next=head;
		head=newNode;
		}
	}
	public static void print() {
		
		int cnt = 0;
		
		if(head==null) {
			System.out.println("Empty");
			return;
		}
		Node cur = head;
		
		while(cur != null) {
			System.out.print(cur.data+"->");
			
			if(cur.next==null) {
				System.out.println(cur.data);
				
			}
			cur=cur.next;
		}
		
		System.out.print("Null");
		System.out.println();
		System.out.println(cnt);
	}

	

	public static void main(String[] args) {
		
		
		
		addFirst(10);
		addFirst(20);
		addFirst(20);
		addFirst(40);
		addFirst(50);
		addFirst(60);
		addFirst(70);
		
		
		print();
		
	}

}

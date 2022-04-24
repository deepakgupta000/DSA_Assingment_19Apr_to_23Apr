package com.DSA_Assingment_19Apr_to_23Apr;

public class Hw_22_April {
	
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
	
	public static void addLast(int data) {
		Node newNode = new Node(data);
		
		if(head==null) {
			head=newNode;
			return;
		}
		Node cur = head;
		while(cur.next !=null) {
			
		
		cur=cur.next;
		}
		
		cur.next=newNode;
	}
	
	
	 public static  void removeFirst() {
	       if(head == null) {
	           System.out.println("Empty");
	           return;
	       }
	 
	       head = head.next;
	       
	   }
	 
	 

	 
	   public static void removeLast() {
	       if(head == null) {
	           System.out.println("Empty List, nothing to delete");
	           return;
	       }
	 
	       
	       if(head.next == null) {
	           head = null;
	           return;
	       }
	 
	       Node currNode = head;
	       Node lastNode = head.next;
	       while(lastNode.next != null) {
	           currNode = currNode.next;
	           lastNode = lastNode.next;
	       }
	 
	       currNode.next = null;
	   }
	   
	 public static void printMiddle()
	    {
	        Node first = head;
	        Node last = head;
	         
	            while (last != null && last.next != null)
	            {
	            	last = last.next.next;
	                first = first.next;
	            }
	            System.out.println("The middle " + first.data);
	         
	    }

	   
	   public static int count() {
		   Node temp=head;
		   int count = 0;
		   while(temp!=null)
		   {
		    temp=temp.next;
		    count++;  
		   }
		   return count;
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
			
			if(cur.data==3) {
				System.out.println(cur);
				
			}
			cur=cur.next;
		}
		
		System.out.print("Null");
		System.out.println();
		System.out.println(cnt);
	}

	

	public static void main(String[] args) {
		
		//LinkedList ll = new LinkedList();
		
		addFirst(1);
		addFirst(11);
		addFirst(12);
		addFirst(13);
		addFirst(14);
		addFirst(15);
		addFirst(16);
		addFirst(17);
		addFirst(18);
		addFirst(13);
		
		addLast(20);
		
		
		print();
		
		System.out.println();
		
		//removeFirst();
		//print();
		
		System.out.println();
		
		removeLast();
		print();
		
		//System.out.println(count());
		
		printMiddle();
		
		
		
		
	}

}

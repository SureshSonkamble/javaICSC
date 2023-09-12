package DS;

import DS.LinkedList.nnode;

public class Reccl {
	Node head;
	class Node{
		int data;
		Node next;
		Node (int d){
			data=d;
			next=null;
		}
	}
	void add(int data) {
		Node n=new Node(data);
		if(head==null) {
			head=n;
			return;
		}
		n.next=head;
		head=n;
	}
	
	void print() {
		Node crnode=head;
		int cnt=0;
		int sm=0;
		while(crnode!=null) {
			System.out.println(crnode.data);
			sm=sm+crnode.data;
			crnode=crnode.next;
			cnt++;
			
		}	
		System.out.println("Number of node="+cnt);
		System.out.println("Sum of item is="+sm);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Reccl l=new Reccl();
		l.add(5);l.add(10);l.add(15);l.add(20);
		l.print();
	}

}

package DS;

import DS.LinkedList.nnode;
public class llstex {
	//=========Node==========
     Node head;
	class Node{
		int data;
		Node next;//class obj ref -->
		Node(int d){
			data=d;
			next=null;
		}
	}
//========================================
	
	public void add(int data) {
		Node n=new Node(data);
		if(head==null) {
			head=n;
			return ;
		}
		n.next=head;
		head=n;
	}
	
	public void printList()
	{
		Node n = head;
		while (n != null) {
			System.out.print(n.data + " ");
			n = n.next;
		}
	}
	
	

	public void printeven()
	{    int ocnt=0;
	    int ecnt=0;
	    int osum=0;
		Node n = head;
		while (n != null) {
			System.out.print(n.data + " ");
			if(n.data%2==0) {
				ecnt++;
			}else {
				ocnt++;
				osum=osum+n.data;
			}
			n = n.next;
		}
		System.out.println("Even cnt="+ecnt);
		System.out.println("odd sum="+osum);
	}
	
	
	//delete 
	public void del() {
		if(head==null) {
			System.out.println("List is empty");
			return;
		}
		head=head.next;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		llstex ll=new llstex();
		
		ll.add(9);//1 node 6
		ll.add(1); //1->6
		ll.add(2);//2-1->6
		//ll.del();
		ll.add(3);//3->2-1->6
		ll.add(4);//4->3->2-1->6
		ll.add(5);//5->4->3->2-1->6
		System.out.println("List before delete");
		ll.printList();
		//ll.del();
		//System.out.println("List after delete");
		//ll.printList();
		ll.printeven();
	}

}

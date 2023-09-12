package DS;

import DS.llstex.Node;

public class recursive_list {
	Node head;
	class Node{
	
		int data;
		Node next;
		Node(int d)
		{
			data=d;
			next=null;
		}
	}	
//add
	public void add(int d) {
		Node nn=new Node(d);
		if(head==null)
		{
			head=nn;
			return;
		}
		nn.next=head;
		head=nn;
	}
	//print
	public void sum()
	{    int cnt=0;

	    int sum=0;
		Node n = head;
		while (n != null) {
			System.out.print(n.data + " ");
				cnt++;
				sum=sum+n.data;
				n = n.next;
			}
		System.out.println("\n");
		System.out.println("cnt="+cnt);
		System.out.println("sum="+sum);
	}
	public static void main(String[] args) {
		recursive_list listObj = new recursive_list();
        listObj.add(20);        listObj.add(15);
        listObj.add(10);        listObj.add(5);
        listObj.sum();
        
	}

}

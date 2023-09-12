package DS;

public class LLex  {

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
	public void prnt() {
		Node curnd=head;
		while(curnd.next!=null) {
			System.out.print(curnd.data + " , ");
			curnd=curnd.next;
		}
		System.out.println();
	}
	
	public void del() {
		
		if(head==null) {
			System.out.println("The list empty");
		}
		head=head.next;
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LLex listObj = new LLex();

        listObj.add(25);
        listObj.add(20);
        listObj.add(15);
        listObj.add(10);
        listObj.add(5);

        listObj.prnt();
       // listObj.del();
        //listObj.prnt();
	}

}

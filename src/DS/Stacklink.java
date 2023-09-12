package DS;

public class Stacklink {
          Node top;
	     class Node{
	    	 int data;
	    	 Node next;
	    	 public Node(int data) {
	    		 this.data=data;
	    	 }
	     }
	     public boolean isEmpty()
	     {
	    	 return top==null;
	     }
	
	    public void push(int data)
	    {
	    	Node newnode=new Node(data);
	    	newnode.next=top;
	    	top=newnode;
	    }
	    
	    public int pop()
	    {
	    	if(isEmpty()) {
	    		System.out.println("Stack is empty");
	    	}
	    	int data=top.data;
	    	top=top.next;
	    	return data;
	    }
	    public int peek()
	    {
	    	if(isEmpty()) {
	    		System.out.println("Stack is empty");
	    	}
	    	
	    	return top.data;
	    }
	    
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Stacklink s=new Stacklink();
		s.push(1);
		s.push(2);
		s.push(3);
		s.push(4);
		while(!s.isEmpty()) {
			System.out.println(s.peek());
			s.pop();
		}
	}

}

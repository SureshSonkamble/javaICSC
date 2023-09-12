package DS;
class ll
{
	Node head; // head
	  
	  // Linked list Node
	  class Node {
	    int data;
	    Node next;

	    // constructor to initialize
	    Node(int d) { 
	      data = d;
	      next = null; 
	    }
	  }
	  public Node insertNode(int data) {
	        // Using constructor to create memory and value assignment
	        Node new_node = new Node(data);
	        // current head becomes this new_node's next
	        new_node.next = head;

	        // changing head to this newly created node
	        head = new_node;

	        return head;
	    }

	    public void delete()
	    {
	        if (head == null){
	            System.out.println("List is empty, not possible to delete");
	            return;
	        }

	        System.out.println("Deleted: " + head.data);
	        // move head to next node
	        head = head.next;
	    }



	    public void display()
	    {
	        Node node = head;
	        //as linked list will end when Node reaches Null
	        while(node!=null)
	        {
	            System.out.print(node.data + " , ");
	            node = node.next;
	        }
	        System.out.println();
	    }

}
public class LinkedListEx {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 ll listObj = new ll();

	        listObj.insertNode(25);
	        listObj.insertNode(20);
	        listObj.insertNode(15);
	        listObj.insertNode(10);
	        listObj.insertNode(5);

	        listObj.display();

	        listObj.delete();
	        listObj.delete();
	        listObj.delete();

	        listObj.display();
	}

}

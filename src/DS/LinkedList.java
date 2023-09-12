package DS;

//A simple Java program for traversal of a linked list

class LinkedList {
//A Node is a data structure that stores a value that can be
	//of any data type and has a pointer to another node. 
	nnode head; // head of list
	static class nnode {
		int data;
		nnode next;//class obj
		nnode(int d)
		{
			this.data = d;
			next = null;
		} // Constructor
	}
	/* This function prints contents of linked list starting
	* from head */
	public void printList()
	{
		nnode n = head;
		while (n != null) {
			System.out.print(n.data + " ");
			n = n.next;
		}
	}

	// Driver's code
	public static void main(String[] args)
	{
		/* Start with the empty list. */
		LinkedList llist = new LinkedList();

		llist.head = new nnode(11);
		nnode second = new nnode(22);
		nnode third = new nnode(33);
		nnode fourth = new nnode(44);


		llist.head.next = second; // Link first node with								// the second node
		second.next = third; // Link second node with the third node
		third.next = fourth;
		// Function call
		llist.printList();
	}
}

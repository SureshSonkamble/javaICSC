package DS;

import java.util.EmptyStackException;
//Appln of stack
//Undo/Redo Operations: Stacks are useful for implementing undo
//women bangal 
//graphics software, and command-line interfaces. 
//Each action performed is stored on the stack, allowing the user to undo or redo operations by popping or pushing items.
class Stackasll {
    private Node top; // Reference to the top of the stack

    private class Node {
        int data;
        Node next;

        public Node(int data) {
            this.data = data;
        }
    }

    public boolean isEmpty() {
        return top == null;
    }
    //push add data
    public void push(int data) {
        Node newNode = new Node(data);
        newNode.next = top;
        top = newNode;
    }

    public int pop() {
        if (isEmpty()) {
           System.out.println("Empty Stack");
        }
        int data = top.data;
        top = top.next;
        return data;
    }

    public int peek() {
        if (isEmpty()) {
        	System.out.println("Empty Stack");
        }
        return top.data;
    }
    public static void main(String args[])
    {
    	Stackasll stack = new Stackasll();
    	stack.push(10);
    	stack.push(20);
    	stack.push(30);
    	stack.push(40);

    	//System.out.println(stack.pop()); // Output: 30
    	//System.out.println(stack.peek()); // Output: 20
    	//System.out.println(stack.isEmpty()); // Output: false
       while(!stack.isEmpty()) {
    	   System.out.println(stack.peek());
    	   stack.pop();
       }
    }
}

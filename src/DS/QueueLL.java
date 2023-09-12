package DS;
class Node {
    int data;
    Node next;

    Node(int data) {
        this.data = data;
        this.next = null;
    }
}

class Queue {
    private Node head;
    private Node tail;

    public boolean isEmpty() {
        return head == null;
    }

    public void enqueue(int data) {
        Node newNode = new Node(data);

        if (isEmpty()) {
            head = newNode;
            tail = newNode;
        } else {
            tail.next = newNode;
            tail = newNode;
        }
    }

    public int dequeue() {
        if (isEmpty()) {
            throw new IllegalStateException("Queue is empty.");
        }

        int data = head.data;
        head = head.next;

        if (head == null) {
            tail = null;
        }

        return data;
    }

    public int peek() {
        if (isEmpty()) {
            throw new IllegalStateException("Queue is empty.");
        }

        return head.data;
    }

    public void display() {
        if (isEmpty()) {
            System.out.println("Queue is empty.");
            return;
        }

        Node current = head;
        while (current != null) {
            System.out.print(current.data + " ");
            current = current.next;
        }
       
        System.out.println();
    }
}
public class QueueLL {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Queue queue = new Queue();
        queue.enqueue(1);
        queue.enqueue(2);
        queue.enqueue(3);

        queue.display();  // Output: 1 2 3

        System.out.println(queue.dequeue());  // Output: 1
        System.out.println(queue.peek());  // Output: 2

        queue.display();  // Output: 2 3
	}

}
 
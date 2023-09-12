package DS;

public class StackArray {
    private int maxSize; // Maximum size of the stack
    private int top; // Index of the top element
    private int[] stackArray; // Array to store the stack elements

    // Constructor to initialize the stack
    public StackArray(int size) {
        maxSize = size;
        top = -1;
        stackArray = new int[maxSize];
    }

    // Method to push an element onto the stack
    public void push(int value) {
        if (top == maxSize - 1) {
            System.out.println("Stack is full. Cannot push element: " + value);
        } else {
            stackArray[++top] = value;
            System.out.println("Pushed element: " + value);
        }
    }

    // Method to pop an element from the stack
    public int pop() {
        if (top == -1) {
            System.out.println("Stack is empty. Cannot pop element.");
            return -1;
        } else {
            int poppedElement = stackArray[top--];
            System.out.println("Popped element: " + poppedElement);
            return poppedElement;
        }
    }

    // Method to peek at the top element of the stack
    public int peek() {
        if (top == -1) {
            System.out.println("Stack is empty. No element to peek.");
            return -1;
        } else {
            int topElement = stackArray[top];
            System.out.println("Top element: " + topElement);
            return topElement;
        }
    }

    // Method to check if the stack is empty
    public boolean isEmpty() {
        return top == -1;
    }

    // Method to check if the stack is full
    public boolean isFull() {
        return top == maxSize - 1;
    }

    // Method to get the size of the stack
    public int size() {
        return top + 1;
    }

    public static void main(String[] args) {
        StackArray stack = new StackArray(5); // Creating a stack of size 5

        stack.push(10);
        stack.push(20);
        stack.push(30);
        stack.push(40);

        System.out.println("Is stack empty? " + stack.isEmpty());
        System.out.println("Is stack full? " + stack.isFull());
        System.out.println("Stack size: " + stack.size());

        stack.peek();

        stack.pop();
        stack.pop();

        stack.peek();
    }
}


package DS;

public class stkraay {

	int maxsize;
	int top;
	int []stkary;
	 public stkraay(int size) {
		 maxsize=size;
		 top=-1;
		 stkary=new int[maxsize];
	 }
	 
	//add value 
	public void push(int value) {
	  if(top==maxsize-1) {
		  System.out.println("Stack is full");
	  }else {
		  stkary[++top]=value;
		  System.out.println("Pushed element"+value);
	  }
	}
	//remove value
	public int pop(){
		if(top==-1) {
			System.out.println("stack is empty");
			return -1;
		}else {
			int pop=stkary[top--];
			System.out.println("removed lement"+pop);
			return pop;
		}
		
	}
	//last value
	public int peek() {
		if(top==-1) {
			System.out.println("stack is empty");
			return -1;
		}else {
			int peek=stkary[top];
			System.out.println("last lement"+peek);
			return peek;
		}
	}
	//check size
	public int size()
	{
		return top+1;
	}
	//check empty
	public boolean isEmpty() {
		return top==-1;
	}
	//check full
	public boolean isFull() {
		return top==maxsize-1;
	}
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		stkraay a=new stkraay(5);
		a.push(10);
		a.push(20);
		a.push(30);
		a.push(40);
		//a.push(50);
		//a.push(60);
		//a.push(60);
//		a.peek();
		a.pop();
		a.pop();
//		a.peek();
//		System.out.println("size="+a.size());
//		System.out.println("empty="+a.isEmpty());
//		System.out.println("Full="+a.isFull());
//		while(!a.isEmpty()) {
//			System.out.println(a.peek());
//			a.pop();
//		}
		
		
	}

}

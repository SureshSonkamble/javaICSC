package DS;

public class quearr {
     static int arr[];
     static int size ;
     static int rear=-1;
     
     quearr(int n){
    	 arr=new int[n];
    	 this.size=n;
     }
     public static boolean isEmpty() {
    	 return rear==-1;
     }
     public void add(int data) {
    	 
    	 if(rear==size-1) {
    		 System.out.println("Queue is Full");
    		 return;
    	 }
    	 rear++;//-1+1=0+1
    	 arr[rear]=data;
     }
	
     public static int peek() {
    	 if(isEmpty()) {
    		 System.out.println("Queue is Empty");
    		 return -1;
    	 }
    	     return arr[0];//fornt element 
     }
     

 	public static int remove() {
 		if(isEmpty()) {
 			System.out.println("Empty Queue");
 			return -1;
 		}
 		int front =arr[0];
 		for(int i=0;i<rear;i++) {
 			arr[i]=arr[i+1];
 		}
 		rear--;
			return front;
 	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        quearr q=new quearr(5);
        q.add(1);q.add(2);q.add(3);q.add(4);
        q.add(5);
        q.remove();

        q.remove();
        q.remove();
        q.add(6);
        q.add(7);
        q.add(8);
        q.add(7);
        while(!q.isEmpty()) {
        	System.out.println(q.peek());
        	q.remove();
        }
	}

}

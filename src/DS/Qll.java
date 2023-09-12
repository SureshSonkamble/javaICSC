package DS;
class Nodes{
	int data;
	Nodes next;
	Nodes(int data){
		this.data=data;
		this.next=null;
	}
}
class Que{
	private Nodes head;
	private Nodes tail;
	
	public boolean isEmpty() {
		return head==null;
	}

public void add(int data) {
	Nodes nd=new Nodes(data);
	if(isEmpty()) {
		head=nd;
		tail=nd;
	}else {
		tail.next=nd;
		tail=nd;
	}
}

public int remove() {
	if(isEmpty()) {
		System.out.println("Queue is empty");
	}
	int data=head.data;
	head=head.next;
	if(head==null) {
		tail=null;
	}
	return data;
}

public int peek() {
	if(isEmpty()) {
		System.out.println("Queue is empty");
	}
	return head.data;
}

public void dispaly() {
	if(isEmpty()) {
		System.out.println("Queue is empty");
		return;
	}
	 Nodes curnd=head;
	 while(curnd!=null) {
		 System.out.println(curnd.data+" ");
		 curnd=curnd.next;
	 }
	
}
}
public class Qll {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Que  q=new Que();
		q.add(1);
		q.add(2);
		q.add(3);
		q.add(4);
		q.remove();
		q.remove();
		q.remove();
		q.add(1);
		q.add(2);
		System.out.println("frist element "+q.peek());
		q.dispaly();
	}

}


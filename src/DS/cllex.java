package DS;

 class nde {
	int data;
	
	nde(int d)
	{
		this.data = d;
	} // Constructor
	void print() {
		System.out.println(data);
	}
}
public class cllex {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		nde n=new nde(1);
		nde nn=new nde(2);
		nn.print();
	}

}

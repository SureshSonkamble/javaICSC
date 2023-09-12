package OOPS;
 class parnt
{
  private void p() {
		System.out.println("This is parent class");
	}
  
  void show(int pin) {
	  if(pin==123) {
		  p();
	  }
	  else {
		  System.out.println("Invalid pin");
	  }
  }
}
class child extends parnt
{
	void c() {
		System.out.println("This is child class");
	}
}
public class inhertex {
	public static void main(String[] args) {
		//parnt p=new parnt();
		//p.show(123);
		//p.c();
	    child c=new child();
		c.c();
		//c.p();
		c.show(123);

	}

}

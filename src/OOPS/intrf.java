package OOPS;
interface itf{
	
	default void m1() {
		System.out.println("Default");
	}
}
class test implements itf{
	public void m1() {
		System.out.println("Class method");
	}
}
public class intrf {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		test t=new test();
		t.m1();
	}

}

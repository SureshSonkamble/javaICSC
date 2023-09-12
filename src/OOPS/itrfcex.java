package OOPS;
interface itfr1{
	void msgs();
}
interface itfr2 extends itfr1{
	void msg();
}
class tfc implements itfr2{

	public void msg() {
		System.out.println("interface method1");		
	}

	public void msgs() {
		
		System.out.println("interface method2");		
	}
}
public class itrfcex {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		tfc t=new tfc();
		t.msg();
	}

}

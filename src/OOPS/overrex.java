package OOPS;
class prnt{
	void prty() {
		System.out.println("$8989899");
	}
 void marry() {
		System.out.println("ABC");
	}
}
class clld extends prnt{
	void marry() {
		System.out.println("XYZ");
	}
}
public class overrex {
	public static void main(String[] args) {
		clld c=new clld();
		c.prty();
		c.marry();
	}

}

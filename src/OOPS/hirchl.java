package OOPS;
class pprt{
	
	void pp() {
		System.out.println("I am Single parent");
	}
}
class cc1 extends pprt{
	 
}
class cc2 extends pprt{
	 
}
public class hirchl {
	public static void main(String[] args) {
		cc1 c1=new cc1();
		c1.pp();
		cc2 c2=new cc2();
		c2.pp();

	}

}

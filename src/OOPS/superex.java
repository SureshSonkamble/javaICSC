package OOPS;
class pclr{
	String color="White";

}
class cclr extends pclr{
	String clr="Black";
	
	void clr()
	{
		System.out.println(super.color);
		System.out.println(color);
	}
}
public class superex {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		cclr c=new cclr();
		c.clr();
		//System.out.println(c.color);
	}

}

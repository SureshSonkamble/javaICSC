package OOPS;
class gp
{
	String sname="Sonkamble";
}
class prt extends gp
{
	String mname="daulat";
}
class cld extends prt{
	String name="suresh";
	
	void fullname() {
		System.out.println(name+" "+mname+" "+sname);
	}
}
public class mlinhrti {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		cld c=new cld();
		c.fullname();
	}

}

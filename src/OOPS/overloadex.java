package OOPS;
class adder{
	void add(int a,int b) {
		int ans=a+b;
		System.out.println("Addition1 "+ans);
	}
	void add(double a,double b) {
		double ans=a+b;
		System.out.println("Addition2 "+ans);
	}
	void add(int a,int b,int c) {
		int ans=a+b+c;
		System.out.println("Addition3 "+ans);
	}}
public class overloadex {
	public static void main(String[] args) {
		adder a=new adder();
		a.add(2, 2,2);
	}
}

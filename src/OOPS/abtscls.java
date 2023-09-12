package OOPS;
abstract class car{
	void model() {
		System.out.println("MAHINDRA THAR");
	}
	abstract void cc();
}
class engg extends car{
	void cc() {
		System.out.println("2000 cc engine");
	}
}

class BMW extends car{
	void cc() {
		System.out.println("2500 cc engine");
	}
}
public class abtscls {
	public static void main(String[] args) {
		engg e=new engg();
		e.cc();
		e.model();
	}

}

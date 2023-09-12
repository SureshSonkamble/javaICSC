package DS;

import java.util.Scanner;

public class twnprime {
public static void main(String args[]) {
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter number");
	int n=sc.nextInt();
	int f=0;
	for(int i=2;i<=n/2;i++) {
		if(n%i==0) {
			System.out.println("Not prime");
			f=1;
			break;
		}
	}
	if(f==0) {
		System.out.println("Prime Number");
	}
	 
}
}

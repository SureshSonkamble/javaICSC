package DS;

import java.util.Scanner;

public class GCD {
      int a,b,hcf,lcm;
      GCD(){
    	  a=0;
    	  b=0;
      }
	  void getdata() {
		  Scanner sc=new Scanner(System.in);
		  System.out.println("Input First number ");
		  a=sc.nextInt();
		  System.out.println("Input Second number ");
		  b=sc.nextInt();
	  }
	    //a=8  b=4
//	  int rechcf(int a,int b) {
//		  for(int i = 1; i <= a || i <= b; i++) {// i=5 5<=8 || 5<=4
//		         if( a%i == 0 && b%i == 0 )//8%4 and 4%4
//		         hcf = i; //2//4
//		      }
//		  return hcf;
//	  }
	  int rechcf(int a,int b)//a=36  b=24
		{
	    	 if(a!=b)  //36!=24 12
		 {
		    if(a>b)  //36>24  12>24
			a=a-b;	//36-24=12
		    else		
		  	b=b-a;   //24-12 //12 	
		    return rechcf(a,b);//12 24
		}
		return a;  
	   }
	 //int lcm = (a * b) / gcd;  
	public static void main(String[] args) {
		// TODO Auto-generated method stub
         GCD d=new GCD();
         d.getdata();
         System.out.println(d.rechcf(d.a, d.b));
	}

}

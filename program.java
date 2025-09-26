  /*import java.util.*;
  class Test{

	public static void main(String[] args) {
		System.out.println("Enter your number");
		Scanner sc=new Scanner(System.in);
	     int num=sc.nextInt();
	     if(num%2==0){
	     	System.out.println(num+"Even number");
	     }

	}
}

class Test1{
	public static void main(String[] args) {
		System.out.println("Enter your number");
		Scanner sc=new Scanner(System.in);
		int num=sc.nextInt();
		if(num%2!=0){
			System.out.println(num+"odd number");
		}
	}
}

class Test2{
	public static void main(String[] args) {
		int n=1234;
		int rev=0;
		while(n!=0){
			int rem=n%10;
			rev=rev*10+rem;  
			n=n/10;
			
		}
		   System.out.println(rev);
	}
}*/

/*class Test3{
	public static void main(String[] args) {
		int n=1233;
		int count=0;
		while(n!=0){
			n=n/10;
			count++;
		}

		System.out.println(count);
	}
}*/

/*class Test4{
	public static void main(String[] args) {
		int n=4,fact=1;
		for(int i=1;i<=n;i++){
			fact =fact*i;
		}

		System.out.println(fact);
	}
}*/

 import java.util.Scanner;
 class Test5{
	public static void main(String[] args) {
		int n,sum=0;
		System.out.println("Enter any number");
		Scanner sc=new Scanner(System.in);
		 n=sc.nextInt();
		for(int i=1;i<n;i++){
			if(n%i==0){
				sum=sum+i;
			}
		}
		if(n==sum){
			System.out.println("perfect number");
		}
		else {
			System.out.println("not perfect number");
		}
		
	}
}

class Test6{
	public static void main(String[] args) {
		int n=8,sum=0;
		for(int i=1;i<n;i++){
			if(n%i==0){
				sum=sum+i;
			}
		}
		if(n==sum){
			System.out.println("perfect number");
		}
		else {
			System.out.println("not perfect number");
		}
	}
}

class Test7{
	public static void main(String[] args) {
	          int a=0,b=1,c=0;
	          System.out.println(a+" "+b);
	          for(int i=1;i<=6;i++){
	          	  c=a+b;
	          	  System.out.println(c);
	          	   a=b;
	               b=c;
	          }
	         
	          
	}
}

class Test8{
	public static void main(String[] args) {
		int a=1,b=1,c,sum=0;
		for(int i=0;i<=5;i++){
			c=a+b;
			
			System.out.println(c);
			a=b;
			b=c;
		}
	}
}




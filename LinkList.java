// class FactData{
// 	  public static void main(String[] args) {
// 	  	     int n = 3;
// 	  	     int fact  = 1;
// 	  	     for(int i =1;i<=n;i++)
// 	  	     {
// 	  	     	fact = fact*i;

// 	  	     }
// 	  	     System.out.println(fact);
// 	  }
// }

                    /*FACTORIAL PROGRAM USING USER TAKE INPUT  VALUE
                        Factorial program based on numbers multiplication*/
                        
 import java.util.Scanner;
// class Factorial{
// 	public static void main(String[] args) {
// 		 Scanner sc = new Scanner(System.in);
// 		 System.out.println("Enter your number");
// 		 int n = sc.nextInt();
// 		 int fact = 1;
// 		 for(int i =1;i<=n;i++)
// 		 {
// 		 	fact = fact*i;
// 		 }
// 		 System.out.println(fact);
// 	}
// }


// class EvenOdd{
// 	public static void main(String[] args) {
// 		 Scanner sc = new Scanner(System.in);
// 		 System.out.println("Enter your number");
// 		 int num = sc.nextInt();
// 		 if(num%2==0)
// 		 {
// 		 	System.out.println("number is even" +num);
// 		 }
// 		 else 
// 		 {
// 		 	System.out.println("number is odd" +num);
// 		 }
// 	}
// }

/*class PrimeNumber{
	public static void main(String[] args) {
		  int n = 53;
		  boolean temp = true;
		  if(n==1)
		  	System.out.println("number is not  prime");
		  else{

			  for(int i=2;i<=n/2;i++)
			  {
			  	 if(n%i==0)
			  	 {
			  	 	temp = false;
			  	 	System.out.println("number is not  prime");
			  	 	break;
			  	 }
			  }
			  
			  if(temp)
			  {
			  	System.out.println("number is prime");
			  }
		
	  }
    }
}
*/

 // class Pattern{
 // 	public static void main(String[] args) {
 // 		   int n = 5;
 // 		   for(int i =1;i<=5;i++)
 // 		   {
 // 		   	  for(int j = i;j<=5;j++)
 // 		   	  {
 // 		   	  	  System.out.print("*");
 // 		   	  }
 // 		   	  System.out.println(" ");
 // 		   }

 // 	}
 // }

 // class Pattern{
 // 	public static void main(String[] args) {
 // 		   int n =5;
 // 		   for(int i =1;i<=5;i++)
 // 		   {
 // 		   	 for(int j =1;j<=i;j++)
 // 		   	 {
 // 		   	 	  System.out.print("*");
 // 		   	 }
 // 		   	 System.out.println(" ");
 // 		   }
 // 	}
 // }


                 //STRONG NUMBER PROGRAM
     //strong number is a sum of factorial equal is number 
//  class StronNumber{
//  	public static void main(String[] args) {
//  		  int num = 40585,rem,sum = 0,n=num;
//  		  while(num != 0)
//  		  {
//  		  	  rem = num%10;
//  		  	  int data = isfact(rem);

//  		  	  sum = sum+data;

//  		  	  num = num/10;

//  		  } 
//  		  if(n==sum)
//  		  {
//  		  	System.out.println(" strong  number");
//  		  }
//  		  else {
//  		  	System.out.println(" not strong number");
//  		  }
// }

//  	public static int isfact(int n){
//  		int fact = 1;
//  		  for(int i =1;i<=n;i++)
//  		  {
//  		  	   fact = fact * i;
//  		  }
//  		  return fact;
//  	}
//  }

class ArmStrong{
	public static void main(String[] args) {
		int n = 407,rem,num=n,cube;
		int sum = 0;
		while(n!=0)
		{
			 rem = n%10;
			 cube = isCube(rem);
			 sum = sum+cube;
			 n = n/10;

		}
		if(num == sum)
		{
			System.out.println("armstrong number");
		} 
		else 
		{
			System.out.println("not armstrong number"+num);
		} 
	}

	public static int isCube(int n)
	{
		 int c = 1;
		 for(int i =1;i<=n;i++)
		 {
              c = n*n*n;
		 }
		 return c;
	}
}

 

 // class Power{
 // 	public static void main(String[] args) {
 // 		   int n = 2,pow = 4,c=1;
 // 		   for(int i =n;i<=pow;i++)
 // 		   {
 // 		   	   c = pow *n;
 // 		   }
 // 		   System.out.println(c);
 // 	}
 // }
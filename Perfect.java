// class Data{
//    public static void main(String[] args) {
// 		  int n = 6,sum=0;
// 		  for(int i=1;i<n;i++)
// 		  {
// 		  	  if(n%i==0)
// 		  	  {
//                   sum = sum+i;
// 		  	  }
		  	  
//           }
//            if(sum==n)
//            {
//            	System.out.println("no is perfect");
//            }
//            else 
//            {
//            	System.out.println("no is not perfect");
//            }
// 	}
// }

// import java.util.Scanner;
// class Demo{

// 	public static int divNumber(int num)
// 	{ 
// 	    int sum=0;
// 	    for(int i=1;i<num;i++)
// 		{
//             if(num%i==0)
//             {
//        	      sum = sum+i;
//             }
           
// 		}
//         return sum;
// 	}
// }

// class Test{
// 	  public static void main(String[] args) {
// 	  	   int n = 10;
// 	  	   int a = 0,b = 1,c=0;
// 	  	   for(int i = 0;i<=n;i++)
// 	  	   {
// 	  	   	  c = a+b;
// 	  	   	  a = b;
// 	  	   	  b = c;
// 	  	   	  System.out.println(b);
// 	  	   }
	  	   
// 	  }
// }


// class Monika{
// 	  public static void main(String[] args) {
// 	  	     int n = 6,sum=0;
// 	  	     for(int i =1;i<n;i++)
// 	  	     {
// 	  	     	 if(n%i==0)
// 	  	     	 {
// 	  	     	 	 sum = sum+i;
// 	  	     	 }
// 	  	     }
// 	  	     if(sum==n)
// 	  	     {
// 	  	     	System.out.println("no is perfect");
// 	  	     }
// 	  	     else {
// 	  	     	 System.out.println("not perfect number");
// 	  	     }
// 	  }
// }


// class MonikaFact{
// 	   public static void main(String[] args) {
// 	   	    int fact = 1 , n = 4;
// 	   	    for(int i =1;i<=n;i++)
// 	   	    {
// 	   	    	 fact = fact*i;
// 	   	    }

//             System.out.println(fact);
// 	   }
// }

class SwappingPrograms{
	  public static void main(String[] args) {
	  	     int a = 1 , b = 2;
	  	      a=a+b;
	  	      b=a-b;
	  	      a=a-b;
	  	     // c = b;
	  	     // b = a;
	  	     // a = c;
	  	     System.out.println(a);
	  	     System.out.println(b);
	  }
}


class Prie{
	  public static void main(String[] args) {
	  	     
               boolean temp = false;
	  	       int n = 10;
	  	       for(int i =2;i<n/2;i++)
	  	       {
	  	       	    if(n%i==0)
	  	       	    temp = true;

	  	       }
	  	      if(temp)
	  	      System.out.println("nnot is prime");
	  	      else 
	  	      System.out.println("is prime"); 
	  }
}
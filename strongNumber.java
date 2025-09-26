// class Demo{

// 	  public static int intFact(int n)
// 	 {
// 	 	 int fact=1,sum=0;
//          for(int i=1;i<=n;i++)
//          {
//              fact = fact*i;
              
// 	     }
//          return sum;
//      }
// 	public static void main(String[] args) {
// 		  int n = 145,rem,sum=0;
// 		  while(n!=0)
// 		  {
//              rem = n%10;
//              int data = Data.intFact(rem);
//              sum = sum+rem;
      
//            }

//           n = n/10;
//           if(sum==n)
//           {
//           	System.out.println("strong number");
//           }
//          else 
//          {
//          	System.out.println("not perfect number");
//          }
// 	}
// }



// class MonikaStrongNumber{

// 	   public static int fact(int n)
// 	   {
// 	   	   int fact = 1;
// 	   	   for(int i =1;i<=n;i++)
// 	   	   {

// 	   	   	    fact = fact*i;
// 	   	   }
// 	   	   return fact;
// 	   }
// 	  public static void main(String[] args) {
// 	  	     int n = 145,rem=0,sum=0;
// 	  	     int temp = n;
// 	  	     while(n!=0)
// 	  	     {
// 	  	     	 rem = n%10;
// 	  	     	 int data = MonikaStrongNumber.fact(rem);
// 	  	     	 // System.out.println(rem);
// 	  	     	 sum = sum+data;
// 	  	     	 System.out.println(data);
// 	  	     	 n = n/10;
// 	  	     }
//              System.out.println(n);
// 	  	     if(temp==sum)
// 	  	     	System.out.println("strong number");
// 	  	     else 
// 	  	     	System.out.println("not strong number");
// 	  }
// }



// class PallindromeMonika{
// 	   public static void main(String[] args) {
	   	    
// 	   	       int n = 1112,rem=0,sum=0;
// 	   	       int temp = n;
// 	   	       while(n>0)
// 	   	       {
// 	   	       	  rem = n%10;
// 	   	       	  sum = (sum*10)+rem;
// 	   	       	  n = n/10;
// 	   	       }
// 	   	       if(temp == sum)
// 	   	       	System.out.println("pallindrome number");
// 	   	       else 
// 	   	       	System.out.println("not pallindrome number");
// 	   }
// }



// class ReverseNumber{
// 	  public static void main(String[] args) {
// 	  	    int n = 123456;
// 	  	    int rem,sum=0;
// 	  	    while(n!=0)
// 	  	    {
// 	  	    	 rem = n%10;
// 	  	    	 sum = sum*10+rem;
// 	  	    	 n = n/10;
// 	  	    }
// 	 	    System.out.println(sum);
// 	  }
// }

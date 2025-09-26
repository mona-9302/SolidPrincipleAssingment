// class Data{

//     public static void main(String[] args) {
// 		  // System.out.println(powNumber(5,4)); 

//    }
// 	public static int powNumber(int n,int p)
// 	{
// 		int pow=n;
// 		for(int i =1;i<p;i++)
// 		{
//             pow = pow*n;
// 		}
// 		return pow;
// 	}
//  }

//  class Count{

//  	public static void main(String[] args) {
// 	{
// 		int n = 12345,count= 0;
// 		while(n!=0)
// 		{
// 			n = n/10;
// 			count++;
// 		}
// 		System.out.println(count);
// 	}
//  }
// }


class Test{

    public static int count(int n)
    {
    	int c = 0;
    	while(n!=0)
    	{
    		n = n/10;
    		c++;
    	}
    	return c;
    }

    public static int power(int n,int p)
    {
    	int data = 1;
    	for(int i =1;i<=p;i++)
    	{
    		 data = data*n;
    	}
    	return data;
    }
	public static void main(String[] args) {
		  
		  int n = 153,rem,sum=0;
		  int temp=n;
		  int value = count(n);
		  while(n!=0)
		  {
		  	 rem = n%10;
		  	 int p = power(rem,value);
		  	 sum = sum+p;
		  	 n = n/10; 
		  }
		  if(temp==sum)
		  {
		  	 System.out.println("Arm strong  number");
		  }

		  else 
		  {
		  	System.out.println("not Arm strong number");
		  }
	}
}


// class MonikaArmStrong{

// 	  public static int count(int n)
// 	  {
// 	  	  int sum = 0;
// 	  	  while(n!=0)
// 	  	  {
// 	  	  	 n = n/10;
// 	  	  	 sum++;
// 	  	  }
// 	  	  return sum;
// 	  }

// 	  public static int pow(int n,int p)
// 	  {
// 	  	    int data = 1;
// 	  	    for(int i =1;i<=p;i++)
// 	  	    {
// 	  	    	data = data*n;
// 	  	    }
// 	  	    return data;
// 	  }
// 	   public static void main(String[] args) {
	   	     
// 	   	        int n =15,rem=0,sum=0;
// 	   	        int temp = n;
// 	   	        int value = count(n);
// 	   	        while(n!=0)
// 	   	        {
//                     rem = n%10;
//                     int data = pow(rem,value);
//                     sum = sum+data;
//                     n = n/10;
// 	   	        }

// 	   	        if(temp==sum)
// 	   	        	System.out.println("arm strong number");
// 	   	        else 
// 	   	        	System.out.println("not arm strong number");
// 	   }
// }

class StrongMonika{

	  public static int pow(int n, int p)
	  public static void main(String[] args) {
           
             int n = 145,rem=0,sum=0;
             while(n!=0)
             {
             	 rem = n%10;
             	 
             }
	  }
}
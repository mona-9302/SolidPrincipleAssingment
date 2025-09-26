class Demo{

	  public static int intFact(int n)
	 {
	 	 int fact=1,sum=0;
         for(int i=1;i<=n;i++)
         {
             fact = fact*i;
              
	     }
         return fact;
     }
	public static void main(String[] args) {
		  int n = 145,rem,sum=0;
          int temp = n;
		  while(n!=0)
		  {
             rem = n%10;
             int data = intFact(rem);
             sum = sum+data;
             n = n/10;
         }

          if(temp==sum)
          {
          	System.out.println("strong number");
          }
         else 
         {
         	System.out.println("not perfect number");
         }
	}
}
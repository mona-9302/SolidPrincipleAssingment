class ArmStrong{
	public static void main(String[] args) {
		int n = 145,rem,num=n,cube;
		int sum = 0;
		int power = countP(n);
		
		while(n!=0)
		{
			 rem = n%10;
			 cube = power(rem,power);
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

	public static int countP(int n)
	{
         int count = 0;
         while(n!=0)
		{
			
		     count++;
			 n = n/10;
        }
        return count;

	}
	public static int power(int n,int p)
	{
		 int c = 1;
		 for(int i =1;i<=p;i++)
		 {
              c = c*n;
		 }
		 return c;
	}
}
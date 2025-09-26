import java.util.*;
class StrReverse{
	  public static void main(String[] args) {
	  	     String s = "nayanr";
	  	     char ch[] = s.toCharArray();
	  	     boolean temp = true;
	  	     int start = 0,last=ch.length-1;
	  	     while(start<last)
	  	     {
	  	     	 if(ch[start]!=ch[last])
	  	     	 {
	  	     	 	 temp = false;
	  	     	 	 System.out.println("string is not palindrome");
	  	     	 	 break;
	  	     	 
	  	     	 }
	  	     	    start++;
	  	     	 	last--; 
	  	     }
	  	     if(temp)
	  	     {
	  	     	System.out.println("string is palindrome");
	  	     }     
	  }
}


class PracticeStringPallindrome{

	 public static void main(String[] args) {
	 	
	 	    String s = "nayan";
	 	    char ch[] = s.toCharArray();
	 	    int start = 0, last = ch.length-1;
	 	    boolean temp = true;

	 	    while(start<last) 
	 	    {
	 	    	 if(ch[start]!=ch[last])
	 	    	  {
	 	    	  	   temp = false;
	 	    	  	   System.out.println("string is not pallindrome");
	 	    	  	   break;
	 	    	  }

	 	    	  start++;
	 	    	  last--;
	 	    }
	 	    if(temp){
	 	    	System.out.println("string is pallindrome");
	 	    }
	 }
}
class Demo{
	  public static void main()
	  {
	  	 System.out.println("main method");
	  }

	  public static void main(String[] args) {
	  	     main();
	  }
}


class Demo1{
	  public static void main(String[] args) {
	  	    Hashtable<String, String> ht = new Hashtable<>();
	  	    ht.put("101","monika");
	  	    ht.put("103","aaj");
	  	    ht.put("103","ertyu");
	  	    ht.put("103","pawan");
	  	    ht.put("104","z");

	  	    System.out.println(ht);
	  }
}

class PracticeString{

	 public static void main(String[] args) {
	 	           String s = "nayan";
	 	           boolean temp = true;
	 	           int start=0,last=s.length()-1;
	 	           for(int i =0;i<s.length();i++)
	 	           {
	 	           	  if(s.charAt(start)!=s.charAt(last))
	 	           	  {
	 	           	  	  temp = false;
                          System.out.println("not palindrome");
                          break;
	 	           	  }
	 	           	  start++;
	 	           	  last--;
	 	           }
	 	           if(temp)
	 	           {
	 	           	  System.out.println("is palindrome");
	 	           }
	 	     }
	 }


class PracticeStr{
	  public static void main(String[] args) {
	  	    System.out.println("please enter string");
	  	    Scanner sc = new Scanner(System.in);
	  	    String s = sc.next();
	  	    boolean temp= true;
	  	    int start=0,last=s.length()-1;
	  	    for(int i =0;i<s.length();i++)
	  	    {
	  	    	 if(s.charAt(start)!=s.charAt(last))
	  	    	 {
                     temp = false;
                     System.out.println("not palindrome");
                     break;
	  	    	 }
	  	    }
	  	    if(temp)
	  	    {
	  	    	System.out.println("is palindrome");
	  	    }
	  }
}

class IsPrimeNumber{
	 public static void main(String[] args) {
	 	int n = 23;
        boolean temp = true;
	 	   for(int i =2;i<=n/2;i++)
	 	   {
	 	   	   if(n%i==0)
	 	   	   {
	 	   	   	   temp = false;
	 	   	   	   System.out.println("not prime");
	 	   	   	   break;
	 	   	   }
	 	   }
	 	   if(temp)
	 	   {
	 	   	  System.out.println("is prime");
	 	   } 


	 }
}


class PrimeNumberProgram{
	public static void main(String[] args) {
		
		  int n = 20;
		  boolean temp = true;

		  for(int i=2;i<=n/2;i++)
		  {
		  	 if(n%i==0)
		  	 {
		  	 	 temp = false;
		  	 	 System.out.println("not prime");
		  	 	 break;
		  	 }
		  }
		  if(temp){
		  	System.out.println("prime number");
		  }
	}
}


class CountProgram{
	public static void main(String[] args) {
		
		  int  n = 123445665;
		  int count = 0;
		  while(n!=0)
		  {
		  	 n = n/10;
		  	 count++;
		  }
		  System.out.println(count);
	}
}


class  FactorialProgram{

	 public static void main(String[] args) {
	 	
	 	  int n = 5,fact = 1;

	 	  for(int i=1;i<=n;i++)
	 	  {

	 	  }

	 }
}



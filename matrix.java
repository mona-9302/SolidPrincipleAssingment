// import java.util.*;
// class PatternMatrix{

// 	 public static void main(String[] args) {
// 	 	   int n = 6;
// 	 	   for(int i =0;i<=n;i++)
// 	 	   {
// 	 	   	   for(int j =0;j<=n;j++)
// 	 	   	   {
// 	 	   	   	  if(i+j==n||i==n||j==n){
	 	   	   	  
// 	 	   	   	  	 System.out.print("*");
// 	 	   	   	  	}
// 	 	   	   	  else {
// 	 	   	   	  	  System.out.print(" ");
// 	 	   	   	  }
// 	 	   	   }
// 	 	   	   System.out.println();
// 	 	   }

// 	 }


// class PatternStar{
// 	  public static void main(String[] args) {
// 	  	 int n = 9;
// 	  	 for(int i =0;i<=n;i++)
// 	  	 {
// 	  	 	  for(int j=0;j<=n;j++)
// 	  	 	  {
// 	  	 	  	  if(i==0||j==n||i==j)
// 	  	 	  	  {
// 	  	 	  	  	  System.out.print("*");
// 	  	 	  	  }
// 	  	 	  	  else {
// 	  	 	  	  	  System.out.print(" ");
// 	  	 	  	  }
// 	  	 	  }
// 	  	 	  System.out.println();
// 	  	 }
// 	  }
// }



// class Pattern1{

// 	  public static void main(String[] args) {
	  	   
// 	  	    int n =10;
// 	  	    for(int i =0;i<=n;i++)
// 	  	    {
// 	  	    	 for(int j =0;j<=n;j++)
// 	  	    	 {
// 	  	    	 	  if(j==0||i==n||i==j)
// 	  	    	 	  {
// 	  	    	 	  	System.out.print("*");
// 	  	    	 	  }
// 	  	    	 	  else {
// 	  	    	 	  	 System.out.print(" ");
// 	  	    	 	  }
// 	  	    	 }
// 	  	    	 System.out.println();
// 	  	    }
// 	  }
// }


// class Pattern2{
// 	 public static void main(String[] args) {
// 	 	   int n =5;
// 	 	   for(int i =1;i<=n;i++)
// 	 	   {
	 	   	  
// 	 	   	   for(int j ='A';j<'A'+i;j++)
// 	 	   	   {
// 	 	   	   	   System.out.print((char)j);
// 	 	   	   }
// 	 	   	   System.out.println();
// 	 	   }
// 	 }
// }


// OUTPUT-
// ***
// * *
// ***
// class Pattern3{
// 	  public static void main(String[] args) {
// 	  	   int n =3;
// 	  	   for(int i=0;i<n;i++)
// 	  	   {
// 	  	   	   for(int j =0;j<n;j++)
// 	  	   	   {
// 	  	   	   	  if(i==0||j==n||i==n-1||j==0||j==n-1)
// 	  	   	   	  {
// 	  	   	   	  	 System.out.print("*");
// 	  	   	   	  }
// 	  	   	   	  else {
// 	  	   	   	  	  System.out.print(" ");
// 	  	   	   	  }
// 	  	   	   }
// 	  	   	    System.out.println();
// 	  	   }
	  	  
// 	  }
// }

class IsPrime{

	  public static void main(String[] args) {
	  	  
	  	    int n = 10;
	  	    boolean temp = true;
	  	    for(int i=2;i<=n/2;i++)
	  	    {
	  	    	if(n%i==0)
	  	    	{
	  	    		 temp=false;
	  	    	}
	  	    	
	  	    }
	  	    if(temp)
	  	    {
	  	    	System.out.println("no is prime");
	  	    }
	  	    else {
	  	    	System.out.println("no is not prime");
	  	    }
	  }
}


       
    
 
// class Pattern4{
// 	 public static void main(String[] args) {
// 	 	  int n =4;
// 	 	  for(int i =0;i<n;i++)
// 	 	  {
// 	 	  	 for(int j =0;j<n;j++)
// 	 	  	 {
// 	 	  	 	  if(j==0||i==n-1||i==j)
// 	 	  	 	  {
// 	 	  	 	  	  System.out.print("*");
// 	 	  	 	  }
// 	 	  	 	  else {
// 	 	  	 	  	  System.out.print(" ");
// 	 	  	 	  }
// 	 	  	 }
// 	 	  	 System.out.println();
// 	 	  }
// 	 }
// }

// *
// **
// * *
// ****


//    *
//   **
//  * *
// ****
// class Pattern5{

// 	 public static void main(String[] args) {
// 	 	   int n =4;
// 	 	   for(int i =0;i<n;i++)
// 	 	   {
// 	 	   	 for(int j=0;j<n;j++)
// 	 	   	 {
// 	 	   	 	 if(j==n-1||i==n-1||i+j==n-1)
// 	 	   	 	 {
// 	 	   	 	 	 System.out.print("*");
// 	 	   	 	 }else {
// 	 	   	 	 	 System.out.print(" ");
// 	 	   	 	 }
// 	 	   	 }
// 	 	   	 System.out.println();
// 	 	   }
// 	 }
// }


// ****
// * *
// **
// *
// class Pattern6{

// 	 public static void main(String[] args) {
// 	 	  int n =4;
// 	 	  for(int i =0;i<n;i++)
// 	 	  {
// 	 	  	 for(int j=0;j<n;j++)
// 	 	  	 {
// 	 	  	 	 if(i==0||j==0||i+j==n-1)
// 	 	  	 	 {
// 	 	  	 	 	 System.out.print("*");
// 	 	  	 	 }
// 	 	  	 	 else {
// 	 	  	 	 	 System.out.print(" ");
// 	 	  	 	 }
// 	 	  	 }
// 	 	  	 System.out.println();
// 	 	  }
// 	 }
//   }

// ****
//  * *
//   **
//    *
// class Pattern7{
// 	 public static void main(String[] args) {
// 	 	  int n= 4;
// 	 	  for(int i =0;i<n;i++)
// 	 	  {
// 	 	  	 for(int j=0;j<n;j++)
// 	 	  	 {
// 	 	  	 	 if(i==0||j==n-1||i==j)
// 	 	  	 	 {
// 	 	  	 	 	 System.out.print("*");
// 	 	  	 	 }
// 	 	  	 	 else {
// 	 	  	 	 	 System.out.print(" ");
// 	 	  	 	 }
// 	 	  	 }
// 	 	  	 System.out.println();
// 	 	  }
// 	 }
// }


// class Pattern8{
// 	 public static void main(String[] args) {
// 	 	   int n= 10;
// 	 	   for(int i =0;i<n;i++)
// 	 	   {
// 	 	   	 for(int j= 0;j<n;j++)
// 	 	   	 {
// 	 	   	 	  if(i+j==n/2||i==n/2||j-i==n/2)
// 	 	   	 	  {
// 	 	   	 	  	 System.out.print("*");
// 	 	   	 	  }
// 	 	   	 	  else {
// 	 	   	 	  	System.out.print(" ");
// 	 	   	 	  }
// 	 	   	 }
// 	 	   	 System.out.println();
// 	 	   }
// 	 }
// }

// class Pattern8{
// 	 public static void main(String[] args) {
// 	 	 int n =4;
// 	 	 for(int i =0;i<=n;i++)
// 	 	 {
// 	 	 	 for(int j=0;j<=i;j++)
// 	 	 	 {
//                  if(j==0||i==n||i==j)
//                  {
//                  	System.out.print("*");
//                  }
//                  else 
//                  {
//                  	 System.out.print(" ");
//                  }
// 	 	 	 }
// 	 	 	 System.out.println();
// 	 	 }
// 	 }
// }


// class Pattern9{
// 	 public static void main(String[] args) {
// 	 	  int n=15;
// 	 	  for(int i=0;i<=n/2;i++)
// 	 	  {
// 	 	  	 for(int j=0;j<n;j++)
// 	 	  	 {
// 	 	  	 	if(i+j==n/2||i==n/2||j-i==n/2)
// 	 	  	 	{
// 	 	  	 		System.out.print("*");
// 	 	  	 	}
// 	 	  	 	else {
// 	 	  	 		System.out.print(" ");
// 	 	  	 	}
// 	 	  	 }
// 	 	  	 System.out.println();
// 	 	  }
// 	 }
// }


// class Pattern10{
// 	 public static void main(String[] args) {
// 	 	 int n = 7;
// 	 	 for(int i =0;i<n;i++)
// 	 	 {
// 	 	 	 for(int j=0;j<n;j++)
// 	 	 	 {
// 	 	 	 	 if(i+j==n/2||i-j==n/2||i-j==n/2||i+j==n/2)
// 	 	 	 	 {
// 	 	 	 	 	System.out.print("*");
// 	 	 	 	 }
// 	 	 	 	 else {
// 	 	 	 	 	System.out.print(" ");
// 	 	 	 	 }
// 	 	 	 }
// 	 	 	 System.out.println();
// 	 	 }
// 	 }
// }


// class Demo{

// 	  public  List<String> msg(String name)
// 	  {
// 	  	 List<String> list  =  new ArrayList<>();
// 	  	 System.out.println("parent class method");
// 	  	 return "";
// 	  }
// }

// class Data extends Demo{

// 	    public ArrayList<String> msg(int a)
// 	    {
// 	    	System.out.println("child class method");
// 	    	return new ArrayList<>();
	    	
// 	    }
// }


//   final class Test{
// 	      int a = 10;
// 	  private  final static int b = 20;
// 	 public static final  void main(String[] args) {
//          final int c = 20;
// 	 	 // Demo t = new Demo();
// 	 	 // System.out.println(t.a);
// 	 	 System.out.println(b);
// 	 	 System.out.println(c);
// 	 }
// }

// class Demo {
  
//       void msg()
//       {
//          Test t= new Test();
//          System.out.println(t.a = 0);
//       }
// }


// class Pattern11{

// 	 public static void main(String[] args) {
// 	 	   int n=15;
// 	 	   for(int i=0;i<n;i++)
// 	 	   {
// 	 	   	  for(int j=0;j<n;j++)
// 	 	   	  {
// 	 	   	  	  if(i+j==n/2||j-i==n/2||i-j==n/2||i+j==n*2/+1)
// 	 	   	  	  {
// 	 	   	  	  	 System.out.print("*");
// 	 	   	  	  }
// 	 	   	  	  else {
// 	 	   	  	  	System.out.print(" ");
// 	 	   	  	  }
// 	 	   	  	// System.out.print(i+""+j+" ");
// 	 	   	  }
// 	 	   	  System.out.println();
// 	 	   }
// 	 }
// }

// 



// class Pattern12{
// 	 public static void main(String[] args) {
// 	 	    int n = 10;
// 	 	    if(n%2==0)
// 	 	    	n+=1;
// 	 	    for(int i=0;i<n;i++)
// 	 	    {
// 	 	    	 for(int j=0;j<n;j++)
// 	 	    	 {
// 	 	    	 	 if(i==n/2||j==n/2)
// 	 	    	 	 {
// 	 	    	 	 	System.out.print("* ");
// 	 	    	 	 }
// 	 	    	 	 else {
// 	 	    	 	 	System.out.print("  ");
// 	 	    	 	 }
// 	 	    	 	// System.out.print(i+""+j+" ");
// 	 	    	 }
// 	 	    	 System.out.println();
// 	 	    }
// 	 }
  // OUTPUT = +
// }

// class Pattern12{
// 	 public static void main(String[] args) {
// 	 	    int n =15;
// 	 	    if(n%2==0)
// 	 	    	n+=1;
// 	 	    for(int i=0;i<n;i++)
// 	 	    {

// 	 	    	 for(int j=0;j<n;j++)
// 	 	    	 {
// 	 	    	 	 if(i==0||j==n/2)
// 	 	    	 	 {
// 	 	    	 	 	 System.out.print("* ");
// 	 	    	 	 }
// 	 	    	 	 else {
// 	 	    	 	 	 System.out.print("  ");
// 	 	    	 	 }
// 	 	    	 	// System.out.print(i+""+j+" ");
// 	 	    	 }
// 	 	    	 System.out.println();
// 	 	    }
// 	 }
// }	

// class Pattern12{
// 	 public static void main(String[] args) {
// 	 	    int n =7;
// 	 	    if(n%2==0)
// 	 	    	n+=1;
// 	 	    for(int i=0;i<=n;i++)
// 	 	    {

// 	 	    	 for(int j=0;j<=n;j++)
// 	 	    	 {
// 	 	    	 	 if(i==0||j==n/2||i+j==n)
// 	 	    	 	 {
// 	 	    	 	 	 System.out.print("* ");
// 	 	    	 	 }
// 	 	    	 	 else {
// 	 	    	 	 	 System.out.print("  ");
// 	 	    	 	 }
// 	 	    	 	// System.out.print(i+""+j+" ");
// 	 	    	 }
// 	 	    	 System.out.println();
// 	 	    }
// 	 }
// }



// class ArrayProgram{
// 	 public static void main(String[] args) {
// 	 	   int arr[] = {1,2,3,4,5,6};
// 	 	   int start=0,last=arr.length-1;
// 	 	   while(start<last)
// 	 	   {
// 	 	   	    int temp = arr[start];
// 	 	   	    arr[start] = arr[last];
// 	 	   	    arr[last] = temp;
// 	 	   	    start++;
// 	 	   	    last--;
// 	 	   }

// 	 	   for(int i=0;i<arr.length;i++)
// 	 	   {
// 	 	   	   System.out.println(arr[i]);
// 	 	   }
// 	 }
// }


// class MinArray{

// 	 public static void main(String[] args) {
// 	 	    int arr[] = {2,3,4,5,6,0};
// 	 	    int n = arr[0];
// 	 	    for(int i =0;i<arr.length;i++)
// 	 	    {
// 	 	    	 if(n>arr[i])
// 	 	    	 {
// 	 	    	 	n = arr[i];
// 	 	    	 }
// 	 	    }
// 	 	    System.out.println(n);
// 	 }
// }



// class MaxArray{
// 	 public static void main(String[] args) {
// 	 	   int arr[] = {1,2,3,4,5};
// 	 	   int n = arr[0];
// 	 	   for(int  i=0;i<arr.length;i++)
// 	 	   {
//                 if(n<arr[i])
//                 {
//                 	n = arr[i];
//                 }
// 	 	   }
// 	 	   System.out.println(n);

// 	 }
// }



// class DuplicateArray{

// 	 public static void main(String[] args) {
	 	    
// 	 	    int arr[] = {1,2,3,4,4};
// 	 	    for(int i=0;i<arr.length;i++)
// 	 	    {
// 	 	    	 for(int j=i+1;j<arr.length;j++)
// 	 	    	 {
// 	 	    	 	 if(arr[i]==arr[j])
// 	 	    	 	 {
//                          System.out.println(arr[i]);
//                          break;
// 	 	    	 	 }
// 	 	    	 }
// 	 	    }
// 	 }
// }


// class IsPrimeNumberProgram{

// 	 public static void main(String[] args) {
	 	
// 	 	   int n = 5;
// 	 	   boolean temp = false;
// 	 	   for(int i =2;i<=n/2;i++)
// 	 	   {
// 	 	   	  if(n%i==0)
// 	 	   	  {
// 	 	   	  	 temp = false;
// 	 	   	  	 System.out.println("not prime");
// 	 	   	  	 break;
// 	 	   	  }
// 	 	   }

// 	 	   if(temp)
// 	 	   {
// 	 	   	  System.out.println("is prime");
// 	 	   }
// 	 }
// }


// class Stack {

// 	 Object stk[];
// 	 int top;

// 	 public Stack()
// 	 {
// 	 	  stk = new object[5];
//           top = -1;
// 	 }

// 	 public Stack(int size)
// 	 {
// 	 	  stk = new Object[size];
// 	 	  top = -1;
// 	 }

//      public int size()
//      {
//      	 return top+1;
//      }

//      public int capacity()
//      {
//      	 return stk.length;
//      }

//      public void push(int val)
//      {
//      	 if(top==stk.length)
//      	 	System.out.println("stack is full");
//      	 return;

//          top++;
//          stk[top] = value;

//      }

//      public Object pop()
//      {
//      	 if(top==-1)
//      	 	return null;

//      	 Object ob = stk[top];
//      	 top--;
//      	 return ob;
//      }

//      public  Object peek()
//      {
//      	 if(top==-1)
//      	 	return null;

//      	 Object ob = stk[top];
//      	 return ob;
//      }

//      public String toString()
//      {
//      	 String s = "";
//      	 if(top==-1)
//      	 return "";

//      	for(int i=top;i>=0;i--)
//      	{
//      		s = s+","+stk[i];
//      	}

//      	return s.substring(1);
//      }
// }


// class Test{

// 	 public static void main(String[] args) {
	 	  
// 	 	     Stack s = new Stack();
// 	 	     System.out.println(s.size());
// 	 }
// }


class A{

	  public void m1(){
	  System.out.println("A");
	}
}

class B{

	 public static void main(String[] args) {
	 	
	 	   System.out.println("monika");
	 }
}

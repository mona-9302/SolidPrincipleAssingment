import java.util.*;
// import java.util.Scanner;
class LargestArrayElement{

	 public static void main(String[] args) {
	 
	     int arr[] = {1,2,3,4,5,6};
	     int max = arr[0];
	     for(int i=0;i<arr.length;i++)
	     {
	     	 if(max<arr[i])
	     	 {
	     	 	 max = arr[i];
	     	 }
	     }
	     System.out.println(max);
    }
}


class SecondLargestElement{

	  public static void main(String[] args) {
	  	
	  	   int arr[] = {7,2,3,4,5,6};
	  	   int temp,size=arr.length;
	  	   for(int i=0;i<size;i++)
	  	   {
	  	   	   for(int j=i+1;j<size;j++)
	  	   	   {
	  	   	   	   if(arr[i]>arr[j])
	  	   	   	   	{
                        temp = arr[i];
                        arr[i] = arr[j];
                        arr[j] = temp;
                        // System.out.println("monika");
	  	   	   	   	}

	  	   	   }
	  	   }
	  	   System.out.println("second largest element :: " +arr[size-2]);
	  }
}


class ThirdLargestArrayElement{

	 public static void main(String[] args) {
	 	  
	 	  int arr[] = {1,2,3,4,5,6};
	 	  int temp,size=arr.length;
	 	  for(int i=0;i<size;i++)
	 	  {
	 	  	  for(int j=i+1;j<size;j++)
	 	  	  {
	 	  	  	  if(arr[i]>arr[j])
	 	  	  	  {
	 	  	  	  	   temp = arr[i];
	 	  	  	  	   arr[i] = arr[j];
	 	  	  	  	   arr[j] = temp;
	 	  	  	  }
	 	  	  }
	 	  }
	 	  System.out.println("third largest element :: "+arr[size-3]);
	 }
}


class ArrayDigitsSum{

	 public static void main(String[] args) {
	 	
	 	  int arr[] = {1,2,3,4,5,6};
	 	  int sum=0;
	 	  for(int i=0;i<arr.length;i++)
	 	  {
	 	  	 sum = sum+arr[i];
	 	  }

	 	  System.out.println(sum);
	 }
}

class ReverseArray{

	 public static void main(String[] args) {
	 	
	 	 int arr[] = {1,2,3,4,5,6};
	 	 System.out.println("before reverse array");
	 	 for(int i=0;i<arr.length;i++)
	 	 {
	 	 	System.out.println(arr[i]);
	 	 }
	 	 int start=0,last=arr.length-1;
	 	 while(start<last)
	 	 {
	 	 	 int temp = arr[start];
	 	 	 arr[start] = arr[last];
	 	 	 arr[last] = temp;

	 	 	 start++;
	 	 	 last--;
	 	 }

       System.out.println("after reverse array");
	 	 for(int i=0;i<arr.length;i++)
	 	 {
	 	 	 System.out.println(arr[i]);
	 	 }
	 }
}

class ArraySmallestElement{

	public static void main(String[] args) {
		
		 int arr[] = {1,2,3,4,5,6};
		 int min = arr[0];
		 for(int i=0;i<arr.length;i++)
		 {
		 	 if(min>arr[0])
		 	 {
		 	 	 min = arr[0];
		 	 }
		 }
		 System.out.println(min);
	}
}


class SecondSmallestElementArray{

	  public static void main(String[] args) {
	  	
	  	  int arr[] = {0,1,2,3,4,5,6};
	  	  int temp,size=arr.length;
	  	  for(int i=0;i<size;i++)
	  	  {
	  	  	 for(int j=i+1;j<size;j++)
	  	  	 {
	  	  	 	  if(arr[i]>arr[j])
	  	  	 	  {
	  	  	 	  	  temp = arr[i];
	  	  	 	  	  arr[i] = arr[j];
	  	  	 	  	  arr[j] = temp;
	  	  	 	  }
	  	  	 }
	  	  }
	  	  System.out.println("second smallest array :: "+arr[1]);
	  }
}


class DeleteArrayElement{

	  public static void main(String[] args) {
	  	
	  	    int arr[] = {1,2,3,4,5,6};
	  	    int pos=0;
	  	    for(int i=pos;i<arr.length-1;i++)
	  	    {
	  	    	 arr[i] = arr[i+1];
	  	    }

	  	    for(int i=0;i<arr.length-1;i++)
	  	    {
	  	    	 System.out.println(arr[i]);
	  	    }
	  }
}


class EvenElementDigitSum{

	public static void main(String[] args) {
		
		  int arr[] = {1,2,3,4,5,6};
		  int sum=0;
		  for(int i=0;i<arr.length;i++)
		  {
		  	  if(arr[i]%2==0)
		  	  {
		  	  	  sum = sum+arr[i];
		  	  }
		  }

		  System.out.println(sum);
	}
}


class ArraySortingProgram{

	 public static void main(String[] args) {
	 	
	 	  int arr[] = {1,2,5,6,0,2};
	 	  int temp;
	 	  for(int i=0;i<arr.length;i++)
	 	  {
	 	  	  for(int j=i+1;j<arr.length;j++)
	 	  	  {
	 	  	  	  if(arr[i]>arr[j])
	 	  	  	  	{
                        temp = arr[i];
                        arr[i] = arr[j];
                        arr[j] = temp;
	 	  	  	  	}
	 	  	  }
	 	  }
	 	  for(int i=0;i<arr.length;i++)
	 	  {
	 	  	  System.out.println(arr[i]);
	 	  }
	 }
}

// class MPP{

// 	  public static void main(String[] args) throws ArithmeticException{
	 	  
//                try{

//                	     try{
//                	     	    int arr[] = new int[5];
//                	     	    arr[6] = 6;
//                	     	    return ;
//                	     }

//                	     catch(ArrayIndexOutOfBoundsException e)
//                	     {
//                	     	 System.out.println("arrey index out of bonds");
               	     	 
//                	     }

//                	     finally{
//                	     	   System.out.println("i am finally block");
//                	     }

//                	     try{
//                	     	   int a = 10;
//                	     	   int b = 0;
//                	     	   System.out.println(a/b);
//                	     }

//                	     catch(ArithmeticException e)
//                	     {
//                	     	 System.out.println("airthmetic exception ");
//                	     	 // return ;
//                	     }

//                	     try{

//                	     	   int num = Integer.parseInt("9a");
//                	     	   System.out.println(num);
//                	     }

//                	     catch(NumberFormatException n)
//                	     {
//                	     	 System.out.println("number format");
//                	     }
//                }

//                catch(Exception e)
//                {
//                	  System.out.println("outside catch block");
//                }


// 	 }
// }



class MP{


	 public static void main(String[] args) {
	 	
	 	    try{

                   int a = 10;
	 	           int b =  0;
	 	           System.out.println(a/b);
	 	    }

	 	    finally
	 	    {
	 	    	 System.out.println("airthmetic exception");
	 	    }
	 	    
	 }
}


class HelloWorld{

	 public static void  msg()
     {

	 try{
	 	throw new ArrayIndexOutOfBoundsException("array");
	 }

	 catch(Exception e)
	 {
	 	 System.out.println("catch block");
	 }
	 

}
	 public static void main(String[] args) {
	 	
	 	   msg();
	 }
}

class HelloWorld1{

   static void print() throws NumberFormatException{

        
        System.out.print("Function1");
        throw new NumberFormatException("HELLO FUNCTION 1");
            
    }


  public static void main(String args[]){

    try{

        print();
    }

    catch(Exception e){

        System.out.print("GOT THE EXCEPTION");
    }

  }
}



class HelloWorld2{

      public  static void m1(){
	  try{

	  	    int a = 10;
	  	    int b= 0;
	  	    System.out.println(a/b);
	  }

	  catch(ArithmeticException a)

	  {
	  	 throw new ArrayIndexOutOfBoundsException("array index");
	  }

	  
	}
 public static void main(String[] args) {
 	     
 	     try{
 	     HelloWorld2.m1();
 	 }
 	 catch(Exception e)
 	 {
 	 	 System.out.println("m1 method");
 	 }
   }

}



// class MyThread extends Thread {

// 	  public void run()
// 	  {
// 	  	 for(int i=0;i<=5;i++)
// 	  	 {
// 	  	 	 System.out.println(Thread.currentThread().getName()+""+i);
// 	  	 }
// 	  }
// }


//  class MyThread implements Runnable {

//   public void run()
//   {
//   	  for(int i=0;i<=5;i++)
// 	  {
// 	 	 System.out.println(Thread.currentThread().getName()+""+i);
// 	  }
//   }

// }
// class MainThread{

// 	 public static void main(String[] args) {
	 	
// 	 	   MyThread mt = new MyThread();
// 	 	   Thread t = new Thread(mt);
// 	 	   t.start();
// 	 	   for(int i=0;i<=5;i++)
// 	 	   {
// 	 	   	  System.out.println(Thread.currentThread().getName()+""+i);
// 	 	   }
// 	 }
// }


// class MyArrayList{

// 	 public static void main(String[] args) {
	 	
// 	 	    LinkedList list = new LinkedList();
// 	 	    list.add(10);
// 	 	    list.add(20);
//             list.add(30);
// 	 	    list.add(null);
// 	 	    list.add(null);
// 	 	    System.out.println(list);
// 	 }
// }



class NumberPatternProgram{

	  public static void main(String[] args) {
	  	
	  	   int n = 5;
	  	   for(int i=0;i<=n;i++)
	  	   {
	  	   	  for(int j=0;j<=n;j++)
	  	   	  {
	  	   	  	  if(((i==0&& i<=n/2)||(i+j==n/2 && i<=n/2)||i==n/2))
	  	   	  	  {
	  	   	  	  	  System.out.print("*");
	  	   	  	  }
	  	   	  	  else {
	  	   	  	  	 System.out.print(" ");
	  	   	  	  } 
	  	   	  }
	  	   	System.out.println();
	  	   }
	  	   
	  	  
	  }
}


 class Example {
   public static void main(String [] args) {
      int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
      int n = arr.length;
      int last= arr[n-1], i;
      // System.out.print("The original array is: ");
      // for (i = 0; i < n; i++)
      // System.out.print(arr[i] + " ");
      for (i = n-1; i > 0; i--)
      arr[i] = arr[i-1];
      arr[0] = last;
      System.out.print("The rotated Array is: ");
      for (i = 0; i < n; ++i)
      System.out.print(arr[i] + " ");
   }
}



// class LinkList{

// 	 public static void main(String[] args) {
	 	
// 	 	  LinkedList list = new LinkedList();
// 	 	  list.add(10);
// 	 	  list.add(10);
// 	 	  list.add(30);
// 	 	  list.add(null);
//           list.add(null);

//           LinkedList list1 = new LinkedList();
//           list1.add(40);
//           list.add(50);
         
// 	 	  System.out.println(list1.remove(list));

// 	 }
// }



class Solution {
    
    public static void main(String[] args) {
    	
    	 String s = "acegi";
    	 String s1 = "bdfh";
    	 int j=0;
    	 int length = s.length()+s1.length();
    	 for(int i=0;i<=length/2;i++)
           {
           	      if(s.length()>i)
                  	System.out.print(s.charAt(i));

                   if(s1.length()>i)
                  	System.out.print(s1.charAt(i));
                 
           }
       }
}



class ReverseString{

	public static void main(String[] args) {
		
	            String s = "monika";
	            char ch[] = s.toCharArray();
	            int start=0,last=ch.length-1;
	            while(start<last){
	            	 char c = ch[start];
	            	 ch[start] = ch[last];
	            	 ch[last] = c;

	            	 start++;
	            	 last--;
	            }
	            for(int i=0;i<ch.length;i++)
	            {
	            	System.out.println(ch[i]);
	            }
	}
}


class P1{
	public static void main(String[] args) {
		
		 int arr[] = {1,2,3,4,5,6};
		 for(int i=arr.length-1;i>=0;i--){
		 	System.out.println(arr[i]);
		 }
	}
}

class P2{

	public static void main(String[] args) {
		
		 int arr[] = {1,2,3,4,5,4,3,1,2,3,2,2,1,1};
		 for(int i=0;i<arr.length-1;i++){
		 	int count = 1;

		 	if(arr[i]==-1)
		 		continue;

		 	for(int j=i+1;j<arr.length;j++){
		 		if(arr[i]==arr[j]){
		 			count++;
		 			arr[j]=-1;
		 		}
		 	}
		 	System.out.println(arr[i]+" ======> "+count);
		 }
	}
}


class P3{

	public static void main(String[] args) {
		
		 int arr[] = {1,2,3,8,4,6,7,1,2,3,4,5,6};
		 for(int i=0;i<arr.length-1;i++){
		 	int count = 0;

		 	for(int j=0;j<arr.length;j++){
		 		if(arr[i]==arr[j]){
		 			count++;
		 		}
		 	}
		 	if(count==1){
		 		System.out.println(arr[i]);
		 		return;
		 	}
		 }
	}
}

// class FindMinimum{

// 	public static void main(String[] args) {
		
// 		  int arr[] = {1,2,3,4,5,6,0};
// 		  int max = arr[0];

// 		  for(int i=0;i<arr.length;i++){
// 		  	if(min>arr[i]){
// 		  		max = arr[i];
// 		  	}
// 		  }
// 		  System.out.println("maximum character =====> "+max);
// 	}
// }

class ArrayProgram{

	public static void main(String[] args) {
		
		int arr[]  = {8,5,33,1,6,3,2,8,3};
	for(int i=0;i<arr.length;i++){
		for(int j=i+1;j<arr.length;j++){
			if(arr[i]>arr[j]){
				int temp = arr[i];
				arr[i] = arr[j];
				arr[j] = temp;
			}
			
		}
		System.out.println(arr[i]);
	  }
	}
}




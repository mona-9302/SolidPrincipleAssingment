// class Pen{

// 	     String color;
// 	     String type;

// 	     public void write()
// 	     {
// 	     	 System.out.println(this.type);
// 	     }

// 	     public void printColor()
// 	     {
// 	     	 System.out.println(this.color);
// 	     	 System.out.println(this.type);
// 	     }
// }

//  class  MonikaRajput
// {
// 	  public static void main(String[] args) {
	  	     
// 	  	     Pen p = new Pen();
// 	  	     p.color = "blue";
// 	  	     p.type = "red";

// 	  	     p.printColor();
// 	  	     p.write();
// 	  }
// }



// class Cycle{


// 	       Object  msg()
// 	     {
// 	     	System.out.println("parent class method");
// 	     	return "";
// 	     }
// }

// class Bike extends Cycle {

//        public Bike()
//          {
//          	   msg();
//          }

// 	   public  StringBuffer msg()
// 	   {
//          StringBuffer a = new StringBuffer("10");
// 	   	 System.out.println("child class method");
	   	  
// 	   	  return a;
// 	   }

// 	   public static void main(String[] args) {
// 	   	     Bike b = new Bike();  
	   	        
// 	   }
// }


// abstract class Bycycel{

//             private static int a = 10;
// 	       abstract  void msg();
// }

// class Aeroplane extends Bycycel{
 
//         void msg()
//        {
//            System.out.println("msg method");
//        }

// }

// import java.util.Arrays;
// class Solution {
//     public static void merge(int[] nums1, int m, int[] nums2, int n) {
//         for (int j = 0, i = m; j < n; j++) {
//             nums1[i] = nums2[j];
//             i++;
//         }
//         Arrays.sort(nums1);
//     }

//     public static void main(String[] args) {
//     	  int nums1 = [1,2,3,0,0,0], m = 3, nums2 = [2,5,6], n = 3;
//     	   int nums1 = [1], m = 1, nums2 = [], n = 0; 

//           System.out.println(merge(nums1,m));
//     }
// }


// class Demo{
// 	 int i;

// 	 public void set(int i)
// 	 {
// 	 	 this.i = i;
// 	 }

// 	 public void show()
// 	 {
// 	 	 System.out.println(i);
// 	 }

// 	 public static void main(String[] args) {
// 	 	   Demo d = new Demo();
// 	 	   d.set(10);
// 	 	   d.show();
// 	 }
// }


// class Data{

//        public void msg(Data data)
//        {
//        	  System.out.println("msg method");
//        }

//        public void data()
//        {
//            msg(this);
//        }

// 	   public static void main(String[] args) {
// 	   	    Data d = new Data();
// 	   	    d.data(); 

// 	   }
// }

// import java.util.io.*;
// class Hash{
// 	  public static void main(String[] args) {
// 	  	    HashTable ht = new HashTable();
// 	  	    ht.put(101,"monika");
// 	  	    ht.put(102,"mona");

// 	  }
// }




// class StringPaliindrome{
// 	  public static void main(String[] args) {
	  	   
	  	    // String s = "monika";
	  	    // String s1 = " ";

	  	    // for(int i=0;i<s.length();i++)
	  	    // {
	  	    // 	 // s1.concat(s1.valueOf(((char)s.charAt(i)-32)));
	  	    // 	System.out.println(s1.valueOf(s));
	  	    // }
	  	     
	  // }
// }


// class Demo{

// 	   public String msg()
// 	   {
// 	   	   System.out.println("msg method");
// 	   	   return "";
	   	  
	   // }
// }

// class Data4 extends Demo
// {
// 	  public  String msg()
// 	  {
// 	  	 System.out.println("child msg method");
// 	  	 return "";
	  	 
// 	  }
// }



//  class A {
	   
// 	    public   class B {
// 	    	 public  static void msg()
// 	    	 {
//                 System.out.println("B");
// 	    	 }
	    	
// 	    }

// 	    public static void main(String[] args) {
	    	    
// 	    	   B.msg();

// 	    }
// }






// interface Payment{

// 	  public void pay();
// }

// class Upi implements Payment{

// 	  public void pay()
// 	  {
// 	  	 System.out.println("pay");
// 	  }
// }

// class Cash implements Payment{

// 	  public void pay()
// 	  {
// 	  	 System.out.println("cash");
// 	  }
// }



// interface I{

// 	 public void msg();
	 
// }

class Fibonacci11{

	public static void main(String[] args) {
		 
		   int a=0,b=1,c=0;
		   c = a+b;
		   a=b;
		   b=c;
		   System.out.println(c);
           

	}
}










class LeetCodeProgram1{

	  public static void main(String[] args) {
	  	
	  	    String s = "abc";
	  	    String s1 = "qwer";
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


class LeetCodeProgram2{

       static int a = 10;

      public void msg()
      {
      	  
          final int c = 30;
      	  System.out.println(c);
      }
	  public static void main(String[] args) {
	  	
	  	  LeetCodeProgram2 leet = new LeetCodeProgram2();
	  	  leet.msg();
	  }
}

class Test1 extends LeetCodeProgram2 {

          public static void main(String[] args) {
          	

          	    LeetCodeProgram2 t = new LeetCodeProgram2();
                System.out.println(t.a);
          }

}


  class Outer {

             int a = 10;

            class Inner{
                 
                 static int  b = 20;
                 public  void msg()
                 {
                 	  // Outer outer = new Outer();
                 	  System.out.println(b);
                 }
           }

	  
}
class Test{
	  public static void main(String[] args) {
	    	 
	    	 Outer outer = new Outer();              // Create an instance of the outer class
             Outer.Inner inner = outer.new Inner();  // Create the inner class instance

             inner.msg();
             System.out.println(Outer.Inner.b);

	    }
}


 class OuterClass{

             int b = 20;
	             class InnerClass{
             static int a = 10;

	       	    public  void msg()
	       	    {
	       	   	   System.out.println(a);
	       	   	   System.out.println(b);
	       	    }
	       }

	       public static void main(String[] args) {
	       	  
	       	      OuterClass outer = new OuterClass();
	       	      OuterClass.InnerClass inner = outer.new InnerClass();
	       	      inner.msg();
	       }
}


class Animal{

	 public void sound(){
	 	 System.out.println("animal sound");
	 }
}

class Dog extends Animal{

	  public void sound()
	  {
	  	 System.out.println("dog is barking");
	  }
}

class Cat extends Animal {

	  public void sound()
	  {
	  	 System.out.println("cat is meowing");
	  }

	  public static void main(String[] args) {
	  	 
	  	    Animal animal   = new Dog();
          Animal animal1 = new Cat();
          animal1.sound();
	  }
}
// tyuk


class MyThread extends Thread {
   
    public void run() {
        System.out.println("Thread is running: " + Thread.currentThread().getName());
    }
}

 class ThreadDemo {
    public static void main(String[] args) {
    	System.out.println("main=>>> "+ Thread.currentThread().getName());
        MyThread thread1 = new MyThread();
        thread1.start(); // Starts the thread and calls the run() method
        
        MyThread thread2 = new MyThread();
        thread2.start(); // Starts another thread
    }
}


class StringBuilderVsStringBuffer{

	    public static void main(String[] args) {

	    	   StringBuffer s  = new StringBuffer("monika");
	    	   StringBuffer s1 = s.append("mona");
	    	   System.out.println(s);
	    	   System.out.println(s1);
	    	
	    	     // String s = new String("monika");
	    	     // String s1 = new String ("mona");
	    	     // s.concat("pawan");
	    	     // String s3 = s2.concat("pawanji");

	    	     // System.out.println(s);//monika
	    	     // System.out.println(s1);//mona
	    	     // System.out.println(s2);//monikapawan
	    	     // System.out.println(s3);//monikapawanpawanji     
	    }
}


// class MaximumArrayElement{

// 	   public static void main(String[] args) {
	   	
// 	   	     int arr[] = {11,1,12,3};
// 	   	     int max = arr[0];
// 	   	     for(int i=0;i<arr.length;i++)
// 	   	     {
// 	   	     	   if(max<arr[i])
// 	   	     	   {
// 	   	     	   	    max = arr[i];
// 	   	     	   }
// 	   	     }
// 	   	     System.out.println(max);
//  	   }
// }


// class CopyArray{

// 	   public static void main(String[] args) {
	   	   
// 	   	     int arr[] = {1,2,3,4,5,6};
// 	   	     int arr1[] = new int[arr.length];
 

// 	   	     for(int i=0;i<arr1.length;i++)
// 	   	     {
// 	   	     	  arr1[i] = arr[i];
// 	   	     	  arr1[0]++;
// 	   	     }
           
//            System.out.println("before copy array");
// 	   	     for(int i=0;i<arr.length;i++)
// 	   	     {
//              System.out.println(arr[i]+"");
             
// 	   	     }
            
//            System.out.println("after copy array");
// 	   	     for(int i=0;i<arr1.length;i++)
// 	   	     	{
// 	   	     		 System.out.println(arr1[i]+"");
	   	     		 
// 	   	     	}
// 	   }
// }


// interface Greet{

//       Greet(){
//      	System.out.println("mona");
//      }
// 	   void sayHello();
// }


// class Namastey{

// 	 public static void main(String[] args) {
	 	
// 	 	     Greet greet = new Greet()
// 	 	     {

// 	 	     	   public void sayHello()
// 	 	     	   {
// 	 	     	   	  System.out.println("hello");
// 	 	     	   }
// 	 	     };

// 	 	     greet.sayHello();
// 	 }
// }


class OuterClassDemo{

     int a = 10;
	   class InnerClassDemo {
       
        static int b = 20;
	   	     
	   }

	   public static void main(String[] args) {
	   	 
	   	     int  arr[] = {2,7,11,15};
		       int  target = 9;
		      TwoDigitSum sum = new TwoDigitSum();
		      int arr1[] = sum.twoSum(arr,target);
	   }
}








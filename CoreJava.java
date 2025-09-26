               //null is the bydefault value of Integer
// class Data{
// 	public static void main(String[] args) {
// 		  Integer i = null;
// 		  // int a = null;
// 		  System.out.println(i);
// 	}
// }

          //we can create inner class private but outer class are not allowed here
//   class Data{
// 	    private class Demo{
// 	    	public static void main(String[] args) {
// 	    		  System.out.println("monika rajput");
// 	    	}
// 	    }
// }

         //output = 100
// class Data{
// 	 static int test()
// 	 {
// 	 	int m = 100;
// 	 	return m;
// 	 }
// 	 public static void main(String[] args) {
// 	 	 System.out.println(test());
// 	 }
// }

// class A{
// 	 public static void main(String[] args) {
// 	 	 int i = test();
// 	 	 System.out.println(i);
	 
// 	 static int test()
// 	 {
// 	 	int i = 10,j;
// 	 	return j = i++ + --i + ++i;
// 	 }
// }

// import java.util.*;
// class Test1{
// 	public static void main(String[] args) {
// 		  ArrayList al = new ArrayList();
// 		  al.add(10);
// 		  al.add(20);
// 		  al.add(30);
// 		  al.add(40);
// 		  System.out.println(al);

// 		  Iterator i = al.iterator();
// 		  while(i.hasNext())
// 		  {
// 		  	System.out.println(i.next());
// 		  }
// 	}
// }


// class Data{
// 	protected static int  a=10;
// 	  public static void main(String[] args) {
// 	          int a = 10;
// 	  }

// }

// class Demo extends Data{
// 	   public void m1()
// 	   {
// 	   	System.out.println(a);
// 	   }
// }


// class Demo{
// 	public static void main(String[] args) {
// 		  int a = 3;
// 		  System.out.println(a++ * 8);
// 	}
// }


class Data{
	public static void main(String[] args) {
		   String i = "10";
		   char ch = 'a';
		   System.out.println( ch+'b'+ ch+'b');//390
		   System.out.println( ch+'b'+i+ ch+'b'+1+ch); //19510ab1a
	}
}


class MyThread implements Runnable{
    
	public void run(){
		for(int i=0;i<=5;i++){
			System.out.println("run method "+i);
			try{Thread.sleep(4000);} catch(Exception e){};
		}
}
public static void main(String[] args) {
		
		MyThread thread =  new MyThread();
        Thread th = new Thread(thread);
		th.start();
	  }
 }

 class MyAnotherThread extends Thread{
   
    public void run(){
    	for(int i=0;i<=5;i++){
    	System.out.println("monika");
    	try{Thread.sleep(4000);}catch(Exception e){}
    }
    }

    // public static void main(String[] args) {
    	
    // 	 MyAnotherThread thread = new MyAnotherThread();
    // 	 thread.start();

    // 	 MyThread thread =  new MyThread();
    //     Thread th = new Thread(thread);
	// 	th.start();
    // }
 }
  
// class PrintAllPrime{
// 	public static void main(String[] args) {
		
// 		 int n = 100;
// 		 for(int i=2;i<=n/2;i++){
// 		 	 boolean temp = true;

// 		 	 for(int j=2;j<=i/2;j++){
// 		 	 	if(i/j==0){
// 		 	 		temp = false;
// 		 	 		break;
// 		 	 	}
// 		 	 }
// 		 }
// 		 if(temp){
// 		 	System.out.println(i);
// 		 }

// 	}
// }


class ThreadName{
	public static void main(String[] args) {
		
		  Thread thread = Thread.currentThread();
		  String name = thread.getName();
		  try{Thread.sleep(4000);} catch(Exception e){}
		  System.out.println("thread name =====> " +name);

		  thread.setName("MyNewThread");
          try{Thread.sleep(6000);} catch(Exception e){}
		  System.out.println("my new thread =======> " +thread.getName());
	}
}


class Company{

    int n;
	synchronized public void produce_item(int n){
       
        this.n = n; 
        System.out.println("produced item "+this.n);
	}

	synchronized public int consume_item(){
		 System.out.println("consumer item "+this.n);
		 return this.n;
	}

}


class TestString{
	public static void main(String[] args) {
		
		 String s = "monika";
		 // String s1 = "monika";
		 System.out.println(s.concat("pawan"));
	}
}

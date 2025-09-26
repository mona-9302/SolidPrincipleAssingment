/*class Test
{
	public static void main(String[] args)
	 {
		MyThread t=new MyThread();
		t.setName("abc:");
		t.start();
		for(int i=1;i<=5;i++){
			System.out.println(Thread.currentThread().getName()+":"+i);
		}
	}
}

class MyThread extends Thread       
{
	public void run()  
	 {
         for(int i=1;i<=5;i++)
         { 
         	System.out.println(Thread.currentThread().getName()+":"+i);
         }
	}
}*/
	/*public void start()
	{
  	 super.start();
  }*/



  

                 //THREAD BY USING RUNNABLE 

/*class Test1{
	public static void main(String[] args) {
		//MyThread t=new MyThread();
		//Thread th=new Thread(t);
		Thread t=new Thread(new MyThread());
		t.start();
		for(int i=1;i<=5;i++){
			System.out.println(Thread.currentThread().getName()+":"+i);
		}
		
	}
}

class MyThread  implements Runnable{
	public void run(){
		for(int i=1;i<=5;i++){
			System.out.println(Thread.currentThread().getName()+":"+i);
		}
	}

}*/

/*class Demo{

	public static void main(String[] args) {
		Thread t=new Thread(new MyThread());
         
		t.start();
		t.setName("Thread:");
		for(int i=0;i<=5;i++){
			System.out.println(Thread.currentThread().getName()+":"+i);
		}
		
	}
}

class MyThread   implements Runnable{

	public void run(){
		for(int i=0;i<=5;i++){
			System.out.println(Thread.currentThread().getName()+":"+i);
		}
	}
}*/

/*class Test1{
	public static void main(String[] args) {
		Demo d=new Demo();
		Thread t=new Thread(d);
		t.start();
		//t.setName("abc");
		for(int i=1;i<=5;i++){
			System.out.println(Thread.currentThread().getName()+":"+i);
		}
		
	}
}

class Demo implements Runnable{
	public void run(){
		for(int i=1;i<=5;i++){
			System.out.println(Thread.currentThread().getName()+":"+i);
		}
	}
}*/


/*class Test{
	public static void main(String[] args) {
		Demo t=new Demo();
		t.start();
		try{

		      t.join();

		}
		catch(Exception e){
			System.out.println(e);
		}
		for(int i=0;i<=5;i++){
			System.out.println(Thread.currentThread().getName()+":"+i);
		}
		System.out.println(Thread.currentThread().getPriority());
		

	}
}



class Demo extends Thread{
	
	public void run(){
		
       for(int i=0;i<=5;i++) {
       	System.out.println(Thread.currentThread().getName()+":"+i);
       }
	}
}




class Test1{
	public static void main(String[] args) {
		Demo1 d=new Demo1(Thread.currentThread());
		d.start();
		for(int i=0;i<=5;i++){
			System.out.println(Thread.currentThread().getName()+":"+i);
		}

		
	}
}

class Demo1 extends Thread{
	 Thread d=null;
	 Demo1(Thread d){
	 	this.d=d;
	 }
	public void run(){
		try{
			d.join();
		}
		catch(Exception e){
			System.out.println(e);
		}
		for(int i=0;i<=5;i++){
			System.out.println(Thread.currentThread().getName()+":"+i);
		}
	}
}

               //30JANUARY INNER CLASS
class Monika extends Thread{
	public void run(){
		System.out.println("monika");
	}
	public static void main(String[] args) {
		Monika m=new Monika();
		m.start();
		//m.start();  illegalThreadstartException
	}

}



        //THREAD USING BY RUNNABLE INTERFACE
class Ritu implements Runnable{
	public void run(){
		System.out.println("monikarajput");
	}
	public static void main(String[] args) {
		Ritu r=new Ritu();
		Thread th=new Thread(r);
		th.start();
	}
}

            //CREATE BY SINGLE TASK FROM SINGLE THREAD
class Titu extends Thread{
	public void run(){
		System.out.println("monikaraj");
	}
	public static void main(String[] args) {
		Titu t=new Titu();
		t.start();
	}
}

          //CREATE SINGLE TASK FROM MUTLIPLE THREADS
class Titu1 extends Thread{
	public void run(){
		System.out.println("monikaraj1");
	}

	public static void main(String[] args) {
		Titu1 t=new Titu1 ();
		t.start();
		Titu1 t1=new Titu1();
		t1.start();
	}
}

           //CREATE MULTIPLE TASK MUTLIPLE THREAD

class Mythread extends Thread{
	public void run(){
		System.out.println("m");
	}
}

class Mythread1 extends  Thread{
	public void run(){
		System.out.println("n");
	}

	public static void main(String[] args) {
		Mythread m=new Mythread();
		m.start();
		Mythread1 m1=new Mythread1();
		m1.start();
	}
} 

                   //THREAD METHOD AND CONSTRUCTORS
           // GETNAME,SETNAME,ISALIVE,CURRENTTHREAD

class Data{
	public static void main(String[] args) {
		System.out.println("hello");
		//Thread.currentThread().setName("main:");
		System.out.println(Thread.currentThread().getName());
		Thread.currentThread().setName("m");
		System.out.println("new Thread name:"+Thread.currentThread().getName());
		System.out.println(10/0);
	}
}

                // USERTHREAD CREATE
class Data1 extends Thread{
	public void run(){
		//Thread.currentThread().setName("m:");
		//System.out.println(Thread.currentThread().getName());
		System.out.println("thread create");
		System.out.println(Thread.currentThread().getName());
	}
	public static void main(String[] args) {
		 Data1 d=new Data1();

		 d.start();
		 Data1 d1=new Data1();
		 d1.start();
		 System.out.println(Thread.currentThread().getName());

	}
}

                    //DAEMON  THREAD
/*DEF-which run in the  another thread background./executing the another thread background.
USE-its provide the service of thread.
exa-garbage  collector,spelling checker.
note-we have to create daemon thread to before start method;
     we cannot create main threade Daemon;
     ITS life depends on another thread 
     daemon thread nature it inherit the property its parent thread.
     jvm role in daemon thread 
     jvm doesnt depedns on daemon thread
     daemon thread priority always low. 
METHODS - 1.public final void setDaemon(boolean b);


          2.public final boolean isDaemon();*/

/*class Data2 extends Thread{
	public void run(){
		System.out.println(Thread.currentThread().isDaemon());
		System.out.println("daemon Thread");
	}


	public static void main(String[] args) {
		/*Thread.currentThread().setDaemon(true);
		System.out.println(Thread.currentThread().getName());*/ // illegalThreadStateException
       /* System.out.println("main thread");
		Data2 d=new Data2();
		d.setDaemon(true);
		d.start();
		//d.setDaemon(true) illegalThreadStateExceptio

	}

}*/


                          //set Daemon and isDaemon method

/*class Testt extends Thread{
	public void run(){
		System.out.println(Thread.currentThread().isDaemon());
		//System.out.println("thread");
	}

	public static void main(String[] args) {
		System.out.println("main thread");
		Testt t=new Testt();
		t.setDaemon(true);
		t.start();
	}
}
 */                     //PRIORITY BASED THREAD
/*notes-1.jvm provides  priority to each thread according to these priority jvm allocates the process.out
      2.priority are represented in the form of integer no.range from 1-10;
      3.1-minimum_priority;
      4.5-norm_priority;
      5.10-max _priority;
      6.0 are not the priorities; 

METHODS-1.public final void setPriority(int value)
        2.public final void getPriority()
NATURE-priority are inherit from parent thread;
       bydefault main thread priority is -5
  3-priority depends on platform;
    windows doestnot support by priority*/


/*class Tata2 extends Thread{
	public void run(){
		System.out.println("Thread");
		System.out.println(Thread.currentThread().getPriority());

	}

	public static void main(String[] args) {
		//System.out.println(Thread.currentThread().getPriority());
		 Tata2 t=new Tata2();
		 t.start();
		 t.setPriority(10);
	}

}

    */                  // Sleep Method

/*Thread Sleep methods-

 1-public static native void sleep(long mili)Throws 
 2-public static void sleep(long mili,int nano)Throws
 Exception-intereptedException.*/

 /*class Tata3
  {
 	public static void main(String[] args) 
 	{
 		 for(int i=1;i<=5;i++)
 		 {
 		 try
 		 {
 		 	Thread.sleep(1000);
 		 System.out.println(i);
 		 }

 		 catch(Exception e)
 		 {
 		 	System.out.println(e);
 		 }
 		}
 	}
 }

 class Tata4 extends Thread
 {
 	public void run()
 	{
 	  for(int i=1;i<=5;i++)
 	  {
 	  	try {
 	  		Thread.sleep(1000);
 	  		System.out.println(i);
 	  	}
 	  	catch(Exception e)
 	  	{
 	  		System.out.println(e);
 	  	}
 	  }
 	}
 	public static void main(String[] args) {
 		Tata4 t=new Tata4();
 		t.start();
 	}

 }*/
                             // SPRING CORE


/*class Papa extends Thread{
	public void run(){
		Thread.currentThread().setPriority(8);
		System.out.println(Thread.currentThread().getPriority());
		System.out.println("run");
	}

	public static void main(String[] args) {
		Papa p=new Papa();
		p.start();
		Thread.currentThread().setPriority(10);
		Thread.currentThread().setPriority(9);

		System.out.println(Thread.currentThread().getPriority());
		System.out.println(Thread.currentThread().getPriority());
	}
}*/

/*class Test7   implements Runnable{
	public void run(){
		for(int i=0;i<=5;i++){
			System.out.println(Thread.currentThread().getName()+":"+i);
		}
	}

	public static void main(String[] args) {
		Test7 t=new Test7();
		Thread th=new Thread(t);
		th.start();
		for(int i=0;i<=5;i++){
			System.out.println(Thread.currentThread().getName()+":"+i);
		}
	}
}

*/


/*class Test10{
	public static void main(String[] args) {
		Test9 t=new Test9();
		t.start();
		for(int i=0;i<=5;i++){
			System.out.println(Thread.currentThread().getName()+":"+i);
		}
	}
}


class Test9 extends Thread{
	public void run(){
		for(int i=0;i<=5;i++){
			System.out.println(Thread.currentThread().getName()+":"+i);
		}
	}

	public void start(){
		super.start();
		System.out.println("start method");

	}
}*/

                      //SLEEP METHOD BY MULTIPLE THREAD       
/*class Test14 extends Thread{
	public void run(){
		try
		{
			for(int i=1;i<=5;i++)
			{
				System.out.println(i+":"+Thread.currentThread().getName());
				Thread.sleep(1000);
			}
		}
		catch(Exception e){
			System.out.println(e);
		}

	}

	public static void main(String[] args) {
		Test14 t=new Test14();
		t.start();

		Test14 t1=new Test14();
		t1.start();
	}
}

*/
                  // YILED METHOD BY MULTITHREADING
/*YIELD-which  stops the current executing thread and give a 
      chance priority  to other thread for execution.
note- java 5 m yield method internally sleep ka method ka method
      use krta tha but java -6m nhi krta h.
METHOD-public static native void yield();*/

                        // JOIN METHOD
/*class Test15 extends Thread{
	public void run(){
		for(int i=0;i<5;i++){
			System.out.println(Thread.currentThread().getName()+":"+i);
		}
	}
	public static void main(String[] args) {
		Test15 t=new Test15();
		t.start();
		try{
			for(int i=0;i<5;i++){
				t.join();
				System.out.println(Thread.currentThread().getName()+":"+i);
			}
		}
		catch(Exception e){
			System.out.println(e);
		}
	}
}
*/
/*class Monika2{
	public static void main(String[] args) {
		 //Integer s[] = new Integer[5];
		 //String s[] = new String[5];
		Object s[] = new Object[5];
		 s[0] = 10;
		 s[1] = "monika";
		 s[2] = 30;
		 s[3] = "monika";
		 s[4] = 50;

		 for(int i=0;i<s.length-1;i++){
		 	System.out.println(s[i]);
		 }
	}
}
*/


import java.util.*;
/*class Monika22{
	public static void main(String[] args)
	 {
	 	Object ob;
	 	public void add(Object ob)
	 	{
	 		this.ob=ob;
	 	}
	 	public Object get()
	 	{
	 		  return ob;
	 	}
		 /*ArrayList <Integer> al = new ArrayList <Integer>();
		 al.add(10);
		 al.add(20);
		 al.add(30);
		 al.add(40);
		 al.add(50.0);
		 Integer sum = 0;
		 for(int i =0;i<al.size();i++)
		 {
		 	  Integer num = (Integer)al.get(i);
		 	  sum = sum+num;
		 }
		 System.out.println(sum);*/
	//}
//}

/*class Data<T>
{
	  T ob;
	  public void add(T ob)
	  {
	       this.ob = ob;
	  }
	  public T get()
	  {
	  	     return ob;
	  }
}

class Mona{
	public static void main(String[] args)
	 {
		Data  <Integer> d = new Data <Integer>();
		d.add(1);

		System.out.println(d.get());
	}
}*/

/*class A
{
	 int add(int i ,int j){
	 return i+j;
	}
}

class B extends A{
	public static void main(String[] args)
	 {
		 short s = 9;
		 System.out.println(s,6);
	}
}   //non static method cannot found in static 
*/

/*class Parent{
	 Parent()
	 {
	 	System.out.println("parent constructor");
	 }

	 public void msg()
	 {
	 	System.out.println("non static method");
	 }
	 static 
	 {
	 	System.out.println("parent static block");
	 }
	 {
	 	System.out.println("parent non static block");
	 }
}

class Child extends Parent{
	    Child()
	    {
	    	System.out.println("child constructor");
	    }

	    public static void demo()
	    {
	    	System.out.println("child static method");
	    }

	    static {
	    	System.out.println("chld static block");
	    }

	    {
	    	System.out.println("non static block");
	    }
	    public static void main(String[] args) {
	    	Child c = new Child();
	    }
}*/

/*class Test
{
	 public static void msg()
	 {
	 	System.out.println("static method");
	 }
	 public static void main(String[] args)
	  {
	 	  //msg();
	 	  //Test.msg();
	  	Test t = new Test();
	  	t.msg();
	 }

	/* public void m2()
	 {
         msg();
	 }*/
//}

/*interface I1
{
	void show();
}

class Test implements I1
{
	  void show()
	  {
	  	System.out.println("monika");
	  }

	  public static void main(String[] args) {
	  	 Test t = new Test();
	  	 t.show();
	  }
	}
*/


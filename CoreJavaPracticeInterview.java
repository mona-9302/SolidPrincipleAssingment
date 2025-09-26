final  class Test{

    final int c = 40;
	public static final void mP(){
	    int b = 30;
		System.out.println(b);
		System.out.println("MP method");
	}
	public static void main(String[] args) {
		
		 Test t = new Test();
		 int a = 10;
		 System.out.println(t.c);	 
		 Test.mP();
		 System.out.println(a);
	}
}

// class Demo extends Test{


// }

 class Demo{

 	static class Data{
 		private void display(){
 			System.out.println("display method");
 		}
 	}
	public static void main(String[] args) {
		Demo.Data data = new Demo.Data();
		data.display();

	}
}


abstract class Module{
 
    public void msg(){
    	System.out.println("msg method");
    }
}

interface Demo2{

	public void demo();
}

abstract class MyDemo extends Module implements Demo2{
	
	public static void main(String[] args) {
		
		   // MyDemo myDemo = new MyDemo();
		   // myDemo.demo();
	}
}

class POJO{

	 private static final int a = 10;
	 private static final int b = 20;
	public static void main(String[] args) {
		
		POJO pojo = new POJO();
		System.out.println(pojo.a);
	}
}






//QUESTION NO-1
// class A {
// 	int i = 10;
// 	public void printValue(){
// 		System.out.println("Value-A");
// 	};
// }

// class B extends A {
// 	int i = 12;
// 	public void printValue(){
// 		System.out.println("Value-B");
// 	}
// }

// class DemoTesting{
// 	 public static void main(String[] args) {
	 	 
// 	 	  A a = new B();
// 	 	  a.printValue();
// 	 	  System.out.println(a.i);
// 	 }
// }


// //QUESTION NO-10 Doubt

// class TestA{
// 	public void start(){
// 		System.out.println("TestA");
// 	}
// }


// class TestB extends TestA{
// 	public void start(){
// 		System.out.println("TestB");
// 	}

// 	public static void main(String[] args) {
		
// 		 ((TestA) new TestB()).start();
// 	}
// }


// class A1{
// 	public void test2(){
// 		System.out.println("test1");
// 	}
// }

// class B1 extends A1{
//     public void test2(){
//     	System.out.println("test2");
//     }

//     public static void main(String[] args) {
    	 
//     	  A1 a = new B1();
//     	  a.test2();
//     }
// }


// //QUESTION NO-12

// public class C1{

// }

// public class D1 extends C1{

// }

// public class A1{

// 	 public C1 getObj(){
// 	 	System.out.println("Class A1 - return C1");
// 	 	return new C1();
// 	 }
// }

// public class B1 extends A1{
// 	 public D1 getObj(){
// 	 	System.out.println("class b1 - return D1");
// 	 	return new D1();
// 	 }
// }

// class TestingData{
// 	public static void main(String[] args) {
// 		 A1 a = new B1();
// 		 a.getObj();
// 	}
// }


class PrintNumber{
	public static void main(String[] args) {
		
		 for(int num = 2;num<100;num++){
		 	boolean temp = true;


		 	for(int i=2;i<=num/2;i++){
		 		if(num%i == 0){
		 			temp = false;
		 			break;
		 		}
		 	}

		 	if(temp){
		 		System.out.println("Prime Numbers "+ num);
		 	}
		 }
	}
}

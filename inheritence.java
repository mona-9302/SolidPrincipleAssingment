class Animal{
	void eat(){
		System.out.println("monika");
	}
}
class Dog  extends Animal{
	public static void main(String[] args) {
		  Animal a=new Animal();
		  a.eat();
		 
		  
	}
}

class Test{
	public void m1(){
		System.out.println("monika");
	}
}

class Test1 extends Test{
	public void m2(){
		System.out.println("mona");
	}
}

class Test2 extends Test{
	public void m3(){
		System.out.println("mahi");
	}

	public static void main(String[] args) {
		   Test t=new Test();
		   t.m1();
		   t.m2();
		   t.m3();
	}
}

/*class Test4{
	public void m1(){
		System.out.println("monika");
	}
}

class Test5 extends Test4{
	public void m2(){
		System.out.println("mona");
	}
}

class Test6 extends Test4{
	public void m3(){
		System.out.println("mahi");
	}
	public static void main(String[] args) {
		      Test6 t=new Test6();
		      t.m1();
		      t.m2();
		      t.m3();

			
		}
	}*/


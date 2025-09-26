 //what is JIT compiler?
/*class Outer{
	   class Inner{
	   	     public   void fun(){
	   	     	System.out.println("monika rajput");
	   	     }
	   }
}

class Test{
	public static void main(String[] args) {
		  Outer ot = new Outer();
		 Outer. Inner in =ot. new Inner();
		   in.fun();
	}
}*/

class Test1{
	public static void main(String[] args) {
		/*Outer ot=new Outer();
		Outer.Inner in=ot.new Inner();
		in.m1();*/

		/*Outer.Inner in =new Outer().new Inner();
		in.m1();*/
		//new Outer().new Inner().m1();
	}
}

/*class Outer{
	class Inner{
		 public void m1(){
		 	for(int i=1;i<=5;i++){
		 		System.out.println(i);
		 	}
		 }
	}
}*/

class Test2{
	class Inner
	{
		public void data()
		{
			System.out.println("data");
		}
	}

	public static void main(String[] args) {
		     Test2 t = new Test2();
		   Inner in =t. new Inner();
		   in.data();
	}
}

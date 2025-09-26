 /*class Test
  {
   public static void main(String[] args)
     {
	   String s="monika";
	   String s1="rajput";
	   char chr[]=s.toCharArray();
	   System.out.println(chr);
   }
 }
 class Test1
  {
    public static void main(String[] args)
      {
	   String s="i am monika rajput";
	   String s1=s.substring(0,7);
	   System.out.println(s1);
   }
 }
 class Test2
  {
   public static void main(String[] args)
    {
	 String s="i am monika rajput";
	 String s1="hello i am here";
	 String s2=s.substring(1,9);
     System.out.println(s2);
	}
 }
 class Test3
  {
     public static void main(String[] args)
     {
	    String s="monika";
	    int a=10;
	    Intstring i=new Intstring();
	    System.out.println(i.s);
	    System.out.println(i.a);
    }
 }
 class Test4
  {
    String s="monika";
    int a=10;
    void fun()
     {
       System.out.println(this.a);
       System.out.println(this.s);
    }
    public static void main(String[] args)
     {
    	Test4 t=new Test4();
    	t.fun();
    }
 }
 class Test5
  {
    public static void main(String[] args) 
     {
	   //String s="monika";
	   System.out.println(10+20+"monika");
    }
 }*/
 /*class Test
 {
   void show()
    {
      System.out.println("i am good");
   }
 }
  class Demo extends Test
  {
  	public static void main(String[] args)
  	 {
  		
      Test t =new Test();
      t.show();
      Std s=new Std();
      System.out.println(s);
     }
 }
   class Std
   {
    String name="mona",address="indore",id="mona12";
    public String toString()
     {
          return name+","+address+","+id;
    }
 }*/
  /*class Test
  {
  	 int a=10;
  	 public boolean equals(Object ob)
  	  {
        return this.a==a;
  	 }
  }
  class Demo
   {
     public static void main(String[] args)
      {
	    Demo d=new Demo();
	    Demo1 d1=new Demo1();
	    System.out.println(d.equals(d1));
     }
  }*/
  /*class Test
   {
     public static void main(String[] args)
     {
	   String s="i am mona";
	   System.out.println(s.indexOf('o'));
     }
  }*/
  /*class Test
   {
      static  void show()
        {
          int a=10;
          System.out.println(a);
       }
       public static void main(String[] args) 
        {
         Test.show();
       }

  }
  class Test1
   {
    static  int a=10;
    public static void main(String[] args)
      {
      System.out.println(a);
    }
  }
*/
 /*abstract class Test
  {
      abstract int sum(int a,int b,int c);
    final  void show()
     {
       System.out.println("m");
    }
    Test()
     {
         System.out.println("mona");
    }
    Test(int a){
      System.out.println("k");
    }
 }
  class Demo extends Test  
   {
     public Demo()
      {
       super(1);
       System.out.println("jjjj");
      }
      int sum(int a,int b,int c)
       {
         int sum=a+b+c;
         return sum;
         
      }
     public static void main(String[] args) 
      {
         Test t=new Demo();
         System.out.println("sum"+t.sum(1,2,3));
         t.show();
     }
 }*/

  /*class P{
     int j=20;
      P(){
          show();
      }
      public void show()
       {
          System.out.println("P:"+j);
      }
  }
  class Child extends P
   {
     int i=100;
     public void show()
      {
        System.out.println("Child:"+i);
     }
      public static  void main(String[] args) {
         Child c=new Child();
         P s=new P ();
      }
  }*/
   /*abstract class Bike
    {
      abstract void run();
   }
  class Honda extends Bike
   {
     void run()
      {
       System.out.println("shrii");
     }
     public static void main(String[] args)
      {
       Bike b=new Honda();
      b.run();
     }
  }*/
  /*abstract  class Shape
  {
    abstract void show();
 }
 class Circle extends Shape
  {
     void show()
      {
        System.out.println("shrii");
     }
 }
  class Triangle extends Shape
  {
    void show()
     {
       System.out.println("siddhi");
    }
 }
 class Square extends Shape
  {
   void show()
    {
      System.out.println("jaya");
   }
 }
 class Rectangular
  {
  public static void main(String[] args) 
   {
     //Shape s=new Circle();
    //Shape s=new Triangle();
    Shape s=new Square();
     s.show();
   }
 }*/
 /*abstract class Test
 {
   Test()
    {
     System.out.println("monika");
   }
   void show()
    {
       System.out.println("mahi");
   }
    abstract void run();
    
   
 class Demo extends Test
  {
   void eat()
    {
      System.out.println("mona");
   }
}
class Data
 {
   public static void main(String[] args) 
    {
      Test t=new Demo();
      t.eat();
    }*/
  /*class Test
   {
     int a=10;
      void show(){
       final int a=20;
      System.out.println(a);
     }
      public static void main(String[] args)
       {
         int a=30;
        Test t=new Test();
        t.show();
        System.out.println(a);
        System.out.println(t.a);
     }
  }
  class Test1
   {
      public static void main(String[] args) 
      {
         int a,b,c,d,e,sum;
          a=10;
          b=20;
          c=30;
          d=40;
          e=50;
         sum=(a+b+c+d+e);
         System.out.println(sum);
     }
  }

  class Test2
   {
     public static void main(String[] args) 
      {
        int a,b,sub;
        a=100;
        b=20;
        sub=(a-b);
        System.out.println(sub);
    }
  }

  class Test3
   {
      public static void main(String[] args) 
      {
        int a,b,c,d,e,avg;
        a=10;
        b=20;
        c=30;
        d=40;
        e=50;
        avg=(a+b+c+d+e)/5;
        System.out.println(avg);
     }
  }
  class Test4
   {
     public static void main(String[] args)
      {
        
        int a=10;
        float f=a;
        System.out.println(a);
        System.out.println(f);
     }
  }

  class Test5
   {
     public static void main(String[] args)
      {
         float f=10.0f;
         int a=(int)f;
         System.out.println(f);
         System.out.println(a);
      }
  }
  class Test6
   {
    public static void main(String[] args) 
     {
       int a=10;
       byte b=(byte)a;
       System.out.println(a);
       System.out.println(b);
    }
  }

  class Test7
   {
     public static void main(String[] args)
       {
         byte a=10;
         byte b=20;
         byte c;
          c=(byte)(a+b);
          System.out.println(c);
     }
  }*/



  

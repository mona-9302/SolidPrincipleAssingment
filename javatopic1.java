/*class Test
 {
   int a=10;
   int b=20;
}
class Std extends Test
 {
   int a=20;
   public static void main(String[] args)
    {
   	Test t=new Std();
   	System.out.println(t.a);
   	System.out.println(t.b);
   	
   }
}


class Test1
 {
    static void show()
    {
     System.out.println("monika rajput");

   }
}
class Std1 extends Test1
 {
    public static void main(String[] args) 
    {
    	//Std1 s=new Std1();
    	Test1.show();

   }
}


class Test2
 {
     void Data(){
    	System.out.println("siddhi rajput");
    }
}
class Std2 extends Test2{
	public static void main(String[] args)
	  {
		Std2 s=new Std2();
        System.out.println(s);
       
       }
    }
    class Test3
     {
         static void demo()
         {
           System.out.println("monika");
        }
         void data()
         {
            System.out.println("rajput");
        }
    }
    class Std3 extends Test3
     {
       public static void main(String[] args) 
        {
	       Test3.demo();
	       Std3 s=new Std3();
	       System.out.println(s);
	       
       }
    }*/
    /* class Test
      {
         static void show()
         {
           System.out.println("static method");
        }
     }
      class Child extends Test 
       {
        String s="monika";
         void data()
          {
            System.out.println("non static method");
         }
         Child()
         {
           
             {
                System.out.println("constructor");
            }
         }    
           public static void main(String[] args)
           {
             Test.show();
             
             Child c=new Child();
             System.out.println(c);

         }
           public String toString ()
           {
             return s;
         }
     }*/

     /*class Test
      {
        public static void main(String[] args) 
         {
           Child c=new Child();
           Child.show();
        }
     }
     class Child 
      {
        Child()
               {
                System.out.println("constructor");
        }
        static void show()
        {
          System.out.println("static method");
       }

        void data()
       {
         System.out.println("non static method");
       }
       static
        {
          System.out.println("static block ");
       }
         {
           System.out.println("non static block");
       }

     }*/

     /*class City
      {
       String cityName;
       City(String name)
        {
           cityName=name;
       }
       public String toString()
        {
          return cityName;
       }
     }
     class State
      {
        String stateName;
        City cityNames[];
        State(String name,City city[])
         {
            stateName =name;
           cityNames=city;
        }
          
        public String toString()
         {
            String s="";
             for(City c:cityNames)
              {
                if(c==null)
                    break;
                else
                 
                   s=s+c+",";
                

              }
              return stateName+":"+s;
            }
        }
        class Country
         {
            String countryName;
            State stateNames[];
            Country(String cName,State state[])
             {
              countryName=cName;
              stateNames=state;
            }
            public String toString()
             {
               String s="";
               for(State c:stateNames)
                {

                  if(c==null)
                    break;
                else 
                
                   s=s+c+",/n";
                }
                  return countryName+"::/n"+s;
               }
            }*/
/*class Test
 {
    public static void main (String[]args)
     {
      City mp_city[]={new City("indore"),new City("ujjain"),new City("dewas")};
      City rj_city[]={new City("udaipur"),new City("jaipur"),new City("kota")};
      State mp[]=
       {
         new State("MP",mp_city),
         new State("RJ",rj_city)
      };
      Country c[]={new Country("india",mp)};
      System.out.println(c[0]);
   }
}
class Test1
 {
    static void   show(int a,int b,String s)
    {
      System.out.println("monika");
   }
    static void  show(String s)
    {
      System.out.println("mona");
   }
    static void   show(int a,String s)
   {
     System.out.println("mahi");
   }
   public static void main(String[] args)
    {
       // Test1 t=new Test1();
     Test1. show(10,10,"monika");
     Test1.show(10,"m");

   }
}*/
/*class Test2
 {
   static void show(int a,int b)
    {
     System.out.println("m");
   }
   static void show(short  a,float b ,int c)
    {
     System.out.println("n");
   }
    static void show(String a,int b,float c){
       System.out.println("o");
   }
   static void show(int a,int b,int c)
   {
    System.out.println("p");
   }
   public static void main(String[] args)
    {
      //show(10.0f,10);

    show((short)10,10.0f,10); 
   }
}
 class Jcp302
 {
   void m1(Object o)
   {
    System.out.println("Object");
   }
   void m1(A ob)
    {
      System.out.println("A");
   }
   void m1(B ob)
    {
      System.out.println("B");
   }
   void m1(C ob)
    {
     System.out.println("C");
   }
   void m1(D ob)
    {
     System.out.println("D");
   }
   void m1(E ob)
    {
      System.out.println("E");
   }
    public static void main(String[] args) 
    {
      //new Jcp302().m1(null);
    //String s=new String(null);
        //String s="";
       // String s2=null;
    
     // System.out.println("hello world!\t");
   }
}
class A
 {

};
class B extends A
{

};
class C extends B
{

};
class D extends B
{

};
class E extends A
{

};*/
 /*class Sample
 {
  Sample (byte b){System.out.println("in byte");}
  Sample(short s){System.out.println("in short");}
  Sample(char c){System.out.println("in char ");}
  Sample(long l){System.out.println("in long");}
  Sample(int i){System.out.println("in int");}
  public static void main(String[] args) 
   {
    Sample s=new Sample((byte)10);
    Sample  s1=new Sample((short)20);
    Sample s2=new Sample('c');
    Sample s3=new Sample((long)12.00);
    Sample s4=new Sample(10);
  }
}*/
/*class Demo
 {
     void m1(byte a,int b)
    {
      System.out.println("mona");
   }
     void m1(String s)
    {
      System.out.println("mahi");
   }
     void m1(int a,int b,int c){
       System.out.println("siddhi");
   }
     void m1(String s,int a) 
    {
      System.out.println("monika");
   }
   public static void main(String[] args) 
    {
     Demo d=new Demo();
     d.m1((byte)10,10);
     //System.out.println(d);
  }
 
}
    class Demo1
     {
       static void m(int a)
       {
         System.out.println("monika");
      }
       Demo1(int a,int b,int c)
        {
          System.out.println("rajput");
       }
       Demo1()
       {
        System.out.println("radhe radhe");
       }
       public static void main(String[] args)
         {
           Demo1 d= new Demo1(10,20,30);
           Demo1 d1=new Demo1();
         }
       }
  class Demo2
  {
   void m1(int a)
   {
     System.out.println("non static method");
   }
   static void m1(int a,int b)
    {
     System.out.println("static method");
   }
   Demo2(int a,int b,int c)
    {
      System.out.println("constructor");
   }
   public static void main(String[] args)
     {
       
       Demo2 d=new Demo2(10,20,30);
       Demo2.m1(10,20);

   }
}
class Demo3
  {
    final void m(int a)
   {
     System.out.println("m");
   }
    final void m(int a,int b)
     {
      System.out.println("n");
    }
    public static void main(String[] args) 
     {
       Demo3 d=new Demo3();
       d.m(10); 
    }
}
class Demo4
 {
  static void m(int a)
   {
     System.out.println("mona");
  }
   void m(int a,int b)
    {
       System.out.println("moni");
   }
   public static void main(String[] args) 
    {
      Demo4.m(10);
      Demo4 d=new Demo4();
      d.m(10,20);
   }
}
  
   class Sample
 {
  Sample(byte b)
  {
    System.out.println("in byte");
  }
   Sample(short s)
    {
     System.out.println("in short");
   }
    Sample(char c)
    {
      System.out.println("in char");
    }
     Sample(long l)
      {
        System.out.println("in long");
     }
     Sample(int i)
      {
       System.out.println("in int");
     }
     public static void main(String[] args)
      {
       Sample s=new Sample(90);  
     }
}
                 //QUE 3.
class Sample1
{
   void m1(Object o)
   {
    System.out.println("Object");
  }
   void m1(A ob)
   {
     System.out.println("A");
   }
    void m1(B ob)
    {
      System.out.println("B");
    }
     void m1(C  ob)
     {
      System.out.println("C");
     }
      void m1(D ob)
      {
        System.out.println("D");
      }
      public static void main(String[] args)
       {
         new Sample1().m1(null);
         System.out.println("hello world!\t"); 
      }
}
class A1{

};
class B1 extends A1{

};
class C1 extends B1{


};
class D1 extends B1{

};*/
        //QUE 10

class Sample2
{
   static void m1(byte b)
   {
     System.out.println("byte");
   }
   static void m1(float b)
   {
     System.out.println("float");
   }
   static void m1(double d)
   {
    System.out.println("double");
   }
   public static void main(String[] args)
    {
      byte b=10;
      int a=20;
      long l=1;
      m1(b);
      m1(10);
      m1(1.0f);
   }
}
      //QUE 11
class Sample3
{
  static void m1(byte b)
  {
    System.out.println("byte");
  }
  static void m1(char b)
  {
     System.out.println("char");
  }
  public static void main(String[] args) 
   {
     byte b=10;
     m1(b);
     m1((byte)10);

     //m1(1);
     m1('a'); 
  }
}
          //   QUE 12
class Sample4
 {
  static void m1(byte b)
  {
   System.out.println("byte");
  }
  static void m1(Long b)
  {
    System.out.println("Long");
  }
  public static void main(String[] args)
   {
    byte b=10;
    m1(b);
    m1((byte)10);
    // m1(100);
  }
}
      //QUE 13
class Sample5
{
static void m1(Byte b)
 {
   System.out.println("Byte");
 }
 static void m1(int b)
 {
  System.out.println("int");
 }
 public static void main(String[] args)
  {
    byte b=10;
    m1(b);
    m1((byte)10);
    m1(100);
  }
}
class Sample6
{
  static void m1(Integer b)
   {
    System.out.println("Integer");
  }
  static void m1(double d)
   {
     System.out.println("double");
  }
  public static void main(String[] args)
   {
     byte b=10;
     m1(b);
     m1((byte)10);
     m1(100); 
  }
}
class Sample7
{
  static void m1(Byte b)
  {
    System.out.println("Byte");
  }
  static void m1(Long l)
   {
    System.out.println("Long");
  }
  public static void main(String[] args)
   {
      byte b=10;
      m1(b);
      //byte c=20;
      //m1(c);
  }
}
class Sample8
 {
   static void m1(int a,double d)
    {
      System.out.println("int double");
   }
   static void m1(byte a,long b)
    {
     System.out.println("long,long");
   }
   public static void main(String[] args)
    {
     m1(10,20);  
   }
}
class Sample9
 {
   static void m1(int a,double b)
    {
      System.out.println("int double");
   }
   static void m1(long a,long b)
   {
    System.out.println("long long");
   }
   static void m1(Integer a,Integer b)
    {
     System.out.println("Integer ,Integer");
   }
   public static void main(String[] args)
    {
        //m1(10,20); 
   }
}
/*class Sample10
 {
   static void m1(int...a,double f)
    {
      System.out.println("int...double");
   }
   static void m1(int a,double b)
    {
       System.out.println("int ,double");
   }
   public static void main(String[] args) 
    {
       m1(10,20,1.0f);
       m1(10,1.0f);
 }
}*/
class Sample11
 {
   static void m1(int a,float b)
    {
      System.out.println("int float");
   }
   static void m1(int a,double b)
   {
      System.out.println("int ,double");
   }
   static void m1(Integer a,Integer b)
    {
      System.out.println("long ,long");
   }
   public static void main(String[] args) 
    {
     m1(10,20);
     m1(10,20L); 
   }
}
class Sample12
 {
   static void m1(Number n)
    {
       System.out.println("Number");
   }
   static  void m1(byte b)
    {
     System.out.println("byte");
   }
   public static void main(String[] args) 
    {
     //m1('a');

       m1(10);
       m1(20L);
   }
}
class Sample13
 {
   static void m1(Object b)
    {
     System.out.println("Object");
   }
   static void m1(Number n)
    {
       System.out.println("Number");
   }
   static void m1(byte b)
    {
       System.out.println("byte ");
   }
   public static void main(String[] args)
     {
       //m1(a);
       m1(10);
       m1("");

   }
}
class Sample14
 {
   static void m1(Object o)
    {
      System.out.println("Object");
   }
   static void m1(String s)
    {
      System.out.println("String");
   }
   static void m1(int b)
    {
       System.out.println("int");
   }
   public static void main(String[] args) 
    {
     m1("");
     m1(null);
     m1('a'); 
   }
}
class Sample15
 {
   static void m1(Object b)
    {
      System.out.println("Object");
   }
   static void m1(String n)
    {
      System.out.println("String");
   }
    static void m1(char b)
     {
      System.out.println("char");
    }
    static void m1(Integer a)
     {
       System.out.println("Integer");
    }
    public static void main(String[] args) 
     {
       m1("");
       //m1(null);
       m1('a');
       m1(10); 
    }
}
class Sample16
 {
    static void m1(byte b)
     {
       System.out.println("byte");
    }
    static void m1(Long a)
     {
      System.out.println("Long");
    }
    public static void main(String[] args)
      {
       // m1(10);

    }
}
/*class Sample17
 {
   static void m1(int a,Integer b)
    {
      System.out.println("int ,Integer");
   }
   static void m1(Integer a,int b){
     System.out.println("Integer ,int");
   }
   public static void main(String[] args)
     {
       m1(1,2);
    }
   }
   class Sample18
   {
     static void m1(int a,Integer b)
     {
       System.out.println("int ,Integer");
     }
     static void m1(Integer a,int b)
      {
        System.out.println("Integer,int");
     }
     public static void main(String[] args) 
      {
         m1(1,new Integer(10));
     }

   }
   class Sample19
    {
      static void m1(int a,long...l)
       {
        System.out.println("int,long...");
      }
      static void m1(int a,Object o)
       {
          System.out.println("int,Object");
      }
      static void m1(int...a)

       {
         System.out.println("...");
      }
      static void m1(Object ref)
       {
          System.out.println("Object");
      }
      public static void main(String[] args) 
       {
        m1(1,1L);
        m1(1,null);
        m1(null); 
      }
   }*/
    /*class Sample20
     {
       static void m1(int a,Integer b)
        {
          System.out.println("int Integer");
       }
       static void m1(Integer a,int b)
        {
          System.out.println("Integer ,int");
       }
       public static void main(String[] args) 
        {
          m1(1,2); 
       }
   }*/
   /*class Sample21
    {
     static void m1(int a,Integer b)
      {
         System.out.println("int ,Integer");
     }
     static void m1(Integer a,int b)
      {
        System.out.println("Integer,int");
     }
     public static void main(String[] args) 
      {
        m1(1,new Integer(10)); 
     }
   }*/
   /*class Sample22
    {
      static void m1(int a,long...l)
       {
          System.out.println("int ,long...");
      }
       static void m1(int a,Object o)
        {
         System.out.println("int ,Object");
       }
       static void m1(int...a)
        {
           System.out.println("...");
       }
       static void m1(Object ref)
        {
          System.out.println("Object");
       }
       public static void main(String[] args)
         {
           m1(1,1L);
           m1(1,null);
           m1(null);
       }
   }*/
   /*class Sample23
    {
      static void m1(int...a)
       {
          System.out.println("int...");
      }
      static void m1(int a,int...b)
       {
         System.out.println("int,int...b");
      }
      static void m1(Integer i)
       {
          System.out.println("Integer");
      }
      static void m1(Object ref)
       {
         System.out.println("Object");
      }
      public static void main(String[] args)
        {
          m1(10);
      }
   }*/

   /*class  Sample24
    {
      static void m1(int...a)
       {
        System.out.println("int...");
      }
      static void m1(int a,int ...b)
       {
         System.out.println("int ,int...b");
      }
      static void m1(Integer i)
      {
         System.out.println("Integer");
      }
      static void m1(Object ref)
       {
         System.out.println("Object");
      }
      public static void main(String[] args) 
       {
        m1(10);
        m1(10,20);
        m1(1,2,3);  
      }
   }*/
   /*class Sample25
   {
     static void fun(int...ar)
     {
       System.out.println("int...");
     }
     public static void main(String[] args)
      {
       int a[]={10,20};
       fun(10,20);
       fun(a);
     }
 }*/
 /*class Sample26
  {
    static void m1(int...a)
     {
        System.out.println("int...");
    }
    static void m1(byte b)
     {
       System.out.println("byte");
    }
    static void m1(Integer i)
     {
       System.out.println("Integer");
    }
    static void m1(Object ref)
     {
       System.out.println("Object");
    }
    static void m1(long ref)
     {
       System.out.println("long");
    }
    public static void main(String[] args) 
     {
       byte b=10;
       int i=10;
       int a[]=null;
       m1(b);
       m1(i);
       m1(a); 
    }
 }*/
 /*class 1
 {
    public void doit()
     {

    }
    public String doit()
     {
       return a;
    }
    public double doit(int x)
     {
       return 1.0;
    }
 }*/
 class Test
  {
   public static void main(String[] args) 
    {
      int i,n=50;
      for( i=1;i<n;i++)
       {
         if(i%2!=0)
          {
            System.out.println("odd number"+n);
         }
      }
   }
 }
 
 
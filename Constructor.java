//NON STATIC CONSTRUCTOR PROGRAM


  class Std
{
   private  String name,id,address;
      private int roll,sal;



     private Std()
     {
    name="monika baisa";
    id="mona1234";
    address="indore";
    roll=101;
    sal=10;
  }
      public static void main(String[] args) {

      Std s=new Std();
   System.out.println(s.name);
    }

  }
  class Std1
   {
      private String name,id;
      private int roll,sal;
         private Std1()
     {
       name="monika";
       id="mona12";
       roll=1234;
       sal=12000;

       public static void main(String[] args)
        {
         Std1 s=new  Std1();
         System.out.println(s.name);
         System.out.println(s.id);
         System.out.println(s.roll);
         System.out.println(s.sal);
       }
     }
  

 
 



/**Private word ka use islie hota h qki hum jab bhi private ko ClassL
m use krte h to dusri class m uska object bnakr hi 
use print kra skte h NON STATIC  */
/*class Test7
{
public static void main(String[] args)
 {
  Std1 s=new Std1();
 System.out.println(s);
 }
}
class Std1
{
  private String name,id,address;
  private int roll,sal;
  Std1()
  {
   this. name="monika baisa";
   this. id="mona123";
   this. address="vijay nagar";
   this. roll=101;
   this. sal=500000;
    System.out.println(name+","+id+","+address+","+roll+","+sal);
}

  public String toString()
   {
     return name;+","+id+","+address+","+roll+","+sal;
    }
}*/






class Test9
{
       public static void main(String[] args) 
     {
       Emp p=new Emp();
       Emp p1=new Emp();
      Std5 s=new Std5("m");
       System.out.println("hello i am here");
       System.out.println(s);

     }
}
  class Emp 
{ 

   Emp()
   {
      System.out.println("hello");
   }
}
 class Std5 extends Emp
 {
    Std5()
    {
       int a;
       String s;
      System.out.println("Monikaa");
    }
        Std5(String s)
        {
          
          super();
          System.out.println("mona");
        }
         Std5(int a)
         {
           System.out.println("monika");
         }
  
     public String getName();
     {
      return  this name;
    }

    public void setName(String name);
    {
       this.name=name ;
 }
}

/*class Test10
{
  public static void main(String[] args)
  {
     Emp1 e=new Emp1("monika","indore","mona123");
      e.setAddress("banglore");
      //e.getAddress();
      //System.out.println(e);
      //System.out.println(e.getAddress());
      System.out.println(e);

  }
}

 class Emp1
 {
    String name,address,id;

   Emp1(String name,String address,String id)
   {
     this .name=name;
     this.address=address;
     this.id=id;
   }
 
   public String getAddress()
   {
    return this.address;
   }
    public void setAdress(String Address)
    {
      this.address=address;
    }
      public String toString()
      {
        return name+","+address+","+id;
     }
  }*/

/*class Test{
     public static void main(String[] args) {
        // System.out.println("hello");
         Dollop d = new Dollop();
         d.m2();
      //System.out.println( m1());


       }  
}
   class Dollop{
     static int a=10;

   Dollop()
  {
    System.out.println("constructor");
  }

  static {
    System.out.println("static block");
  }
  {
    System.out.println("none static block");
  }
  static void m1()
  {
    System.out.println("static method");
  }
  void m2()
  {

    System.out.println(" non static method");
  }
}*/
/*class Test12
{
   public static String revstr(String str)
   {
     char chr[]=str.toCharArray();
     int si=0,li=chr.length-1;
     while(si<li)
     {
      char ch=chr [li];
      chr[li]=chr [si];
      chr[si]=ch;
      s++;
      li--;
     }
     return new String (chr);
   }
   public static void main(String[] args)
    {
     System.out.println("hello");
   }
}*/
/*interface I
{
  //public static final int a=10;
    //public abstract  void show();
        void  show();
        void show1();
}
class Data implements I
{
   public void show()
    {
     System.out.println("DATA monika");
    }
    public void show1()
      {
     System.out.println("DATA radhika");
      }
}
class Data1 implements I
{
  public void show()
    {
     System.out.println("DATA1 monika");
    }
     public void show1()
      {
     System.out.println("DATA1 radhika");
      }
}
class Test
{
  public static void main(String[] args) 
     {  
     
      Data d=new Data();
      d.show();
      Data1 d1=new Data1();
      d1.show1();

      //System.out.println(a);
     }
}*/

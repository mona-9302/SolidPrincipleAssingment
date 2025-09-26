class Test
{
  static void show()
  {
    System.out.println("1");
  }
  public static void main(String[] args) 
   {
     Test.show();
   }
 }
class Test1
{
  void data()
 {
  System.out.println("2");
 }
 public static void main(String[] args)
  {
   Test1 t=new Test1();
    t.data();
   }
 }
       //OVERLOADING CONCEPT
 /*class Data
 {
   void show(int a)
   {
     System.out.println("1");
   }
   void  show(int a,int b)
   {
     System.out.println("2");
   }
   public static void main(String[] args)
    {
     Data d=new Data();
     d.show(100);
   }
 }*/
 class Data1
 {
     public static void main(String[] args) 
     {
     System.out.println("1");
     Data1 d=new Data1();
     d.main(20);
   }
     public static void main(int a)
   {
    System.out.println("2");
    }
  }
 


 

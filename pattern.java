class Data
{
  public static void main(String[] args) 
   {
   	int n=5;

   	for(int i=1;i<=n;i++)
   	 {
       for(int j=1;j<=i;j++)
       {
         System.out.print("*");
       }
       System.out.println();
   	}
   }
}
class Data1
{
  public static void main(String[] args)
   {
	int n=5;
	int i,j;
	for(i=1;i<=n;i++)
	{
	  for(int c=1;c<=n-i;c++)
		{
		  System.out.print(" ");
		}	
         for(j=1;j<=i;j++)
        {
         System.out.print("*");
       }
        System.out.println();
   }
  }
}
// class Data2
// {
//   public static void main(String[] args) 
//     {
//        int n=9;
//        for(int i=0;i<n;i++)
//         {
//          for(int j=0;j<n;j++)
//           {
//             if(i+j<n/2||j-i>n/2)
//               {
//                 System.out.print(" ");
//             }
//             else 
//               System.out.print("*");
//          }
//          System.out.println();
//        }

//    }*/

/*class Data3
{
  public static void main(String[] args)
   {
    int n=5;
    for(int i=0;i<=n;i++)
    {
      for(int j=0;j<=n;j++)
      {
         System.out.print(i+"" +j+ " ");
      }
       System.out.println();
}*/

//O/P=MATRIX;class Data4
/* {
  public static void main(String[] args) 
   {
    int n=5;
     for(int i=0;i<=5;i++)
      {
        for(int j=0;j<=5;j++)
        {
            //if(i==j)
          if(i==j||i==n-5||i<j)
              System.out.print("*");
            else 
              System.out.print(" ");
          } 
          System.out.println(); 

            
        }
     }
  }*/
  // class Data5
  // {
  //  public static void main(String[] args) 
  //  {
  //    int n=5;
  //    for(int i=0;i<=5;i++)
  //    {
  //     for(int j=0;j<=5;j++)
  //     {
  //       if(i==j||i<j)
  //         System.out.print("*");
  //       else 
  //         System.out.print("") ;
  //     }
  //       System.out.println();
  //     }
  //    }
  //  }
/*class Data7
  {
  public static void main(String[] args) 
   {
  int n=5;
   for(int i=0;i<=5;i++){
     for(int j=0;j<=5;j++)
     {
      if(i==0||j==1&&j==2||j==3)
      
      
        System.out.print("*");
      else 
        System.out.print(" ");
     }
     System.out.println();

   }
  }
}*/
 //O/P=T

/*class Data8
{
  public static void main(String[] args) 
   {
     int n=5;
    for(int i=0;i<=5;i++)
    {
      for(int j=0;j<=5;j++)
      {
       if(j==0||i==j||j==n-1&&i==j||j==n)
        System.out.print("*");
      else 
        System.out.print(" ");
      }
      System.out.println();
      }
    }*/
  //O/P=N
 /* class Data9
  {
   public static void main(String[] args) 
   {
     int n=5;
     for(int i=0;i<=5;i++)
      {
       for(int j=0;j<=5;j++)
        {
          if(j==0||i==n)
            System.out.print("*");
          else 
            System.out.print(" ");
        }
        System.out.println();
       }
     }
   }O/P=L*/
   /*class Data9
    {
      public static void main(String[] args)
       {
         int n=5;
         for(int i=0;i<=5;i++)
          {
           for(int j=0;j<=5;j++)
            {
             if(j==0||j==n-2||i==n-3)
              System.out.print("*");
              else 
              System.out.print("  ");
           }
           System.out.println();
         }
      }
   }O/P=H*/
  /* class Data10
    {
     public static void main(String[] args) 
     {
       int n=5;
       for(int i=0;i<=5;i++)
        {
         for(int j=0;j<=5;j++)
          {
           if(j==0||i==0||i==n-3)
              
            System.out.print("*");
           else 
            System.out.print("");
         }
         System.out.println();
       }
     }
   } O/P=F*/
   /*class Data11
    {
      public static void main(String[] args) 
         {
          int n=5;
          for(int i=0;i<5;i++)
          {
            for(int j=0;j<5;j++)
             {
               if(j==0||i==n-1||j==n-1)
              
                System.out.print("*");
              else 
                System.out.print(" ");
            }
            System.out.println();
          }
       }
   }O/P=U*/
  /* class Data12
   {
     public static void main(String[] args) 
       {
         int n=5;
         for(int i=0;i<5;i++)
          {
            for(int j=0;j<5;j++)
            {
             if(j==0||i==n-1||j==n-1||i==0)
              System.out.print("*");
            else 
              System.out.print(" ");
            }
            System.out.println();
         }
     }
   }
   O/P=U*/
   /*class Data13
     {
       public static void main(String[] args)
        {
         int n=5;
         for(int i=0;i<=5;i++)
          {
            for(int j=0;j<=5;j++)
             {
                if(j==0||i+j==n-2||i==j+1)
                 System.out.print("*");
               else 
                System.out.print(" ");
            }
              System.out.println();
         }
     }
   }O/P=K*/
   /*class Data14
     {
      public static void main(String[] args) 
         {
          int n=5;
          for(int i=0;i<=5;i++)
          {
            for(int j=0;j<=5;j++)
            {
              if(i==0||j==0||i==n)
                System.out.print("c");
              else 
                System.out.print(" ");
            }
            System.out.println();
          }
      }*/
   //O/P=C
   /*class Data15
     {
       public static void main(String[] args)
          {
           int n=5;
           for(int i=0;i<=5;i++)
            {
              for(int j=0;j<=5;j++)
               {
                 if(i==0||i==n-1||i+j==0||j==n/2)
                
                  System.out.print("i");
                else 
                  System.out.print(" ");
              }
              System.out.println();
           }
      }
   }*/
  // O/P=I
   /*class Data16
     {
       public static void main(String[] args)
          {
             int n=5;
             for(int i=0;i<n;i++)
              {
                for(int j=0;j<n;j++)
                  {
                   if(j==0||j==n-1||(i==j&&i<=n/2)||(i+j==n-1&&i<=n/2))
                   
                  System.out.print("*");
                 else 
                  System.out.print("  ");
                }

                System.out.println();

            }
       }
   }*/
   //O/P=M
  /* class A
   {
     public static void main(String[] args) 
     {
           int n=5;
           for(int i=0;i<5;i++)
         {
           for(int j=0;j<5;j++)
            {
               
              if(i==0||j==n-1||j==0||i==n/2)
                System.out.print("*");
              else 
                System.out.print(" ");
            }
           
           System.out.println();
        }

      }
    }*/
   /* class Y
    {
     public static void main(String[] args) 
      {
       int n=5;
        for(int i=0;i<=5;i++)
         {
          for(int j=0;j<=i;j++)
           {
             //if(i+j==n-1||i==j)
              if(j==0)
              System.out.print("j");
            System.out.print(" ");
          }
          System.out.println();
        }
     }
    }*/
 
 /*class Animal
  {
     void run()
      {
        System.out.println("monika");
     }
 }
  class Dog extends Animal 
  {
   public static void main(String[] args)
    {
      Dog d=new Dog();
      d.run();
      //System.out.println();
    }
 }
   class Bank
   {
    void show()
     {
        System.out.println("monika");
        //return 0;
    }
 }
 class Sbi extends Bank
  {
   void show()
    {
       System.out.println("mona");
       //return 0;
   }
 }
 class Pnb extends Bank
  {
    void show()
     {
        System.out.println("siddhi");
    }
 }
 class Rbi extends Bank
  {
   void show()
    {
      System.out.println("mahi");
      //return 0;
   }
   public static void main(String[] args)
     {
       Bank b=new Bank();
       b=new Pnb ();
       b.show();
   }
 }
  class Test
  {
    void show()
     {
       System.out.println("monika");
    }
 }
 class Std extends Test
  {
    void show()
     {
       System.out.println("mahi");
    }
     public static void main(String[] args)
      {
        Test t=new Std();
        System.out.println(t);
    }
 }*/

 // class Test{
 //  public static void main(String[] args) {

 //        int n=4;
 //        for(int i=1;i<=n;i++)
 //        {
 //          for(int j=1;j<=i;j++)
 //          {
 //            System.out.print("*");
 //          }
 //           System.out.println();
 //       }
 //  }
 // }


 // class IsPrime{

 //    public static void main(String[] args) {
      
 //         int n = 6;
 //         boolean flag = false;

 //         for(int i=2;i<n/2;i++)
 //         {
 //             if(n/2!=0){
 //                 flag = true;
 //                 break;
 //             }
 //         }

 //         if(flag){
 //            System.out.println("no is prime");
 //         }
 //         else {
 //          System.out.println("no is not prime");
 //         }
 //    }
 // }
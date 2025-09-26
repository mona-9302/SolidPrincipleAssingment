class Oddnumber
{
    static int isprime(int n)
    {
        int i;
        for(i=2;i<n/2;i++)
        {
            if (n%i==0)
             return 0;
         } 
          return 1;
        
    }
}



/*public static void main(String[] args)
 {
    int n;
    n=23; 
   if (isprime(n)==1)   

    {
        System.out.println("prime number"+n);
     }
     else 
     {
        System.out.println("not prime "+n);
     }
   
   } 
 }
 class Characterarray
 {
    public static void main(String[] args)
     {
        String s="mona rajput";
        char chr[]=s.toCharArray();
        System.out.println(chr );
        
    }
 }
 

 class Substring
 {
    public static void main(String[] args)
     {
        String s="my name is  mona";
        String s1=s.substring(7,15);
        System.out.println(s1);
    } 
 }

              class Sum
 {
    public static void main(String[] args)
     {
        int sum;
        int a=10;
        int b=20;
        int c=30;
        int d=40;
        sum=a+b+c+d;
        System.out.println(sum);
      }  

 }

           class Subtraction
        {
            public static void main(String[] args)
             {
                int sub;
                int a=20;
                int b=10;
                sub=a-b;
                System.out.println(sub);
              }  
        }

 class Divide
{
    public static void main(String[] args)
     {
        int div;
        int a=200;
        int b=20;
        div=a/b;
        System.out.println(div);
     }   
 } 
  
 class Static
 {
    static int a=5;
    public static void main(String[] args)
     {
    
        
        System.out.println(a);
     }
 }
 class Intstring
 {
    String s="mona";
    int a=8;
    public static void main(String[] args)
     {
        Intstring m=new Intstring ();
        System.out.println(m.a);
        System.out.println(m.s);
     }   
   }

class Intstring1
{
static String s="mona";
static int a=10;
public static void main(String[] args)
 {
    Intstring1 m=new Intstring1();
    System.out.println(s);
    System.out.println(a);
  }
}
class  Intstring2
{
    static String s="monika";
    static int a=12;
    public static void main(String[] args)
     {
        Intstring2 m=new Intstring2();
        System.out.println(m.a);
        System.out.println(m.s);
        m=null;
       // System.out.println(a);
       // System.out.println(s);
        System.out.println(a);
        System.out.println(s);
      }  
}

class Intstring3
    {
    String s="mona";
    int a=10;
    void fun()
    {
        System.out.println(this.a);
        System.out.println(this.s);
    }
    public static void main(String[] args) 
    {
        Intstring3 m=new Intstring3();
        m.fun();
        
    }
}

class Data
{
    static String s="mona";
    static  int a=10;
 }
 class  Data1
 {
    public static void main(String[] args)
     {
        Data d=new Data();
        System.out.println(d.a);
        System.out.println(d.s);
        d=null;
        System.out.println(d.a);
        System.out.println(d.s);
      }
    }
class Data2
{
    public static void main(String[] args)
     {
        float  f=10.24f;
        Float  d=10.244f;
        System.out.println(f);
        System.out.println(d);
      } 
 }
class Conceate
{
    public static void main(String[] args)
     {
        String s1="monika";
        System.out.println(10+20 +"monika");
        
    }

}
class Conceate1
 {
    public static void main(String[] args)
     {
       String s1="monika";
       System.out.println("monika"+10+20); 
    }
}

class Monika
{
   void msg()
{
  System.out.println("hello i am good");  

   }
}
class Test extends Monika
{
    public static void main(String[] args)
     {
        Monika m= new Monika();
       m. msg();
        std st=new std();
        System.out.println(st);
    }
}
class std
{
String name="abc",address="nai pta",mobile="00000000";
public String toString(){
   return name+","+address+",+mobile"; 
}

}
class  Sample
{

    int a=10;
    public boolean equals (Object ob)
    {
       return this .a==a;
    }
}

class Testt
{
public static void main(String[] args) 
   {
    Sample ob1=new Sample();
    Sample ob2=new Sample();
    System.out.println(ob1.equals(ob2));
    }
}
class Pequals
{
String s="hello";
String s1="hello";
   public boolean equals (Object ob)
   {
       return s1==s;
   }
   public static void main(String[] args)
    {
     Pequals t1=new Pequals();
     Pequals t2=new Pequals();
     System.out.println(t1.equals (t2)); 

   }
}
class Pequals1
{
String s="hello";
String s1="hello";
   public boolean equals (Object ob)
   {
     return s1!=s;
   }
   public static void main(String[] args) 
   {
      Pequals1 t1=new Pequals1();
      Pequals1 t2=new Pequals1();
      System.out.println(t1.equals(t2));
   }
}
class Pequals2
{
  String s="hello";
  String s1="hellojj";
  public boolean equals (Object ob)
{  
  return s1==s;
}
public static void main(String[]args)
{
Pequals2 t1=new Pequals2();
Pequals2 t2=new Pequals2();
System.out.println(t1.equals(t2));
System.out.println(t1);
 }

}*/
/*class R
{
Integer a=10;
String s="mona";
String s1= "mona";
String s2="rajput";
}
class Child extends  R
{
    Integer a=10;
    String s="mona";
    String s1= "mona";/*
    String s2="rajput";/*
//Integer a=30;
//Integer b=30;

public static void main(String[] args)
 {
   R ob=new Child();
Child ob1=new Child ();
System.out.println(ob1.a==ob1.a);
System.out.println(ob.a);
System.out.println(ob.s); 
System.out.println(ob.s1==ob1.s1);
System.out.println(ob.s2);
System.out.println("mona" .equals ("mona"));

  }
}
/*class O
{

Integer a=100;

}

class Bacha extends O
{
Integer a =200;
public static void main(String[] args)
 {
   O ob=new  Bacha();
   Bacha ob1=new Bacha();
   System.out.println(ob.a==ob1.a); 

}
}

class Abc 
{
    public static void main(String[] args) {
        
    
    Integer a=-100;
    Integer b=-200;
System.out.println(a.equals(b));
int c=400;
int d=400;
System.out.println(c==d);
Integer e=500;
int f=600;
System.out.println(e==f);
}    
}


class C
 {
    Integer a=-10;
    int b=-20;
    String s="1234";
    String s1="rajput";

}
class D extends  C
{
    char ch='l';
   Character ch1='m';
    String s="1234";
    String s1="rajput";
    public static void main(String[] args) 
    {
        C ob=new C();

        D ob1=new D();*/
       /* System.out.println(ob.a==ob.b);//false
        System.out.println(ob1.ch==ob1.ch1);//false
        System.out.println(ob1.s.equals(ob.s));//true
        System.out.println(ob.s==ob1.s);//true
        System.out.println(ob.s.equals(ob1.s));//true*/
       /*System.out.println(Integer.valueOf(ob.s)==ob.a);
        System.out.println(ob.s==ob1.s);
        System.out.println(ob.b==ob.a);
        System.out.println(ob.b==ob.a);
        System.out.println(ob1.s1.equals(ob.s));
         
        
    


/*class S
{
    Integer a=10;
    Integer b =20;
    String s="mona";
    public static void main(String[] args)
     {

        T ob=new T();
        S ob1= new S  ();
       System.out.println(ob.a.equals.(ob.a));
        
    }

}*/




  /*class Printstring
  {
    public static void main(String[] args)
     {*/
     //final String s="i";
    // final String s1="am";
        //String s="i";
        //String s1="iammona";
     //String s2="fine";
    /* String s3="iamfine";
    String s4=s+s1+"fine";
    String s5=s1.intern(); 
    System.out.println(s5==s3);*/



         //5.12.23 Concat  karne ka program

 /*class Addconcat
 {
    public static void main(String[] args)  {
    String s1="i";
    String s2="am";
    String s3 = s1.concat("hyy");
    String s4="iammona";
    String s5=s1+s2+"mona";
    String s6=s2.concat ("mona");
   //System.out.println(s5);
   //System.out.println(s3);
   System.out.println(s6);
  }
}*/


            //Substring progrram
/*class  Addconcat2
{
public static void main(String[] args) 
{
    String s="I am mona";
    String s1="i am rajput";
   // String s1=s.substring();

   System.out.println(s.substring(5,9));
   System.out.println(s1.substring(4,6));
}
}*/


          //character ka index
/*class Addconcat3
{
    public static void main(String[] args)
     {
      String s="i am mangla";
      String s1="i am mona";
      System.out.println(s.indexOf('g'));
      System.out.println(s1.indexOf('o'));  
     }
}

                //character ki length ka index
class Addconcat4
{
    public static void main(String[] args)
     {
       String s="i am monika";
       s=s.substring(0,s.length()-3);
       System.out.println(s);
    
       //s=s1.substring(0, 15 -4);
     // s= s.substring(0,17-3);
    }
}*/

                //character ke word right karne ka program

class Addconcat5
{
public static void main(String[] args)
 {
    char ch[]={'h','a','l','l','o'};
    for(int i=0;i<ch.length;i++)
    {
        if(ch[i]=='a')
            ch[i]='e';
    }
    System.out.println(ch);

}
}
          //character change krne ka program 

class Addconcat6
{
public static void main(String[] args) 
{
   String s="hallo";
   char ch[]=s.toCharArray();
   for(int i=0;i<ch.length;i++) 
     {
       if(ch[i]=='a')
          ch[i]='e';
     }
     s=new String(ch);
     System.out.println(s);
}
}
      //character print karne ka program
class Addconcat7
{
    public static void main(String[] args)
 {
  char ch[]={'h','a','l','l','o'};
  for(int i=0;i<ch.length;i++)
  {
    System.out.println(ch[i]);
    }
  }
}

//Replace karne ka program 

class Addconcat8
{
   public static void main(String[] args) 
     {
        String s="hallo dollop as";
        s=s.replaceAll("a","e");
        System.out.println(s);
     }

              //6/12/2023
}
  class Mona23 
{
    public static void main(String[] args)
     {
      String list[]=split("hello. how. are. you",". ");
      for(int i=0;i<list.length;i++)
         System.out.println(list[i]);  
    }
    public static String[] split(String str,String find)
    {


     String list[]=new String[str.length()];
     int i=0;
     int s=0,l=0;
     while(true)
       {
            l=getLastIndex(str,find,s);
            String sub="";
            if(l==str.length())
                 sub=str.substring(s,str.length());
            else 
              sub=str.substring(s,l-find.length());
              list[i++]=sub;
              s=l;
             if(l==str.length())
                break;
        }
          return trimToSize(list);
    }
       public static int getLastIndex(String str,String find,int s)
       {
         for(int i=s;i<str.length();i++)
         {
            boolean temp=true;
            if(str.charAt(i)==find.charAt(0))
         {
              for(int j=0;j<find.length();j++)
            {
               if(str.charAt(i++)!=find.charAt(j))
               { 
                    temp=false;
         
                }
            }
                  if(temp)
                     return i;
         }   
           }
              return str.length();
    }          
    public static String[] trimToSize(String[] list)
   {
        int i;
       for(i=0;i<list.length;i++)
       {
         if(list[i]==null)
           {
               break;
            }
        }
            int c=i;
            String newList[]=new String[c];
            for(i=0;i<c;i++)
            {
              newList[i]=list[i];
            }
            return newList;
    }


}
           // TYPECASTING PROGRAM
  class Selftask
   {
      public static void main(String[] args)
      {
         int a=10;
         double d=a;
         float f=a;
          System.out.println(a);
          System.out.println(f); 
        }
    }
 class  Selftask1
   {
     public static void main(String[] args)
       {
         int myval=10;
         int mydouble=(int )myval;
         System.out.println(mydouble);
        }
    }
      
class Selftask3
{
    public static void main(String[] args)
     {
     // String s="mona";
        String s="hello world";
      String rev="";
      int length=s.length();
      //for(int i=length-1;i>=0;i--)
      for(int i=length-1;i>=0;i--)
        {
          rev=rev+s.charAt(i);
          System.out.println("reverse string is"+:rev);
        }  
    }
}
class Selftask4
{
   public static void main(String[] args)
   {
       String s="hello";
       String rev="";
       for(int i=0;s<=length-1;i--)
         {
          rev=rev +s.charAt(i);
          System.out.println(i);
         }
    }     
}*/




        
    


 

   

        
    
   




        
    
   
  
    

         


    











   
   
    
     
















      
  
















 
     

    



















    








    

 




  
  


  
       

        
    




        
    




  




























    







    

    
  
       
    



    









        
    










   

 










   


















 
 










    









                
            
        
          




           










  
  



   








    












  




 












































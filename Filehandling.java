/*import java.io.*;
class Test
 {
   public static void main(String[] args) 
   {
   	  File f=new File("abc.txt");
   	  System.out.println(f.exists());
	
   }
}

class Test7
 {
   public static void main(String[] args) 
    {
	  File f=new File("abc");
	  System.out.println(f.exists());
   }
}*/

/*import java.io.*;
class Test1
 {
   public static void main(String[] args)throws Exception
   {
	File f=new File("abc.txt");
	 if(f.exists())
	  {
        System.out.println("File already exists");
	 }
	 else 
	 {
	 	f.createNewFile();
	 	 System.out.println("new file is created");
	 }
   }
}*/

/*import java.io.*;
 class Test2
 {
  public static void main(String[] args) 
  {
	File f=new File ("C:\\");
	if(f.exists())
	 {
	 	if (f.isDirectory()){
	 		String names[]=f.list();
	 		System.out.println(names.length+"file and folders");
	 		for(String n:names)
	 			System.out.println(n);
	 	}
         System.out.println("File  already exists");
	}
	  else 
	 {
       System.out.println("file already exists");
	}
  }
}*/
      //OBJECT TYPECASTING 
/*class Test3
 {
   public static void main(String[] args) 
    {
	   //Object ob=new Test();
	   //String t= (String ) ob;
	    Object o=new Object();
	    System.out.println(o);
    	
	   //Test t=(Test)ob;
	   //Test t=ob;
      //System.out.println(t);
	}
}*/

/*import java.io.*;
class Test
 {
   public static void main(String[] args)throws Exception
    {
	 // File f=new File("abc.txt1");
	  File f=new File("abc.txt");
	  System.out.println(f.exists());
  }
}
class Test1
 {
   public static void main(String[] args)throws Exception
    {
	  File f=new File("abc.txt1");
	   if(f.exists())
	    {
           System.out.println("file already exists");
	   }
	   else
	    {
          f.createNewFile();
           System.out.println("file is already created");
	   } 

    }
}*/
  /*import java.io.*;
  class Test
  {
   public static void main(String[] args) 
    {
	  File f=new File("C:\\");
	    if(f.exists())
	    {
	    	if(f.isFile())
	    	 {
               String names[]=f.list();
               System.out.println(names.length+"file and folders");
               for(String n:names)
               	System.out.println(n);
	    	}

	   }
	   else
	    {
         System.out.println("file already exists");
	   } 

   }
}*/
/*import java.io.*;
 class Test
  {
     public static void main(String[] args) 
     {
	    File f=new File("abc");
	    if(f.exists())
	     {
            System.out.println("folder exists");
	    }
	    else 
	    {
	    	f.mkdir();
	    	System.out.println("new folder  is created");
	    }
    }
}*/
 /*import java.io.*;   
 class Test     
 {
    public static void main(String[] args)
    {
	  File f=new File("C://java");
	  if(f.exists())
	   {
           if(f.isDirectory())
          {
            String name[]=f.list();
            //System.out.println(name.length);
              for(int i=0;i<name.length;i++)
              {
                File f1=new File(name[i]);
                 if(f1.exists())
                  {
                     if(f1.isFile())
                     	System.out.println(name[i]+"---------->is a file");

                     else if (f1.isDirectory())
                        System.out.println(name[i]+"----------->is a folder");
                 }
             }
         }
	  }
   }
}*/
   /*class Parent 
   {

 }
class Child extends Parent
 {
  public static void main(String[] args) 
  {
	Parent p=new Child();
	System.out.println(p);
  }
}*/
 /*class Parent 
 {
   void show()
    {
      System.out.println("monika");
   }
}
class Child extends Parent
 {
   void show()
    {
       System.out.println("rajput");
   }

  public static void main(String[] args)
  {
 	Parent p=new Child();
 	p.show();

   } 
}
 class Bank
 {
  void show()
   {
     System.out.println("monkaa");
  }
}
class Sbi extends Bank
 {
    void show()
     {
       System.out.println("m");
    }
}
class Rbi extends Bank
 {
   void show()
    {
      System.out.println("monka");
   }
}
class Pnb extends Bank
 {
   void show()
    {
       System.out.println("mahi");
   }

 public static void main(String[] args) 
 {
	Bank b;
	b=new Sbi();
	b=new Pnb();
	b=new Rbi();
	b.show();
	b.show();
	b.show();
  }
}
 class Parent
  {
   int a=10;
}
class Child extends Parent
 {
  int a=10;
  public static void main(String[] args)
    {
  	 Parent p=new Child();
  	 System.out.println(p.a);
  }
}*/


 /*import java.io.*;           //4.1.2024
 class Demo
  {
   public static void main(String[] args)throws Exception
     {
	     //File f=new File("mona.txt");
       FileWriter fw=new FileWriter("mona.txt");
      
	       fw.write("hello");
         fw.write("\n");

         fw.write(123);
         fw.write("\n");
         fw.write('c');
         fw.write("\n");
         fw.close();


   }
}*/

/*import java.io.*;
 class Demo1
  {
   public static void main(String[] args)throws Exception
     {
	    File  f=new File("mona.txt");
	    FileReader fr=new FileReader(f);
	    int c=0;
	    while((c=fr.read())!=-1)
     {
       System.out.println((char)c);
    }
	  
    }
}*/

/*import java.io.*;

 class Demo2
 {
   public static void main(String[] args)throws Exception 
   {
     File f=new File("Filehandling.java");
     System.out.println(f.length());
     FileReader fr=new FileReader(f);
     char b[]=new char[100];
     int i=0;
     System.out.println(b);
     while (fr.read(b)!=-1)
      {
         System.out.println(b);
         i++;
         System.out.println(i);
     }
  }
}*/
/*import java.io.*;
class Demo3
 {
    public static void main(String[] args)throws Exception 
    {
      File f=new File("mona.txt");
      FileReader fr=new FileReader(f);
      int c=fr.read();
      while(c!=-1)
       {
         //System.out.println((char)c);
        System.out.println(c);
         c=fr.read();
      }
  }
}*/
/*import java.io.*;
class Demo4
 {
    public static void main(String[] args)throws Exception
      {
        File f=new File("Filehandling.java");
        System.out.println(f.length());
        FileReader fr=new FileReader(f);
        char b[]=new char[(int)f.length()];
        int i=0;
        fr.read(b);
        System.out.println(b);
        b=null;
   }
}*/
                        //SELF PRACTICE
 /*import java.io.*;
class Demo5
 {

   public static void main(String[] args)throws Exception
     {
       FileWriter fw=new FileWriter("monika.txt");
       File f=new File("monika.txt");
      
       fw.write("hello");
       fw.write("\n");
       fw.write(125);
       fw.write("\n");
       fw.write('c');
       fw.write("\n");
       fw.close();

  }
}*/

/*import java.io.*;
class Demo6
 {
   public static void main(String[] args)throws Exception
    {
      File f=new File("mahi.txt");
      FileReader fr=new FileReader(f);
      int c=0;
      while((c=fr.read())!=-1)
       {
         System.out.println((char)c);

      }

   }
 }*/
  /*import java.io.*;
  class Test
   {
      public static void main(String[] args)throws Exception
       {
          BufferedWriter bw=new BufferedWriter(new FileWriter(con));
           bw.write("hello");
           bw.newLine();
           bw.write('c');
           bw.newLine();
           bw.close();

      }
  }*/

  /*import java.io.*;
  class Test1
   {
     public static void main(String[] args)throws Exception
      {
        list ("C:\\  ");
     }
     public static void list(String name)
      {
          File f=new File(name);
          if(f.isFile())
          System.out.println(name);
        else
         {
           System.out.println(name);
           String nameList[]=f.list();
           for(int i=0;i<nameList.length;i++)
            {
              list(name+"\\"+nameList[i]);
           }
        } 

     }
  }


 import java.io.*;
  class Test
   {
     public static void main(String[] args)throws Exception
      {
        FileWriter fw = new FileWriter("output.txt");
        BufferedWriter bw=new BufferedWriter(fw);
        BufferedReader br=new BufferedReader(new FileReader("file.txt"));  
        String line=br.readLine();
        while(line!=null)
        {
           if(isNotExist("output.txt",line))
          //if(!isNotExist("aaa.txt",line)&& isNotExist("output.txt"))
            {
                 bw.write(line);
                 bw.newLine(); 
                 bw.flush();
           }
             line =br.readLine();
        } 

     
       br=new BufferedReader(new FileReader("aaa.txt"));
       line=br.readLine();
     while(line!=null)
      {
          if(isNotExist("output.txt",line))
       // if(!isNotExist("aaa.txt",line)&& isNotExist("output.txt"))

           {
             bw.write(line);
             bw.newLine();
             bw.flush();
          }
            line=br.readLine();
     }
          bw.close();
  }
  public static boolean isNotExist(String name,String val)throws Exception{
     BufferedReader br=new BufferedReader(new FileReader(name));
     String line=br.readLine();
    

     while(line!=null)
      {
         if(line.equals(val))
          return false;
        line=br.readLine();
     }
      return true;
  }
}*/


/*import java.io.*;
class MySystem
 {
   static PrintStream out=null;

   static 
    {
       try 
         {
           out = new PrintStream("con");
         }
       catch (Exception e){}

   }

}
class Test 
  {
   public static void main(String[] args)throws Exception 
    {
     //PrintStream out=new PrintStream("output.txt");
      //out.println("hii hello ");
      MySystem.out.println("hi");
      //out.close();

      
  }
}*/




 /*import java.io.*;             
class Test1
 {
   public static void main(String[] args)throws Exception
    {
      ObjectOutputStream os=new ObjectOutputStream(new FileOutputStream("test.ob"));
      Sample s=new Sample();
      os.writeObject(s);

      ObjectInputStream ois =new ObjectInputStream(new FileInputStream("test.ob"));

      Sample s1=(Sample)ois.readObject();
      System.out.println(s1.a);
      System.out.println(s1.b);
      System.out.println(s1.c);

   }
}
 class Sample implements Serializable   
  {
    transient final  int a=10;
    int b=20;
    int c=30;
    Cat d=new Cat();
    String s="hello";
}
class Cat implements Serializable
 {
    int i=40;
}*/


/*import java.util.*;
import java.io.*;
class Crud
 {
   final String FILE_NAME="abc.obj";
   public void insert(Object al)
    {
       try
       {
         ArrayList oldValue=get();
         if(oldValue==null)

          {
            oldValue=new ArrayList();
         }
           FileOutputStream fos=new FileOutputStream(FILE_NAME);
           ObjectOutputStream os=new ObjectOutputStream(fos);
           oldValue.add(al);
           os.writeObject(oldValue);
           os.close();
      }
        catch (Exception e)
         {
          System.out.println(e);
        }
   }
     public void insert (ArrayList al)
      {
        for(int i=0;i<al.size();i++)
        {
           insert(al.get(i));
        }
     }
      public ArrayList get()
       {
         try
          {
            FileInputStream ios=new FileInputStream(FILE_NAME);
            ObjectInputStream os=new ObjectInputStream(ios);
            ArrayList al=(ArrayList)os.readObject();
            os.close();
            return al;
         }
           catch (Exception e)
            {
               //e.printStackTrace();
           }
             return null;
      }
}
class Test
 {
    public static void main(String[] args)
     {
       Crud crud=new Crud();
       crud.insert(new Emp("mahesh babu" ,"Hyderabad",90000));
       crud.insert(new Emp("Ravi teja","Tamilnadu",95000));
       crud.insert(new Emp("Mohanlal","Kerala",80000));
       crud.insert(new Emp("Anushka setthi","Hyderabad",60000));
       crud.insert(new Emp("Rashmika Mandana","Mumbai",50000));
       System.out.println(crud.get());
    }
}
class Emp implements Serializable
 {
    String name,address;
    int sal;
    Emp(String name,String address,int sal)
     {
        this .name=name;
        this.address=address;
        this.sal=sal;
    }
     public String toString()
      {
         return"("+name+","+address+","+sal+")\n";
     }
}

class Test1
 {
   public static void main(String[] args) 
    {
      ArrayList al=new ArrayList();
      al.add(10);
      al.add(20);
      al.add(30);
      al.add(40);
      al.add(50);
      al.add(2,100);
      System.out.println(al);
      al.remove(2);
      System.out.println(al);
  }
}*/
/*import java.util.*;
import java.io.*;
class Crud
 {
     final  String FILE_NAME="abc.obj";
     public void insert(Object al){
     try{
           FileOutputStream fos=new FileOutputStream(FILE_NAME);
           ObjectOutputStream os=new ObjectOutputStream(fos);
           ArrayList oldValue=get();
           if(oldValue==null)
            {
              oldValue =new ArrayList();
              oldValue.add(a1);
               os.writeObject(oldValue);
           }
           else 
          os.writeObject(al);
       }
       catch(Exception e)
        {
           System.out.println(e);
       }
     }
      public ArrayList get()throws Exception
      {
        try{
          FileInputStream ios=new FileInputStream(FILE_NAME);
         ObjectInputStream os=new ObjectInputStream(ios);
         ArrayList al=(ArrayList)os.readObject();
         return al;
       }
       catch(Exception e)
       {
          System.out.println(e);
       }
       return null;
    }

}
class Test{
  public static void main(String[] args)throws Exception {
    ArrayList al=new ArrayList();
    // al.add(10);
    // al.add(20);
     Crud c=new Crud();
     c.insert(al);
     ArrayList a1=c.get();
   // System.out.println(al);
    System.out.println(a1);
  }
}*/

class Test{
  public static void main(String[] args) {
    int a=10;
    int b=20;
    int sum;
    sum=a+b;
    System.out.println(sum);
  }
}
/*import java.util.*;
import java.io.*;
class Test{
	public static void main(String[] args) 
	{
		 ArrayList al=new ArrayList();
		 al.add(12);
		 al.add(13);
		 al.add(28);
		 Crud c=new Crud();
		 c.insert();
		 System.out.println(c);
		 System.out.println(al);
	}
}

class Crud
{

	    final String FILE_NAME="ABC.OBJ";

	public void insert()
	 {
	 	  try
	 	      {

            FileOutputStream fos=new FileOutputStream(FILE_NAME);
           ObjectOutputStream os=new ObjectOutputStream(fos);
            //os.writeObject(al);
          }

           catch(Exception e)
           {
              System.out.println(e);
          }
	}


}*/
import java.util.*;
import java.io.*;
class Test{
	public static void main(String[] args) {
		ArrayList al=new ArrayList();
		al.add(10);
		al.add(20);
		Crud c=new Crud();
		c.insert(al);
		ArrayList a1=c.get();
		System.out.println(a1);
		System.out.println(c);

		System.out.println(al);
	}
}

class Crud
{
	 final String FILE_NAME="abcd.obj";
	public void insert(ArrayList al)
	{
		try
		{
		     FileOutputStream fos=new FileOutputStream(FILE_NAME);
		    ObjectOutputStream os=new ObjectOutputStream(fos);
		    os.writeObject(al);
      }
       catch(Exception e)
       {
          System.out.println(e);
      }

	}
	  public ArrayList get()
	   {
	   	try
	   	    {
              FileInputStream fis=new FileInputStream(FILE_NAME);
              ObjectInputStream ois=new ObjectInputStream(fis);
              ArrayList a1=(ArrayList)ois.readObject();
              return a1;
             }
            catch(Exception e){
            	System.out.println(e);
            }
            return null;
         }
      }



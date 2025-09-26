
      //METHOD OVERLOADING
/*class Test
 {
     static void show(Object ob)
    {
       System.out.println("int method");
    }
     static void show(int a){
     	System.out.println("String method");
     }
    public static void main(String[] args)
      {
    	Test.show("");
    }
}
class Test1
 {
   Test1(byte b)
    {
     System.out.print("byte");
   }
   Test1(int a)
    {
        System.out.println("int ");
   }
   public static void main(String[] args) 
    {
      Test1 t=new Test1(90);
   }
 }

 class  Parent 
  {
    
     show(int a,int b)
      {
        System.out.println("m");
        return null;
     }
 }
 class Child extends Parent
  {
    String show(int a,int b)
     {
       System.out.println("nn");
       return null;
    }
    public static void main(String[] args) 
     {
       Parent p=new Parent ();
       p.show(10,20);
    }
 }*/

 /*class Employee
 {
     private int empid;
     public void setEmpid(int eid)
      {
        empid=eid;
     }
     public int getEmpid()
      {
        return empid;
     }

 }
 class Company 
  {
    public static void main(String[] args) 
    {
       Employee e=new Employee();
       e.setEmpid(101);
       System.out.println(e.getEmpid());
    }
 }*/

     /* abstract class Car
   {
      int a=20;
      abstract void show();
  }
  class Bike extends Car
   {
       void show()
    {
     int a=10;
       System.out.println("o");
        
    }
    public static void main(String[] args)
      {
       //Car c =new Car();;
       Bike b=new Bike();
       b.show();
    
    }
}*/
/*class Emp
 {
   private String name,id,mobile,address,company;
   private int salary;
   Emp(String name,String id,String mobile,String address,String company,int salary)
    {
       this.name=name;
       this.id=id;
       this.mobile=mobile;
       this.address=address;
       this.company=company;
       this.salary=salary;
   }
    Emp(String id)
    {
      this.id=id;
   }
   Emp()
   {

   }
   public void setName(String name)
    {
       this.name=name;
   }
   public void setId(String id)
    {
      this.id=id;
   }
   public void setSalary(int  salary)
    {
      this .salary=salary;
   }
   public String getName()
    {
     return name;
   }
   public String getId()
    {
      return id;
   }
   public int getSalary()
    {
       return salary;
   }
   public String toString()
    {
 return"("+name+","+id+","+mobile+","+address+","+company+","+salary+")";
}
public boolean equals (Object ob)
 {
   if(ob instanceof Emp)
    {
      Emp e=(Emp) ob;
      return this.id.equals(e.id);
   }
   return false;
  }
}
class Company
 {
    private Emp emp[];
    private int index;
    Company()
     {
       emp =new Emp[5];
       index =-1;
    }
    public Emp deleteEmp(String  id)
     {
       int oldId=search(new  Emp(id));
       Emp e=null;
       if(oldId !=-1)
        {
          e=emp[oldId];
          for(int i=oldId;i<index;i++)
           {
            emp [i]=emp[i+1];
          }
          emp[index]=null;
          index--;
       }
       return e;
    }
    public int search(Emp e)
     {
       for(int i=0;i<=index;i++)
        {
           if(e.equals(emp[i]))
            {
               return i;
           }
       }
       return -1;
    }
    public Emp get(int i)
     {
       if(i>index)
        return null;
      else if(i<0)
        return null;
    else 
        return emp[i];
    }
    public void increaseSizeArray()
     {
      Emp e[]=new Emp[emp.length+5];
      for(int i=0;i<=index;i++){
        e[i]=emp[i];
      }
       emp =e;
    }
    public void add(Emp e)
     {
        if(index==emp.length-1)
         {
             increaseSizeArray();
        }
        emp[++index]=e;
    }
    public String toString()
     {
       String s="";
       if(index==-1)
        return "[Empty String]";
        for(int i=0;i<=index;i++)
         {
           s+=","+emp[i];
        }
        return "["+s.substring(1)+"]";
    }
    public int length()
     {
      return index+1;
    }
    public int capacity()
     {
       return emp.length;
    }
}
class Test
 {
    public static void main(String[] args)
     {
        Company c=new Company();
        Emp e=new Emp();
        c.add(new Emp("abc","101","9824609247","indore","TCL",10000));
        c.add(new Emp("mona","102","2396953960","vijaynagar","TATA",20000));
        c.add(new Emp("mahi","103","1112245694","mp","TCL",30000));
        c.add(new Emp("monika","104","1011129563","rj","TATA",40000));
        c.add(new Emp("ritu","105","1314156943","hr","TCL",50000));
        c.add(new Emp("archu","106","1617189432","up","TATA",600000));
        //System.out.println(c);
        //System.out.println(c.capacity());
       // System.out.println(c.length());
        //System.out.println(c.get(1));
       // System.out.println(c.search(new Emp("102")));
        //System.out.println("Deleted:"+c.deleteEmp("105"));
        System.out.println(c.capacity());
        System.out.println(c.length());

    }
}*/
/*class Product
   {
       private String colour,quality;
       private int quantity,deleivery date ,charges;
       Product(String colour,String quality,int quantity,deleivery date,charges)
        {
          this.colour=colour;
          
          this.quality;
          this.quantity=quantity;
          this.date=date;
          this.charges=charges;
       }
       Product(String colour)
       this.colour=colour;
   }
    Product()
    {

   }
   public void setName(String name)
    {
       this.name=name;
   }
   public String getName()
   {
     return name;
   }
   public String toString(){
   return"("+colour+","+forms+","+quality+","+quantity+","+deleivery+","+charges+")";
   }*/
   
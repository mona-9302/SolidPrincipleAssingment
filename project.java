import java.util.*;
import java.io.*;
class Test{
	public static void main(String[] args) {
		  Dmart d=new Dmart();
		  d.newProduct(new Product("Sanchi Milk gold","0.5L",32,100,"dairy product",0));
		  d.newProduct(new Product("Parle-g","400",32,100,"grocery ",0));
		  d.newProduct(new Product("kurkure","100",32,100,"grocery",0));
		  d.newProduct(new Product("meggi","50g",32,10,"grocery",2));
		  d.newProduct(new Product("Dove soap","28gm",32,20,"grocery",2));
		  d.newProduct(new Product("kesh kanti oil","500ml",32,3300,"grocery",5));
		  d.newProduct(new Product("Red label","50g",32,100,"grocery",0));
		  d.newProduct(new Product("ruchi soya oil","1L",105,50,"grocery",0));
		 // d.ShowAllProducts();
		  d.generateBill();

		/*ArrayList al=new ArrayList();
		al.add(new Sample("hello"));*/
		/*al.add("hello");
		al.add("hello2");
		al.add("hello3");*/
		/*System.out.println(al.indexOf(new Sample("hello")));
		System.out.println(new Sample("hello").equals(new Sample("hello")));*/
		//Crud c=new Crud();
		
		/*c.insert(10);
		c.insert("hello");
		c.insert(40);
     c.insert(40);
     c.insert(al);*/
		//System.out.println(al);
		//ArrayList a1=c.get();
		//System.out.println(a1);
		//System.out.println(c.get());
		
		
		/*Crud crud=new Crud();
		crud.insert(new Emp("Mahesh babu","indore",30000));
		crud.insert(new Emp("Ravi teja","goa",50000));
		crud.insert(new Emp("Mohanlal","kerala",60000));
		crud.insert(new Emp("Anushka  mandana","Mumbai",80000));
		crud.insert(new Emp("Aliya bhatt","Mumbai",55000));
		System.out.println(crud.get());*/
		  //d.newProduct(new Product("pen","0",10,50,"grocery",0));
		//Product p=new Product()

		}

}

class Sample
 {
     String val,name;

     Sample(String val)
      {
         this.val=val;
         
     }
     public boolean equals (Object ob)
      {
          
          	Sample s= (Sample)ob;
          return val.equals(s.val);
          
     }
}


class Dmart
  {
  	  Crud crud=new Crud("dmart.obj");
     public void newProduct(Product p)
      {
          ArrayList productList=crud.get();
          if(productList!=null)
           {
              int index =productList.indexOf(p);
              if(index==-1)
               {
              	crud.insert(p);//insert(object)
              }
              else 
               {
                  Product oldProduct =(Product) productList.get(index);
                  oldProduct.qty=oldProduct.qty + p.qty;
                  crud.insert(productList); //insert(Arraylist)
              }
          }
          

          else
            {
               crud.insert(p);
          }
        }
        

           public void generateBill()
           {
               Scanner sc=new Scanner(System.in);
               System.out.println("plz enter your mobile number:");

               String mob=sc.next();
               Crud bill=new Crud(mob+".bill");
               ShowAllProducts();
               while(true){
               System.out.println("enter product id.if you want to exit then write'done'");

               String pId = sc.next();
               if(pId.equals("done"))
               	break;
               System.out.println("enter qty");
               int qty=sc.nextInt();
              
               Product product =getProductById(pId);
               if(product!=null)
                {
                   System.out.println(product);
                   PurchasedProduct p=new PurchasedProduct(product.id,product.name,product.mrp,qty);
                 // System.out.println(p);
                   bill.insert(product);
                   //printBill();
               }
             }
              
          }


       public Product  getProductById(String pId)
         {
           ArrayList allproducts=crud.get();
           for(int i=0;i<allproducts.size();i++)
            {
                Product product = (Product)allproducts.get(i);
                if(product.id.equals(pId))
                 {
                        return product;
                }
           }
              return null;
           /*public void printBill(String mob){
            Crud bill=new Crud(mob+".bill");
            System.out.println(bill.get());*/
         }
       
       

        

   

class PurchasedProduct  implements Serializable
 {
       String id,name;
       int price,qty,totalAmount;
       PurchasedProduct(String id,String name,int price,int qty)
        {
            this.id=id;
            this.name=name;
            this.price=price;
            this.qty=qty;
            this.totalAmount=price*qty;
       }
       public String toString(){
       	return id+": "+name+","+price+","+qty+","+totalAmount+"\n";
       }
} 


 public void ShowAllProducts()
 {
     ArrayList  productList =crud.get();
    // System.out.println(productList);
     for(int i=0;i<productList.size();i++) 
     {
          System.out.print((i+1)+": "+productList.get(i));
     }
 }
}




/*class Emp implements Serializable
 {
    String name,address;
    int sal;
    Emp(String name,String address, int sal)
     {
         this .name=name;
         this.address=address;
         this.sal=sal;
    }
    public String toString()
     {
       return "("+name+","+address+","+sal+")\n";
    }
    
}*/
class Crud
{
	  String FILE_NAME;
	  Crud(String name)
	   {
          FILE_NAME=name;
	  }
	 public void insert(Object al)
	 {
	   	try
	  	{
          /*FileOutputStream fos=new FileOutputStream(FILE_NAME);
          ObjectOutputStream os=new ObjectOutputStream(fos);*/
          ArrayList oldValue=get();
          //System.out.println(oldValue);
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
       catch(Exception e)
       {
      	System.out.println( e);
       }

         // return null;
 }
   public void insert(ArrayList al)
    {
        /* for(int i=0;i<al.size();i++)
          {
              //System.out.println(al.get(i));
          	insert(al.get(i));
         }*/
         try
          {
             FileOutputStream fos=new FileOutputStream(FILE_NAME);
             ObjectOutputStream os=new ObjectOutputStream(fos);
             os.writeObject(al);
             os.close();
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
      	     FileInputStream ios=new FileInputStream(FILE_NAME);
      	     ObjectInputStream os=new ObjectInputStream(ios);
      	     ArrayList a1=(ArrayList)os.readObject();
      	     os.close();

      	     return a1;
        }
          catch(Exception e)
          {
            //System.out.println(e);
            //System.out.println("Test:"+e);
           // e.printStackTrace();
           }
           return null;

    }
 }
  


class Product implements Serializable
 {
      String id,name,weight,type;
      int qty,mrp,discount;
     static  int counter=100;
      Product(String name,String weight,int mrp,int qty,String type,int discount)
       {
         	id=++counter+"";
          this.name=name;
          this.weight=weight;
          this.type=type;
          this.qty=qty;
          this.mrp=mrp;
          this.discount=discount;
      }
        

      public boolean equals(Object ob)
       {
            if(ob instanceof Product)
             {
               Product p=(Product)ob;
               return name.equals(p.name) && weight.equals(p.weight) && type.equals(p.type) ; 
             }
             return false;
       }
      public String toString()
       {
          return"(Id: "+id+", "+name+","+weight+","+mrp+","+qty+","+type+","+discount+"  )\n";
      }

}
      





       
          

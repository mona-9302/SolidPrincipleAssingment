class Test{
	  public static void main(String[] args) {
	  	     
	  	     try{
 
                  // Class.forName("1344");
	  	     	//jvm write the code throw  new ClassNotFoundException();
	  	     	   Class.forName("p");
	  	     }catch(Exception e)
	  	     {
	  	     	// System.out.println(" ClassNotFoundException");
	  	     	// System.out.println(e.toString());
	  	     	// e.printStackTrace();
	  	     	System.out.println(e);
	  	     	// System.out.println(e.getMessage());
	  	     }
	  	    
	  }
}


class Demo {

       static {
       	System.out.println("demo staic block");
       }
}



class CoreFor{
	 
	 public static void main(String[] args) throws ClassNotFoundException{
	 	  System.out.println("main start");
	 	   m1();
	 	   System.out.println("main end");
	 }


	 static void m1()throws ClassNotFoundException
	 {
	 	 System.out.println("m1 start");
	 	  m2();
	 	  System.out.println("m1 end");
	 }

	 static void m2() throws ClassNotFoundException
	 {
	 	 System.out.println("m2 start");
	 	 Class.forName("CoreFor");
	 	 System.out.println("m2 end");
	 }
}



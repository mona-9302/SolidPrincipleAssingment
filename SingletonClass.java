class Singleton{

     private static Singleton ob;
	 private Singleton()
	 {
	 	System.out.println("singleton constructor");
	 }


 

 public static Singleton object(){
 	// in same class  object will be same create
 	Singleton s = new Singleton();
 	if(ob==null){
 //if access any object to another class then object will return  same object
 		ob= new Singleton();
 	   return ob;
 	  }
 	return ob;
 }

}

class Test{
	  public static void main(String[] args) {
	  	    
	  	      System.out.println(Singleton.object());
	  	      System.out.println(Singleton.object());
	  	      System.out.println(Singleton.object());
	  }
}



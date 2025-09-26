class Example{

       int a;
       String name;

       Example(int a,String name){
       	 this.a = a;
       	 this.name = name;
       }

       public static void main(String[] args) {
       	
       	    Example e = new Example(10,"moni");
       	    Example e1 = new Example(20,"Monika");

       	    System.out.println(e.hashCode());
       	    System.out.println(e1.hashCode());

       }
	
}

class SystemExample{

	public static void main(String[] args) {
		
		boolean temp  = true;

		if(temp!){
			
		}
	}
}
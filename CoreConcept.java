class ExampleIdentifiers{

	 public static void main(String[] args) {
	 	
	 	  int  _$a = 10;
	 	  System.out.println( _$a);
	 }

}

class  ExampleEquals{

     public static void main(String[] args) {
	 String name = "monika";
	 String pname = "monika";

	 System.out.println(name.equals(pname));
   }
}

class ExampleToString{

    int a;
    String name;

    ExampleToString(int a,String name){
    	  this.a = a;
    	  this.name = name;

    }

    public String toString(){
    	 return a+" "+name;
    }
	public static void main(String[] args) {
		
		ExampleToString example = new ExampleToString(10,"monika");
		System.out.println(example);
	}
}
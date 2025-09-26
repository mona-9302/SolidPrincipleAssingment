// import java.util.*;
import java.util.Arrays;
import java.util.List;
//             LAMDA EXPRESION
// it is a anonymous function and not having any modifier,return type and access modifier.
// syntax - ()->{}

// class ExampleLamda{

// 	public static void main(String[] args) {
		
// 		 ()->{

// 		 	System.out.println("monika");
// 		 }

// 		 ()->System.out.printl("monika");

// 		 String s->s.length();
// 		 s->s.length();
// 	}
// }



interface MyInterface{

	public void show(int a, int b);
}

class  Tester{

	public static void main(String[] args) {
		 
		 MyInterface interFace = (a,b)->
		 	System.out.println(a+b);

		 interFace.show(10,20);
	}
}


interface MyString {

	public String myString(String s);
}

class Test{

	public static void main(String[] args) {
		
		 MyString dot = (s)->s+".";
		 MyString ask = (s)->s+"?";

        String s = "Hello";

        printFormatted(s,ask);
        printFormatted(s,dot);
		
	}	 
		public static void printFormatted(String s,MyString myStr){

		 	  String s1 = myStr.myString(s);
		 	  System.out.println(s1);
		 }
	
}


class ExampleStream{

	public static void main(String[] args) {
		
		 int arr[] = {1,2,3,4,5,6};

		 // Arrays.stream(arr).forEach((n)->System.out.println(n));
		 Arrays.stream(arr).filter(n->n%2==0).map(n->n+n).forEach(n->System.out.println(n));
	}
}

class ExampleStreamArray{

	public static void main(String[] args) {
		
		 int arr[] = {1,2,3,4,5,6};
		 Arrays.stream(arr).filter(n->n%2==0).forEach(n->System.out.println(n));
	}
}


class ExampleData{

	public static void main(String[] args) {
		
		  int arr[] = {1,2,3,4,5,6};
		  Arrays.stream(arr).filter(n->n%2!=0).forEach(n->System.out.println(n));
	}
}

class ExampleDemo{

	public static void main(String[] args) {
		
		  int arr[] = {1,2,3,4,5,6};
	}
}


class ListData{

	public static void main(String[] args) {
		
		 List<String> name = Arrays.asList("Monika","Ritu","Krishna","Archu");

		 name.stream().filter(names->names.startsWith("M")).forEach(names->System.out.println(names));
	}
}


class Employee{

	private int id;
	private String name;
	private int salary;
	private String department;

	public Employee(int id,String name,int salary,String department){
		 this.id = id;
		 this.name = name;
		 this.salary = salary;
         this.department = department;
	}

	public int getId(){return id;}
	public String getName(){return name;}
	public int getSalary(){return salary;}
	public String getDepartment(){return department;}

	public String toString(){
		 return id+","+name+","+salary+","+department;
	}
}


class TestData{

	public static void main(String[] args) {
		
		  List<Employee> emp = Arrays.asList(new Employee(101,"Monika",10000,"HR"),
		  	new Employee(102,"Mona",20000,"HR"),new Employee(103,"Pawan",3000,"Accounting"),
		    new Employee(104,"Ritu",4000,"Finance"));

         //IT department employee

         // System.out.println("IT department employee name");
         emp.stream().filter(name->name.getDepartment().equals("HR")).
         forEach(name->System.out.println(name));

         emp.stream().filter(name->name.getSalary()>40000).forEach(name->System.out.println(name));

        //  int totalSalary = emp.stream()
        //         .mapToInt(emp::getSalary)
        //         .sum();
        // System.out.println("\nTotal Salary: ₹" + totalSalary);
	}
}



import java.util.*;
import java.util.List;
import java.util.stream.Stream;
import java.util.stream.Collectors;
import java.util.Arrays;
import java.util.stream.*;


//---------------------------------------------filter employee by department-----------------------------------------------------
class Employee{

	 private int id;
	 private String name;
	 private double salary;
	 private String department;

	 public Employee(int id,String name,double salary,String department){
	 	  this.id = id;
	 	  this.name  = name;
	 	  this.salary = salary;
	 	  this.department = department;
	 }

	 public String getDepartment(){
	 	return department;
	 }
     
     public double getSalary(){
     	return salary;
     }
     
     public String getName(){
     	return name;
     }
	 public String toString(){
	 	 return id+" "+name+" "+salary+" "+department;
	 }
}

class Test{

	 public static void main(String[] args) {
	 	
	 	  List<Employee> emp = Arrays.asList(
	 	  	new Employee(1,"monika",1000.00,"HR"),
	 	  	new Employee(2,"ruchika",2000.00,"Finance"),
	 	  	new Employee(3,"pawanji",3000.00,"IT"),
	 	  	new Employee(4,"archu",5000.00,"HR")
	 	  );

	 	  String dept = "HR";
	 	  List<Employee> empData = emp.stream().filter(employee->employee.getDepartment()
	 	  	.equals(dept)).collect(Collectors.toList());

	 	  System.out.println("Employees in "+empData+" "+"department ");

	 	  //----------------compute total salary with reduce----------------------------------

	 	  double totalSal =  emp.stream().mapToDouble(Employee::getSalary).reduce(0.0,Double::sum);
	 	  System.out.println("Total salary "+totalSal);
          
          //convert employee name into upperCase
	 	  emp.stream().map(Employee::getName).map(String::toUpperCase).forEach(System.out::println);
	 }
}



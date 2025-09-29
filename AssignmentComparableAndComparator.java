import java.util.*;
import java.util.List;
import java.util.Scanner;


//sorting using comparable by id;
class EmployeeUsingComparable implements Comparable<EmployeeUsingComparable>{

	  private int id;
	  private String name;
	  private String department;
	  private double salary;

	  public EmployeeUsingComparable(int id,String name,String department,double salary){
	  	    this.id = id;
	  	    this.name = name;
	  	    this.department = department;
	  	    this.salary = salary;
	  }


	  public int compareTo(EmployeeUsingComparable emp){
	  	return this.id - emp.id;
	  } 
       
      public int getId(){
      	return id;
      }
	  public String toString(){
	  	return id+" "+name+" "+department+" "+salary;
	  }
}

class EmployeeTest{

	public static void main(String[] args) {
		
		 Scanner sc = new Scanner(System.in);
		 List<EmployeeUsingComparable> empData = new ArrayList<>();
         empData.add(new EmployeeUsingComparable(1,"Monika","HR",1000.00));
         empData.add(new EmployeeUsingComparable(4,"Mona","Accounting",2000.00));
         empData.add(new EmployeeUsingComparable(6,"Moni","HR",3000.00));
         empData.add(new EmployeeUsingComparable(3,"Pawan","Finance",4000.00));
         empData.add(new EmployeeUsingComparable(5,"Ruchika","HR",5000.00));
         empData.add(new EmployeeUsingComparable(9,"Anugya","Accounting",6000.00));

        
         Collections.sort(empData);

        System.out.println("Before Sorting : ");
         Iterator itrData = empData.iterator();

         while(itrData.hasNext()){
         	System.out.println(itrData.next());
         }
         
         System.out.println("Enter id to delete : ");
         int empId = sc.nextInt();

         Iterator<EmployeeUsingComparable> itr = empData.iterator();

         while(itr.hasNext()){            
         	EmployeeUsingComparable e = itr.next();
         	if(e.getId()==empId){
         		itr.remove();
         	}
         }

        System.out.println("\nAfter Deletion: ");
        for(EmployeeUsingComparable e : empData) {
            System.out.println(e);
        }

         
	}
}

//-----------------------------------------LinkedListUsingComparator--------------------------------------------------

class Employee{

	 private int id;
	 private String name;
	 private String department;
	 private double salary;

	 public Employee(int id,String name,String department,double salary){
	 	this.id = id;
	 	this.salary = salary;
	 	this.department = department;
	 	this.name = name;
	 }

	 public int getId(){
	 	return id;
	 }

	 public String getName(){
	 	return name;
	 }

	 public String getDepartment(){
	 	return department;
	 }

	 public double getSalary(){
	 	return salary;
	 }

	 public String toString(){
	 	return id+" "+name+" "+department+"  "+salary;
	 }
}

 class Test {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        
        LinkedList<Employee> empData = new LinkedList<>();

        
        empData.add(new Employee(1, "Monika", "HR", 4000.00));
        empData.add(new Employee(4, "Mona", "Accounting", 2000.00));
        empData.add(new Employee(6, "Moni", "HR", 3000.00));
        empData.add(new Employee(3, "Pawan", "Finance", 4000.00));
        empData.add(new Employee(5, "Ruchika", "HR", 5000.00));
        empData.add(new Employee(9, "Anugya", "Accounting", 6000.00));

        System.out.println("Before Sorting:");
        for (Employee e : empData) {
            System.out.println(e);
        }

        
        Comparator<Employee> sortByAll = new Comparator<Employee>() {
            public int compare(Employee e1, Employee e2) {
                
                int nameCompare = e1.getName().compareTo(e2.getName());
                if (nameCompare != 0) return nameCompare;

                
                int deptCompare = e1.getDepartment().compareTo(e2.getDepartment());
                if (deptCompare != 0) return deptCompare;

             
                if (e1.getSalary() < e2.getSalary()) return 1;
                else if (e1.getSalary() > e2.getSalary()) return -1;
                else return 0;
            }
        };

       
        Collections.sort(empData, sortByAll);

        System.out.println("\nAfter Sorting (Name ASC, Dept ASC, Salary DESC):");
        for (Employee e : empData) {
            System.out.println(e);
        }

        System.out.print("\nEnter ID to delete: ");
        int deleteId = sc.nextInt();

        int index = -1;
        for (int i = 0; i < empData.size(); i++) {
            if (empData.get(i).getId() == deleteId) {
                index = i;
                break;
            }
        }

        if (index != -1) {
            empData.remove(index);
            System.out.println("Employee with ID " + deleteId + " deleted successfully!");
        } else {
            System.out.println("Employee with ID " + deleteId + " not found!");
        }

        System.out.println("\nAfter Deletion:");
        for (Employee e : empData) {
            System.out.println(e);
        }
    } 
}


//-----------------------------------check perfromance of arrayList and linkedlist-------------------------------------------


 class CompareListPerformance {
    public static void main(String[] args) {

        
        int[] sizes = {10000, 50000, 100000};

        for (int size : sizes) {
            
            List<Integer> arrayList = new ArrayList<>();
            long arrayInsertTime = insertElements(arrayList, size);
            long arrayDeleteTime = deleteElements(arrayList, size);

            List<Integer> linkedList = new LinkedList<>();
            long linkInsertTime = insertElements(linkedList, size);
            long linkDeleteTime = deleteElements(linkedList, size);
        }
    }

    
    public static long insertElements(List<Integer> list, int size) {
        long start = System.currentTimeMillis();
        for (int i = 0; i < size; i++) {
            list.add(i);  // inserting at end
        }
        long end = System.currentTimeMillis();
        return end - start;
    }

  
    public static long deleteElements(List<Integer> list, int size) {
        long start = System.currentTimeMillis();
        for (int i = 0; i < size; i++) {
            list.remove(0);  
        }
        long end = System.currentTimeMillis();
        return end - start;
    }
}

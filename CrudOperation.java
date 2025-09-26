import java.util.ArrayList;
import java.util.List;
// import java.util.Scanner;

// class StudentCrudOperation {
//     private String stdName;
//     private Integer stdRoll;
//     private Integer marks;

//     // Constructor
//     StudentCrudOperation(String stdName, Integer stdRoll, Integer marks) {
//         this.stdName = stdName;
//         this.stdRoll = stdRoll;
//         this.marks = marks;
//     }

//     void display() {
//         System.out.println("Name: " + stdName + ", Roll: " + stdRoll + ", Marks: " + marks);
//     }

//     Integer getMarks() {
//         return marks;
//     }
// }

// class StudentTest {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);

//         StudentCrudOperation[] students = new StudentCrudOperation[5];

//         for (int i = 0; i < 5; i++) {
//             System.out.println("Enter details of Student " + (i + 1) + ":");

//             System.out.print("Enter Name: ");
//             String name = sc.nextLine();

//             System.out.print("Enter Roll Number: ");
//             int roll = sc.nextInt();

//             System.out.print("Enter Marks: ");
//             int marks = sc.nextInt();
//             sc.nextLine(); // consume newline

//             students[i] = new StudentCrudOperation(name, roll, marks);
//         }

//         System.out.println("\n--- Student Details ---");
//         for (StudentCrudOperation s : students) {
//             s.display();
//         }

//         // Find topper
//         StudentCrudOperation topper = students[0];
//         for (int i = 1; i < students.length; i++) {
//             if (students[i].getMarks() > topper.getMarks()) {
//                 topper = students[i];
//             }
//         }

//         System.out.println("\n--- Topper ---");
//         topper.display();

//         sc.close();
//     }
// }

class EmployeeCrudOperation{

	 private int id;
	 private String name;
	 private int price;

     EmployeeCrudOperation(int id,String name,int price){
     	this.id = id;
     	this.name = name;
     	this.price  = price;
     }
     
	 public void setId(int id){
	 	this.id = id;
	 }

	 public void setName(String name){
	 	this.name = name;
	 }

	 public void setPrice(int price){
	 	this.price  = price;
	 }

	 public int getId(){
	 	return id;
	 }

	 public String getName(){
	 	return name;
	 }

	 public int getPrice(){
	 	return price;
	 }

	 void display(){

	 	 System.out.println("id " +id+" name "+name+" price "+price);
	 }

	 public String toString(){
	 	return id+" "+name+" "+price;
	 }
}

	class Employee{

		 private static List<EmployeeCrudOperation> employee = new ArrayList<>();

	    // ✅ Only createEmployee method
	    public static void createEmployee(int id, String name, int price) {

	    	if(id<=0){
	    		System.out.println("is  must be positive");
	    		return;
	    	}
	    	for(EmployeeCrudOperation e : employee){
	    		if(e.getId()==id){
	    			System.out.println("employee  already exist");
	    			return;
	    		}

	    	}
	    	if(name==null || name.isEmpty()){
	    		System.out.println("name field is null");
	    		return;
	    	}


	        employee.add(new EmployeeCrudOperation(id, name, price));
	        System.out.println("Employee created successfully");
	    }

	    public static void deleteEmployee(int id){

	    	  for(int i=0;i<employee.size();i++){
	    	  	 if(employee.get(i).getId()==id){
	    	  	 	employee.remove(i);
	    	  	 	System.out.println("Employee with id"+id+" delete successfully");
	    	  	 	return;
	    	  	 }
	    	  }
	    	  System.out.println("Employee not found");
	    }

	    public static void showEmployee(){
	    	 for(EmployeeCrudOperation e : employee){
	    	 	System.out.println(e);
	    	 }
	    }

	    public static void updateEmployee(int id,String name,int price){

	    	for(EmployeeCrudOperation e : employee){
	    		if(e.getId()==id){
	    			e.setName(name);
	    			e.setPrice(price);
	    			System.out.println("update  successfully ");
	    			return;
	    		}
	    	}
	    	System.out.println("Employee not found");
	    }
	    public static void main(String[] args) {
	        Employee.createEmployee(-1, "Monika Sondhiya", 100);
	        // Employee.createEmployee(2, "Pawan Sondhiya", 200);
	        // Employee.createEmployee(1, "Monika Sondhiya", 100);

	          // Employee.deleteEmployee(1);
	          // Employee.showEmployee();

	          // Employee.updateEmployee(2,"Pawan Monika",200);
	          // Employee.showEmployee();

	    }
	}


class Product{

	 private int id;
	 private String name;
	 private int price;


	 Product(int id,String name,int price){

	 	 this.id = id;
	 	 this.name = name;
	 	 this.price = price;
	 }

	 public void setId(int id){
	 	this.id = id;
	 }

	 public void setName(String name){
	 	 this.name = name;
	 }

	 public void setPrice(int price){
	 	this.price = price;
	 }

	 public int getId(){return id;}
	 public String getName(){return name;}
	 public int getPrice(){return price;}

	 public String toString(){

	 	 return id+" "+name+" "+price;
	 }
}

class ProductOperation{

	  private static List<Product> product = new ArrayList<>();

	  public static void createProduct(int id,String name,int price){

         for(Product prod : product){
         	 if(prod.getId()==id){
         	 	System.out.println("id is already exist");
         	 	return;
         	 }
         }
	  	 product.add(new  Product(id,name,price));
	  	 System.out.println("product is addedd successfully");
	  }

      public static void showProduct(){

         System.out.println(" \n product list");
      	 for(Product prod : product){
      	 	if(prod.getPrice()>5000){
      	 	System.out.println(prod);
      	   }
      	 }
      }

      public static void deleteProduct(int id){

      	 for(int i=0;i<product.size();i++){
      	 	 if(product.get(i).getId()==id){
      	 	 	product.remove(i);
      	 	 	System.out.println("product deleted");
      	 	 	return;
      	 	 }
      	 }
      	 System.out.println("product is not found");
      }

      public static void updateProduct(int id,String name,int cost){

      	 for(Product prod : product){
      	 	 if(prod.getId()==id){
      	 	 	 prod.setName(name);
      	 	 	 prod.setPrice(cost);
      	 	 	 System.out.println("Update successfully");
      	 	 }
      	 }
      	 System.out.println("product is not found");
      }
	  public static void main(String[] args) {
	  	
	  	   createProduct(1,"Monika",1000);
	  	   createProduct(2,"Ritu",2000);
	  	   createProduct(3,"Archana",3000);
	  	   createProduct(4,"Krishna",4000);
	  	   createProduct(5,"Pawan",5000);
	  	   createProduct(6,"Madhuri",6000);
	  	   createProduct(7,"Anugya",7000);
	  	   createProduct(8,"Prithvi",8000);
           createProduct(1,"Monika",1000);
           updateProduct(1,"Rajput",100000);
	  	   showProduct();

	  	   // deleteProduct(10);
	  }
}


class BankAccount{

	  private int accountNumber;
	  private String accountHolderName;
	  private Double balance;


	  BankAccount(int accountNumber,String accountHolderName,Double balance){
	  	  this.accountNumber = accountNumber;
	  	  this.accountHolderName = accountHolderName;
	  	  this.balance = balance;
	  }

	  public void deposit(Double amount){
	  	  amount = amount+balance;
	  	  System.out.println("amound added "+amount);
	  }
 
      public void withdraw(Double amount){
      	  amount = amount - balance;
      	  System.out.println(amount);
      }
      public void checkBalance(){
      	 System.out.println(balance);
      }
	  public static void main(String[] args) {
	  	
	  	    BankAccount balance = new BankAccount(101,"Monika",100000.00);
	  	    balance.checkBalance();
	  	    // balance.deposit(2000.00);
	  	    balance.withdraw(1000.00);
	  }
}

class Student{

	 private int id;
	 private String name;
	 private String email;

	 Student(int id,String name,String email){
	 	 this.id = id;
	 	 this.name = name;
	 	 this.email = email;
	 }

	 public void setId(int id){
	 	 this.id = id;
	 }

	 public void setName(String name){
	 	 this.name = name;
	 }

	 public void setEmail(String email){
	 	 this.email = email;
	 }

	 public int getId(){return id;}
	 public String getName(){return name;}
	 public String getEmail(){return email;}

	 public String toString(){
	 	return id+" "+name+" "+email;
	 }
}


class StudentOperation{


	  private static List<Student> student = new ArrayList<>();

	  public static void createStudent(int id,String name,String email){
	  	  student.add(new Student(id,name,email));
	  	  System.out.println("student addedd");
	  }

	  public static void showStudent(){
	  	  for(Student std : student){
	  	  	System.out.println("\n list student");
	  	  	 System.out.println(std);

	  	  }
	  }

	  public static void deleteStudent(int id){
	  	 for(Student std : student){
	  	 	 if(std.getId()==id){
	  	 	 	 student.remove(id);
	  	 	 	 System.out.println("deleted student");
	  	 	 	 return;
	  	 	 }
	  	 }
	  	 System.out.println("student is not found ");
	  }
	  public static void main(String[] args) {
	  	
	  	    createStudent(1,"Monika","monikarajput9302@gmail.com");
	  	    createStudent(2,"Pawwanji","pawansindhiya@gmail.com");
	  	    createStudent(3,"Anugya","anugya@gmail.com");
	  	    createStudent(4,"Prithvi","prithvi@gmail.com");

            showStudent();
	  }
}

class StrReverse{

    public static String reverseStr(String s){
    	 char ch[] = s.toCharArray();
    	 for(int i=ch.length-1;i>=0;i--){
    	 	System.out.println(ch[i]);
    	 }
    	 return s;
    }
	public static void main(String[] args) {
		
        String s = "hello";
        reverseStr(s);
	}
}

class CheckPrime{

	public static void main(String[] args) {
		
		 int n = 31;
		 boolean temp = true;

		 for(int i=2;i<=n/2;i++){
		 	if(n%i==0){
		 		temp = false;
		 		break;
		 	}
		 }
		 if(temp){
		 	System.out.println("is prime");
		 }else{
		 	System.out.println("not prime");
		 }
	}
}

class RemoveDuplicate{

	public static void main(String[] args) {
		
		 String s = "aaammmcccvvfdksskff";
		 char ch[] = s.toCharArray();

		 boolean visited[] = new boolean[ch.length];

		 for(int i=0;i<ch.length;i++){
		 	if(visited[i])
		 		continue;

		 	 int count = 1;

		 	 for(int j=i+1;j<ch.length;j++){
		 	 	if(ch[i]==ch[j]){
		 	 		count++;
		 	 		visited[j] = true;
		 	 	}
		 	 }
		 	 if(count>1){
		 	 		System.out.println(ch[i]);
		 	 	}
		 }
	}
}

class FindSecondHighest{

	public static void main(String[] args) {
		
		 int arr[] = {1,2,3,4,5,6};
		 int max = arr[0];
		 int secondMax = arr[0];

		 for(int i=1;i<arr.length;i++){
		 	 if(arr[i]>max){
		 	 	 max = arr[i];
		 	 }
		 }

        for(int i=0;i<arr.length;i++){
        	if(arr[i] > secondMax && arr[i] < max){
        		secondMax = arr[i];
        	}
        }
        System.out.println(secondMax);
	}
}

class SwapNumber{

	public static void main(String[] args) {
		
		 int a = 10;
		 int b = 20;

		  a = a+b;
		  b = a-b;
          a = a-b;
		 System.out.println(a+" "+b);
	}
}

class SecondMinimum{

	public static void main(String[] args) {
		
		 int arr[]  = {1,2,3,4,5,6,7};
		 int max = arr[0];
		 int secondMax = arr[0];

		 for(int i=1;i<arr.length;i++){
		 	 if(arr[i]<max){
		 	 	max = arr[i];
		 	 }
		 }
		 for(int i=0;i<arr.length;i++){
		 	if(arr[i]<secondMax && arr[i]>max){
		 		secondMax = arr[i];
		 	}
		 }
		 System.out.println(secondMax);
	}
}

class CheckAnagram{

	public static void main(String[] args) {
		
		 String s = "silent";
		 String s1 = "listen";

		 if(s.length()!=s1.length()){
		 	System.out.println("not anagram");
		 	return;
		 }

		 char ch[] = s.toCharArray();
		 char ch1[] = s1.toCharArray();

		 for(int i=0;i<ch.length;i++){
		 	for(int j=i+1;j<ch.length;j++){
		 		if(ch[i]>ch[j]){
		 			char c = ch[i];
		 			ch[i] = ch[j];
		 			ch[j] = c;
		 		}
		 		if(ch1[i]>ch1[j]){
                   char c = ch1[i];
                   ch1[i] = ch1[j];
                   ch1[j] = c;

		 		}
		 	}
		 }
		 for(int i=0;i<ch.length;i++){
		 	if(ch[i]!=ch1[i]){
		 		System.out.println("not anagram");
		 		return;
		 	}
		 }
		 System.out.println("anagram");
	}
}


class CheckAnagram1{
    public static void main(String[] args) {
        
        String s = "silent";
        String s1 = "listen";

        if (s.length() != s1.length()) {
            System.out.println("not anagram");
            return;
        }

        char ch[] = s.toCharArray();
        char ch1[] = s1.toCharArray();

        // Sort both arrays in ascending order manually
        for (int i = 0; i < ch.length; i++) {
            for (int j = i + 1; j < ch.length; j++) {
                if (ch[i] > ch[j]) {   // corrected
                    char c = ch[i];
                    ch[i] = ch[j];
                    ch[j] = c;
                }
                if (ch1[i] > ch1[j]) { // keep same condition
                    char c = ch1[i];
                    ch1[i] = ch1[j];
                    ch1[j] = c;
                }
            }
        }

        // Compare both sorted arrays
        for (int i = 0; i < ch.length; i++) {
            if (ch[i] != ch1[i]) {
                System.out.println("not anagram");
                return;
            }
        }
        System.out.println("anagram");
    }
}


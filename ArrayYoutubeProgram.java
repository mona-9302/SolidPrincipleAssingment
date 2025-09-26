import java.util.*;
import java.util.List;
class Anagram{
     public static void main(String[] args) {
     	   String s = "silentw";
	       String s1 = "listen";

	      char ch[] = s.toCharArray();
	      char ch1[] = s1.toCharArray();

	      Arrays.sort(ch);
	      Arrays.sort(ch1);

	     boolean result = Arrays.equals(ch,ch1);

	    if(result==true)
	    {
	 	  System.out.println("string is anagram");
	   }

	   else {
	 	 System.out.println("string is not anagram");
	   }
     }
}

//                              Print negative number in first
class PrintNonNegativeNumber{

	public static void main(String[] args) {
		
		 int arr[] = {-1,2,3,-2,5,-6,8};
		 int newArr[] = new int[arr.length];
 
           int j = 0;
		 for(int i=0;i<arr.length;i++){
                    
                if(arr[i]<=0){
                	newArr[j] = arr[i];
                	j++;
                }
		 }
		 for(int i=0;i<arr.length;i++){
		 	 if(arr[i]>=0){
		 	 	newArr[j] = arr[i];
		 	 	j++;
		 	 }

		 }

          for(int i=0;i<newArr.length;i++){
          	System.out.println(newArr[i]+" ");
          }
	}
}

//                   Move all zeros to end of the arrays


class MoveAllZerosEndOfArray{

	public static void main(String[] args) {
		
		 int arr[] = {1,2,3,4,0,4,0,2,0,6,0,5,0};
		 int newArr[] = new int[arr.length];

		 int j=0;
		 for(int i=0;i<arr.length;i++){
		 	if(arr[i]!=0){
		 		newArr[j] = arr[i];
		 		j++;
		 	}
		 }
		 for(int i=0;i<arr.length;i++){
		 	if(arr[i]==0){
		 		newArr[j] = arr[i];
		 		j++;
		 	}
		 }
		 for(int i=0;i<newArr.length;i++){
		 	System.out.println(newArr[i]+" ");
		 }
	}
}

class Program1{

	public static void main(String[] args) {
		
		 int arr[] = {1,2,-2,4,-1,5,-6,9,-0};
		 int newArr[] = new int[arr.length];

		 int j = 0;
		 for(int i=0;i<arr.length;i++){
		 	 if(arr[i]<=0){
		 	 	newArr[j] = arr[i];
		 	 	j++;
		 	 }
		 }
		 for(int i=0;i<arr.length;i++){
		 	if(arr[i]>=0){
		 		newArr[j] = arr[i];
		 		j++;
		 	}
		 }
		 for(int i=0;i<newArr.length-1;i++){
		 	System.out.println(newArr[i]+" ");
		 }
	}
}

class Program2{

	public static void main(String[] args) {
		
		 int arr[] = {1,2,0,3,0,5,0,-1};
		 int newArr[] = new int[arr.length];

           int j=0;
		 for(int i=0;i<arr.length;i++){
             
                if(arr[i]!=0){
                	 newArr[j] = arr[i];
                	 j++;
                }
		 }
		 for(int i=0;i<arr.length;i++){
		 	if(arr[i]==0){
		 		newArr[j] = arr[i];
		 		j++;
		 	}
		 }
		 for(int i=0;i<newArr.length;i++){
		 	System.out.println(newArr[i]+" ");
		 }
	}
}

class RemoveZeroFromArray{

	public static void main(String[] args) {
		
		int arr[] = {1,2,3,0,40,50,0};
		int count = 0;
		for(int i=0;i<arr.length;i++){
			if(arr[i]!=0){
				count++;
			}
		}

		int newArr[] = new int[count];
		int j=0;
		for(int i=0;i<arr.length;i++){
			if(arr[i]!=0){
				newArr[j] = arr[i];
				j++;
			}
		}
		for(int i=0;i<newArr.length;i++){
			System.out.println(newArr[i]+" ");
		}
	}
}


class ReverseArray{

	public static void main(String[] args) {
		
		int arr[] = {1,2,3,4,5,6};
		for(int i=arr.length-1;i>=0;i--){
			System.out.println(arr[i]);
		}
	}
}

class FindMin{

	public static void main(String[] args) {
		
		 int arr[] = {1,2,3,4,5,0,-1,-0};
		 int min = arr[0];

           for(int i=0;i<arr.length;i++){
           	if(min>arr[i]){
           		min = arr[i];
           	}
           }
           System.out.println("Minimum array ------>" + min);
	}
}

class  FindMax{

	public static void main(String[] args) {
		
		 int arr[] = {1,2,3,4,5,6};
		 int max = arr[0];

		 for(int i=0;i<arr.length;i++){
		 	if(max<arr[i]){
		 		max = arr[i];
		 	}
		 }

		 System.out.println("Maximum array ------> " + max);
	}
}

class FindSecondMaximum{

	public static void main(String[] args) {
		
		 int arr[] = {1,2,3,4,5,6};

		 int max = arr[0];
		 int secondMax = arr[0];

		 for(int i=0;i<arr.length;i++){
		 	if(arr[i]>max){
		 		max = arr[i];
		 	}
		 }

		 for(int i=0;i<arr.length;i++){
		 	if(arr[i]>secondMax && arr[i]<max){
		 		secondMax = arr[i];
		 	}
		 }
		 System.out.println("maximum ------> " +max);
		 System.out.println("second maximum ------> " +secondMax);
	}
}

class FindMinimum{

	public static void main(String[] args) {
		
		 int arr[] = {1,2,3,4,5,6,0};
		 int min = arr[0];
		 int secondMin = arr[0];

		 for(int i=0;i<arr.length;i++){
		 	 if(min>arr[i]){
		 	 	min = arr[i];
		 	 }
		 }
		 for(int i=0;i<arr.length;i++){
		 	if(arr[i]<secondMin && arr[i] < min){
		 		secondMin  = arr[i];
		 	}
		 }
		 System.out.println("minimum -----> " + min);
		 System.out.println("second minimum ---->" + secondMin);
	}
}

//------------------------------------------Collection FrameWork-------------------------------------------

class CollectionInterface{

	public static void main(String[] args) {
		
		  ArrayList<Object> list = new ArrayList<>();
		  list.add("Moonika");
		  list.add("Pawan");
		  list.add("Pawanika");
		  list.add(1);

            // Collections.sort(list);
		  System.out.println(list);
	}
}

class StudentCrudOperation{

	 private int stdId;
	 private String stdName;
	 private int roll;

	 public StudentCrudOperation(int stdId,String stdName,int roll){
	 	this.stdId = stdId;
	 	this.stdName = stdName;
	 	this.roll = roll;
	 }

	 public void setStdId(int stdId){
	 	this.stdId = stdId;
	 }

	 public void setStdName(String name){
	 	this.stdName = stdName;
	 }

	 public void setRoll(int roll){
	 	this.roll = roll;
	 }

	 public int getStdId(){
	 	return stdId;
	 }

	 public String getStdName(){
	 	return stdName;
	 }

	 public int getRoll(){
	 	return roll;
	 }

	 public String toString(){
	 	return stdId+" "+stdName+" "+roll;
	 }
}

class Test{

      ArrayList<StudentCrudOperation> list = new ArrayList<>();

      public  void createStudent(int stdId,String stdName,int roll){
   
           StudentCrudOperation student = new StudentCrudOperation(stdId,stdName,roll);
      	 list.add(student);
      	 // System.out.println(student);
      }

      public void showStudents(){

      	for(StudentCrudOperation std : list){
      		System.out.println(std+" ");
      	}
      }

     public void deleteStudent(int id){

     	for(int i=0;i<list.size();i++){
     		if(list.get(i).getStdId()==id){
     			list.remove(i);
     			System.out.println("student successfully is deleted");
     			return;
     		}
     	}
     	System.out.println("student is not found");
     }

     public void updateStudent(StudentCrudOperation student){

          for(StudentCrudOperation std : list){
          	if(std.getStdId()==student.getStdId()){
          		std.setStdName(student.getStdName());
          		std.setRoll(student.getRoll());
          		System.out.println("update successfully");
          		return;
          	}
          }
          System.out.println("not found");
     }

      public static void main(String[] args) {
      	Test test = new Test();
      	 test.createStudent(1,"Monika",101);
      	 // test.createStudent(2,"Ruchika",102);
      	 // test.createStudent(3,"Archna",103);
      	
      	System.out.println("Before updation");
      	test.showStudents();

      	test.updateStudent(new StudentCrudOperation(1,"Mona",101));
          
          System.out.println("after updation");
      	test.showStudents();
      }
}


class PrintPrimeNumber{

	public static void main(String[] args) {
		
		 for(int num=2;num<=100;num++){
		 	boolean temp = true;

		 	for(int i=2;i<num/2;i++){
		 		if(num%i==0){
		 			temp = false;
		 			break;
		 		}
		 	}

		 	if(temp){
		 		System.out.println(num+" ");
		 	}
		 }
	}
}

class P{

	public static void main(String[] args) {
		
		 for(int num=2;num<=100;num++){
		 	boolean temp = true;

		 	for(int i=2;i<=num/2;i++){
		 		if(num%i==0){
		 			temp = false;
		 			break;
		 		}
		 	}
		 	if(temp){
		 		System.out.println(num+" ");
		 	}
		 }
	}
}

class CheckPrime{

	public static void main(String[] args) {
		
		 int n = 4;
		 boolean temp = true;

		 for(int i=2;i<=n/2;i++){
		 	if(n%i==0){
		 		temp = false;
		 		break;
		 	}
		 }
		 if(temp){
		 	System.out.println("is prime");
		 }
		 else {
		 	System.out.println("not prime");
		 }
	}
}



class CRUD{

	private int empId;
	private String empName;
	private int empSalary;

	public CRUD(int empId,String empName,int empSalary){
		this.empId = empId;
		this.empName = empName;
		this.empSalary = empSalary;
	} 

	public void setEmpId(int empId){
		this.empId = empId;
	}

	public void setEmpName(String empName){
		this.empName = empName;
	}

	public void setEmpSalary(int empSalary){
		this.empSalary = empSalary;
	}

     public int getEmpId(){
     	return empId;
     }

     public String getEmpName(){
     	return empName;
     }

     public int getEmpSalary(){
     	return empSalary;
     }

	public String toString(){
		return empId+" "+empName+" "+empSalary;
	}
}

class EmpOperation{

	ArrayList<CRUD> list = new ArrayList<>();

	public void createEmployee(int empId,String empName,int empSalary){
		CRUD crud = new CRUD(empId,empName,empSalary);
		list.add(crud);
		// System.out.println(crud);
	}

	public void showEmployee(){
		for(CRUD c : list){
			System.out.println(c);
		}
	}

	public void  deleteEmployee(int id){
		for(int i=0;i<list.size();i++){
			if(list.get(i).getEmpId()==id){
				list.remove(i);
				System.out.println("deleted successfully");
				return;
				
			}
		}
		System.out.println("employee is not found ");
	}

     public void updateEmployee(CRUD crud){
     	for(CRUD c : list){
     		if(c.getEmpId()==crud.getEmpId()){
     			c.setEmpName(crud.getEmpName());
     			c.setEmpSalary(crud.getEmpSalary());
     			System.out.println("update successfully");
     			return;
     		}
     	}
     	System.out.println("emplooyee not found");
     }
	public static void main(String[] args) {
		
           EmpOperation emp = new EmpOperation();
           emp.createEmployee(1,"Monika",500000);
           emp.createEmployee(2,"Ruchika",600000);
           emp.createEmployee(3,"Mona",700000);
           emp.createEmployee(4,"Pawan",800000);

           // System.out.println("before deletion");
           // emp.showEmployee();

           // emp.deleteEmployee(1);
           // System.out.println("after deletion");
           // emp.showEmployee();

           System.out.println("before updation");
           emp.showEmployee();

           System.out.println("after updation");
           emp.updateEmployee(new CRUD(1,"Monika",40000));
           emp.showEmployee();


	}
}


class CountStringnumber{

	public static void main(String[] args) {
		
		  String s = "aabbbcccd dddeeee0";
		  char ch[] = s.toCharArray();

		  boolean visited[] = new boolean[ch.length];

		  for(int i=0;i<ch.length;i++){
		  	if(visited[i] || ch[i]==' ')
		  		continue;
               
               int count = 1;
		  	for(int j=i+1;j<ch.length;j++){
		  		if(ch[i]==ch[j]){
		  			visited[j] = true;
		  			count++;
		  			
		  		}
		  	}
		  	System.out.println(ch[i]+" "+count);
		  }


	}
}

class checFrquency{

     public static String checkFreCount(String s){
            
          char ch[] = s.toCharArray();
          boolean visited[] = new boolean[ch.length];

          for(int i=0;i<ch.length;i++){
          	if(visited[i])
          		continue;

          	int count = 1;
          	for(int j=i+1;j<ch.length;j++){
          		if(ch[i]==ch[j]){
          			visited[j] = true;
          			count++;
          		}
          	}
          	System.out.println(ch[i]+" "+count);
          }
          return s;
     }
	public static void main(String[] args) {
		
		 String s = "aabbbcccdddd";
		 checkFreCount(s);
	}
}

class PrintDuplicate{

     public static String printDuplicateChar(String s){

     	char ch[] = s.toCharArray();
     	for(int i=0;i<ch.length;i++){
     		int count = 1;

     		for(int j=i+1;j<ch.length;j++){
     			if(ch[i]==ch[j]){
     				count++;
     			}
     		}
     		if(count>1){
     			System.out.println(ch[i]);
     		}
     	}
     	return s;
     }
	public static void main(String[] args) {
		
		  String s = "monikamosfpaonjj";
		  printDuplicateChar(s);
	}
}


class RemoveDuplicate{

     public static String removeDuplicate(String s){
     	char ch[] = s.toCharArray();
     	for(int i=0;i<ch.length;i++){
     		int count = 1;

     		for(int  j=i+1;j<ch.length;j++){
     			if(ch[i]==ch[j]){
     				count++;
     			}
     		}
     		if(count==1){
     			System.out.println(ch[i]);
     		}
     	}
     	return s;
     }
	public static void main(String[] args) {
		
		 String s = "monikamonika";
		 removeDuplicate(s);
	}
}

class  PrintFirstNonRepitive{

     public static void checkFirstNon(String s){

     	char ch[] = s.toCharArray();
     	for(int i=0;i<ch.length;i++){
     		int count = 0;
     		for(int j=0;j<ch.length;j++){
                
                   if(ch[i]==ch[j]){
                   	  count++;
                   }
     		}
     		if(count==1){
     			System.out.println("first non repitive character -------> " + ch[i]);
                    return;
     		}
     	}
     	
     }
	public static void main(String[] args) {
		
		 String s = "monikamonikaL";
		 checkFirstNon(s);
	}
}

class StringSort{

	public static void main(String[] args) {
		
		 String s = "monika";
		 char ch[] = s.toCharArray();

		 for(int i=0;i<ch.length;i++){

		 	for(int j=i+1;j<ch.length;j++){

		 		if(ch[i]<ch[j]){
		 			char c = ch[i];
		 			ch[i] = ch[j];
		 			ch[j] = c;
		 		}
		 	}
		 	System.out.println(ch[i]);
		 }
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
		 System.out.println("string anagram");
	}
}

class Print{

	public static void main(String[] args) {
		
		String s = "silent";
		String s1 = "listekn";

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
		System.out.println("anagram string");
	}
}

class CheckStringPlr{

	public static void main(String[] args) {
		
		 String s = "eye";
		 char ch[] = s.toCharArray();

		 boolean temp = true;
		 int start=0,last=ch.length-1;
		 for(int i=0;i<ch.length;i++){
		 	if(ch[start]!=ch[last]){
		 		temp = false;
		 		break;
		 	}
		 }
		 if(temp){
		 	System.out.println("is pallindrome");
		 }else{
		 	System.out.println("not pallindrome");
		 }
	}
}

class CountVowelAndCons{

      public static void main(String[] args) {
   	   
   	     String s = "monika";
   	     char ch[] = s.toCharArray();
   	     int vowel = 0 , consonant = 0;

   	     for(int i=0;i<ch.length;i++){
   	     	if(ch[i]=='a'||ch[i]=='e'||ch[i]=='i'||ch[i]=='o'||ch[i]=='u'){
   	     		vowel++;
   	     	}
   	     	else{
   	     		consonant++;
   	     	}
   	     }
   	     System.out.println("vowel"+vowel);
   	     System.out.println("consonant"+consonant);
     }
}

class CountWord{

	public static void main(String[] args) {
		
		String s = "my name";
		char ch[] = s.toCharArray();
          int count = 0;

		for(int i=0;i<ch.length;i++){
			if(ch[i]!=' ' && (i==0 || ch[i-1]==' ')){
				count++;
			}
		}
		System.out.println(count);
	}
}

class ReplaceSpecificWord{

	public static void main(String[] args) {
		
		 String s = "monika";
		 char ch[] = s.toCharArray();

           for(int i=0;i<ch.length;i++){
           	 if(ch[i]=='m'){
           	 	 ch[i] = 'p';
           	 }
           	 System.out.println(ch[i]);
           }
	}
}

class DeleteAnyPosCharacter{

	public static void main(String[] args) {
		
		 String s = "monika";
		 char ch[] = s.toCharArray();
           int pos = 2;
           for(int i=0;i<ch.length;i++){
           	if(i!=pos){
           		System.out.println(ch[i]);
           	}
           }

	}
}

class DynamicPositionDelete{

	public static void main(String[] args) {
		
		 Scanner sc = new Scanner(System.in);

		 System.out.println("Enter string");
		 String s = sc.nextLine();

		 System.out.println("Enter position wherever you want to delete");
		 int pos = sc.nextInt();

		 char ch[] = s.toCharArray();

		 if(pos<0 || pos>=ch.length){
		 	System.out.println("invalid position");
		 	return;
		 }

		 for(int i=0;i<ch.length;i++){
		 	if(i!=pos){
		 		System.out.println(ch[i]);
		 	}
		 }
	}
}

//-----------------------------OOPS Concept--------------------------------------------------------------------------

class Encapsulation{

     private int balance;

     public void setBalance(int balance){
     	this.balance = balance;
     }

     public int getBalance(){
     	return balance;
     }

	public static void main(String[] args) {
		
		Encapsulation encaps = new Encapsulation();
		encaps.setBalance(1000);

		System.out.println(encaps.getBalance());
	}
}

 // class ExceptionHandling{

 // 	public static void main(String[] args) {
 		
 // 		 int a = 10;
 // 		 int b = 0;

 // 		 try{

 //               String s = null;
 //               System.out.println(s.length());
 // 		 	System.out.println(a/b);
 		 	
 // 		 }
 // 		 catch(NullPointerException  e){
 // 		 	System.out.println("ArithmeticException e");
 // 		 }
 		 

 // 	}
 // }



class InSufficientBalance  extends  Exception{

	public InSufficientBalance(String message){
		super(message);
	}
}

class Bank{

	private double balance = 5000;

	public void withDraw(double amount)throws InSufficientBalance{
		if(balance>amount){
			throw new InSufficientBalance("balance is in sufficient");
		}
		balance -= balance;
		System.out.println("suffiecinet balance");
	}

	public static void main(String[] args) {
		
		Bank bank = new Bank();
		try{
			bank.withDraw(600);
		} 
		catch(InSufficientBalance e){
			System.out.println(e.getMessage());
		}
	}
}


class NullPointerException{

	public static void main(String[] args) {
		
		 int a = 10;
		 int b = 0;
		 try{

		 	System.out.println(a/b);
		 }
		 catch(ArithmeticException n){
		 	throw new RuntimeException("Chained Exception "+n);
		 }
	}
}

class PrintFibo{

	public static void main(String[] args) {
		
		 int n = 10;
		 int a = 0 , b = 1;
		 for(int i=1;i<=n;i++){
		 	System.out.println(a);

		 	int sum = a + b;
		 	a = b;
		 	b = sum;
		 }
	}
}

class PrimeNumber{

	 public static void main(String[] args) {
	 	
	 	 int n = 10;
	 	 boolean temp = true;

	 	 for(int i=2;i<n/2;i++){
	 	 	if(n%i==0){
	 	 		temp = false;
	 	 		break;
	 	 	}
	 	 }
	 	 if(temp){
	 	 	System.out.println("is prime");
	 	 }
	 	 else{
	 	 	System.out.println("not prime");
	 	 }
	 }
}

class PrintNumber{

	public static void main(String[] args) {
		
		  for(int num=2;num<=100;num++){
		  	 boolean temp = true;

		  	 for(int i=2;i<=num/2;i++){
		  	 	if(num%i==0){
		  	 		temp = false;
		  	 		break;
		  	 	}
		  	 }
		  	 if(temp){
		  	 	System.out.println("prime number"+num);
		  	 }
		  }
	}
}

class FindFact{

     public static void main(String[] args) {
     	
     	 int n = 3;
     	 int data = 1;
     	 for(int i=1;i<=n;i++){
     	 	data = data * i;
     	 }
     	 System.out.println(data);
     }
}

class ProgramCount{

	public static void main(String[] args) {
		
		 int n = 1234569;
		 int count = 0;

		 while(n!=0){

		 	 n = n/10;
		 	 count++;
	  }
		 System.out.println("number counting ------> " + count);
	}
}

class F{

	public static void main(String[] args) {
		
		 int n = 5;
		 int data = 1;	
		 for(int i=1;i<=n;i++){
		 	data = data * i;
		 }
		 System.out.println(data);
	}
}

class FB{

	public static void main(String[] args) {
		
		 int n = 10;
		 int a = 0 , b = 1;

		 for(int i=1;i<=n;i++){
		 	System.out.println(a);

		 	int sum = a+b;
		 	a = b;
		 	b = sum;
		 }
	}
}

class PowerProgram{

     public static int findPowerProgram(int n, int p){

     	 int data = 1;
     	 for(int i=1;i<=p;i++){

     	      data = n * data;
     	 }
     	 System.out.println(data);
     	 return data;

     }
	public static void main(String[] args) {
		
		 int n = 3, p = 4;
		 findPowerProgram(n,p);
	}
}

//-----------------------Encapsulation-----------
class BankAccount{

	private int balance;

	public void deposit(int amount){
		if(amount>0){
		balance+= amount;
	   }else if(amount==-1){
	   	System.out.println("not allowed here");
	   }
	   else{
	   	System.out.println("amount is not allowed");
	   }
	}

	public int getBalance(){
		return balance;
	}
}

//-------------------------------constructor---------------------------------------------------------------

class A{

	public A(){
		System.out.println("A construcctor is calling");
	}
}

class B extends A{

	public B(){
		System.out.println("B constuctor is calling");
	}
}

class C extends B{
      
      int a=10;
      int b=20;
      public C(){
      	System.out.println("C constructor is calling");
      }

      public C(int a,int b){
      	System.out.println(a+" "+b);
      }

      public static void main(String[] args) {
      	
      	  B b = new C();
      	  C c = (C) b;
      }
}


class TestBalance{

	public static void main(String[] args) {
		
		BankAccount bank = new BankAccount();
		bank.deposit(-1);
		// System.out.println(bank.getBalance());
	}
}

class ReflectionAPi{

	public void demo(){
		System.out.println("she is  doing demo");
	}

	public static void main(String[] args) {
		
		try{
		Class<?> cls = Class.forName("ReflectionAPi");
		ReflectionAPi api = (ReflectionAPi)cls.newInstance();
		api.demo();
	  }
	  catch(Exception e){
	  	e.printStackTrace();
	  }
	}
}

//-------------Abstraction------------------------
abstract class  Abstraction{

	abstract void drive();
}

class TestAbstraction extends Abstraction{

	void drive(){
		System.out.println("tesla is driving");
	}
}

class TestTesla{

	public static void main(String[] args) {
		
		 Abstraction car = new TestAbstraction();
		 car.drive();
	}
}


class P1{

     public static String reverse(String s){
     	char ch[] = s.toCharArray();
     	for(int i=ch.length-1;i>=0;i--){
     		System.out.println(ch[i]);
     	}
     	return s;
     }
	public static void main(String[] args) {
		
          String s = "monika";
          reverse(s);
	}
}

class P2{

     public static boolean stringPallindrome(String s){
     	char ch[] = s.toCharArray();
     	int start=0,last=ch.length-1;
     	boolean temp = true;
     	for(int i=0;i<ch.length;i++){
     		if(ch[start]!=ch[last]){
     			temp = false;
     			break;
     		}
     	}
     	return true;
     }
	public static void main(String[] args) {
		
           String s = "eye";
           if(stringPallindrome(s)){
           	System.out.println("is pallindrome");
           }else{
           	System.out.println("not pallindrome");
           }
	}
}

class P3{

	public static void main(String[] args) {
		
		 String s = "silent";
		 String s1 = "listen";

		 if(s.length()!=s1.length()){
		 	System.out.println("not anagram");
		 	return;
		 }

		 char a[] = s.toCharArray();
		 char b[] = s1.toCharArray();

		 for(int i=0;i<a.length;i++){
		 	for(int j=i+1;j<a.length;j++){
		 		if(a[i]>a[j]){
		 			char c = a[i];
		 			a[i] = a[j];
		 			a[j] = c;
		 		}
		 		if(b[i]>b[j]){
		 			char c = b[i];
		 			b[i] = b[j];
		 			b[j] = c;
		 		}
		 	}
		 }
		 for(int i=0;i<a.length;i++){
		 	if(a[i]!=b[i]){
		 		System.out.println("not anagram");
		 	}
		 }
		 System.out.println("is anagram");
	}
}

class P4{

	public static void main(String[] args) {
		
		String s = "aabbbcccddddeeee";
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
			System.out.println(ch[i]+ "------>" +count);
		}
	}
}

class P5{

	public static void main(String[] args) {
		
		 String s = "mmoonikanikaM";
		 char ch[] = s.toCharArray();

		 for(int i=0;i<ch.length;i++){
		 	int count = 0;

		 	for(int j=0;j<ch.length;j++){
		 		if(ch[i]==ch[j]){
		 			count++;
		 		}
		 	}
		 	if(count==1){
		 		System.out.println(ch[i]);
		 		return;
		 	}
		 }
	}
}

class P7{
	public static void main(String[] args) {
		
		String s = "hello";
		char ch[] = s.toCharArray();

		for(int i=0;i<ch.length-1;i++){
			System.out.println(ch[i]);
		}
	}
}

class P8{
	public static void main(String[] args) {
		
		 String s = "monika";
		 char ch[] = s.toCharArray();

		 for(int i=0;i<ch.length;i++){
		 	ch[i] = (char)(ch[i]-32);
		 	System.out.println(ch[i]);

		 }
	}
}



class StringCrud {

    private static String s = "";

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int choice;

        do {
            System.out.println("\n----- CRUD Operation -----");
            System.out.println("1. Create");
            System.out.println("2. Read");
            System.out.println("3. Update");
            System.out.println("4. Delete");
            System.out.println("5. Exit");
            System.out.print("Enter your choice: ");
            choice = sc.nextInt();
            sc.nextLine(); // buffer clear

            switch (choice) {
                case 1:
                    System.out.print("Enter a string to create: ");
                    s = sc.nextLine();
                    System.out.println("Created successfully!");
                    break;

                case 2:
                    if (s.isEmpty()) {
                        System.out.println("Data not found.");
                    } else {
                        System.out.println("Stored Data: " + s);
                    }
                    break;

                case 3:
                    if (s.isEmpty()) {
                        System.out.println("Data not found.");
                    } else {
                        System.out.print("Enter new data to update: ");
                        s = sc.nextLine();
                        System.out.println("Data updated successfully!");
                    }
                    break;

                case 4:
                    if (s.isEmpty()) {
                        System.out.println("Data not found.");
                    } else {
                        s = "";
                        System.out.println("Data deleted successfully!");
                    }
                    break;

                case 5:
                    System.out.println("Exiting program...");
                    break;

                default:
                    System.out.println("Invalid choice!");
            }

        } while (choice != 5);

        sc.close();
    }
}

class EmployeeCRUD{

      
	private Integer id;
	private String  name;
	private Integer salary;

	public EmployeeCRUD(Integer id,String name,Integer salary){
		this.id = id;
		this.name = name;
		this.salary = salary;
	}

	public void setId(Integer id){
		this.id = id;
	}

	public void setName(String name){
		this.name = name;
	}

	public void setSalary(Integer salary){
		this.salary = salary;
	}

	public int getId(){
		return id;
	}

	public String getName(){
		return name;
	}

	public int getPrice(){
		return salary;
	}

	public String toString(){
		return id+" "+name+" "+salary;
	}
}

class TestCRUD{
      
      static Map<Integer,EmployeeCRUD> map = new HashMap<>();

	      public static void createEmployee(){
	      	 
	      	 Scanner sc = new  Scanner(System.in);

	      	 System.out.println("How many student do  you want to add ");
	      	 int n = sc.nextInt();
	      	 sc.nextLine();

	      	 for(int i=1;i<=n;i++){
	      	 System.out.println("Enter id :");
	      	 int id = sc.nextInt();
	      	 sc.nextLine();

	      	 System.out.println("Enter name :");
	      	 String name = sc.nextLine();

	      	 System.out.println("Enter price");
	      	 int price = sc.nextInt();

	          EmployeeCRUD emp = new EmployeeCRUD(id,name,price);
	      	map.put(id,emp);
	      	 
   
	      	System.out.println("Added successfully");

	      }
      }
      public static void showEmployee(){
      	for(EmployeeCRUD emp : map.values()){
      		System.out.println(emp);
      	}
      }

      public static void deleteEmployee(Integer id){
      	if(map.containsKey(id)){
               map.remove(id);
      	     System.out.println("Emplyee is deleted successfully");
      	}else{
      		System.out.println("employee is not found");
      	}
      }

      public static void updateEmployee(Integer id,String name,Integer price){
         
           if(map.containsKey(id)){
           	EmployeeCRUD emp = new EmployeeCRUD(id,name,price);
           	map.put(id,emp);
           	System.out.println("updated successfully");
           }else{
           	System.out.println("not found");
           }
      }
	public static void main(String[] args) {
		
		createEmployee();
		showEmployee();
		// deleteEmployee(1);
		updateEmployee(1,"Pawan",100000);
		showEmployee();
	}
}

abstract class Demo{

	public void demo(){
		System.out.println("iit is doing demo");
	}

	abstract void show();
}


//------------------Pattern Program-----------------
class Pattern1{
	public static void main(String[] args) {
		 int n = 6;
		 for(int i=0;i<=n;i++){
		 	for(int j=n;j>=i;j--){
		 		if(j>=i){
		 			System.out.print("*");
		 		}else{
		 			System.out.print(" ");
		 		}
		 	}
		 	System.out.println();
		 }
	}
}

class Pattern2{

	public static void main(String[] args) {
		
		 int n = 6;
		 for(int i=n;i>=0;i--){
		 	for(int j=0;j<=n;j++){
		 		if(j>=i){
		 			System.out.print("*");
		 		}else{
		 			System.out.print(" ");
		 		}
		 	}
		 	System.out.println();
		 }
	}
}

// class Pattern3{
// 	public static void main(String[] args) {
		
// 		 int n = 6;
// 		 for(int i=0;i<=n;i++){
// 		 	for(int j=0;j<=n;j++){
// 		 		if(){
// 		 		System.out.print("*");
// 		 	  }else{
// 		 	  	System.out.print(" ");
// 		 	  }
// 		 	}
// 		 }

// 	}
// }

//------------------------------------------Array Program------------------------------------------------------------
class Reverse{
	public static void main(String[] args) {
		
		 int arr[] = {1,2,3,4,5,6,0,9};
		 int min = arr[0];
		 
		 for(int i=arr.length-1;i>=0;i--){
		 	if(min<arr[i]){
		 		min = arr[i];
		 	}


		 }
		 System.out.println("minimum array ------> " + min);
	}
}

class FindSecondMax{

	public static void main(String[] args) {
		
		 int arr[] = {1,2,3,4,5,6,0};
		 int max = arr[0];
		 int secondMax = arr[0];

		 for(int i=0;i<arr.length;i++){
		 	if(max>arr[i]){
		 		max = arr[i];
		 	}
		 }

		 for(int i=0;i<arr.length;i++){
		 	if(arr[i]<secondMax && arr[i]<max){
		 		secondMax = arr[i];
		 	}
		 }
		 System.out.println("Maximum character ----> " + max);
		 System.out.println("Second character -----> " + secondMax);
	}
}

class Second{

	public static void main(String[] args) {
		
		 int arr[] = {1,2,3,4,5,6,0};
		 int min = arr[0];
		 int secondMax = arr[0];

		 for(int i=0;i<arr.length;i++){
		 	if(min<arr[i]){
		 		min = arr[i];
		 	}
		 }
		 for(int i=0;i<arr.length;i++){
		 	if(arr[i]>secondMax && arr[i]<min){
		 		secondMax = arr[i];
		 	}
		 }
		 System.out.println(secondMax);
	}
}


class PP{
	public static void main(String[] args) {
		
		 String s = "monika@@@123";
		 char ch[] = s.toCharArray();

		 int vowel=0,consonant=0,special=0,digit=0;

		 for(int i=0;i<ch.length;i++){
		 	if(ch[i]>='0' && ch[i]<='9'){
		 		digit++;
		 	}else if(ch[i]>='a' && ch[i]<='z' || ch[i]>='A' && ch[i]<='Z'){
		 		if(ch[i]=='a'||ch[i]=='e'||ch[i]=='i'||ch[i]=='o'||ch[i]=='u'){
		 			vowel++;
		 		}else{
		 			consonant++;
		 		}
		 	}else{
		 		special++;
		 	}
		 }
		 System.out.println("vowel ------>" + vowel);
		 System.out.println("consonant ------->" + consonant);
		 System.out.println("speical ------>" + special);
		 System.out.println("digit ------->" + digit);
		 
 	}
}

class  PPP{
	public static void main(String[] args) {
		
		String s = "MONIKA";
		char ch[] = s.toCharArray();

		for(int i=0;i<ch.length;i++){
			ch[i] = (char)(ch[i]+32);
			System.out.println(ch[i]);
		}
	}
}

class PM{
	public static void main(String[] args) {
		 String s = "monikaaaaa";
		 char ch[] = s.toCharArray();

		 int count=0;
		 for(int i=0;i<ch.length;i++){
		 	count++;
		 }
		 System.out.println(count);
	}
}

class PM1{
	public static void main(String[] args) {
		
		 String s = "aabbbcccddddeeeeklmn";
		 char ch[] = s.toCharArray();
           for(int i=0;i<ch.length;i++){
           	int count  = 0;

           	for(int j=0;j<ch.length;j++){
           		if(ch[i]==ch[j]){
           			count++;
           		}
           	}
           	if(count==1){
           		System.out.println(ch[i]);
           	}
           }

	}
}

class PrintDuplicateString{

	public static void main(String[] args) {
		
		 String s = "aaabbbbcccccdddddddkdlms";
		 char ch[] = s.toCharArray();

		 for(int i=0;i<ch.length;i++){
		 	int count = 1;

		 	for(int j=i+1;j<ch.length;j++){
		 		if(ch[i]==ch[j]){
		 			count++;
		 		}
		 	}
		 	if(count==1){
		 		System.out.println(ch[i]);
		 	}
		 }
	}
}

class MissingValuesArrays{

	public static void main(String[] args) {
		
		int arr[] = {1,2,3,4,10};
		int n = 10;

		for(int i=0;i<=n;i++){
			boolean found = true;

			for(int j=0;j<arr.length;j++){
				if(arr[j]==i){
					found = false;
				}
			}
			if(found){
				System.out.println(i);
			}
		}
	}
}

class FindSmallest{

	public static void main(String[] args) {
		
		 int arr[] = {1,2,3,4,5,0};
		 int min = arr[0];
		 int secondMin = arr[0];
		 for(int i=0;i<arr.length;i++){
		 	if(min>arr[i]){
		 		min = arr[i];
		 	}
		 }
		 for(int j=0;j<arr.length;j++){
		 	if(secondMin > arr[j] && min > arr[j]){
		 		secondMin = arr[j];
		 	}
		 }
		 System.out.println("min " +min);
		 System.out.println("secondMin " + secondMin);
	}
}

class FindLargest{
	public static void main(String[] args) {
		
		 int arr[] = {1,2,3,4,5,6};
		 int max = arr[0];
		 int secondMax = arr[0];

		 for(int i=0;i<arr.length;i++){
		 	if(max<arr[i]){
		 		max = arr[i];
		 	}
		 }
		 for(int i=0;i<arr.length;i++){
		 	if(secondMax < arr[i] && arr[i] < max){
		 		secondMax  = arr[i];
		 	}
		 }
		 System.out.println("max " + max);
		 System.out.println("secondMax " + secondMax);
	}
}


class FindMissingElementArray{

	public static void main(String[] args) {
		 
		 int arr[] = {1,2,3,4};
		 int n = 10;

		 for(int i=1;i<=n;i++){
		 	boolean found = true;


		 	for(int j=0;j<arr.length;j++){
		 		if(arr[j]==i){
		 			found = false;
		 		}
		 	}
		 	if(found){
		 		System.out.println(i);
		 	}
		 }
	}
}


class FindSumAndAverageElement{

     public static int sumOfElement(int arr[]){
     	int sum = 0;
     	for(int i=0;i<arr.length;i++){
              sum = sum+arr[i];
     	}
     	return sum;
     }

     public static int averageOfElement(int arr[]){
     	int avg = 0;

     	for(int i=0;i<arr.length;i++){

     		avg = sumOfElement(arr)/arr.length;

     	}
     	return avg;
     }
	public static void main(String[] args) {
		
		 int arr[] = {1,2,3,4,5,6};
		 System.out.println(sumOfElement(arr));

		 System.out.println(averageOfElement(arr));

	}
}


class FindAverage{

	public static void main(String[] args) {
		
		 int arr[] = {1,2,3,4,5,6};
		 int sum = 0;

		 for(int i=0;i<arr.length;i++){
		 	sum = sum+arr[i];
		 }

		 int average = sum/arr.length;
		 System.out.println("average founded " +average);
	}
}

class FindArray{

	public static void main(String[] args) {
		
		 int arr[] = {1,2,3,4,5,6,7,7,7};
           int arr2[] = new int[arr.length];

           for(int i=0;i<arr.length;i++){
           	 arr2[i] = arr[i];
           } 

           for(int i=0;i<arr2.length;i++){
              System.out.println(arr2[i]);
           }    
	}
}


class SortArray{

	public static void main(String[] args) {
		
		 int arr[] = {1,2,3,4,52,93,8};
		 for(int i=0;i<arr.length;i++){
		 	for(int j=i+1;j<arr.length;j++){
		 		if(arr[i]>arr[j]){
		 			int temp = arr[i];
		 			arr[i] = arr[j];
		 			arr[j] = temp;
		 		}
		 	}
		 	System.out.println(arr[i]);
		 }
	}
}


class CountFrequencyArrayElement{

	public static void main(String[] args) {
		
		 int arr[] = {1,2,3,4,2,4,5,6,8};
		 for(int i=0;i<arr.length;i++){

		 	 int count = 1;
               if(arr[i]==-1)
               	continue;

		 	 for(int j=i+1;j<arr.length;j++){
		 	 	 if(arr[i]==arr[j]){
		 	 	 	count++;
		               arr[j] = -1;
		 	 	 }
		 	 }
		 	 System.out.println(count+" --------> "+arr[i]);
		 }
	}
}


class PrintNonDuplicated{

	public static void main(String[] args) {
		
		 int arr[] = {1,2,3,4,2,3,1,7,9,7,10,11};
		 for(int i=0;i<arr.length;i++){

		 	 int count = 0;
		 	 for(int j=0;j<arr.length;j++){
		 	 	if(arr[i]==arr[j]){
		 	 		count++;
		 	 	}
		 	 }
		 	 if(count==1){
		 	 	System.out.println(arr[i]);
		 	 }
		 }
	}
}

class PrintDuplicateElement{

	public static void main(String[] args) {
		
		 int arr[] = {1,2,3,4,5,1,3,4,5,10,11,12};
		 for(int i=0;i<arr.length;i++){
		 	int count = 0;

		 	for(int j=0;j<arr.length;j++){
		 		 if(arr[i]==arr[j]){
		 		 	count++;

		 		 }
		 	}
		 	if(count>1){
		 		System.out.println(arr[i]);
		 	}
		 }
	}
}

class MergeTwoArray{

	public static void main(String[] args) {
		
		int arr[] ={1,2,3,4,5};
		int arr1[] = {5,6,7,8,9};
		int mergeArray[] = new int[arr.length+arr1.length];

		for(int i=0;i<arr.length;i++){
			mergeArray[i] = arr[i];
		}

		for(int i=0;i<arr1.length;i++){
			mergeArray[arr1.length+i] = arr1[i];
		}

		for(int i=0;i<mergeArray.length;i++){
			System.out.println(mergeArray[i]);
		}
	}
}


class LeftRotate {
    public static void main(String[] args) {
        
        int arr[] = {1, 2, 3, 4, 5};

        // store first element
        int temp = arr[0];

        // shift elements to left
        for (int i = 0; i < arr.length - 1; i++) {
            arr[i] = arr[i + 1];
        }

        // put temp at last
        arr[arr.length - 1] = temp;

        // print rotated array
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}


//----------------------------Pattern Program--------------------------------------------------------------------------


class PMP{
	public static void main(String[] args) {
		
		 int n = 5;
		 for(int i=0;i<=n;i++){
		 	for(int j=0;j<=n;j++){
		 		System.out.print("*");
		 	}
		 	System.out.println();
		 }
	}
}

class MPP{
	public static void main(String[] args) {
		 
		  int n = 5;
		  for(int i=0;i<=n;i++){
		  	for(int j=0;j<=n;j++){
		  		if(j<=i){
		  			System.out.print("*");
		  		}else{
		  			System.out.print(" ");
		  		}
		  	}
		  	System.out.println();
		  }
	}
}

	class Mp1{
		public static void main(String[] args) {
			
			int n = 5;
			for(int i=0;i<=n;i++){
				for(int j=0;j<=n;j++){
					if(j>=i){
						System.out.print("* ");
					}else{
						System.out.print(" ");
					}
				}
				System.out.println();
			}
		}
	}

class MPMPPP{
	public static void main(String[] args) {
		int n = 5;
		for(int i=n;i>=0;i--){
			for(int j=i;j>=0;j--){
				System.out.print("*");
			}
			System.out.println();
		}
	}
}

class PyramidProgram{

	public static void main(String[] args) {
		
		 int n = 5;
		 for(int i=1;i<=n;i++){
		 	for(int j=1;j<=n-i;j++){
		 		System.out.print(" ");
		 	}
		 	for(int k=1;k<=i;k++){
		 		System.out.print("* ");
		 	}
		 	System.out.println();
		 }
	}
}

class ReversePyramid{

	public static void main(String[] args) {
		
		 int n = 5;
		 for(int i=n;i>=1;i--){
		 	for(int j=1;j<=n-i;j++){
		 		System.out.print(" ");
		 	}for(int k=1;k<=i;k++){
		 		System.out.print("* ");
		 	}System.out.println();
		 }
	}
}


class KajuKatli{
	public static void main(String[] args) {
		
		 int n  = 5;
		 for(int i=1;i<=n;i++){
		 	for(int j=1;j<=n-i;j++){
		 		System.out.print(" ");
		 	}for(int k=1;k<=i;k++){
		 		System.out.print("* ");
		 	}System.out.println();
		 }
		 for(int i=n-1;i>=1;i--){
		 	for(int j=1;j<=n-i;j++){
		 		System.out.print(" ");
		 	}for(int k=1;k<=i;k++){
		 		System.out.print("* ");
		 	}System.out.println();
		 }

	}
}


class HoollwSquare{
	public static void main(String[] args) {
		
		 int n = 5;
		 for(int i=1;i<=n;i++){
		 	for(int j=1;j<=n;j++){
		 		if(i==1||j==1||j==n||i==n){
		 			System.out.print("*");
		 		}else{
		 			System.out.print(" ");
		 		}
		 	}System.out.println();
		 }
	}
}

class PrintNumbers{
	public static void main(String[] args) {
		int n=5;
		for(int i=1;i<=n;i++){
			for(int j=1;j<=i;j++){
				System.out.print(j+" ");
			}System.out.println();
		}
	}
}



class PrintReverseNumber{
	public static void main(String[] args) {
		int n=5;
		for(int i=1;i<=n;i++){
			for(int j=1;j<=n-i;j++){
				System.out.print(" ");
			}
			for(int k=1;k<=i;k++){
				System.out.print(k+"");
			}
			System.out.println();
		}
	}
}


class ReverseNumberProgram{
	
	public static void main(String[] args) {
		
		 int n = 5;
		 for(int i=n;i>=1;i--){
		 	for(int j=1;j<=i;j++){
		 		System.out.print(j+" ");
		 	}
		 	System.out.println();
		 }
	}
}

class PrintAlternate{
	public static void main(String[] args) {
		
		 int n = 5;
		 int num=1;

		 for(int i=1;i<=n;i++){
		 	for(int j=1;j<=i;j++){
		 		System.out.print(num+" ");
		 		num++;
		 	}
		 	System.out.println();
		 }
	}
}

class PrintPyramidProgram{

    public static void main(String[] args) {
    	
    	       int n = 5;
    	       for(int i=1;i<=n;i++){
    	       	for(int j=1;j<=n-i;j++){
    	       		System.out.print(" ");
    	       	}
    	       	
    	       	for(int k=1;k<=i;k++){
    	       		System.out.print(k+"");
    	       	}

    	       	for(int k=i-1;k>=1;k--){
    	       		System.out.print(k+"");
    	       	}
    	       	System.out.println();
    	       }
    }
}

class R1{
	public static void main(String[] args) {
		 
		  int n =5;
		  for(int i=0;i<=n;i++){
		  	for(int j=0;j<=n;j++){
		  		System.out.print("*");
		  	}
		  	System.out.println();
		  }
	}
}

class R2{
	public static void main(String[] args) {
		 
		 int n = 5;
		 for(int i=1;i<=n;i++){
		 	for(int j=1;j<=i;j++){
		 		System.out.print("*");
		 	}
		 	System.out.println();
		 }
	}
}

class R3{
	public static void main(String[] args) {
		 
		 int n = 5;
		 for(int i=n;i>=0;i--){
		 	for(int j=i;j>=0;j--){
		 		System.out.print("*");
		 	}
		 	System.out.println();
		 }
	}
}

class R4{
	public static void main(String[] args) {
		
		 int n = 5;
		 for(int i=1;i<=n;i++){
		 	for(int j=1;j<=n-i;j++){
		 		System.out.print(" ");
		 	}
		 	for(int k=1;k<=i;k++){
		 		System.out.print("* ");
		 	}
		 	System.out.println();
		 }
	}
}

class R5{
	public static void main(String[] args) {
		
		 int n = 6;
		 for(int i=n-1;i>=1;i--){
		 	for(int j=1;j<=n-i;j++){
		 		System.out.print(" ");
		 	}
		 	for(int k=1;k<=i;k++){
		 		System.out.print("* ");
		 	}
		 	System.out.println();
		 }
	}
}

class R6{
	public static void main(String[] args) {
		
		 int n = 6;
		 for(int i=1;i<=n;i++){
		 	for(int j=1;j<=n-i;j++){
		 		System.out.print(" ");
		 	}
		 	for(int k=1;k<=i;k++){
		 		System.out.print("*");
		 	}
		 	System.out.println();
		 }

		 for(int i=n-1;i>=1;i--){
		 	for(int j=1;j<=n-i;j++){
		 		System.out.print(" ");
		 	}
		 	for(int k=1;k<=i;k++){
		 		System.out.print("*");
		 	}
		 	System.out.println();
		 }
	}
}

class R7{
	public static void main(String[] args) {
		
		 int n = 5;
		 for(int i=0;i<=n;i++){
		 	for(int j=0;j<=n;j++){
		 		if(i==0||j==0||i==n||j==n){
		 			System.out.print("*");
		 		}else{
		 			System.out.print(" ");
		 		}
		 	}
		 	System.out.println();
		 }
	}
}

class R8{
	public static void main(String[] args) {
		
		 int n = 5;
		 for(int i=1;i<=n;i++){
		 	for(int j=1;j<=i;j++){
		 		System.out.print(j+" ");
		 	}
		 	System.out.println();
		 }
	}
}

class R9{
	public static void main(String[] args) {
		
		 int n = 5;
		 for(int i=n;i>=1;i--){
		 	for(int j=1;j<=i;j++){
		 		System.out.print(j+" ");
		 	}
		 	System.out.println();
		 }
	}
}

class R10{
	public static void main(String[] args) {
		
		 int n = 5;
		 int num = 1;
		 for(int i=1;i<=n;i++){
		 	for(int j=1;j<=i;j++){
		 		System.out.print(num+" ");
		 		num++;
		 	}
		 	System.out.println();
		 }
	}
}

class R11{
	public static void main(String[] args) {
		
		 int n  = 5;
		 for(int i=1;i<=n;i++){
		 	for(int j=1;j<=n-i;j++){
		 		System.out.print(" ");
		 	}
		 	for(int k=1;k<=i;k++){
		 		System.out.print(k);
		 	}
		 	System.out.println();
		 }

	}
}

class R12{
	public static void main(String[] args) {
		
		 int n = 5;
		 for(int i=1;i<=n;i++){
		 	for(int j=1;j<=n-i;j++){
		 		System.out.print(" ");
		 	}
		 	for(int k=1;k<=i;k++){
		 		System.out.print(k);
		 	}

		 	for(int k=i-1;k>=1;k--){
		 		System.out.print(k);
		 	}

		 	System.out.println();
		 }
	}
}

class R13{
	public static void main(String[] args) {
		
		 int n = 5;
		 for(int i=0;i<=n;i++){
		 	for(int j=0;j<=i;j++){
		 		if((i+j)%2==0){
		 			System.out.print("1");
		 		}
		 		else{
		 			System.out.print("0");
		 		}
		 	}
		 	System.out.println();
		 }
	}
}

class PMPMPM{

	public static void main(String[] args) {
		
		  for(int num=2;num<=100;num++){

		  	 boolean isPrime = true;

		  	 for(int i=2;i<=num/2;i++){
		  	 	 if(num%i==0){
		  	 	 	isPrime = false;
		  	 	 	break;
		  	 	 }
		  	 }
		  	 if(isPrime){
		  	 	System.out.println(num+" ");
		  	 }
		  }
	}
}


//------------------CRUD OPERATION------------

class Employee{

	private int id;
	private String name;
	private String email;


	public Employee(int id,String name,String email){
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

     public int getId(){
     	return id;
     }

     public String getName(){
     	return name;
     }

     public String getEmail(){
     	return email;
     }

	public String toString(){
		return id+" "+name+" "+email;
	}
}

class TestEmployee{

     private static ArrayList<Employee> list = new ArrayList<>();

     public static void create(int id,String name,String email){

     	Employee emp = new  Employee(id,name,email);
     	list.add(emp);
     	// System.out.println("Addedd successfully");
     }

     public static void show(){

     	 for(Employee e : list){
     	 	System.out.println("------> " +e);
     	 }
     }

     public static void delete(int id){
     	for(int i=0;i<list.size();i++){
     		if(list.get(i).getId()==id){
     			list.remove(i);
     			System.out.println("deleted successfully");
     		}
     	}
     }

     public static void update(Employee emp){
     	for(Employee empData : list){
     		if(empData.getId()==emp.getId()){
     			empData.setName(emp.getName());
     			empData.setEmail(emp.getEmail());
     			System.out.println("updated successfully");
     		}
     	}
     }
	public static void main(String[] args) {
		
          create(1,"Monika","monika@gmail.com");
          create(2,"Mona","mona@gmail.com");
          create(3,"Ruchika","ruchika@gmail.com");
          create(4,"Moni","moni@gmail.com");

          // show();
          // delete(1);
          update(new Employee(1,"MonaLisa","moika138@gmail.com"));
          show();
	}
}

class ExampleOfHashMap{
	public static void main(String[] args) {
		
		 // Map<Object ,Object> map = new HashMap<>();
		 // map.put(1,"monika");
		 // map.put(2,10);
		 // map.put(3,"ruchika");
		 // map.put(4,"archika");
		 // map.put(5,"archika");
		 // map.put(6,null);
		 // map.put(7,null);
           
           // System.out.println(map);
		 // System.out.prin
		 
		 // System.out.println(map);

		List<String> list = new ArrayList<>();
		list.add("monika");
		list.add("tonika");
		list.add("ponika");
		list.add("onika");
		list.add("looniika");
		list.add("ochika");

		// Iterator itr = list.iterator();
		// while(itr.hasNext()){
		// 	System.out.println(itr.next());
		// }

		ListIterator itr = list.listIterator();
		while(itr.hasNext()){
			System.out.println(itr.next());
		}

		while(itr.hasPrevious()){
			System.out.println(itr.previous());

		}
	}
}


class ArrayExample{

	public static void main(String[] args) {
		
		 int arr[] = {1,2,3,4};

		 int newArr[] = new int[5];

           for(int i=0;i<arr.length;i++){
           	newArr[i] = arr[i];
           }

		 newArr[4] = 40;
		 

		 for(int n : newArr){
		 	System.out.println(n);
		 }
	}
}


class ArrayListExample{
	public static void main(String[] args) {
		
		 ArrayList<Integer> list = new ArrayList<>();
		 list.add(10);
		 list.add(10);
		 list.add(10);
		 list.add(10);
		 list.add(10);

		 System.out.println(list);

		 list.add(20);
		 list.add(20);
		 list.add(20);
		 list.add(20);
		 list.add(20);

		 System.out.println(list);
	}
}


class StudentArray{

	private int id;
	private String name;
	private int roll;

     public StudentArray(int id,String name,int roll){
     	this.id = id;
     	this.name = name;
     	this.roll = roll;
     }

	public void setId(int id){
		this.id = id;
	}

	public void setName(String name){
		this.name = name;
	}

	public void setRoll(int roll){
		this.roll = roll;
	}

	public int getId(){
     	return id;
	}

	public String getName(){
		return name;
	}

	public int getRoll(){
		return roll;
	}

	public String toString(){
		return id+" "+name+" "+roll;
	}
}


class TestArray{
	public static void main(String[] args) {
		
		  StudentArray std[] = new StudentArray[4];

		  std[0] = new StudentArray(1,"Pawan",101);
		  std[1] = new StudentArray(2,"Monika",102);
		  std[2] = new StudentArray(3,"Archu",103);
		  std[3] = new StudentArray(4,"Ritu",104);

		  for(StudentArray s : std){
		  	System.out.println(s);
		  }
	}
}


class Hash{
	public static void main(String[] args) {
		
		Map<Integer,String> map = new HashMap<>();
		map.put(1,"monika");
		map.put(2,"mona");
          map.put(null,"ritu");
          map.put(null,"anubetu");
          map.put(3,"pawanji");
          map.put(4,null);
          map.put(5,null);

          System.out.println(map.get(1));
          System.out.println(map.get(2));
          System.out.println(map.get(3));
          System.out.println(map.get(4));
          System.out.println(map.get(5));
          System.out.println(map.get(6));
         
	}
}

class HashTable{
	public static void main(String[] args) {
		
		 Hashtable<Object,String> table = new Hashtable<>();
		 table.put(null,"mona");
		
		 

		 System.out.println(table);
	}
}

class ExampleMultiThreading{
     
     public static void task(){
     	for(int i=1;i<=5;i++){
     		System.out.println(i);
     		System.out.println("Task completed");
     	}
     }

     public static void task1(){
     	for(int i=1;i<=5;i++){
     		System.out.println(i);
     		System.out.println("Task1 completed");
     	}
     }
	public static void main(String[] args) {
		
		 task();
		 task1();
	}
}

class  Task1 extends  Thread{

     public void run(){
	for(int i=1;i<=5;i++){
		System.out.println("Task1 Thread "+ i);
	}
   }
}

class Task2 extends Thread{

	public void run(){
		for(int i=1;i<=5;i++){
			System.out.println("Task Thread "+i);
		}
	}
}

class MainThread{

	public static void main(String[] args) {
		
		 Task1 task = new Task1();
		 Task2 task1 = new Task2();

		 task.start();
		 task1.start();
	}
}

class MultiHashMap extends Thread{

     static Map<Integer,String> map  = new HashMap<>();
     
     public void run(){
     	for(int i=1;i<=6;i++){
     		map.put(i,"value"+i);
     	}
     }

	public static void main(String[] args)throws InterruptedException {
		
           MultiHashMap h = new MultiHashMap();
           MultiHashMap h1 =  new MultiHashMap();

           h.start();
           h1.start();

           h.join();
           h1.join();

           System.out.println(map);
	}
}

class ThreadClass  implements Runnable{

	public  void run(){
		for(int i=1;i<=6;i++){
			System.out.println(i);
		}
	}
	public static void main(String[] args) {
		
		ThreadClass cls = new ThreadClass();
		Thread thread = new Thread(cls);

		thread.start();
	}
}

class Vehicle{

	public void drive(){
		System.out.println("its driving");
	}
}

class Cycle{

	public void riding(){
		System.out.println("i am doing ride");
	}
}
class Demo6 extends Vehicle  implements Runnable{

	 public void run(){
	 	System.out.println("Job is getting me");
	 }

	 public static void main(String[] args) {
	 	
	 	 Demo6 d = new Demo6();
	 	 Thread t = new Thread(d);

	 	 t.start();
	 }
}


class ExampleOfString{

	public static void main(String[] args) {
		
		 String s = "monika";
		 s = "rajput";
		 System.out.println(s);
	}
}


class RM{
	public static void main(String[] args) {
		
		 int n = 5;
		 for(int i=1;i<=n;i++){
		 	for(int j=1;j<=i;j++){
		 		System.out.print(j);
		 	}
		 	System.out.println();
		 }
	}
}

class RM1{

	public static void main(String[] args) {
		
	      int n = 5;
	      for(int i=n;i>=1;i--){
	      	for(int j=i;j>=1;j--){
	      		System.out.print("*");
	      	}
	      	System.out.println();
	      }
	}
}

class RM2{

	public static void main(String[] args) {
		
		 int n = 5;
		 for(int i=1;i<=n;i++){
		 	for(int j=1;j<=n-i;j++){
		 		System.out.print(" ");
		 	}

		 	for(int k=1;k<=i;k++){
		 		System.out.print(k);
		 	}
		 	for(int k=i-1;k>=1;k--){
		 		System.out.print(k);
		 	}
		 	System.out.println();
		 }
	}
}


class RM3{
	public static void main(String[] args) {
		
		int n = 5;
		for(int i=1;i<=n;i++){
			for(int j=1;j<=n;j++){
				System.out.print(1);
			}
			System.out.println();
		}
	}
}

class RM4{
	public static void main(String[] args) {
		
		 int n = 5;
		 for(int i=0;i<=n;i++){
		 	for(int j=0;j<=i;j++){
		 		System.out.print("*");
		 	}
		 	System.out.println();
		 }
	}
}

class DiamondPattern{

	public static void main(String[] args) {
		
		 int n = 5;
		 for(int i=0;i<=n;i++){
		 	for(int j=0;j<=n-i;j++){
		 		System.out.print(" ");
		 	}
		 	for(int k=1;k<=i;k++){
		 		System.out.print("* ");
		 	}	
		 }
		 for(int i=n;i>=0;i--){
		 	for(int j=0;j<=n-i;j++){
		 		System.out.print(" ");
		 	}
		 	for(int k=i;k>=0;k--){
		 		System.out.print("* ");
		 	}
		 	System.out.println();
		 }
	}
}


class NonDupli{
	public static void main(String[] args) {
		
		 int arr[] = {1,2,3,4,5,1,2,3,6,8,9,0,88};
           boolean visited[] = new boolean[arr.length];

		 for(int i=0;i<arr.length;i++){

		 	if(visited[i])
		 		continue;

		 	 int count = 1;

		 	 for(int j=i+1;j<arr.length;j++){
		 	 	if(arr[i]==arr[j]){
		 	 		count++;
		 	 		visited[j] = true;
		 	 	}
		 	 }
		 	 if(count>1){
		 	 	System.out.println(arr[i]);
		 	 }
		 }
	}
}

class StrDupli{

	public static void main(String[] args) {
		
		 String s = "aabbbssssmonika";
		 char ch[] = s.toCharArray();
		 boolean visited[] = new boolean[ch.length];

		 for(int i=0;i<ch.length;i++){
		 	 // if(visited[i])
		 	 // 	continue;

		 	 int count = 0;

		 	 for(int j=0;j<ch.length;j++){
		 	 	if(ch[i]==ch[j]){
		 	 		count++;
		 	 		// visited[j] = true;
		 	 	}
		 	 }
		 	 if(count==1){
		 	 	System.out.println(ch[i]);
		 	 	return;
		 	 }
		 }
	}
}

class FNR{

	public static void main(String[] args) {
		
		  int arr[] = {1,2,3,4,5,6,8,9,0,2,3,4,5};
		  for(int i=0;i<arr.length;i++){
		  	 int count = 0;

		  	 for(int j=0;j<arr.length;j++){
		  	 	 if(arr[i]==arr[j]){
		  	 	 	count++;
		  	 	 }
		  	 }
		  	 if(count>1){
		  	 	System.out.println(arr[i]);
		  	 	return;
		  	 }
		  }
	}
}


class MPArray{

	public static void main(String[] args) {
		
		 int arr[] = {12,3,4,5,8,6,7,0};
		 int min = arr[0];
		 int secondMin = arr[0];

		 for(int i=0;i<arr.length;i++){
		 	 if(min<arr[i]){
		 	 	min = arr[i];
		 	 }
		 }
          
           for(int j=0;j<arr.length;j++){
           	 if(arr[j]<min && arr[j]> secondMin){
           	 	secondMin = arr[j];
           	 }
           }
           System.out.println("min "+min);
           System.out.println("secondMin "+secondMin);
	}
}


class C1{
	public static void main(String[] args) {
		
		 int arr[] = {1,2,3,4,5,6,12,1,2,3,4};
		 boolean visited[] = new boolean[arr.length];

		 for(int i=0;i<arr.length;i++){

		 	 if(visited[i])
		 	 	continue;

		 	 int count = 1;

		 	 for(int j=i+1;j<arr.length;j++){
		 	 	  if(arr[i]==arr[j]){
		 	 	  	count++;
		 	 	  	visited[j] = true;
		 	 	  }
		 	 }
		 	 if(count==1){
		 	 	System.out.println(arr[i]);
		 	 }
		 }
	}
}


class RvrArray{

	public static void main(String[] args) {
		
		 int arr[] = {1,2,3,4,5,6};
		 for(int i=arr.length-1;i>=0;i--){
		 	System.out.println(arr[i]);
		 }
	}
}

class SortArry{

	public static void main(String[] args) {
		
           int arr[] = {1,2,4,3,5,6};
           for(int i=0;i<arr.length;i++){
           	  for(int j=i+1;j<arr.length;j++){
           	  	 if(arr[i]>arr[j]){
           	  	 	int temp = arr[i];
           	  	 	arr[i] = arr[j];
           	  	 	arr[j] = temp;
           	  	 }
           	  }
           	  System.out.println(arr[i]);

           }
	}
}

class  MArrT{

	public static void main(String[] args) {
		
		  int arr[] = {1,2,3};
		  int arr1[] = {4,5,6};

		  int mergeArray[]  = new int[arr.length+arr1.length];

		  for(int i=0;i<arr.length;i++){
		  	 mergeArray[i] = arr[i];
		  }

		  for(int i=0;i<arr1.length;i++){
		  	 mergeArray[arr.length+i] = arr1[i];
		  }

		  for(int i=0;i<mergeArray.length;i++){
		  	System.out.println(mergeArray[i]);
		  }
	}
}

class FindMissNumber{

	public static void main(String[] args) {
		
		 int arr[] = {1,2,3,4,5,7};
		 int n = 10;

		 for(int i=0;i<=n;i++){

		 	  boolean found = true;

		 	  for(int j=0;j<arr.length;j++){
		 	  	 if(arr[j] == i){
		 	  	 	found = false;
		 	  	 }
		 	  }
               
               if(found){
               	System.out.println(i);
               }
		 }
	}
}

class PallindromeArray{

	public static void main(String[] args) {
		
		 int arr[] = {1,2,1,4};
		 int start = 0,last = arr.length-1;

		 boolean pallindrome = true;

		 for(int i=0;i<arr.length;i++){
		 	if(arr[start]!=arr[last]){
		 		pallindrome =  false;
		 	}
		 }
		 if(pallindrome){
		 	System.out.println("is pallindrome");
		 }else{
		 	System.out.print("not pallindrome");
		 }
	}
}

class FrElA{
	public static void main(String[] args) {
		
		 int arr[] = {1,2,3,4,5,6,2,3,11,8,4};
		 boolean visited[] = new  boolean[arr.length];

		 for(int i=0;i<arr.length;i++){
                 
                 if(visited[i])
                 	continue;

                  int count = 1;

                  for(int j=i+1;j<arr.length;j++){
                  	  if(arr[i]==arr[j]){
                  	  	count++;
                  	  	visited[j] = true;
                  	  }
                  }
                  System.out.println(arr[i]+" ------> "+count);
		 }
	}
}

class PrintZeroElement{

	public static void main(String[] args) {
		
		  int arr[] = {1,2,3,4,0,2,0,4,0,0,66,0};
		  int j = 0;
		  for(int i=0;i<arr.length;i++){
		  	  if(arr[i]!=0){
		  	  	int temp = arr[i];
		  	  	arr[i] = arr[j];
		  	  	arr[j] = temp;

		  	  	j++;
		  	  }
		  }

		  for(int i=0;i<arr.length;i++){
		  	System.out.println(arr[i]);
		  }
	}
}


class LeftToRight{
	public static void main(String[] args) {
		
		 int arr[] = {1,2,3,4,5,6};
		 int temp = arr[0];

		 for(int i=0;i<arr.length-1;i++){

		 	 arr[i] = arr[i+1];
		 }

		 arr[arr.length-1] = temp;

		 for(int i=0;i<arr.length;i++){
		 	System.out.println(arr[i]+" ");
		 }
	}
}

class S1{
	public static void main(String[] args) {
		
		 String s = "monika";
		 char ch[] = s.toCharArray();

		 for(int i=ch.length-1;i>=0;i--){
		 	System.out.println(ch[i]);
		 }
	}
}

class S2{
	public static void main(String[] args) {
		
		 String s = "eye";
		 char ch[]  = s.toCharArray();

		 boolean temp = true;
		 int start=0,last=ch.length-1;

		 for(int i=0;i<ch.length-1;i++){
		 	if(ch[start]!=ch[last]){
		 		temp = false;
		 		break;
		 	}
		 }
		 if(temp){
		 	System.out.println("is pallindrome");
		 }else{
		 	System.out.println("not pallindrome");
		 }
	}
}

class S3{
	public static void main(String[] args) {
		
		 String s = "monikaeeee";
		 char ch[] = s.toCharArray();

		 int consonant=0,vowel=0;

		 for(int i=0;i<ch.length;i++){
		 	if(ch[i]=='a'||ch[i]=='e'||ch[i]=='i'||ch[i]=='o'||ch[i]=='u'){
		 		vowel++;
		 	}else{
		 		consonant++;
		 	}
		 }
		 System.out.println("vowel "+vowel);
		 System.out.println("consonant "+consonant);
	}
}

class S4{

	public static void main(String[] args) {
		
		 String s = "monikamoni";
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
		 	 if(count==1){
		 	 	System.out.println(ch[i]);
		 	 }
		 }
	}
}

class S5{
	public static void main(String[] args) {
		
		 String s = "monikamoniakl";
		 char ch[] = s.toCharArray();

		 for(int i=0;i<ch.length;i++){
		 	int count = 0;

		 	for(int j=0;j<ch.length;j++){
		 		 if(ch[i]==ch[j]){
		 		 	count++;
		 		 }
		 	}
		 	if(count==1){
		 		System.out.println(ch[i]);
		 		return;
		 	}
		 }
	}
}

class S6{
	public static void main(String[] args) {
		 
		  String s = "aabbbccdddeeeee";
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
		  	   System.out.println(ch[i]+" count -----> "+count);
		  }
	}
}

class S7{
	public static void main(String[] args) {
		
		  String s = "silent";
		  String s1 = "listena";

		  if(s1.length()!=s.length()){
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
		  	 }
		  }
		  System.out.println("anagram");
	}
}

class S8{
	public static void main(String[] args) {
		 
		  String s = "monika";
		  char ch[] = s.toCharArray();

		  for(int i=0;i<ch.length;i++){
		  	  ch[i] = (char)(ch[i]-32);

		  	  System.out.println(ch[i]);
		  }
	}
}

class S9{
	public static void main(String[] args) {
		
		  String s = "monika";

		  for(int i=0;i<s.length();i++){
		  	System.out.println(s.charAt(i));
		  }
	}
}

class S10{
	public static void main(String[] args) {
		 
		   String s = "monika@123456";
		   char ch[] = s.toCharArray();

		   int digit=0,symbol=0;
		   for(int i=0;i<ch.length;i++){

		   	   if(ch[i]>='0'&& ch[i]<='9'){
		   	   	  digit++;
		   	   }
		   	   else if(!((ch[i]>='a'&& ch[i]<='z')||(ch[i]>='A' && ch[i]<='Z'))){
		   	   	symbol++;
		   	   }
		   }
		   System.out.println("digit "+digit);
		   System.out.println("symbol "+symbol);
	}
}

class S11{
	public static void main(String[] args) {
		System.out.println("Hello  World");
	}
}

class S12{
	public static void main(String[] args) {
		
		 int n = 10;
		 for(int i=1;i<=n;i++){
		 	System.out.println(i);
		 } 
	}
}

class S13{
	public static void main(String[] args) {
		
		  int n = 10;
		  for(int i=1;i<=n;i++){
		  	 if(i%2==0){
		  	 	System.out.println(i+" "+"Even");
		  	 }
		  	 else{
		  	 	System.out.println(i+" "+"Odd");
		  	 }
		  }
	}
}

class S14{
	public static void main(String[] args) {
		
		  int n = 10;
		  int sum = 0;
		  for(int i=1;i<=n;i++){
		  	  sum+=i;
		  }
		  System.out.println("sum of the numbers "+sum);
	}
}

class S15{
	public static void main(String[] args) {
		 
		  int n = 4,data = 1;
		  for(int i=1;i<=n;i++){
		  	  data = data*i;
		  }
		  System.out.println("factorial of this number " +data);
	}
}

class S16{
	public static void main(String[] args) {
		
		int n = 17;
		boolean temp = true;

		for(int i=2;i<n/2;i++){
			 if(n%i==0){
			 	temp = false;
			 }
		} 
		if(temp){
			System.out.println("is prime");
		} else{
			System.out.println("not prime");
		}
	}
}

class T1{
	public static void main(String[] args) {
		
		  int n = 6;
		  for(int i=0;i<=n;i++){
		  	for(int j=0;j<=i;j++){
		  		System.out.print("*");
		  	}
		  	System.out.println();
		  }
	}
}

class T2{

	public static void main(String[] args) {
		
		int n = 6;
		for(int i=n;i>=0;i--){
			for(int j=i;j>=0;j--){
				System.out.print("*");
			}
			System.out.println();
		}
	}
}

class T3{
	public static void main(String[] args) {
		
		int n = 6;
		for(int i=0;i<=n;i++){
			for(int j=0;j<=n-i;j++){
				System.out.print(" ");
			}
			for(int k=0;k<=i;k++){
				System.out.print("* ");
			}
			System.out.println();
		}
	}
}

class T4{
	public static void main(String[] args) {
		
          int n = 6;
          for(int i=n;i>=0;i--){
          	for(int j=0;j<=n-i;j++){
          		System.out.print(" ");
          	}

          	for(int k=i;k>=0;k--){
          		System.out.print("* ");
          	}
          	System.out.println();
          }
	}
}

class T5{
	public static void main(String[] args) {
		 
		   int n = 6;
		   for(int i=0;i<=n;i++){
		   	for(int j=0;j<=n;j++){
		   		if(i==0||j==0||i==n||j==n){
		   			System.out.print("*");
		   		}else{
		   			System.out.print(" ");
		   		}
		   	}
		   	System.out.println();
		   }
	}
}


class T6{
	public static void main(String[] args) {
		 
		 int n = 6;
		 for(int i=0;i<=n;i++){
		 	for(int j=0;j<=n;j++){
		 		if(j==0||i==n||i==j){
		 			System.out.print("*");
		 		}else{
		 			System.out.print(" ");
		 		}
		 	}
		 	System.out.println();
		 }
	}
}

class T7{
	public static void main(String[] args) {
		 
		  int n = 10;
		  for(int i=0;i<=n;i++){
		  	for(int j=0;j<=n-i;j++){
		  		System.out.print(" ");
		  	}
		  	for(int k=0;k<=i;k++){
		  		System.out.print("* ");
		  	}
		  	System.out.println();
		  }
		  for(int i=n;i>=0;i--){
		  	for(int j=0;j<=n-i;j++){
		  		System.out.print(" ");
		  	}
		  	for(int k=i;k>=0;k--){
		  		System.out.print("* ");
		  	}
		  	System.out.println();
		  }
	}
}

class T8{
	public static void main(String[] args) {
		
		 int n  = 6;
		 for(int i=1;i<=n;i++){
		 	for(int j=1;j<=i;j++){
		 		System.out.print(j);
		 	}
		 	System.out.println();
		 }
	}
}

class T9{
	public static void main(String[] args) {
		 
		  int n = 5;
		  for(int i=n;i>=1;i--){
		  	for(int j=1;j<=i;j++){
		  		System.out.print(j);
		  	}
		  	System.out.println();
		  }
	}
}

class T10{
	public static void main(String[] args) {
		
		 int n = 6;
		 for(int i=1;i<=n;i++){
		 	for(int j=1;j<=n-i;j++){
		 		System.out.print(" ");
		 	}
		 	for(int k=1;k<=i;k++){
		 		System.out.print(k);
		 	}
		 	for(int k=i-1;k>=1;k--){
		 		System.out.print(k);
		 	}
		 	System.out.println();
		 }
	}
}

class T11{
	public static void main(String[] args) {
		  
		 int n  = 5;
		 int num = 1;
		 for(int i=0;i<=n;i++){
		 	for(int j=0;j<=i;j++){
		 		System.out.print(num);
		 		num++;
		 	}
		 	System.out.println();
		 }
	}
}

class T12{
	public static void main(String[] args) {
		
          int n = 3;
          int num = 1;

          for(int i=1;i<=n;i++){
          	for(int j=1;j<=n;j++){
          		System.out.print(num);
          		num++;
          	}
          	System.out.println();
          }
	}
}

class  T13{
	public static void main(String[] args) {
		
		 int num  = 5;
		 int first=0,last=1,sum=0;
		 for(int i=0;i<=num;i++){
		 	System.out.println(first+" ");

		 	sum = first+last;
		 	first = last;
		 	last = sum;
		 }

		 System.out.println(first+" "+last);
	}
}

class T14{

	public static void main(String[] args) {
		 
		  int n = 4,data = 1;
		  for(int i=1;i<=n;i++){
		  	data = data*i;
		  }
		  System.out.println(data);
	}
}

class T15{

	public static void main(String[] args) {
		
		 for(int num=2;num<=100;num++){

		 	boolean isPrime = true;

		 	for(int i=2;i<=num/2;i++){
		 		if(num%i==0){
		 			isPrime = false;
		 			break;
		 		}
		 	}
		 	if(isPrime){
		 		System.out.println(num+" ");
		 	}
		 }
	}
}

class T16{

     public static int count(int n){
     	int c = 0;
     	while(n!=0){
     		c++;
     		n = n/10;
     	}
     	return c;
     }

     public static int pow(int n,int p){
         
           int data  = 1;
           for(int i=1;i<=p;i++){
           	data = data*n;
           }
           return data;
     }
	public static void main(String[] args) {
		
           int num = 145;
           int temp = num;
           int rem = 0;
           int sum = 0;
           int value = count(num);
           while(num!=0){
           	rem = num%10;
           	int data = pow(rem,value);
           	sum = sum+data;

           	num = num/10;
          }
          if(temp==sum){
          	System.out.println("is armstrong number that!");
          }else{
          	System.out.println("not armstrong number that!");
          }

	}
}

class A1{

	public A1(){
		System.out.println("parent constructor");
	}

	public void show(){
		System.out.println("A1 parent");
	}
}

class B1 extends A1{

	public B1(){
		System.out.println("child B1 constructor");
	}

	public void demo(){
		System.out.println("B1  child");
	}
}

class C2 extends B1{

     public C2(){
		System.out.println("child C1 constructor");
	}

	public void sum(){
		System.out.println("C1 child");
	}

	public static void main(String[] args) {
		
		  C2 c = new C2();
	}
}


interface Vehicle1{

	 void demo();
}

interface Daata {
	void show();
}

class AAnimal implements Vehicle1,Daata{

     public void show(){
     	System.out.println("show method");
     }

    public void demo(){
     	System.out.println("demo method");
     }
	public static void main(String[] args) {
		
		 Daata data = new AAnimal();
		 data.show();

	}
}


abstract class Var{
	 abstract void withDraw();
}

class ATM extends Var{

	void withDraw(){
		System.out.println("ATM is withdrawing");
	}
}

class SBI extends Var{

	  void withDraw(){
	  	System.out.println("SBI is withdrawing fast");
	  }

	  public static void main(String[] args) {
	  	
	  	  ATM a = new ATM();
            a.withDraw();
	  }
}

abstract class ExampleOfAbstract{

	public void demo(){
		System.out.println("demo is abstract method");
	}
}

class DemoTest{

	public static void main(String[] args) {
		
		 ExampleOfAbstract example = new ExampleOfAbstract(){

		 };example.demo();
	}
}

class CheckPallindromeNumber{
	public static void main(String[] args) {
		
		 int n = 556663;
		 int temp = n;
		 int rev = 0;

		 while(n!=0){
		 	int rem  = n%10;
		 	rev = rev*10+rem;
		 	n = n/10;
		 }

		 if(temp==rev){
		 	System.out.println("is pallindrme");
		 }
          else{
          	System.out.println("not pallindrome");
          }
		 // System.out.println("reverse number"+rev);
	}
}

class SumOfDigitsCount{
	public static void main(String[] args) {
		
		  int n = 1123456;
		  int sum = 0;

		  while(n!=0){
		  	
		  	int rem = n%10;
		  	sum = sum+rem;
		  	n = n/10;
		  }
		  System.out.println("sum number "+sum);
	}
}

class MD{
	public static void main(String[] args) {
		int n = 6;
		for(int i=0;i<=n;i++){
			for(int j=0;j<=n-i;j++){
				System.out.print(" ");
			}
			for(int k=0;k<=i;k++){
				System.out.print("* ");
			}
			System.out.println();
		}
		for(int i=n;i>=0;i--){
			for(int j=0;j<=n-i;j++){
				System.out.print(" ");
			}
			for(int k=i;k>=0;k--){
				System.out.print("* ");
			}
			System.out.println();
		}
	}
}

class MD1{
	public static void main(String[] args) {
		
		  int n = 5;
		  int num = 1;;
		  for(int i=0;i<=n;i++){
		  	for(int j=1;j<=i;j++){
		  		System.out.print(num);
		  		num++;
		  	}
		  	System.out.println();
		  }
	}
}

class MD3{
	public static void main(String[] args) {
		
		 int n = 6;
		 for(int i=0;i<=n;i++){
		 	for(int j=1;j<=n-i;j++){
		 		System.out.print(" ");
		 	}
		 	for(int k=1;k<=i;k++){
		 		System.out.print(k);
		 	}
		 	for(int k=i-1;k>=1;k--){
                  System.out.print(k);
		 	}
		 	System.out.println();
		 }
	}
}
class MD4{
	public static void main(String[] args) {
		
		  int n = 6;
		  for(int i=0;i<=n;i++){
		  	for(char ch='A';ch<'A'+i;ch++){
		  		System.out.print(ch);
		  	}
		  	System.out.println();
		  }
	}
}

class MD5{
	public static void main(String[] args) {
		  int n = 6;
		  for(int i=1;i<=n;i++){
		  	 for(int j=1;j<=n-i;j++){
		  	 	System.out.print(" ");
		  	 }
		  	 for(int k=1;k<=i;k++){
		  	 	System.out.print(k);
		  	 }
		  	 System.out.println();
		  }
	}
}

class MD6{
	public static void main(String[] args) {
		 
		  int n = 5;
		  int num=1;
		  for(int i=1;i<=n;i++){
		  	for(int j=1;j<=i;j++){
		  		System.out.print(i);
		  	}
		  	System.out.println();
		  }
	}
}

class MD7{
	public static void main(String[] args) {
		  int n = 5;
		  int num=1;
		  for(int i=1;i<=n;i++){
		  	for(int j=1;j<=i;j++){
		  		System.out.print(num);
		  		num++;
		  	}
		  	System.out.println();
		  }
	}
}

class MD8{
	public static void main(String[] args) {
		 
		  int n = 6;
		  for(int i=1;i<=n;i++){
		  	for(int j=n;j>=i;j--){
		  		System.out.print(j);
		  	}
		  	System.out.println();
		  }
	}
}

// Find maximum and minimum element

// Find second maximum and second minimum element

// Reverse an array

// Rotate array (left & right)

// Shift all zeros to end

// Merge two arrays

// Find duplicate elements

// Find non-duplicate (unique) elements

// Find missing number in array (1–n range)

// Find frequency of each element

// Sort array without using predefined methods

// Find pair of elements whose sum is a given number (Two Sum problem)

// Find common elements between two arrays

// Find intersection and union of two arrays


class MM{
	public static void main(String[] args) {
		
		 int arr[] = {1,2,3,4,5,6};
		 int max = arr[0];
		 int secondMax = arr[0];
		 for(int i=0;i<arr.length;i++){
		 	 if(max<arr[i]){
		 	 	max = arr[i];
		 	 }
		 }
		 for(int j=0;j<arr.length;j++){
		 	if(secondMax<arr[j] && arr[j]<max){
		 		secondMax = arr[j];
		 	}
		 }
		 System.out.println("maximum element " +max);
		 System.out.println("second maximum element " +secondMax);
	}
}

class MinElement{
	public static void main(String[] args) {
		 
		 int arr[] = {1,2,3,4,5,6,0};
		 int min = arr[0];
		 int secondMin = arr[0];

		 for(int i=0;i<arr.length;i++){
		 	if(min>arr[i]){
		 		min = arr[i];
		 	}
		 }
		 for(int j=0;j<arr.length;j++){
		 	if(min>arr[j] && secondMin>arr[j]){
		 		secondMin = arr[j];
		 	}
		 }
		 System.out.println(min+" ");
		 System.out.println(secondMin+" ");
	}
}

class MPS{
	public static void main(String[] args) {
		 int arr[] = {1,2,3,4,5,6};
		 int temp = arr[arr.length-1];

		 for(int i=arr.length-1;i>0;i--){
		 	arr[i] = arr[i-1];
		 }

		 // arr[arr.length-1] = temp;
		 arr[0] = temp;

		 for(int i=0;i<arr.length;i++){
		 	System.out.println(arr[i]);
		 }
	}
}

class PMS2{
	public static void main(String[] args) {
		 int arr[] = {1,2,3};
		 int arr1[] = {4,5,6};

		 int mergeArray[] = new int[arr.length+arr1.length];

		 for(int i=0;i<arr.length;i++){
		 	 mergeArray[i] = arr[i];
		 }
		 for(int i=0;i<arr1.length;i++){
		 	mergeArray[arr.length+i] = arr1[i];
		 }

		 for(int i=0;i<mergeArray.length;i++){
		 	System.out.println(mergeArray[i]+" ");
		 }
	}
}

class PMS4{
	public static void main(String[] args) {
		
		 int arr[] = {1,2,3,5,1,2,6,8,3,2,9,10};
		 boolean visited[] = new boolean[arr.length];

		 for(int i=0;i<arr.length;i++){
		 	 if(visited[i])
		 	 	continue;

		 	 int count = 1;

		 	 for(int j=i+1;j<arr.length;j++){
		 	 	 if(arr[i]==arr[j]){
		 	 	 	count++;
		 	 	 	visited[j] = true;;
		 	 	 }
		 	 }
		 	 if(count==1){
		 	 	System.out.println(arr[i]+" ");
		 	 }
		 }
	}
}

class MPS5{
	public static void main(String[] args) {
		int arr[]  = {1,2,3,4,10};
		int n = 10;
         
		for(int i=1;i<=n;i++){
           boolean found = true;

             for(int j=0;j<arr.length;j++){
             	 if(arr[j]==i){
             	 	found = false;
             	 	break;
             	 }
             }
             if(found){
             	System.out.println(i);
             }
		}
	}
}

class MPS6{
	public static void main(String[] args) {
		
		int arr[] = {1,2,3,4,5,6,7,8,9};
		int target = 10;

		for(int i=0;i<arr.length;i++){
			for(int j=i+1;j<arr.length;j++){
				 if(arr[i]+arr[j]==target){
				 	System.out.println(arr[i]+"+"+arr[j]+" = "+target);
				 }
			}
		}
	}
}

class MPS7{
	public static void main(String[] args) {
		
		 int arr[] = {1,2,3,4,5,6};
		 int arr1[] = {4,5,7,1,3,5};

		 for(int i=0;i<arr.length;i++){
		 	for(int j=0;j<arr1.length;j++){
		 		if(arr[i]==arr1[j]){
		 			System.out.println(arr[i]);
		 		}
		 	}
		 }
	}
}


class MPS8{
	public static void main(String[] args) {
		
		int arr[] = {1,2,0,5,2,0,5,4,0};
		int j = 0;
		for(int i=0;i<arr.length;i++){
			if(arr[i]!=0){
				int temp = arr[i];
				arr[i] = arr[j];
				arr[j]  = temp;

				j++;
			}
		}

        for(int i=0;i<arr.length;i++){
        	System.out.println(arr[i]);
        }
	}
}

// Reverse a string (loop & recursion)

// Palindrome string check

// Count vowels and consonants

// Count words in a string

// Count occurrence of each character

// Remove duplicate characters

// Find duplicate characters

// Check anagram strings

// Check pangram string

// Swap two strings without using 3rd variable

// Convert first letter of each word to uppercase (Title Case)

// Remove all spaces from string

// Convert string to char array (without toCharArray)

// Print all substrings of string

// Find longest word in string


class MPS9{
	public static void main(String[] args) {
		 String s = "monika";
		 char ch[] = s.toCharArray();

		 for(int i=ch.length-1;i>=0;i--){
		 	System.out.println(ch[i]);
		 }
	}
}


class MPS10{
	public static void main(String[] args) {
		
		 String s = "eyes";
		 char ch[] = s.toCharArray();

		 boolean isPallindrome = true;
		 int start=0,last=ch.length-1;

		 for(int i=0;i<ch.length;i++){
		 	if(ch[start]!=ch[last]){
		 		isPallindrome = false;
		 		break;
		 	}
		 }
		 if(isPallindrome){
		 	System.out.println("is pallindrome");
		 }else{
		 	System.out.println("not isPallindrome");
		 }

	}
}

class MPS11{
	public static void main(String[] args) {
		
		 String s = "monikajk";
		 char ch[] = s.toCharArray();

		 int vowel=0,consonant=0;
		 for(int i=0;i<ch.length;i++){
		 	if(ch[i]=='a'||ch[i]=='e'||ch[i]=='i'||ch[i]=='o'||ch[i]=='u'){
		 		vowel++;
		 	}
		 	else{
		 		consonant++;
		 	}
		 }
		 System.out.println("vowel"+vowel);
		 System.out.println("consonant"+consonant);
	}
}

class MPS12{
	public static void main(String[] args) {
		 
		  String s = "monika@123";
		  char ch[] = s.toCharArray();
		  int words = 0,digit=0;

		  for(int i=0;i<ch.length;i++){
		  	if(((ch[i]>='a' && ch[i]<='z')||(ch[i]>='A'&& ch[i]<='Z'))){
		  		words++;
		  	}else{
		  		digit++;
		  	}
		  }
		  System.out.println("words"+words);
		  System.out.println("digits"+digit);
	}
}


class MPS13{
	public static void main(String[] args) {
		
		 String s = "aabbbcccdddeeee";
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
		 	 System.out.println(ch[i]+"count"+count);
		 }
	}
}


class MPS14{
	public static void main(String[] args) {
		
		 String s = "aabbccdddeeekffggg";
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
		 	 if(count==1){
		 	 	System.out.println(ch[i]);
		 	 }
		 }
	}
}


class MPS15{
	public static void main(String[] args) {
		
		 String s = "monika rajput";
		 String result = "";
           char ch[] = s.toCharArray();

           for(int i=0;i<ch.length;i++){
           	if(ch[i]!=' '){
           		result = result+ch[i];
           	}
           }
           System.out.println(result);

	}
}


class MPS16{
	public static void main(String[] args) {
		
		String s = "monika";
		for(int i=0;i<s.length();i++){
			System.out.println(s.charAt(i));
		}
	}
}

class MPS17{
	public static void main(String[] args) {
		
		 String s = "monika";
		
		 for(int i=0;i<s.length();i++){
		 	for(int j=i+1;j<s.length();j++){
		 		System.out.println(s.substring(i,j));
		 	}
		 }
	}
}

class ButterFly{
	public static void main(String[] args) {
		
		 int n = 6;
		 for(int i=1;i<=n;i++){
		 	for(int j=1;j<=i;j++){
		 		System.out.print("*");
		 	}
		 	for(int j=1;j<=2*(n-i);j++){
		 		System.out.print(" ");
		 	}
		 	for(int j=1;j<=i;j++){
		 		System.out.print("*");
		 	}
		 	System.out.println();
		 }
		 for(int i=n-1;i>=1;i--){
		 	for(int j=1;j<=i;j++){
		 		System.out.print("*");
		 	}
		 	for(int j=1;j<=2*(n-i);j++){
		 		System.out.print(" ");
		 	}
		 	for(int j=1;j<=i;j++){
		 		System.out.print("*");
		 	}
		 	System.out.println();
		 }
	}
}
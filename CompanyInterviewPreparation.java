import java.util.*;
import java.io.File;
// import java.lang.reflect.Field;
// abstract class Atm{

// 	abstract void withDraw(Double amount);
// }

// class Machine extends Atm{

// 	void withDraw(Double amount){
// 		System.out.println("amount is withdrawing ====> " +amount);
// 	}

// 	public static void main(String[] args) {
		
// 		  Machine machine = new Machine();
// 		  machine.withDraw(1000000.00);
// 	}
// }

// import java.util.*;
// class ArrayData{
// 	public static void main(String[] args) {
		
// 		 String [] students = new String[10];
// 		 students[0] = "monika";
// 		 students[1] = "pawan";
// 		 students[2] = "pawanika";
// 		 students[3] = "pawanu";
// 		 students[4] = "monu";
// 		 students[5] = "kanu";
// 		 students[6] = "sdfgh";
// 		 students[7] = "asdfgh";
// 		 students[8] = "qwefgb";
// 		 students[9] = "sdfghjk";
		

// 		 for(int i=0;i<students.length;i++){
// 		 	if(students[i]!=null){
// 		 		System.out.println(students[i]);
// 		 	}
// 		 }
	
// 	}
// }


// class StudentDataCollect{

// 	public static void main(String[] args) {
		
// 		 ArrayList<String>student = new ArrayList<>();

// 		student.add("8");
// 		student.add("10");
// 		student.add("1");
// 		student.add("5");
// 		student.add("2");
// 		student.add("5");
    
        

// 	}
// }
// class Student{

// 	private String name;
// 	private String address;

// 	public void setName(String n){

//           name = n;
// 	}

// 	public String getName(){
// 		return name;
// 	}

// 	public void setAddress(String add){
       
//          address = add;
// 	}

// 	public String getAddress(){
// 		return address;
// 	}
// }


// class AccessData{
// 	public static void main(String[] args) {
		
// 		 Student student = new Student();

// 		 student.setName("Monika");
// 		 student.setAddress("Banglore");

// 		 System.out.println(student.getName());
// 		 System.out.println(student.getAddress());
// 	}
// }




// class Student {
//     private String name = "Mona";
// }

//  class Main {
//     public static void main(String[] args) throws Exception {
//         Student s = new Student();

//         Field field = Student.class.getDeclaredField("name");
//         field.setAccessible(true);  //  Forcefully access private variable

//         String value = (String) field.get(s);
//         System.out.println("Name: " + value);  // Output: Mona
//     }
// }


// class Zoo{

// 	Zoo(){
// 		System.out.println("default constructor");
// 	}

// 	 Zoo(String name){
// 		System.out.println("non parameteriz constructor");
// 	}

// 	 static void cat(String name){
// 		System.out.println("cat is generating sound =====> "+name);
// 	}

// 	public static void cat(int n){
// 		System.out.println("cat is getting number =====> "+n);
		
// 	}

	// public static void main(String[] args) {
		
	// 	 // Zoo zoo = new Zoo();
	// 	 // zoo.cat("monika");
	// 	Zoo.cat("Pawanika");
	// }
// }


// class Tester{

// 	public static void main(String[] args) {
		
// 		Zoo zoo  = new Zoo("monika");
// 		zoo.cat("Monika");

// 	}
// }


// class MethodOverridding{

// 	   public Object start(){
// 		System.out.println("parent ki method start");
// 		return new  MethodOverridding();
// 	}
// }

// class ChildKiClass extends MethodOverridding{

// 	   public String start(){

// 		return "child ki method start";
// 	}

// 	public static void main(String[] args) {
		
// 		ChildKiClass child = new ChildKiClass();
// 		child.start();
// 	}
// }


// interface Parent{
//    default void safe(){
//    	System.out.println("parent is safe");
//    }
	
// }

// interface Papa {

// 	 default void safe(){
// 	 	System.out.println("papa is calling");
// 	 }
// }
// class Child implements Parent,Papa{

//        public void safe(){
// 	   Papa.super.safe();
// 	}


// 	public static void main(String[] args) {
		
//        Child child = new Child();
//        child.safe();
// 	}
// }


// class C
// {

// 	public void show(){
// 		System.out.println("Parent class method running");
// 	}
// }


// class P extends C {

// 	public void show(){
// 		super.show();
// 		System.out.println("child class method show");
// 	}

// 	public static void main(String[] args) {
		
// 		P p = new P();

// 		p.show();

		
// 	}
// }

// class Pitaji{

// 	  void show(){
// 	 	System.out.println("parent class is method");
// 	 }
// }

// class Betaji extends Pitaji{

	

// 	public void show(){
// 		 super.show();
// 		System.out.println("child class method is calling");
	
// 	}


// 	public static void main(String[] args) {
		
// 		Betaji beta = new Betaji();
// 		beta.show();
// 	}
// }


//   class MonikaClass{

// 	 public static void show(){
// 	 	System.out.println(" show method() ");
// 	 }

// 	 public static void main(String[] args) {
	 	
// 	 	 MonikaClass.show();
// 	 }
// }


//   abstract   class Demo{

// 	abstract  void  deta();
//     abstract void mult();
// 	public void add(){
// 		System.out.println("add method()");
// 	}
// }

// class Delta  extends Demo{

// 	void deta(){
// 		System.out.println("deta method()");
// 	}

//     void mult(){
//     	System.out.println("method is going mult");
//     }
// 	public static void main(String[] args) {
		
// 		 Delta delta = new Delta();
// 		 delta.add();
// 	}
// }


// abstract class Payment{

// 	abstract void makePayment();
// }

// class DebitCard extends Payment{

// 	public void makePayment(){

// 		System.out.println("debit card");
// 	}
// }

// class CreditCard extends Payment{

// 	public void makePayment(){
// 		System.out.println("credit card");
// 	}

// 	public static void main(String[] args) {
		
// 		Payment payment = new CreditCard();
// 		payment.makePayment();
// 	}
// }


// class ListData{

// 	public static void main(String[] args) {
		
// 		 List<String> stdData = new ArrayList<>();
// 		 stdData.add("1");
// 		 stdData.add(1);
// 		 stdData.add("monika");
// 		 stdData.add("rajput");

// 	}
// }


class Frequency{
	public static void main(String[] args) {
		
		 String s = "monihj0000ka"; 
		 char ch[] = s.toCharArray();

		 for(int i=0;i<ch.length;i++){
		 	int count =  1;

		 	if(ch[i]=='0')
		 		continue;

		 	for(int j=i+1;j<ch.length;j++){
		 		if(ch[i]==ch[j]){
		 			count++;
		 			ch[j] = '0';
		 		}
		 	}
		 	System.out.println(ch[i]+" ======> "+count);
		 }
	}
}


class UpperToLower{

	public static void main(String[] args) {
		
		 String s = "MONIKAP";
		 char ch[] = s.toCharArray();

         for(int i=0;i<s.length();i++){

         	ch[i] = (char)(ch[i]+32);

         	System.out.print(ch[i]);
         }

	}
}


class WrapperClasses{

	public static void main(String[] args) {
		
		int a = 10;
		Integer obj = a;

		System.out.println(obj);
	}
}


class FindMin{

	public static void main(String[] args) {
	
	    int a[] = {1,2,3,4,5,6};
	    int m = a[0];
	    System.out.println(minimum(a,m));

	}

	public static int minimum(int arr[] , int min){

		for(int i=0;i<arr.length;i++){
			if(min<arr[i]){
				min = arr[i];
			}
		}
		return min;
	}
}

class SortArray{

	public static void main(String[] args) {
		
		 int arr[] = {0,5,8,2,0,2,5,4,7};
		 int []  sortedArray = sortingArray(arr);
		 System.out.println("sorted data");
		 printData(sortedArray);
		 duplicateFind(sortedArray);
     }

     public static int[] sortingArray(int ar[]){

     	  for(int i=0;i<ar.length;i++){

     	  	 for(int j=i+1;j<ar.length;j++){

     	  	 	if(ar[i]>ar[j]){
     	  	 		int temp = ar[i];
     	  	 		ar[i] = ar[j];
     	  	 		ar[j] = temp;
     	  	 	}
     	  	 }
     	  }
     	  return ar;
     }

     public static int[] duplicateFind(int arrr[]){

     	 for(int i=0;i<arrr.length;i++){

     	 	int count = 1;
     	 	if(arrr[i]==-1)
     	 		continue;

     	 	for(int j=i+1;j<arrr.length;j++){
     	 		if(arrr[i] ==arrr[j]){
     	 			count++;
     	 			arrr[j] = -1;
     	 		}
     	 	}
     	 	if(count>1){
     	 		System.out.println("duplicate values "+arrr[i]);
     	 	}
     	 }
     	 return arrr;
     }

     public static void printData(int arrr[]){
     	 for(int n : arrr){
     	 	System.out.println(n + " ");
     	 }
     }
}


class SecondLargest{

	public static void main(String[] args) {
		
		 int arr[] = {1,2,3,4,5,6,7,8,9};
		 for(int i=0;i<arr.length;i++){
		 	for(int j=i+1;j<arr.length;j++){
		 		if(arr[i] > arr[j]){
		 			int temp = arr[i];
		 			arr[i] = arr[j];
		 			arr[j] = temp;
		 		}
		 	}
		 }
		 System.out.println("second largest element is  " +arr[2]);
	}
}

class SumOfArray{

	public static void main(String[] args) {
		
		 int arr[] = {1,2,3,4,5,6,7};
		 int even = 0,odd=0,count=0;

		 for(int i=0;i<arr.length;i++){
		 	if(i%2!=0){
		 		even++;
		 	}
		 	else {
		 		odd++;
		 	}
		 }
		 System.out.println("sum of total nummbers ====> "+ count);
		 System.out.println("even ====> "+ even);
		 System.out.println("odd =====> "+ odd);

	}
}


class S1{

	public static String reverseString(String s){

		for(int i=s.length()-1;i>=0;i--){
           
            System.out.println(s.charAt(i));
         }
         return s;
	}
	public static void main(String[] args) {
		
         String rev = "monika";
         reverseString(rev);
	}
}

class S2{

	public static void main(String[] args) {
		
		String s = "121";
		char ch[] = s.toCharArray();
        int start = 0,last = ch.length-1;
        boolean temp = true;

        for(int i=0;i<ch.length-1;i++){
        	if(ch[start]!=ch[last]){
              temp = false;
              break;
        	}
        }
        if(temp){
        	System.out.println("is pallindrome");
        }
        else {
        	System.out.println("not pallindrome");
        }
	}
}


class  S3{

	public static void main(String[] args) {
		
		   String s = "monikamooookjj";
		   char ch[] = s.toCharArray();

		   for(int i=0;i<ch.length-1;i++){

		   	  int count = 1;
              
              if(ch[i]=='0')
              	continue;

		   	  for(int j=i+1;j<ch.length;j++){
		   	  	  if(ch[i]==ch[j]){
		   	  	  	count++;
		   	  	  	ch[j] = '0';
		   	  	  }
		   	  }

		   	  if(count>1){
		   	  	System.out.println(ch[i]);
		   	  }
		   }
	}
}


class ArmStrongNumberProgram{

    public static int count(int n){
    	int count = 0;
    	while(n!=0){

    		n = n/10;
    		count++;
    	}
    	return count;
    }

    public static int power(int n,int p){
    	int data  = 1;
    	for(int i=1;i<=p;i++){
    		 data  = data*n;
    	}
    	return data;
    }
	public static void main(String[] args) {
		
		 for(int num=1;num<=100;num++){
		 int rem =0, sum = 0;
		 int temp = num;
		 int n = num;
		 int value = count(num);
		 while(n!=0){

		 	rem = n % 10;
		 	int fun = power(rem,value);
		 	sum = sum + fun;
		 	n = num/10; 
		 }
		 if(sum==temp){
		 	System.out.println(temp);
		 }
		 else{
		 	System.out.println("not arm strong number");
		 }
	}
  }
}


class PrintProgram{

	public static void main(String[] args) {
		
		 for(int num=2;num<=100;num++){

		 	boolean isPrime = true;

		 	for(int i=0;i<=num/2;i++){
		 		if(num%i==0){
		 			isPrime = false;
		 			break;
		 		}
		 	}
		 	if(isPrime){
		 		System.out.println(num);
		 	}
		 }
	}
}


class StrPallindrome{
	public static void main(String[] args) {
		
		 String s = "121";
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
		 }
		 else {
		 	System.out.println("not pallindrome");
		 }
	}
}


class FindDuplicateCharacter{

	public static void main(String[] args) {
		
		 String s = "monikaanim";
		 char ch[] = s.toCharArray();

		 for(int i=0;i<ch.length;i++){
		 	 int count = 1;

		 	 for(int j=i+1;j<ch.length;j++){
		 	 	 if(ch[i]==ch[j]){
		 	 	 	count++;
		 	 	 	ch[j] = '0';
		 	 	 }
		 	 }
		 	 if(count>1 && ch[i]!='0'){
		 	 	System.out.println(ch[i]);
		 	 }
		 }
	}
}


class FirstNon{
	public static void main(String[] args) {
		
		  String s = "monimafeejnvjkdvjkeamifee";
		  char ch[] = s.toCharArray();

		  for(int i=0;i<ch.length-1;i++){
		  	 int count = 0;

		  	 for(int j=i+1;j<ch.length;j++){
		  	 	 if(ch[i]==ch[j]){
		  	 	 	 count++;
		  	 	 	 ch[j] = '0';
		  	 	 }
		  	 }
		  	 if(count==1){
		  	 	System.out.println("first non repited character "+ch[i]);
		  	 	return;
		  	 }
		  }
	}
}


class DuplicateArray{

    public static int[] sorting(int a[]){
    	for(int i=0;i<a.length;i++){
    		for(int j=i+1;j<a.length;j++){
    			 if(a[i] > a[j]){
    			 	int temp = a[i];
    			 	a[i] = a[j];
    			 	a[j] = temp;
    			 }
    		}
    	}
    	 return a;
    }

public static void main(String[] args) {
		
		 int arr[] = {1,2,3,3,4,5,6,1};
		 System.out.println(sorting(arr));
		 
	}
}


class ReverseArray{

	public static void main(String[] args) {
		
		 int arr[] = {1,2,3,1,4,5,2,3,9,6,6,0,0};
		 for(int i=0;i<arr.length;i++){
		 	 
		 	 for(int j=i+1;j<arr.length;j++){
		 	 	 if(arr[i] == arr[j]){
		 	 	 	arr[j] = -1;
		 	 	 }
		 	 }
		 }
		 for(int i=0;i<arr.length;i++){
		 	 if(arr[i]!=-1){
		 	 	System.out.println(arr[i]+ " ");
		 	 }
		 }
	}
}


class StrDuplicate{
	public static void main(String[] args) {
		
		 String s = "aabbcccddeessg";
		 char ch[] = s.toCharArray();

		 for(int i=0;i<ch.length-1;i++){
		 	 for(int j=i+1;j<ch.length;j++){
		 	 	 if(ch[i] > ch[j]){
		 	 	 	 char c = ch[i];
		 	 	 	 ch[i] = ch[j];
		 	 	 	 ch[j] = c;
		 	 	 }
		 	} 
		 }

		 for(int i=0;i<ch.length;i++){
		 	System.out.println(ch[i]);
		 }
	}
}

class FindMaximumElement{

	public static void main(String[] args) {
		
		int arr[] = {1,2,3,4,5,6,0,9};
		int m = arr[0];
		System.out.println(maximum(arr,m));
	}

	public static int maximum(int arr[],int max){
     
         for(int i=0;i<arr.length;i++){
         	 if(max<arr[i]){
         	 	 max = arr[i];
         	 }
         }
         return max;
	}
}

class SecondMaximum{

	public static void main(String[] args) {
		
         int arr[] = {1,2,3,4,5,6,9,10};
         int[] secondData = secondMaximum(arr);
         System.out.println(secondData[1]);
	}

	public static int[] secondMaximum(int arr[]){
		 for(int i=0;i<arr.length;i++){
		 	for(int j=i+1;j<arr.length;j++){
		 		if(arr[i]<arr[j]){
		 			int temp  = arr[i];
		 			arr[i] = arr[j];
		 			arr[j] = temp;
		 		}
		 	}
		 }
		 return arr;
	}
}


class SumArray{
	public static void main(String[] args) {
		
		 int a[] = {1,2,3,4,5,6};
		 int sum = sumArrayValue(a);
		 System.out.println(sum);
	}

	public static int sumArrayValue(int arr[]){

		 int count = 0;
		 for(int i=0;i<arr.length;i++){
		 	if(i%2==0){
		 	 count = count+arr[i];
		 	}
		 }
		 return count;
	}
}


// class SearchingValue{
// 	public static void main(String[] args) {
		
// 		 Scanner sc = new Scanner(System.in);
//          System.out.println("enter size :");
//          int arr[] = new int[sc.nextInt()];

//          System.out.println("enter elements");
//          for(int i=0;i<arr.length;i++)
//           arr[i] = sc.nextInt();

//          System.out.println("search");
//          int key = sc.nextInt();

//          for(int i=0;i<arr.length;i++){
//          	if(arr[i]==key){
//          		System.out.println("index found" + arr[i]); 
//          		return;
//          	}
//          }
//          System.out.println("not found");
// 	}
// }


class ElementSearching{

	public static void main(String[] args) {
		

		  int arr[] = {1,2,3,4,5,6,7};
		  int value = 5;
          

		  for(int i=0;i<arr.length;i++){
		  	 if(value==arr[i]){
		  	 	System.out.println("index found "+arr[i]);
		  	 	return;
		  	 }
		  }

		  System.out.println("Not found. : ");
	}
}


class CopyArray{
	public static void main(String[] args) {
		
		 int arr[] = {1,2,3,4,5,6,6,1,4,4,4,4};

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

		 	 System.out.println(arr[i]+ "========> "+count);
		 }
	}
}

class MergeTwoArray{

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

		 for(int num : mergeArray){
		 	System.out.println(num+ " ");
		 }
	}
}


class MyErrorExample {
    public static void main(String[] args) {
        while (true) {
            MyErrorExample.main(null);  // Infinite recursion
        }
    }
}


class FileExample{

	public static void main(String[] args) {
		
		File file = new File("example.text");
		if(file.exists()){
			System.out.println("file is exist hai");
		}
		else {
			System.out.println("file is  not exist");
		}
	}
}


class ExampleData{

	 static void main(String[] args) {
		
		 System.out.println("Monika Rajput");
	}
}


class StringExample{

	public static void main(String[] args) {
		
		 String s = "PawanjiMyLove";
		 // System.out.println(s.startWith(" "));
	}
}


class ToStringMethodExample implements Cloneable{

    int n = 10;
    String name = "monika";

	public static void main(String[] args)throws CloneNotSupportedException {
		
		ToStringMethodExample example = new ToStringMethodExample();
		ToStringMethodExample example1 = (ToStringMethodExample)example.clone();

		System.out.println(example1.n+"  "+example1.name);
	}
}



class ExceptionExample{

	public static void main(String[] args) {
		
		 String name = null;

		System.out.println(name.length());
	}
}


class ExampleAirthMetic{

	public static void main(String[] args) {
		
		 int a = 10;
		 int b = 0;

		 System.out.println(a/b);
	}
}


class ArrayIndexOutOfBonds{

	public static void main(String[] args) {
		
		 int arr[] = {1,2,3,4};

		 System.out.println(arr[5]);
	}
}

class  ClassNotFoundException{

	public static void main(String[] args) {
		
		 System.out.println();
	}
}

class MyCustomException extends RuntimeException{

	public MyCustomException(String message){
		super(message);
	}
}


class MyDemoCustomException{

	 public static void  airthmeticOperation(int a,int b){

	 	  if(a==-1){

	 	  	   throw new MyCustomException("This is not allowed");
	 	  }
	 	  else  {
	 	  	System.out.println("This is allowed here");
	 	  }
	 }

	 public static void main(String[] args) {
	 	
	 	 airthmeticOperation(1,10);
	 }
}


class PM{

    public static String reverseString(String s){

    	 for(int i=s.length()-1;i>=0;i--){

    	 	 System.out.println(s.charAt(i));
    	 }
    	 return s;
    }
	public static void main(String[] args) {
		
         String s = "monika";

         reverseString(s);
	}
}

class PM1{

    public static void frequecyCount(String s , int count){
        StringBuilder sb = new StringBuilder(s);
    	for(int i=0;i<s.length();i++){

    		 count = 1;

             if(sb.charAt(i)=='0')
             	continue;

    		 for(int j=i+1;j<sb.length();j++){
    		 	 if(sb.charAt(i)==sb.charAt(j)){
    		 	 	count++;
    		 	 	sb.setCharAt(j,'0');
    		 	 }
    		 }
    		 System.out.println(sb.charAt(i)+" "+count);
    	}
    }
	public static void main(String[] args) {
		
		 String s = "aabbsccfkaa";
		 int count = 1;

		 frequecyCount(s,count);
	}
}

class PM2{

    public static String firstNonRepitive(String s){
        
    	for(int i=0;i<s.length();i++){
            
    		int count = 0;

    		for(int j=0;j<s.length();j++){
              
               if(s.charAt(i)==s.charAt(j)){
               	  count++;
               }
    		}

    		if(count==1){
    			System.out.println("first non repitive character "+s.charAt(i));
    			return null;
    		}
    	}

    	return  s ;
    }
	public static void main(String[] args) {
		
		String s  = "monikamsjoain";
        
        System.out.println(firstNonRepitive(s));
	}
}

class  PM4{

	public static void main(String[] args) {
		
		String s = "monika";
		char ch[] = s.toCharArray();

		for(int i=0;i<ch.length;i++){

			ch[i] = (char)(ch[i] - 32);

			System.out.println(ch[i]);
		}
	}
}

class PM5{

    public static void findDuplicate(String s){
         

         StringBuilder sb = new StringBuilder(s);

    	 for(int i=0;i<sb.length();i++){

    	 	 // int c = 1;

    	 	 for(int j=i+1;j<sb.length();j++){

    	 	 	 if(sb.charAt(i)==sb.charAt(j)){
    	 	 	 	// c++;
    	 	 	 	sb.setCharAt(j,'0');
    	 	 	 }
    	 	 }
    	 	 if(sb.charAt(i)!='0'){
    	 	 	System.out.println(s.charAt(i));
    	 	 }
    	 }
    }
	public static void main(String[] args) {
		
		 String s = "monikamakdsd";

		 findDuplicate(s);
	}
}


class PM6{

	public static void main(String[] args) {
		
		 String s = "nayan";
		 char ch[] = s.toCharArray();
         
         boolean temp = true;
		 int start = 0, last = ch.length-1;

         for(int i=0;i<ch.length;i++){
         	 if(ch[start]!=ch[last]){
         	 	 temp = false;
         	 	 break;
         	 }
         }
         if(temp){
         	System.out.println("is  pallindrome");
         }
         else {

         	 System.out.println("not pallindrome");
         }
	}
}


interface ExampleDemo{

	public void sum(int a ,int b);
}

class DemoTest{

	public static void main(String[] args) {
		
		 ExampleDemo  example = (a,b)->System.out.println("method data "+a+" "+b);
		 example.sum(10,20);
	}
}


class ExampleCollection{

	public static void main(String[] args) {
		
		 ArrayList<Integer> list = new  ArrayList<>();

		 list.add(10);
		 list.add(10);
		 list.add(10+20);

		 System.out.println(list);
	}
}



class ArmStrongProgram{

    public static int count(int n){

    	 int count = 0;
    	 while(n!=0){

    	 	 n = n/10;
    	 	 count++;
    	 }
    	 return count;
    }

    public static int pow(int n,int p){

    	int data = 1;
    	for(int i=1;i<=p;i++){

    		data = data * n ;
    	}
    	return data;
    }
	public static void main(String[] args) {
		
		int n = 154,rem,sum=0;
		int temp = n;
		int value  = count(n);

		while(n!=0){

			rem = n%10;
			int data = pow(rem,value);
			sum = sum+data;
			n = n/10;
		}
		if(temp==sum){
			System.out.println("num is arm strong");
		}

		else{
			System.out.println("num is not armstrong");
		}
	}
}

class PrintPrimeNumber{

	public static void main(String[] args) {
		
		  for(int num=2;num<=100;num++){

		  	  boolean isPrime = true;

		  	  for(int i=2;i<=num/2;i++){
		  	  	 if(i%2==0){
		  	  	 	 isPrime  = false;
		  	  	 	 break;
		  	  	 }
		  	  }

		  	  if(isPrime){
		  	  	 System.out.println(num);
		  	  }
		  }
	}
}


class FirstNonRepitive{

	public static void main(String[] args) {
		
		String s = "moonikams";
		char ch[] = s.toCharArray();

		for(int i=0;i<ch.length;i++){
			 int count = 0;

			 for(int j=0;j<ch.length;j++)
			 {
			 	if(ch[i]==ch[j]){
			 		count++;
			 		
			 	}
			 }
			 if(count==1){
			 	System.out.println("first non repitive char " + ch[i]);
			 	return;
			 }
		}
	}
}


class PrintString{

	public static void main(String[] args) {
		
		 String s = "monika@123";
		 char ch[] = s.toCharArray();

		 for(int i=0;i<ch.length;i++){
		 	 if(ch[i]>='0' && ch[i]<='9'){
		 	 	System.out.println(ch[i]);
		 	 }
		 }
	}
}

class PatternProgram{

	public static void main(String[] args) {
		
		 for(int i=1;i<=6;i++){

		 	 for(int j=1;j<=i;j++){

		 	 	System.out.print(i);
		 	 }
		 	 System.out.println();
		 }
	}
}

class ReplaceStringData{

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

// class RemoveFirstCharacter{

// 	public static void main(String[] args) {
		
// 		 String s = "Monika";
// 		 char ch[] = s.toCharArray();
         

// 	}
// }



// class ExampleConstructor{

//     final ExampleConstructor(){

//     	System.out.println("pawanika");
//     }
// 	public static void main(String[] args) {
		
// 		ExampleConstructor example = new ExampleConstructor();
// 	}
// }

class This{

	protected String name = "monika";

	protected void show(){
		System.out.println("monika is growing");
	}
}

class Example extends This{

	 public void display(){
	 	System.out.println(name);
	 	show();
	 }
}

class ProtectedExample{

	public static void main(String[] args) {
		  
		  Example example = new Example();
		  example.display();
	}
}


class ExampleVariable{

    ExampleVariable(){
    	final String name = "monikapawan";
    	System.out.println(name);
    }
	public void show(){
		 int a = 10;
        
		 System.out.println(a);
	}

	public static void main(String[] args) {
		
          int b = 20;
          ExampleVariable variable = new ExampleVariable();
          variable.show();System.out.println(b);
	}
}

class ExampleInstance{

    int a = 10;
    String name = "mona";
	public static void main(String[] args) {
		
        ExampleInstance obj = new ExampleInstance();
        ExampleInstance obj1 = new ExampleInstance();

        // System.out.println(obj.a);
        // System.out.println(obj1.name);

         obj.a = 20;
         obj1.name = "monika";

         System.out.println(obj.a);
         System.out.println(obj1.name);
	}
}

class ExampleClass{

	public static void demo(){
		System.out.println("monika");
	}

	public static void main(String[] args) {
		
		 
		 ExampleClass.demo();
	}
}

 class ExampleFetch{

	public void show(){
		System.out.println("monika rajput");
	}
}

class Demo {

	 public static void main(String[] args) {
	 	
	 	 // Demo demo = new Demo();
	 	 // demo.show();  
	 }
}

class Balance{

	private int balance;
	private String accountNumber;


	public void setBalance(int balance){
		this.balance = balance;
	}

	public void setAccountNumber(String accountNumber){
		this.accountNumber = accountNumber;
	}

	public int getBalance(){
		return balance;
	}

	public String getAccountNumber(){
		return accountNumber;
	}

	public static void main(String[] args) {
		
		 Balance balance = new Balance();
		 balance.setBalance(10000);
		 System.out.println(balance.getBalance());
	}
}

abstract class Bank{
	  abstract void payment();
}
class ExampleAbstraction extends Bank{

    void payment(){
    	 System.out.println("payment has been done");
    }

	public static void main(String[] args) {
		 
		 ExampleAbstraction ex = new ExampleAbstraction();
		 ex.payment();
	}
}


class  ExampleNullPointer{

    String name = null;
	public static void main(String[] args) {
		
		 ExampleNullPointer pointer = new ExampleNullPointer(); 
        System.out.println(pointer.name.length());
	}
}

class ExampleArrayIndexOut{

	public static void main(String[] args) {
	   
	    String s = "monika";
	    int num = Integer.parseInt(s);

	    System.out.println(num);
       	}
}

// class ExampleNullPoint{

// 	 public static void main(String[] args) {
	 	
// 	 	 FileReader file = new FileReader("text.exe");
// 	 	 System.out.println(file);
// 	 }
// }


class ExampleError{

	 public void show(){
	 	 show();
	 }

	 public static void main(String[] args) {
	 	
	 	  ExampleError error = new ExampleError();
	 	  error.show();
	 }
}

class ExamlepCatchBlock{

     public void showData(){
     
          try{
     	  String s = null;
     	  System.out.println(s.length());
     	}
     	catch(NumberFormatException e){
     		System.out.println("exception occur");
     	}
     	catch(ArithmeticException e){
     		System.out.println("null pointer exception occur");
     	}
     	catch(Exception  c){
     		System.out.println("airthmetic exception");
     	}
     }

     public static void main(String[] args) {
     	
          ExamlepCatchBlock block = new ExamlepCatchBlock();
          block.showData();
     }
}

 class ExampleInnerClass{
    
    private static String name = "pawanika";

        private ExampleInnerClass(){
        	System.out.println("outer class of constructor");
        }
	    class Inner{

	    	private Inner(){
	    		System.out.println("inner class of constructor");
	    		System.out.println(name);
	    	}

		public void demo(){
			System.out.println(name);
		}
	}

	public static void main(String[] args) {
		
		 ExampleInnerClass outer = new ExampleInnerClass();
		 ExampleInnerClass.Inner inner = outer.new Inner();
		 inner.demo();

		// ExampleInnerClass.Inner inner = new Inner();
		// inner.demo();
	}
}

class ExampleSingleton{

	  private static ExampleSingleton singleInstance = null;

	  private ExampleSingleton(){
	  	  System.out.println("This is a singleton constructor class");
	  }

	  public static  ExampleSingleton getInstance(){

	  	  if(singleInstance == null){

	  	  	   singleInstance = new ExampleSingleton();
	  	  }
	  	  return singleInstance;
	  }

	  public void show(){

	  	System.out.println("This is  a show method");

	  }

	  public static void main(String[] args) {
	  	
	  	   ExampleSingleton example = ExampleSingleton.getInstance();
	  	   ExampleSingleton ex = ExampleSingleton.getInstance();

	  	   example.show();

	  	   System.out.println(example==ex);

	  }
}

class checkPrime{

	public static void main(String[] args) {
		
		 int n = 29;
		 boolean temp = true;

		 for(int i=2;i<=n/2;i++){
		 	 if(n%i==0){
                
                 temp = false;
                 break;
		 	 }
		 }
		 if(temp){
		 	System.out.println("prime number");
		 }else {
		 	System.out.println("not prime");
		 }
	}
}


class PrintD{

	public static void main(String[] args) {
		
		 String s = "aaccssscbbsddd";
		 char ch[] = s.toCharArray();

		 for(int i=0;i<ch.length-1;i++){
		 	 

            if(ch[i]=='0')
            	continue;

		 	 for(int j=i+1;j<ch.length;j++){
		 	 	 if(ch[i]==ch[j]){
		 	 	 	
		 	 	 	ch[j] = '0';
		 	 	 }
		 	 }
		 	 if(ch[i]!=0){
		 	 	System.out.println(ch[i]);
		 	 }
		 }
	}
}

class ProgramP{

	public static void main(String[] args) {
		
		 int n = 6;
		 for(int i=1;i<=n;i++){
		 	 for(int j=i;j<=n-1;j++){
		 	 	 System.out.print(" ");
		 	 }
		 	 for(int j=1;j<=i;j++){
		 	 	System.out.print(i+" ");
		 	 }
		 	 System.out.println();
		 }
	}
}


class  PrintHollow{

	public static void main(String[] args) {
		
		  for(int i=1;i<=6;i++){

		  	 for(int j=1;j<=6;j++){

		  	 	 if(i==1||i==6||j==1||j==6){
		  	 	 	System.out.print("*");
		  	 	 }
		  	 	 else {
		  	 	 	System.out.print(" ");
		  	 	 }
		  	 }
		  	 System.out.println();
		  }
	}
}

class ProgramNumberIncresing{

	public static void main(String[] args) {
		
		 int num = 1;
          for(int i=1;i<=6;i++){

          	 for(int j=1;j<=i;j++){
          	 	 System.out.print(num);
          	 	 num++;
          	 }

          	 System.out.println();
          }
	}
}

class ButterFlyPattern{

	public static void main(String[] args) {
		
		  int n = 6;

		  //First half
		  for(int i=1;i<=n;i++){
		  	 for(int j=1;j<=i;j++){
		  	 	System.out.print("*");
		  	 }

		  	 for(int k=1;k<=(n-i)*2;k++){
		  	 	System.out.print(" ");
		  	 }

		  	 for(int l=1;l<=i;l++){
		  	 	System.out.print("*");
		  	 }
		  	 System.out.println();
		  }

		  //Second half
		  for(int i=n;i>=1;i--){

		      for(int j=1;j<=i;j++){
		      	System.out.print("*");
		      }
		      for(int k=1;k<=(n-i)*2;k++){
		      	System.out.print(" ");
		      }
		      for(int l=1;l<=i;l++){
		      	System.out.print("*");
		      }
		      System.out.println();
		  }
	}
}

class FirstHalfButterFly{

	public static void main(String[] args) {
		
		 int n = 5;
		 for(int i=1;i<=n;i++){
		 	for(int j=1;j<=i;j++){
		 		 System.out.print("*");
		 	}
		 	for(int k=1;k<=(n-i)*2;k++){
		 		System.out.print(" ");
		 	}
		 	for(int l=1;l<=i;l++){
		 		System.out.print("*");
		 	}
		 	System.out.println();
		 }

		 //Second half
		  for(int i=n;i>=1;i--){

		      for(int j=1;j<=i;j++){
		      	System.out.print("*");
		      }
		      for(int k=1;k<=(n-i)*2;k++){
		      	System.out.print(" ");
		      }
		      for(int l=1;l<=i;l++){
		      	System.out.print("*");
		      }
		      System.out.println();
		  }
	}
}

class PrintButterFly{
	public static void main(String[] args) {
		
		  int n = 6;
		  for(int i=1;i<=n;i++){
		  	 for(int j=1;j<=i;j++){
		  	 	System.out.print("*");
		  	 }
		  	 for(int k=1;k<=(n-i)*2;k++){
		  	 	System.out.print(" ");
		  	 }
		  	 for(int l=1;l<=i;l++){
		  	 	System.out.print("*");
		  	 }
		  	 System.out.println();
		  }

		  for(int i=n;i>=1;i--){
		  	 for(int j=1;j<=i;j++){
		  	 	System.out.print("*");
		  	 }
		  	 for(int k=1;k<=(n-i)*2;k++){
		  	 	System.out.print(" ");
		  	 }
		  	 for(int l=1;l<=i;l++){
		  	 	System.out.print("*");
		  	 }
		  	 System.out.println();
		  }
	}
}

class PrintHalfDiamond{

	public static void main(String[] args) {
		
		   int n = 6;
		   for(int i=1;i<=n;i++){
		   	 for(int j=n;j>i;j--){
		   	 	System.out.print(" ");
		   	 }
		   	 for(int k=1;k<=i;k++){
		   	 	System.out.print("* ");
		   	 }
		   	 System.out.println();
		   }
	}
}


class ReverseHalfTriangle{

	 public static void main(String[] args) {
	 	
	 	  int n = 5;
	 	  for(int i=1;i<=n;i++){
	 	  	 for(int j=2;j<=i;j++){
	 	  	 	 System.out.print(" ");
	 	  	 }
	 	  	 for(int k=5;k>=i;k--){
	 	  	 	System.out.print("* ");
	 	  	 }
	 	  	 System.out.println();
	 	  }
	 }
}

class S{

	public static void main(String[] args) {

		int arr[] = {1,2,3,4,5,6,1,2,4,8,2};
		int second[] = secondMax(arr);
		 System.out.println(second[1]);
	}
	public static int[] secondMax(int arr[]){

		for(int i=0;i<arr.length;i++){

			for(int j=i+1;j<arr.length;j++){
				 if(arr[i]>arr[j]){
				 	 int temp = arr[i];
				 	 arr[i] = arr[j];
				 	 arr[j] = temp;
				 }
			}
		}
		return arr;
	}
}

class  PowerProgram{

	public static void main(String[] args) {
		
		 int n = 2,p = 4, value=1;
		 for(int i=1;i<=p;i++){

              value = value*n;
		 }
		 System.out.println(value);
	}
}

class FindSecondMaximum{

	public static void main(String[] args) {
		
		 int arr[] = {1,2,3,4,5,6};
		 int max = arr[0];
		 int secondMax = -1;

		 for(int i=1;i<arr.length;i++){
		 	 if(arr[i]<max){
		 	 	 max = arr[i];
		 	 }
		 } 
		 for(int i=0;i<arr.length;i++){

		 	 if(arr[i]>secondMax && arr[i]<max){

		 	 	  secondMax = arr[i];
		 	 }
		 }
		 System.out.println(secondMax);
	}
}

class PrintDuplicate{

	public static void main(String[] args) {
		
		  String s = "aabbmomnikdsee";
		  char ch[] = s.toCharArray();

		  for(int i=0;i<ch.length;i++){

		  	   int count = 1;
		  	   if(ch[i]=='0')
		  	   	continue;


		  	   for(int j=i+1;j<ch.length;j++){
		  	   	  if(ch[i]==ch[j]){
		  	   	  	count++;
		  	   	  	ch[j] = '0';
		  	   	  }
		  	   }
		  	   if(ch[i]!='0' && count>1){

		  	   	 System.out.println(ch[i]);
		  	   }
		  }
	}
}

class Program{

	 public static void main(String[] args) {
	 	
	 	   int arr[] = {1,2,3,4,5,1,2,3,4};
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
	 	   	  if(arr[i]!=-1){
	 	   	  	System.out.println(arr[i]);
	 	   	  }
	 	   }
	 }
}

class  A{

	A(){
		System.out.println("A constructor");
	}
}

class B extends A{

	B(){
		System.out.println("B constructor");
	}

	public static void main(String[] args) {
		
		  B
	}
}
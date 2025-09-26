// // class MergeSort{
// // 	 int arr[];
// // 	 int length;
// // 	 int tempMergeArr[];

// // 	 public static void main(String[] args) {
// // 	 	int  inputArr[] = {48,29,59,1,53,66,9,3};
// // 	 	MergeSort ms = new MergeSort();
// // 	 	ms.sort(inputArr);

// // 	 	for(int i:inputArr){
// // 	 		System.out.println(i+"");
// // 	 	}

// //      }
// // 	 	public void sort(int inputArr[]){
// // 	 		 this.arr=inputArr;
// // 	 		 this.length=inputArr.length;
// // 	 		 this.tempMergeArr=new int[length];

// // 	 		 divide(0,length-1);

// // 	 	}

// // 	 	public void divide(int lowerIndex,int higherIndex){
// // 	 		if(lowerIndex<higherIndex){
// // 	 			int middle = lowerIndex+(higherIndex-lowerIndex)/2;
// //                 divide(lowerIndex,middle);

// //                 divide(middle+1,higherIndex);

// //                 mergeArray(lowerIndex, higherIndex, middle);
// // 	 		}
// // 	 	}


// // 	 	 public void mergeArray(int lowerIndex,int higherIndex,int middle){
// // 	 	 	 for(int i=lowerIndex;i<=higherIndex;i++){
// // 	 	 	 	tempMergeArr[i] = arr[i];
// // 	 	 	 }

// // 	 	 	 int i=lowerIndex;
// // 	 	 	 int j=middle+1;
// // 	 	 	 int k=lowerIndex;

// // 	 	 	 while(i<=middle && j<=higherIndex){
// // 	 	 	 	 if(tempMergeArr[i]<=tempMergeArr[j]){
// // 	 	 	 	 	arr[k]=tempMergeArr[i];
// // 	 	 	 	 	i++;
// // 	 	 	 	 }
// // 	 	 	 	 else {
// // 	 	 	 	 	 arr[k] = tempMergeArr[i];
// // 	 	 	 	 	 i++;
// // 	 	 	 	 }
// // 	 	 	 	 k++;
// // 	 	 	 }

// // 	 	 	 while(i<=middle){
// // 	 	 	 	 arr[k] = tempMergeArr[i];
// // 	 	 	 	 k++;
// // 	 	 	 	 i++;
// // 	 	 	 }
// // 	 	 }

// // 	 }


// // class SortingWithBubbleSort{
    
// //      public static void main(String[] args) {
     	    
// //      	      int arr[] = {1,2,3,4,5,6,7};
// //          for(int i=0;i<arr.length;i++)
// //          {
// //          	 int flag=0;
// //      	 for(int j=0;j<arr.length-1-i;j++)
// //      	 {
// //      	 	 if(arr[j]>arr[j+1])
// //      	 	 {
// //      	 	 	 int temp=arr[j];
// //      	 	 	 arr[j] = arr[j+1];
// //      	 	 	 arr[j+1]= temp;

// //      	 	 	 flag=1;
// //      	 	 }
// //      	   }
// //      	   if(flag==0){
// //      	   	   break;
// //      	   }
// //         }

// //         for(int i=0;i<arr.length;i++){
// //         	System.out.print(arr[i]+" ");
// //         }
// //      }
// // }


// import java.util.Scanner;
// class AddTwoSuumNumber{
// 	public static void main(String[] args) {
	   
// 	   Scanner sc = new Scanner(System.in);
// 	   System.out.println("Enter your choice number");
// 	   int first = sc.nextInt();
// 	   System.out.println("enter second number");
// 	   int second = sc.nextInt();
// 	   System.out.println("enter third number");
// 	   int third = sc.nextInt();
// 	   if(first>second && first>third)
// 	   	System.out.println("first is greater number "+first);
// 	   if(second>first && second>third)
// 	   	System.out.println("second number is greater "+second);
// 	   if(third>first && third>second)
// 	   	System.out.println("third is greater "+third);
// 	}
// }

// class SwappingTwoNumberprogram{
// 	public static void main(String[] args) {
		 
// 		  int a=55;
// 		  int b=44;

//           int c = b;
//           b = a;
//           a=c;
// 		  System.out.println(a+" "+b);
// 	}
// }

// class Star1{
// 	public static void main(String[] args) {
// 		 int n = 6;
// 		 for(int i=0;i<=n;i++){
// 		 	 for(int j=0;j<=n;j++)
// 		 	 {
// 		 	 	if(i==0||j==n||j==0||i==n){
// 		 	 		System.out.print("*");
// 		 	 	}else {
// 		 	 		System.out.print(" ");
// 		 	 	}
// 		 	 }
// 		 	 System.out.println();
// 		 }
// 	}
// }

// class Star2{
//     public static void main(String[] args) {
//         int n = 4;  // Set the number of rows (you can adjust n to get a larger or smaller pattern)
        
//         // Adjusting for odd n (if n is even, make it odd)
//         if (n % 2 == 0)
//             n += 1;

//         for (int i = 1; i <= n; i++) {
            
//             for (int k = 1; k <= n - i; k++) {
//                 System.out.print(" ");
//             }

//             // Print the numbers
//             for (int j = 1; j <= i; j++) {
//                 System.out.print(i);  // Print the current row number
//                 if (j != i) {
//                     System.out.print(" ");  // Add space between the numbers in the same row
//                 }
//             }

//             // Move to the next line after finishing a row
//             System.out.println();
//         }
//     }
// }

// // class Star3{
// // 	public static void main(String[] args) {
// // 		 int n = 5;
// // 		 for(int i=1;i<n;i++)
// // 		 {
// // 		 	for(int j=1;j<=i;j++)
// // 		 	{
// //                System.out.print(j);
// // 		 	}
// // 		 	System.out.println();

// // 		 }
// // 	}
// // }


// // class Datatypes {
// // 	public static void main(String[] args) {
// // 		boolean flag = false;
// //        int num = flag ? 1 : 0;  // Using ternary operator
// //        System.out.println(num);  // Output: 1

// // 	}
// // }


// // class Demo {
// // 	public static void main(String[] args) {
		
// // 		 float myNum = 5.75f;
// //          System.out.println(myNum);
// // 	}
// // }


// // class ArrayRepeatedValue{

// // 	public static void main(String[] args) {
		
// // 		  int arr[] = {3,4,5,6,8,9,1,9,8,7,6,5,4,3,2,2};
// //           System.out.println("Repeated arrays");
// // 		  for(int i=0;i<arr.length;i++){
// // 		  	for(int j=i+1;j<arr.length;j++){
// // 		  		 if(arr[i] == arr[j]){
// // 		  		 	System.out.println(arr[i]);
// // 		  		 	break;
// // 		  		 }
// // 		  	}
// // 		  }
// // 	}
// // }



// // class SecondMinimumValueArray {
// //     public static void main(String[] args) {
        
// //         int arr[] = {2, 5, 3, 8, 7, 2, 8, 9};

// //         int min = arr[0];  
// //         int secondMin = arr[1];

// //         for (int i = 0; i < arr.length; i++) {
// //             if (arr[i] < min) {
// //                 secondMin = min; // Update secondMin before updating min
// //                 min = arr[i]; // Update min to new lowest value
// //             } else if (arr[i] > min && arr[i] < secondMin) {
// //                 secondMin = arr[i]; // Update secondMin if it's greater than min but smaller than previous secondMin
// //             }
// //         }

// //         if (secondMin == Integer.MAX_VALUE) {
// //             System.out.println("No second minimum found");
// //         } else {
// //             System.out.println("Second Minimum: " + secondMin);
// //         }
// //     }
// // }

// // class MainClass{
	
// // 	 public static void main(String[] args) {
	 	
// // 	 	 myMethod(1);
// // 	 	 myMethod(1,2);
// // 	 }
// // }



// class TestData{

// 	  TestData() throws Exception{
// 	  	throw new Exception("throw exception");
// 	  }


// }


// class Main{
// 	 public static void main(String[] args) {
// 	 	try{
// 	 	  TestData data = new TestData();

// 	 	}
// 	 	catch(Exception e){
// 	 		System.out.println("Catch Exception :"+e.getMessage());
// 	 	}
// 	 }
// }



// class Base {

// 	 public Base(){

// 	 	System.out.println("default constructor base");
// 	 }

// 	 public Base (int i,int j){
// 	 	System.out.println("parameterised constructor");
// 	 }
// }


// class DemoData extends Base{

// 	 DemoData(int j){
// 	 	System.out.println("demodata  constructor");
// 	 }

// 	 DemoData(int j,int k){
// 	 	super(j,k);
// 	 }

// 	 public static void main(String[] args) {
	 	
// 	 	 // DemoData data = (new Base()).new DemoData(1);
// 	 }
// }


// public class Outer{
// 		public int a = 1;
// 		private int b = 2;
// 		public void method(final int c){
// 			int d = 3;
// 			class Inner{
// 				private void iMethod(int e){
// 					System.out.println();
// 				}
// 			}
// 		}
// }


// class A {
// 	int i = 10;
// 	public void printValue(){
// 		System.out.println("Value-A");
// 	};
// }

// class B extends A {
// 	int i = 12;
// 	public void printValue(){
// 		System.out.println("Value-B");
// 	}
// }

// class DemoTesting{
// 	 public static void main(String[] args) {
	 	 
// 	 	  A a = new B();
// 	 	  a.printValue();
// 	 	  System.out.println(a.i);
// 	 }
// }



class EvenStringPrint{
	public static void main(String[] args) {
		
		 String s = "monikarajput";
		 char ch[] = s.toCharArray();

		 for(int i=0;i<ch.length-1;i++){
		 	 if(ch[i]%2==0){
		 	 	System.out.println("even number string character "+ i + " =====> is :"+ch[i]);

		 	 }
		 }
	}
}
import java.util.*;
class String1{

    public static String revString(String s){
     
        for(int i=s.length()-1;i>=0;i--){

        	System.out.println(s.charAt(i));
        }

         return s;
    }

	public static void main(String[] args) {
		
		 String s = "monika";
		 revString(s);
	}
}


class CheckStr{

    public static boolean isPallindrome(String s){
    	 int start=0,last=s.length()-1;
    	 
         for(int i=0;i<s.length();i++){
         	 if(s.charAt(start)!=s.charAt(last)){
         	 	  return false;
         	 }
         }
         return true;
    }
	public static void main(String[] args) {
		
		 String s = "eye";
		 if(isPallindrome(s)){
		 	System.out.println("is isPallindrome");
		 }
		 else{
		 	System.out.println("not pallindrome");
		 }
	}
}

class CountVowelAndConsonant{

	public static void main(String[] args) {
		
		 String s = "monika";
		 char ch[] = s.toCharArray();
		 int vowel=0,consonant=0;
		 for(int i=0;i<ch.length;i++){
		 	if(ch[i]=='a'||ch[i]=='e'||ch[i]=='i'||ch[i]=='o'||ch[i]=='u'){
		 		vowel++;
		 	}
		 	else {
		 		consonant++;
		 	}
		 }
		 System.out.println("vowel ======> "+vowel);
		 System.out.println("consonant ======>"+consonant);
	}
}

class CountFrequencyEachCharacter{

	public static void main(String[] args) {
		
		 String s = "aabbccddeee000e";
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
		 	 System.out.println(ch[i]+" ------> "+count);
		 }
	}
}

class FrequencyCheck{

    public static void checkFrequency(String s){

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
	public static void main(String[] args) {
		
		  String s = "aaabbbcccddeeeee00pm";
		  checkFrequency(s);
	}
}

class FirstNonRepitiveCharacter{

	public static void main(String[] args) {
		
		 String s = "monoikamsaadmi";
		 char ch[] = s.toCharArray();

		 for(int i=0;i<ch.length;i++){
		 	int count = 0;

		 	for(int j=0;j<ch.length;j++){
		 		if(ch[i]==ch[j]){
		 			count++;
		 		}
		 	}
		 	if(count==1){
		 		System.out.println("first non repitive character "+ch[i]);
		 		return;
		 	}
		 }
	}
}

class  CheckContainsDigit{

	public static void main(String[] args) {
		
		 String s = "monika1234";
		 char ch[] = s.toCharArray();

		 for(int i=0;i<ch.length;i++){
		 	 if(ch[i]>='0' && ch[i]<='9'){
		 	 	System.out.println(ch[i]);
		 	 }
		 }
	}
}

class CheckStringBothAnagram{

	public static void main(String[] args) {
		
		 String s = "silent";
		 String s1 = "listenm";

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
		 	 	return;
		 	 }
		 }
		 System.out.println("anagram string");
	}
}

class AnagramPrograam{

	public static void main(String[] args) {
		
		 String s  = "silent";
		 String s1 = "listen";

		 if(s.length()!=s1.length()){
		 	System.out.println("not anagram");
		 	return;
		 }

		 char a[] = s.toCharArray();
		 char b[] = s1.toCharArray();

		 for(int i=0;i<a.length;i++){

		 	   for(int j=i+1;j<a.length;j++){

		 	   	    if(a[i]<a[j]){
		 	   	    	 char c = a[i];
		 	   	    	 a[i] = a[j];
		 	   	    	 a[j] = c;
		 	   	    }

		 	   	    if(b[i]<b[j]){
		 	   	    	 char c = b[i];
		 	   	    	 b[i] = b[j];
		 	   	    	 b[j] = c;
		 	   	    }
		 	   }

             }
		 	  for(int i=0;i<a.length;i++){
		 	  	 if(a[i]!=b[i]){
		 	  	 	 System.out.println("not anagram");
		 	  	 	 return;
		 	  	 }
		 	  }
		 	  System.out.println("anagram");
		 }
	}


//------------------------------------------Array Program---------------------------------------------------------------------------------------------------
class FindAvgSum{

    public static int sumOfArray(int arr[]){

    	 int sum = 0;
    	 for(int i=0;i<arr.length;i++){
    	 	 sum = sum+arr[i];
    	 }
    	 return sum;
    }

    public static int avgOfArray(int arr[]){
         
         int avg = 0;
    	 int sum = sumOfArray(arr);
         avg = sum/arr.length;
         return avg;

    }
	public static void main(String[] args) {
		
		 int arr[] = {1,2,3,4,5,6,1,1,1};
		 // System.out.println(sumOfArray(arr));
		 System.out.println(avgOfArray(arr));
	}
}

class CheckMinMax{

	public static void main(String[] args) {
		
		 int arr[] = {1,2,3,4,5,6};
         int min = arr[0];
		 // System.out.println(checkMin(arr,min));
		 System.out.println(checkMax(arr,min));
	}

	public static int checkMin(int arr[],int min){

		   for(int i=0;i<arr.length;i++){
		   	  if(min>arr[i]){
		   	  	 min = arr[i];
		   	  }
		   }
		   return min;
	}

    public static int checkMax(int arr[],int min){

    	  for(int i=0;i<arr.length;i++){
    	  	  if(min<arr[i]){
    	  	  	  min = arr[i];
    	  	  }
    	  }
    	  return min;
    }
}

class ArraySotringProgram{

    public static int[] sortArray(int arr[]){

    	 for(int i=0;i<arr.length;i++){
    	 	 for(int j=i+1;j<arr.length;j++){
    	 	 	if(arr[i]<arr[j]){
    	 	 		int temp = arr[i];
    	 	 		arr[i] = arr[j];
    	 	 		arr[j] = temp;
    	 	 	}
    	 	 }
    	 }
    	 return arr;
    }


	public static void main(String[] args) {
		
		 int arr[] = {1,2,3,4,5,6};
		 int sorted[] = sortArray(arr);
		 for(int i=0;i<sorted.length;i++){
		 	System.out.println(sorted[i]);
		 }

	}
}

class SearchingArray{

	public static void main(String[] args) {
		
		 Scanner sc = new Scanner(System.in);
		 System.out.println("Enter size ::");
		 int size = sc.nextInt();

         int arr[] = new int[size];
		 System.out.println("Enter Elements ::");
		 for(int i=0;i<arr.length;i++){
		 	 arr[i] = sc.nextInt();
		 }

		 System.out.println("Enter search");
		 int key = sc.nextInt();

		 boolean found = false;
		 for(int i=0;i<arr.length;i++){
		 	 if(arr[i]==key){
		 	 	found = true;
                break;
		 	 }
		 }
		 if(found){
		 	System.out.println("found element");
		 }
		 else{
		 	System.out.println("not found");
		 }
	}
}

class  DuplicateElementArray{

     
	public static void main(String[] args) {
		
		 int arr[] = {1,2,3,2,4,4,5,1,6,3};
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
}}

class FindEvenAndOdd{

	public static void main(String[] args) {
		
		 int arr[] = {1,2,3,4,5,6};

		 for(int i=0;i<arr.length;i++){
		 	 if(arr[i]%2==0){
		 	 	System.out.println("Even number ------> "+arr[i]);
		 	 }
		 	 else 
		 	 {
		 	 	System.out.println("Odd number ----> "+arr[i]);
		 	 }
		 }
	}
}

class FindSumEvenIndex{

	public static void main(String[] args) {
		
		 int arr[] = {1,2,3,4,5,6};
		 int  sum = 0;
		 for(int i=0;i<arr.length;i++){
		 	 if(i%2==0){
		 	 	sum = sum+arr[i];
		 	 	System.out.println("index ----> " +i+ "element ----> " +arr[i]+ "sum ----> " +sum);
		 	 }
		 }
		 System.out.println("sum of even index"+sum); 
	}
}

class CheckPallindromeArray{

	public static void main(String[] args) {
		
		 int arr[] = {1,1,1,1,1,1};
		 int start=0,last=arr.length-1;
		 boolean  temp = true;

		 for(int i=0;i<arr.length;i++){
		 	 if(arr[start]!=arr[last]){
		 	 	 temp = false;
		 	 	 break;
		 	 }
		 }
		 if(temp){
		 	System.out.println("array pallindrome");
		 }
		 else {
		 	System.out.println("not pallindrome");
		 }
	}
}

class CheckPrimeNumber{

	public static void main(String[] args) {
		
		 int n = 12;
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
		 else{
		 	System.out.println("not prime");
		 }
	}
}

class FindMinValue{

	public static void main(String[] args) {
		
		 int arr[] = {1,2,3,4,5,6,7,9};
		 int min = arr[0];
         int secondMin = arr[0];

		 for(int i=1;i<arr.length;i++){
		 	 if(min>arr[i]){
		 	 	min = arr[i];
		  }
	   }
	   for(int i=0;i<arr.length;i++){
	   	 if(arr[i]<secondMin && arr[i]>min){
	   	 	secondMin = arr[i];
	   	 }
	   }
	   System.out.println("second  minimum "+secondMin);
   } 
}

class SecondLargest {
    public static void main(String[] args) {
        int arr[] = {12, 35, 1, 10, 34, 1};

        int largest = arr[0];
        int secondLargest = arr[0];

        // Pehle largest find karenge
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > largest) {
                largest = arr[i];
            }
        }

        // Ab second largest find karenge
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > secondLargest && arr[i] < largest) {
                secondLargest = arr[i];
            }
        }

        System.out.println("Largest: " + largest);
        System.out.println("Second Largest: " + secondLargest);
    }
}

class SecondSmallest {
    public static void main(String[] args) {
        int arr[] = {12, 35, 1, 0, 10, 34, 1};

        int smallest = arr[0];
        int secondSmallest = arr[0];

        // Pehle smallest find karenge
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < smallest) {
                smallest = arr[i];
            }
        }

        // Ab second smallest find karenge
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < secondSmallest && arr[i] > smallest) {
                secondSmallest = arr[i];
            }
        }

        System.out.println("Smallest: " + smallest);
        System.out.println("Second Smallest: " + secondSmallest);
    }
}

class PrintPrimeNumber{

	public static void main(String[] args) {
		
		 for(int num=2;num<=100;num++){
		 	 boolean isPrime = true;


		 	 for(int i=2;i<num;i++){
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


class FibonacciSeries {
    public static void main(String[] args) {
        int n = 6;  

        int first = 0, second = 1;

        System.out.print("Fibonacci Series: ");

        for (int i = 0; i <= n; i++) {
            System.out.print(first + " ");

            int next = first + second; 
            first = second;
            second = next;
        }
    }
}


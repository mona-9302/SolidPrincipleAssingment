import java.util.*;
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


class Encapsulation{

	
}
import java.util.Scanner;
class Array{

    public static int[] twoSum(int arr[],int target)
    {
    	int index[] = {-1,-1};
    	for(int i=0;i<arr.length;i++)
    	{
    		 for(int j=i+1;j<arr.length;j++)
    		 {
    		 	if(arr[i]+arr[j]==target)
    		 	{
    		 		 index[0] = i;
    		 		 index[1] = j;
    		 		return index;
    		 	}
    		 }
    	}
    	return index;

    }
	public static void main(String[] args) {
		
		 int arr[] = {11,12,73,23,3,11,13,8};
		 int sum = 10;
         int result[] = Array.twoSum(arr,sum);
         System.out.println("Indices: " + result[0] + ", " + result[1]);
	}
}


class ArraySortedProgram{

	 public static void main(String[] args) {
	 	
	 	   int arr[] = {2,4,1,3,5,7,6,8};
	 	   int size= arr.length-1;
	 	   int min = arr[0];
	 	         
	 	         for(int i=0;i<size;i++)
	 	         {
					for(int j=0;j<size;j++)
	 	        	{

		 	         	 if(arr[i]>arr[j])
		 	         	 {
		 	         	 	min=arr[j];		 	  
		 	         	 }

				    }
				System.out.println(min);   
				//min=arr[i+1];       
	 	   }
	 	}
 }


 class ArrayMin{

 	 public static void main(String[] args) {
 	 	
 	 	  int arr[] = {9,12,13,4,5,6,7,1,0};
 	 	  int min = arr[0];
 	 	  int count=0;
 	 	  for(int i=1;i<arr.length;i++)
 	 	  {
 	 	  	  count = count+1;
 	 	  	  if(min>arr[i])
 	 	  	  {
 	 	  	  	 min = arr[i];
 	 	  	  }
 	 	  }

 	 	  // System.out.println(count);
 	 	  System.out.println(min);
 	 }
 }




// class Frequency{

// 	  public static boolean isExist(int arr[],int element,int index)
// 	  {
// 	  	 for(int i =index;i>=0;i--){
// 	  	 	 if(element==arr[i])
// 	  	 	 	return true;
// 	  	 }

// 	  	 return false;
	  	 
// 	  }
// 	 public static void main(String[] args) {
// 	 	    int arr[] = {1,2,1,2,1,1,1};
// 	 	    for(int i =0;i<arr.length;i++)
// 	 	    {
// 	 	    	 if(!isExist(arr,arr[i],i-1))
// 	 	    	 {
// 	 	    	 	 int count =1;
// 	 	    	 	 for(int j=i+1;j<arr.length;j++)
// 	 	    	 	 {
// 	 	    	 	 	 if(arr[j]==arr[i])
// 	 	    	 	 	 	count++;
// 	 	    	 	 }
// 	 	    	 	 System.out.println(arr[i]+"-->"+count);
// 	 	    	 }
// 	 	    }
// 	 }
// }



// class ReverseArray{
// 	public static void main(String[] args) {
// 		  int arr[] = {1,2,3,4,5};
// 		  int start=0,last=arr.length-1;
// 		  for(int i =0;i<arr.length;i++)
// 		  {
// 		  	 System.out.println(arr[i]);
// 		  }
// 		  while(start<last)
// 		  {
// 		  	  int a = arr[start];
// 		  	  arr[start] = arr[last];
// 		  	  arr[last] = a;
// 		  	  start++;
// 		  	  last--;


// 		  }
// 		  for(int i =0;i<arr.length;i++)
// 		  {
// 		  	 System.out.println(arr[i]);
// 		  }

// 	}
// }


class CheckFrequencyArray{
	  

	  	public static boolean isExist(int arr[],int element,int index)
	  	{
	  		for(int i =index;i>=0;i--)
	  		{
	  			if(element==arr[i])
	  				return true;
	  		}
	  		return false;
	  	}
	  	public static void main(String[] args) {
	  	    int arr[] = {1,2,3,1};
	  	    for(int i=0;i<arr.length;i++)
	  	    {
	  	    	 if(!isExist(arr,arr[i],i-1))
	  	    	 {
	  	    	 	 int count=1;
	  	    	 	 for(int j=1+1;j<arr.length;j++)
	  	    	 	 {
	  	    	 	 	 if(arr[j]==arr[i])
	  	    	 	 	 	count++;
	  	    	 	 }
	  	    	 	 System.out.println(arr[i]+"---->"+count);
	  	    	 }

	  	    }
	  }
}
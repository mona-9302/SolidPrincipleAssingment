// class PerfectSquareFinder {
//     public static void main(String[] args) {
//         int[] numbers = {1, 4, 6, 7, 9};

//         System.out.println("Perfect squares in the given numbers:");
//         for (int number : numbers) {
//             if (isPerfectSquare(number)) {
//                 System.out.println(number);
//             }
//         }
//     }

//     public static boolean isPerfectSquare(int number) {
//         int sqrt = (int) Math.sqrt(number);
//         return sqrt * sqrt == number;
//     }
// }




// class Demo{
// 	public static void main(String[] args) {
// 		  int arr[] = {1,2,3,4,5,6,8,9};
// 		  for(int i =0;i<arr.length;i++)
// 		  {
//               if(sqrRoot(int number))
//               {
//               	System.out.println(number);
//               }
// 		  }
// 	}

// 	public static boolean sqrRoot(int number)
// 	{
// 		 int sqr = (int) Math.sqrt(number);
// 		 return sqr*sqr == number;

// 	}
// }


// class ReverseString{
//       public static void main(String[] args) {
//       	   String s = "lokendra";
//       	   char ch[] = s.toCharArray();
//       	   int start=0,last=ch.length-1;
//       	   while(start<last)
//       	   {
//       	   	  char c = ch[start];
//       	   	  ch[start] = ch[last];
//       	   	  ch[last] = c;
//       	   	  start++;
//       	   	  last--;
//       	   }
//       	   System.out.println(ch);
//       }
// }


// class CountEvenOdd{
// 	 public static void main(String[] args) {
// 	 	  int arr[] = {1,2,3};
// 	 	  int even=0,odd=0;
// 	 	  for(int i =0;i<arr.length;i++)
// 	 	  {
//                if(arr[i]%2==0)
//                {
//                	   even++;
//                }

//                else 
//                {
//                	   odd++;
//                }
// 	 	  }
// 	 	  System.out.println(even+","+odd);
// 	 }
// }

class SumOfPerfectSquare{
	   public static void main(String[] args) {
	   	     int arr[] = {1,2,4,5,9};
	   	     int sum=0;
	   	     for(int i =0;i<arr.length;i++)
	   	     {
	   	     	 
	   	     	 if(arr[i]==1)
	   	     	 	sum = sum+arr[i];
	   	     }
	   	     for(int j=1;j<=arr[i]/2;j++)
	   	     {
	   	     	 if(arr[i]%j==0 && j*j==arr[i])
	   	     	 {
	   	     	 	 sum = sum+arr[i];
	   	     	 	 break;
	   	     	 }
	   	     }
               System.out.println("sum :"+sum);
	   }
	   
	   
}

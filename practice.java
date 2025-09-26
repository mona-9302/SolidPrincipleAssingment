// class Fibonacci1{
// 	public static void main(String[] args) {
// 		  int n = 5;
// 		   int a = 0,b =1,c=0;
// 		  for(int i=1;i<n;i++)
// 		  {

// 		  	  c = a+b;
// 		  	  a = b;
// 		  	  b = c;
 
// 		  	  System.out.println(c);
// 		  }
//      }
// }

// class DemoData{

// 	public static int factData(int n)
// 	{
//         int fact = 1;
//         for(int i =1;i<=n;i++)
//         {
//         	fact = fact*i;
//         }
//         return fact;
// 	}
// 	public static void main(String[] args) {
// 		   int n = 142,rem=0,sum=0;
// 		   int temp = n;
//            while(n!=0){
           
//             rem = n%10;
//             sum = sum+factData(rem);
//             n = n/10;
//        }
//          if(temp==sum)
//           System.out.println("strong number");
       
//        else 
//        System.out.println("not strong number");
       
//      }
// }


// class DigitSum{
//       int sum=0;
// 	 public static int sumData(int n)
// 		  {
//               int rem=0,sum=0;
//               while(n!=0)
//               {
//               	 rem = n%10;
//               	 sum = sum+rem;
//               	 n = n/10;
//               }
//               return sum;
// 		  }
// 	public static void main(String[] args) {
// 		   int sum = 0;
// 		    sum =  sumData(123774);
// 		   if(sum<10)
// 		   	 System.out.println("it is  a generic root");
//            else  
// 		   	  System.out.println(sumData(sum));
//     }
// }


// class RevStr{
// 	public static void main(String[] args) {
		    
// 		     String s = "hello";
// 		     char  ch[] = s.toCharArray();
//               int size = s.length();
//               int start=0,last=ch.length-1;
//               while(start<last)
//               {
//               	  char c = ch[start];
//               	  ch[start] = ch[last];
//               	  ch[last] = c;
//               	  start++;
//               	  last--;
//               }
               
//              	System.out.println(ch);
//           }

//     }

// class RevString{
// 	public static void main(String[] args) {
// 		  String s = "monika";
// 		  char ch[] = s.toCharArray();
// 		  int  start = 0; 
// 		  int last = ch.length;
		  
// 		  while(start<last)
// 		  {
// 		  	  ch[start] = (ch[start])+(ch[last]);
// 		  	  ch[last] = (ch[start])-(ch[last]);
// 		  }

// 		  System.out.println(ch);

// 	}
// }


class SwappingStr{
	public static void main(String[] args) {
		   // int a = 10,b=20,c;
		   // c = a+b;
		   // a = b;
		   // b = c;
		   // System.out.println(a+","+b);

		// int a = 10,b=20;
		// a = a+b;
		// b = a-b;
		// a = a-b;
		// System.out.println(a+","+b);
	}

}






 
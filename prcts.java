/*class A1{
  public static void main(String[] args){
       int [] arr1 = new int[]{1,2,3,4,5};
       int [] arr2 = new int[arr1.length];
       for(int i=0;i<arr1.length;i++)
       {
         arr2[i] = arr1[i];
       }

       System.out.println("Elements of original array:");
       for(int i=0;i<arr1.length;i++)
       {
       	System.out.print(arr1[i] +" ");
        }
         System.out.println();
        System.out.println("Elements of new array:");
        for(int i=0;i<arr2.length;i++){
       	System.out.print(arr2[i]+" ");
       }
    }
}*/
/*import java.util.Scanner;
class Test{
  public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter The Number");
    int n=sc.nextInt();
    int t1=n;
    int count=0;
    while(t1!=0){
      t1=t1/10;
      count++;
    }
    int t2=n;
    int rem;
    int mult=1;
    int arm=0;
    while(t2!=0){
      rem =t2%10;
     
      for(int i=1;i<=count;i++){
         mult=mult*rem;

      }
      arm=arm+mult;
      t2=t2/10;
    }
    if(arm==n)
      System.out.println(n+"is armstrong");
    else 
      System.out.println(n+"is not armstrong no");
    
  }
}*/

import java.util.Scanner;
class Test1{
  public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    System.out.println("Please Enter Your Choice Number");

    int n=sc.nextInt();
    int t1=n;
    int count=0;
    while(t1!=0){
      t1=t1/10;
      count++;
    }
    int t2=n,mult=1, arm=0;
    while(t1!=0){
      int rem=t2%10;
      for(int i=1;i<=count;i++){
         mult=mult*rem;
      }
      arm=arm+mult;
      t2=t2/10;
    }
    if(arm==n)
      System.out.println(n+"is armstrong no");
    else 
      System.out.println(n+"is not armstrong no");

  }
}
  
    

class Test3{
  public static int factorial(int n){
       int f=1;
       for(int i=1;i<=n;i++){
           f=f*i;
      }
      return f;
  }
  public static void main(String[] args) {
        int n=145;
        int t1=n,rem,sum=0;
        while(n!=0){
            rem=n%10;
            sum=sum+factorial(rem);
            n=n/10;

        }
        if(sum==t1)
          System.out.println("strong number");
        else 
          System.out.println("not strong number");

  }
}
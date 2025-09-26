/*class Test{
	void demo(){
		final int a=10;
		System.out.println(a);
	}
	Test(){
		final int b=20;
		System.out.println(b);
	}
	  {
		final int  c=30;
		System.out.println(c);
	}
	public static void main(String[] args) {
		Test t=new Test();
		t.demo();
	}
} */                // LOCAL VARIABLE


/*class Test1{
	int a=10;
	int b=20;
	public static void main(String[] args) {
		Test1 t=new Test1();
		System.out.println(t.a);
		System.out.println(t.b);
	}
}*/

/*class Test{
	int a=10;
	static int b=20;
	public static void main(String[] args) {
		Test t=new Test();
		System.out.println(t.a);
		System.out.println(t.b);
		t.a=100;
		t.b=200;
		System.out.println(t.a);
		System.out.println(t.b);
		Test t1=new Test();
		System.out.println(t1.a);
		System.out.println(t1.b);

		Test t2=new Test();
		System.out.println(t2.a);
		System.out.println(t2.b);


	}
}*/


                   //ARRAY DELETE VALUE

/*class Test4{
	public static void main(String[] args) {
		int a[]={10,40,30,80,60,20};
		int deletevalue=10;
		for(int i=0;i<a.length;i++)
		{
			if(deletevalue==a[i])
			{
               for(int j=i;j<a.length-1;j++)
               {
                	a[j]=a[j+1];
               }
			}
		}
		for(int i=0;i<a.length-1;i++){
			System.out.println(a[i]);
		}
	}
}*/

                 //ARRAY INSERT VALUE
/*class InserArray{
	public static void main(String[] args) {
		int a[]={10,20,30,40,50};
		int element=80;
		int pos=3;
		for(int i=a.length-1;i>pos-1;i--)
		{
			 a[i]=a[i-1];
		}
		  a[pos-1]=element;
		  for(int i=0;i<a.length-1;i++){
		  	System.out.println(a[i]);
		  }
	}
}*/


import java.util.Scanner;
class ReplaceElement{
	public static void main(String[] args) {
		int[] arr={1,2,3,4,4,3,5};
		Scanner sc=new Scanner(System.in);

		System.out.println("Before changing");  
		for (int i=0;i<arr.length ;i++ ) {
			System.out.print(arr[i]+" ");  
			
		}
		System.out.println("\nEnter Element TO Replace"); 
		int change=sc.nextInt();
		System.out.println("\nEnter Element TO Put "); 
		int put=sc.nextInt();
		for (int i=0;i<arr.length ;i++ ) {
			if(change==arr[i]){
				arr[i]=put;

			}
			
			
		}
		System.out.println("After changing");
		for (int i=0;i<arr.length ;i++ ) {
			System.out.print(arr[i]+" ");
			
		}
	}
}

class Replace{
	public static void main(String[] args) {
		int a[]={1,2,3,4,5,6};
		System.out.println("Before changing");
		Scanner sc=new Scanner(System.in);
	}
}

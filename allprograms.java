// class Test{
// 	public static void main(String[] args) {
// 		System.out.println(isPrime(3));
// 	}
// 	public static boolean isPrime( int num){
// 		for(int i=2;i<=num/2;i++){
// 			if(num%i==0)
// 		    return false;
// 		}
// 		  return true;
// 	}
// }
              
// class Test2{
// 	public static void main(String[] args) {
// 		int a,b,c,d,e;
// 		int sum;
// 		a=10;
// 		b=20;
// 		c=30;
// 		d=40;
// 		e=50;
// 		sum=a+b+c+d+e;
// 		System.out.println(sum);
// 	}
// }


// class Test3{
// 	public static void main(String[] args) {
// 		int a,b;
// 		int sub;
// 		a=400;
// 		b=200;
// 		sub=a-b;
// 		System.out.println(sub);
// 	}
// }	

// class Test4{
// 	public static void main(String[] args) {
// 		int a,b,c,d,e;
// 		int avg;
// 		a=10;
// 		b=20;
// 		c=30;
// 		d=40;
// 		e=50;
// 		avg=(a+b+c+d+e)/5;
// 		System.out.println(avg);

// 	}
// }

// class Test5{
// 	public static void main(String[] args) {
// 		int a,b,n;
// 		a=20;
// 		b=30;
// 		n=a*b;
// 		System.out.println(n);
// 	}
// }

// class Test6{
// 	public static void main(String[] args) {
// 		int a,b,div;
// 		a=400;
// 		b=20;
// 		div=a/b;
// 		System.out.println(div);
// 	}
// }

//                  //{REVERSE STRING}


// class Test7{
// 	public static void main(String[] args) {
// 		String s="hello";
// 		char ch[]=s.toCharArray();
// 		int start=0,last=ch.length-1;
// 		while(start<last){

// 			char c=ch[start];
// 			ch[start]=ch[last];
// 			ch[last]=c;
// 			start++;
			
// 			last--;

// 		}
// 		s=new String(ch);
// 		System.out.println(s);
// 	}
// }

// class Test8{
// 	public static void main(String[] args) {
// 		String s="eyes";
// 		char ch[]=s.toCharArray();
// 		int start=0,last=ch.length-1;
// 		while(start<last)
// 		{
// 		  if(ch[start]!=ch[last])
// 		  System.out.println("is not polindrome"+ch);
// 		  start++;
// 		  last--;

//       s = new String(ch);
// 		  if(start>=last)
// 		  System.out.println("is polindorme\n"+s);
// 		}
// 	}
// }


// class Test9{
// 	public static void main(String[] args) {
// 		String s="monika rajput";
// 		char ch[]=s.toCharArray();
// 		System.out.println(s);
// 	}
// }

// class Test10{
// 	public static void main(String[] args) {
// 		String s="hello london";
// 		String s1=s.substring(0,6);
// 		System.out.println(s1);
// 	}
// }


// class Test11{
// 	public static void main(String[] args) {
		
// 		String s="mona";
// 		System.out.println(10+20+"mona");
// 	}
// }



// class Test15{
// 	public static void main(String[] args) {
// 		int i,n=50;
// 		for( i=1;i<n;i++)
// 		 {
// 			if(i%2!=0)
// 		   System.out.println("odd number"+i);
// 		}
// 	}
// }



// class Test16{
// 	public static void main(String[] args) {
// 		int i,n=50;
// 		for(i=2;i<n;i++){
// 			if(i%2==0)
// 			System.out.println("even number"+i);
// 		}
// 	}
// }


// class Test17{
// 	public static void main(String[] args)
// 	  {
// 		System.out.println(fact(5));
// 	}
// 	public static int fact(int n){
// 		int f=1;
// 		for(int i=1;i<=n;i++){
// 			f=f*i;

// 		}
// 		return f;
// 	}
// }

//PROGRAM = 1
// class Data
// {
//   public static void main(String[] args) 
//    {
//    	int n=5;

//    	for(int i=1;i<=n;i++)
//    	 {
//        for(int j=1;j<=i;j++)
//        {
//          System.out.print("*");
//        }
//        System.out.println();
//    	}
//    }
// }
                       //PROGRAM NO 2

/*class Data1{
	public static void main(String[] args) {
		int a=20,b=10;
		if(a>b)
		{
			System.out.println("a is greater then b"+a);
		}
		else 
			System.out.println("b is greater then b"+b);
	}
}*/

                       //PROGRAM NO= 3
                      //ARRAY SIZE PRIINT

/*class Data2{
	public static void main(String[] args)
	  {
		int a[]={10,20,30,40,50};
		
		for(int i=0;i<a.length;i++)
		 {
           System.out.println(a[i]);
		}
	}
}
                 //PROGRAM 4
                //1 TO 10 NUMBER 

class Data3{
	public static void main(String[] args) {
		int n=10;
		for(int i=1;i<n;i++){
			System.out.println(i);
		}
	}
}


                // PROGRAM 5
                 //SUM OF ARRAY
class Data4{
	public static void main(String[] args) {
		int sum=0;
		int a[]={10,20,30,40,50};
		for(int i=0;i<a.length;i++){
			sum=sum+a[i];

		}
		System.out.println(sum);
	}
}

        // TABLE PRINT
         //PROGRAM 6

class Data5{
	public static void main(String[] args) {
		 int n=5;
		for(int i=1;i<=10;i++){
			System.out.println(n*i);
		}
	}
}
               //CUBE PROGRAM
              // PROGRAM 7

class Data6{
	public static void main(String[] args) {
		  int a=4,n;
		  n=a*a*a;
		 System.out.println(n);


	}
}*/
                //PROGRAM 8
               //ARRAYPOSITION FIND

// class Data7{
// 	public static void main(String[] args) {
// 		int a[]={10,20,30,40,50,20,20,20,10};
// 		//int position =2;
// 		for(int i=0;i<a.length;i++)
// 		{
// 			if(a[i]==10)
// 			System.out.println(i+1);
// 		}
// 	}
// }




                 //ARRAY DELETE
                 //PROGRAM 9 
// class Data8{
// 	public static void main(String[] args) {
// 		int a[]={1,2,3,4,5,6,7};
// 		int index=4;
// 		for(int i=index;i<length-1;i++)
// 		{
//            if(a[i]=a[i+1])
// 		}
// 	       length--;
// 	      System.out.println(a[i]);
// 	  }
// }

               // PERCENTAGE PROGRAME
                //PROGRAM 10

/*class Data9{
	public static void main(String[] args) {
		int n=100,p=30;
		n=n*p/100;
		System.out.println(n);
	}
}

                    //SI PROGRAM
                    //11 PROGRAM
class Data10{
	public static void main(String[] args) {
		int SI,p,r,t;
		p=1000;
		r=3;
		t=2;
		SI=(p*r*t)/100;
		System.out.println(SI);
	}
}


class Data11{
	 String s="mona";
	 int a=10;
	 public static void main(String[] args) {
	 	  Data11 d=new Data11();
	 	  System.out.println(d.s);
	 	  System.out.println(d.a);
	 }
}

class Data12{
	public static void main(String[] args) {
		char ch[]={'m','a','n','i','k','a'};
		for(int i=0;i<ch.length;i++){
			if(ch[i]=='a')
				ch[i]='o';
			System.out.println(ch);
		}
	}
}




class Data13{
	public static void main(String[] args) {
		String s="hallo London";
		s=s.replaceAll("a","e");
		System.out.println(s);
	}
}


                  //TYPECASTING PROGRAM
class Data14{
	public static void main(String[] args) {
		int a=10;;
		double d=a;
		System.out.println(d);
	}
}

class Data15{
	public static void main(String[] args) {
		int a[]={1,2,3,4,5,6,7};
		int count =0,j;
		for(int i=0;i<a.length;i++)
		 {
           for( j=0;j<a.length;j++){
           	System.out.println(a[j]);
           	 if(a[i]==a[j])
           	 //System.out.println(a[i]);
           	count++;
           }
		}
	}
}
            //ASCII CODE  PRINT CHARACTER

class Data16{
	public static void main(String[] args) {
		String s="hello";
		char ch[]=s.toCharArray();
		for(int i=0;i<ch.length;i++){
			System.out.println(ch[i]+"--->"+(int)ch[i]);
		}

	}*/


// class Data17{
// 	public static void main(String[] args) {
// 		String s="hello";
// 		char ch[]=s.toCharArray();
// 		for(int i=0;i<ch.length;i++){
// 			if(i%2==0){
// 				System.out.println(ch[i]+"--->"+(int)ch[i]);

// 			}
// 		}
// 	}
// }


class Data18{
	public static void main(String[] args) {
		String s="hello";
		char ch[]=s.toCharArray();
		for(int i=0;i<ch.length;i++){
			if(i%2!=0){
				System.out.println(ch[i]+"--->"+(int)ch[i]);

			}
		}
	}
}

// class Data19{
// 	public static void main(String[] args) {
// 		String s="hello";
// 		int vol=0;
// 		char ch[]=s.toCharArray();
// 		for(int i=0;i<ch.length;i++){
// 			if(ch[i]=='a')
          
// 		}
//   }
// }

class Data20{
	public static void main(String[] args) {
		 int a[]={1,2,3,4,5,6};
		 int sum=0;
		 for(int i=0;i<a.length;i++)
		 {
             if(  a[i]%2==0)
             sum=sum+a[i];
		 }
		 System.out.println(sum);
	}
}


class Data21{
	public static void main(String[] args) {
		 int a[]={1,2,3,4,5,6};
		 int sum=0;
		 for(int i=0;i<a.length;i++)
		 {
             if(  a[i]%2!=0)
             sum=sum+a[i];
		 }
		 System.out.println(sum);
	}
}

class Data22{
	public static void main(String[] args) {
		 int a[]={1,2,3,4,5,6};
		 int sum=0;
		 for(int i=0;i<a.length;i++)
		  {
             sum=sum+a[i];
		 }
		 System.out.println(sum);
	}
}
class Data23{
	public static void main(String[] args) {
		int a[]={1,2,3,4,5,6};
		int sum=0;
		for(int i=0;i<a.length;i++)
		 {
             if(a[i]%2!=0)
             {
             	sum=sum+a[i];
             }
		}
             System.out.println(sum);
	}
}
            
class Data24{
	public static void main(String[] args) {
		int a[]={1,2,3,4,5,6};
		int sum=0;
		for(int i=0;i<a.length;i++)
		 {
             if(a[i]%2==0)
             {
             	sum=sum+a[i];
             }
		}
             System.out.println(sum);
	}
}

class Data25{
	public static void main(String[] args) {
		int a[]={1,2,3,4,5,6};
		int start=0,last=a.length-1;
		while(start<last){
			 int  temp  =a[start];
			a[start]=a[last];
			a[last]=temp;
			start++;
			last--;
		}
	     for(int i=0;i<a.length;i++)
		   {
		      System.out.println(a[i]);
	     }
	}
}

class Data26{
	public static void main(String[] args) {
		int a[]={1,2,3,4,5,6};
		int a1[];
		int j=0;
		for(int i=0;i<a.length;i++){
			if(i==a.length-1){
				continue;
			}
			  a[j]=a[i];
			  j++;
			System.out.println(a[i]);
		}
		
	}
}

class Data27{
	public static void main(String[] args) {
         String s="hello";
         // char ch[]=s.toCharArray();
         // for(int i=0;i<ch.length;i++)
         
         	System.out.println(ch[i]);
         
	}
}

/*class Data28{
	 public static void main(String[] args) 
   {
    int n=5;
     for(int i=0;i<=5;i++)
      {
        for(int j=0;j<=5;j++)
        {
            //if(i==j)
          if(i==j||i==n-5||i<j)
              System.out.print("*");
            else 
              System.out.print(" ");
          } 
          System.out.println();
       } 
   }


   class Data29
  {
   public static void main(String[] args) 
   {
     int n=5;
     for(int i=0;i<=5;i++)
     {
      for(int j=0;j<=5;j++)
      {
        if(i==j||i<j)
          System.out.print("*");
        else 
          System.out.print("") ;
      }
        System.out.println();
      }
   }

class Data30
{
   public static void main(String[] args)
   {
       String s="hello";
       String rev="";
       for(int i=0;s<=length-1;i--)
         {
          rev=rev +s.charAt(i);
          System.out.println(i);
         }
    }

    class Data31
    {
     public static void main(String[] args) 
     {
       int n=5;
       for(int i=0;i<=5;i++)
        {
         for(int j=0;j<=5;j++)
          {
           if(j==0||i==0||i==n-3)
              
            System.out.print("*");
           else 
            System.out.print("");
         }
         System.out.println();
       }
     }

     class Data32
    {
      public static void main(String[] args) 
         {
          int n=5;
          for(int i=0;i<5;i++)
          {
            for(int j=0;j<5;j++)
             {
               if(j==0||i==n-1||j==n-1)
              
                System.out.print("*");
              else 
                System.out.print(" ");
            }
            System.out.println();
          }
       }

       class Data33
     {
      public static void main(String[] args) 
         {
          int n=5;
          for(int i=0;i<=5;i++)
          {
            for(int j=0;j<=5;j++)
            {
              if(i==0||j==0||i==n)
                System.out.print("c");
              else 
                System.out.print(" ");
            }
            System.out.println();
          }
      }


  class Data34
     {
      public static void main(String[] args) 
         {
          int n=5;
          for(int i=0;i<=5;i++)
          {
            for(int j=0;j<=5;j++)
            {
              if(i==0||j==0||i==n)
                System.out.print("c");
              else 
                System.out.print(" ");
            }
            System.out.println();
          }
      }


      class Data35
     {
      public static void main(String[] args) 
         {
          int n=5;
          for(int i=0;i<=5;i++)
          {
            for(int j=0;j<=5;j++)
            {
              if(i==0||j==0||i==n)
                System.out.print("c");
              else 
                System.out.print(" ");
            }
            System.out.println();
          }*/

/*class Parent
{
	  
	public static void show()
	 {
         System.out.println("hello");
	}
}

class Child extends Parent
 {
 	String name="monika";

   public static void main(String[] args)
     {
	  Child c=new Child();
	  System.out.println(c);
  }
    public String toString()
     {
        return name;
    }
}*/

/*class Parent
  {
  	 Parent()
  	  {
         System.out.println(" parents constructor");
  	 }
    public static void show()
     {
          System.out.println("static method");
    }
    static
     {
    	System.out.println("static block");
    }
      {
        System.out.println("non static block");
    }
}
class Child extends Parent{
	Child()
	{
		super();
		System.out.println("child constructor");
	}
	public static void show()
	 {
          System.out.println("child static method");
	}
	static 
	 {
         System.out.println("child static block");
	}
	 {
        System.out.println("child non static block");
	}
	public static void main(String[] args) 
	 {
		Child c=new Child();
		Parent p=new Parent();

		//p.show();
		//c.show();


	}
}


             // { OVERLOADINNG CONCEPT }
class Test12
 {
    public void show(int a)
     {
    	System.out.println("hey!");
    }
    public void show(String s,int a)
     {
       System.out.println("hello");
    }
     public void show(int a,int b,int c)
     {
     	System.out.println("hii");
	 }
     public static void main(String[] args)
       {
     	 Test12 t=new Test12();
     	 t.show(10);
     	 t.show("m",10);
     	 t.show(10,20,30);
     	
     }
}

              //OVERRIDDING CONCEPT

class Test13
 {
   public static void show(String s)
    {
        System.out.println("hello");
   }
}
class Test14 extends Test13
 {
    public static void show1(String s)
     {
         System.out.println("hi");
    }
    public static void main(String[] args) {
    	Test14.show("m");
    }
}*/

/*class Data{
	public static void main(String[] args) {
		int n=10;
		for(int i=1;i<=n;i++){
			System.out.println(i);
		}
	}
}

class Demo1{
	public static void main(String[] args) {
		int n=10;
		for(int i=1;i<=n/2;i++){
			System.out.println(i);
		}
	}
}

class Demo2{
	public static void main(String[] args) {
		int a[]={1,2,3,4,5,6};
		int start=0,last=a.length-1;
		while(start<last){
           int temp=a[start];
          a[start]=a[last];
          a[last]=temp;
          start++;
          last--;

		}
		for(int i=0;i<a.length;i++){
			System.out.println(a[i]);
		}


	}
}
class Demo4{
	public static void main(String[] args) {
		int n=10,sum=0;
		for(int i=0;i<=n;i++)
		 {
            sum=sum+i;
		}
		System.out.println(sum);

	}
}

class Demo5{
	public static void main(String[] args) {
		int a[]={1,2,3,4,5,6};
		int sum=0;
		for(int i=0;i<a.length;i++)
		{
           sum=sum+a[i];
           
		}
		  System.out.println(sum);


	}
}

class data44{
	void show(){
		System.out.println("monika");
	}
	public static void main(String[] args) {
		
		Demo6 d=new Demo6();
		d.show();
	}
}

/*class Demo7{
	String name="monika";
	int sal=1000;
}
class Demo9{
	String name="mona";
	int sal=12000;
}
class Demo8{
	public static void main(String[] args) {
		Demo9 d=new Demo9();
		System.out.println(d.name);
		System.out.println(d.sal);
	}
}*/

/*class Demo9{
	String name;
	int salary;
	void show(){
		System.out.println("monika");
	}
}*/

/*class Demo10{
	public static void main(String[] args) {
		Demo9 d=new Demo9();
		d.name="monika";
		d.salary=1000;
		System.out.println(d.name+" "+d.salary);
	}
}*/

/*class Demo11{
	String name;
	int salary;
	public static void main(String[] args) {
		Demo11 d=new Demo11();
		d.name="monika";
		d.salary=1000;
		System.out.println(d.name+" "+d.salary);

	}
}
class EvenNumber{
	public static void main(String[] args) {
		int i,n=10;
		for(i=2;i<=n;i++){
			if(i%2==0)
		  System.out.println(i);
		}
	}
}

class OddNumber{
	public static void main(String[] args) {
		int i,n=10;
		for(i=1;i<=n;i++){
			if(i%2!=0)
			System.out.println(i);
		}
	}
}

class StrongNumber{
	public static int factorial(int num){
		int fact=1;
		for(int i=1;i<=num;i++)
			fact =fact*i;
	}
	return fact;
}
public static boolean isStrongnumber(int num){
	int temp=num;
	int sum=0;
	while(num!=0){
	int rem=num%10;
	sum=sum+factorial(rem);
	num=num/10;
  }
    if(sum==temp)
    return true;
   else
   	return false;
}
/*public static void main(String[] args) {
	 Scanner sc=new Scanner(System .in);
	 System.out.println("Enter the Number");
	 int num=sc.nextInt();
	 boolean condition=StrongNumber.isStrongNumber(num);
	 if(condition)
	 	System.out.println(num+"isStrongnumber");
	 else 
	 	System.out.println(num+"is not Strong Number");
  }
class EvenNumberInArray{
	public static void main(String[] args) {
		int a[]={1,2,3,4,5,6,7,8};
		int sum=0;
		for(int i=0;i<a.length;i++){
             if(i%2==0)
             	//sum=sum+a[i];
             	System.out.println(a[i]);
		}
	}
}

class Data{
	public static void main(String[] args) {
		Integer i=new Integer(10);
		System.out.println(i);
	}
}*/

/*class Test1{
	public static void main(String[] args) {
		int n=20;
		for(int i=1;i<=n;i++){
			if(n%i==0)
				System.out.println(i);
		}
	}
}*/
/*class Test{
	public static void main(String[] args) {
		int a[]={1,2,3,4,5};
		int sum=0;
		for(int i=0;i<a.length;i++)
		{
         sum+=a[i];
        // System.out.println(sum);
		}
		  System.out.println(sum);
	}
}*/
/*import java.util.Scanner;
class PerfectNumber{

    public static boolean isPerfact(int num){
    	int temp=num;
    	int sum=0;
    	for (int i=1;i<=num/2 ;i++ ) {
    		if(num%i==0)
    			sum=sum+i;
    		
    	}
    	if(sum==temp)
    		return true;
    	else 
    		return false;
    }

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Number");
		int num=sc.nextInt();
		boolean condition=isPerfact(num);
		if(condition)
			System.out.println(num+" is Perfact Number");
		else 
			System.out.println(num+" is not Perfact Number");
		
	}
}*/

/*import java.util.Scanner;
class Table{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Table");
		int n=sc.nextInt();
		for(int i=1;i<=10;i++){
			System.out.println(n+"*"+i+"="+n*i);
			//System.out.println(n*i);
		}
	}
}

class Even{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter your Number");
		int n=sc.nextInt();
		//int i;
		//for(int i=2;i<=n;i++){
			if(n%2!=0)
				System.out.println(n+"is odd number");
		}
	}*/

	/*PROGRAM 1

	class Test{
		public static void main(String[] args) {
			int n=10;
			for(int i=1;i<=n;i++){
				if(i%2!=0)
					System.out.println(i);
			}
		}
	}*/

/*class Test1{
	public static void main(String[] args) {
		int n=20;
		for(int i=1;i<=n;i++){
			if(i%2==0)
				System.out.println(i);
		}
	}
}*/


/*class Test2{
	public static void main(String[] args) {
		int n=10;
		for(int i=1;i<=n;i++)
			System.out.println(i);
	}
}*/

/*class Test3{
	public static void main(String[] args) {
		int rev=0,rem;
		int n=1234;
		while(n!=0){
			rem=n%10;
			rev=rev*10+rem;
			n=n/10;
			//System.out.println(rev);
		}
		System.out.println(rev);
	}
}*/

/*class Test4{
	public static void main(String[] args) {
		int n=1234966;
		int count=0;
		while(n!=0){
			n=n/10;
			count++;
		}
		System.out.println(count);
	}
}*/

/*class Test5{
	public static void main(String[] args) {
		int f=1,n=5;
		for(int i=1;i<=n;i++){
			f=f*i;
		}
		//return f;
		System.out.println(f);
	}
}*/
/*class Test{
	public static void main(String[] args) {
		int n=1234,rem,sum=0;
		while(n!=0){
			rem =n%10;
			sum+=rem;
			n=n/10;
		}
		System.out.println(sum);
	}
}

class Test1{
	public static void main(String[] args) {
		int n=12;
		for(int i=1;i<=10;i++){
			System.out.println(n*i);
		}
		//System.out.println(n*i);
	}
}

class Test2{
	public static void main(String[] args) {
		int n=123,sum=0,rem;
		while(n!=0){
			rem=n%10;
			sum=sum+rem;
			n=n/10;

		}
		System.out.println(sum);
	}
}*/

/*class Test3{
	public static void main(String[] args) {
		int n=1234555,count=0;
		while(n!=0){
			n=n/10;
			count++;
		}
		System.out.println(count);
	}
}*/



/*class Test{
	public static void main(String[] args) {
		  int n = 1234;
		   int rev = 0,sum=0;
		   while(n!=0)
		   {
         int rem  = n %10;
         rev = rev *10 +rem;
         n = n/10;
		   }

		   System.out.println(rev);
	}
}


class Test1{
	public static void main(String[] args) {
		   int a = 0,b = 1, c=0;

		   for(int i=0; i<4; i++){
		   	   c = a+b;
		   	   a = b;
		   	   b = c;
		   }

		   System.out.println(c);
	}
}



 class Test2{
 	public static void main(String[] args) {
 		  int a[] =  new int []{10,20,30,40,50};
 		  int a1[] =new int [a.length];
 		  for(int i=0;i<a.length;i++)
 		  {
 		  	   System.out.println(a[i]); 

 		  	     a1[i] = a[i];
 		  }
        System.out.println("Before copy the array");

 		  for(int  i=0;i<a1.length;i++)
 		  {
 		  	System.out.println(a[i]+ " ");
 		  }

 		      System.out.println();

 		    
 	}
 }*/


/*class Test{
	   public static void main(String[] args) {
	   	    int n = 1234,rem,rev=0;
	   	    while(n!=0)
	   	    {
	   	    	   rem = n%10;
	   	    	   rev = rev*10+rem;
	   	    	   n = n/10;
	   	    }

	   	    System.out.println(rev);
	   }
}


class Test2{
	  public static void main(String[] args) {
	  	  int a[] = {10,22,33,44,55};
	  	    int start = 0,last=a.length-1;
	  	    System.out.println("before reverse array");
	  	    for(int i =0;i<a.length;i++)
	  	    {
	  	    	
	  	    	  System.out.println(a[i]);
	  	    }

	  	    while(start<last)
	  	    {
	  	    	   int temp = a[start];
	  	    	   a[start] = a[last];
	  	    	   a[last] = temp;
	  	    	   start++;
	  	    	   last--;
	  	    }
	  	    System.out.println("after reverse array");

	  	    for(int i=0;i<a.length;i++){
	  	    	System.out.println(a[i]);
	  	    }
	  }

	  */

 /*class Test3
 {
 	  public static int fact(int n)
 	  {
 	  	   int fact=1;
 	  	   for(int i =1;i<=n;i++)
 	  	   {
 	  	   	   fact = fact*i;
 	  	   }
 	  	    return fact; 
 	  }

 	  public static void main(String[] args) {
 	  	    int num = 145,rem,fact,sum=0;
 	  	    int temp = num;
 	  	    while(num!=0)
 	  	    {
 	  	    	   rem = num%10;
 	  	    	   fact = fact(rem);
 	  	    	   sum = rem +fact;
 	  	    	   num = num/10;
 	  	    }
 	  	    if(num==sum){
 	  	    	  System.out.println("num is strong num"+num);
 	  	    }

 	  	    
 	  }
 }*/



/*class Test{
	public static void main(String[] args) {
		    int a[] = {10,20,30,40};
		    int b[] = {50,60,70,80};

		    int a_length=a.length;
		    int b_length=b.length;
		    int c_length=a.length+b.length;
    System.out.println("before merge array");
		    int c[] = new int[c_length];
		   
		    for(int i =0;i<a.length;i++)
		    {
		    	   c[i] = a[i];
		    }

		    for(int i =0;i<b.length;i++)
		    {
           c[a.length+i] = b[i];
		    }

		    for(int i =0;i<c.length;i++)
		    {
		    	System.out.println(c[i]);
		    }
	}
}*/
                  //ARRAY MERGE
// class Test{
// 	public static void main(String[] args) {
// 		   int a[] ={10,20,30,40};
// 		   int b[] ={50,60,70};
// 		   int c[] = {80,90,100};

// 		   int a_length=a.length;
// 		   int b_length=b.length;
// 		   int c_length=c.length;

// 		   int d_length=a.length+b.length+c.length;
//       int d[] = new int[d_length];

//         for(int i =0;i<a.length;i++)
//         {
//             d[i] = a[i];
//         }

//         for(int i =0;i<b.length;i++)
//         {
//            d[a.length+i] = b[i];
//         }

//         for(int i =0;i<c.length;i++)
//         {
//             d[a.length+b.length+i] = c[i];
//         }

//         for(int i =0;i<d.length;i++){
//         	System.out.println(d[i]);
//         }

		   

// 	}
// }
                   //duplicacy by sorting form
/*class Test
{
	public static void main(String[] args) 
	{
		    int a[] = {1,2,2,3,4,5,5};
		    int temp [] =new int [a.length];
          int j =0;
		    for(int i=0;i<a.length-1;i++)
		    {
		    	   if(a[i] != a[i+1])
		    	   {
                 temp [j] =a[i];
                 j++;

		    	   }
		    }
          temp[j] = a[a.length-1];
		    
		    for(int i =0;i<temp.length;i++)
		    {
		    	System.out.println(temp[i]+" ");
		    }
}
		   
	}*/


/*class Test{
	public static void main(String[] args) {
		   int a[] = {10,20,20,30,40,40};
		   int temp[] = new int[a.length];
		   int j =0;
		   for(int i =0;i<a.length-1;i++)
		   {
		   	  if(a[i] != a[i+1])
		   	  {
		   	  	  temp[j] = a[i];
		   	  	  j++;
		   	  }

		   	  
		   }
		   temp[j] = a[a.length-1];
		   	  for(int i =0;i<temp.length;i++)
		   	  {
             System.out.println(temp[i]+" ");
		   	  }
	}
}*/
                   //DELETE FROM ARRAY
/*class Test{
	public static void main(String[] args) {
		  int a[] = {10,20,30,40,50};
		  int delete = 40;
		  for(int i =0;i<a.length;i++)
		  {
		  	  if(delete == a[i])
		  	  {
		  	  	 for(int j=i;j<a.length-1;j++)
		  	  	 {
                 a[j] = a[j+1];
		  	  	 }
		  	  	 break;
		  	  }
		  }

		  for(int i=0;i<a.length-1;i++){
		  	System.out.println(a[i]);
		  }
	}
}

*/

         //INSERT FROM ARRAY

/*class Test{
	public static void main(String[] args) {
		   int a[] = {10,20,30,40,50};
		   int pos = 4;
		   int element = 100;
		   for(int i =a.length-1;i>pos-1;i--)
		   {
           a[i] = a[i-1];
		   }

		     a[pos-1]  = element;
		     for(int i =0;i<a.length-1;i++){
		     	System.out.println(a[i]);
		     }
	}
}*/

/*import java.util.*;
import java.io.*;
class Employee implements Serializable{
	  int empno;
	  String ename;
	  int salary;

	    Employee(int empno,String ename,int salary){
	    	    this.empno = empno;
	    	    this.ename = ename;
	    	    this.salary = salary;
	    }

	    public String toString()
	    {
	    	  return empno+" "+ename+" "+salary;
	    }

}

class EmployeeDemo{
	public static void main(String[] args) throws Exception {
		  int choice = -1;
		   Scanner s = new Scanner(System.in);
		   Scanner s1 = new Scanner(System.in);
		   File file = new File("employee .txt");
		   ArrayList<Employee> al  = new ArrayList<Employee>();
		   ObjectOutputStream oos = null;
		   ObjectInputStream ois = null;
		   ListIterator li = null;

		   if(file.isFile()){
		   	ois = new ObjectInputStream(new FileInputStream(file));
		   	al = (ArrayList<Employee>)ois.readObject();
		   	 ois.close();
		   }

		  do{
		  	System.out.println("1.INSERT");
		  	System.out.println("2.DISPLAY");
		  	System.out.println("3.SEARCH");
		  	System.out.println("0.EXIT");
		  	System.out.println("Enter your choice:");
		  	 choice = s.nextInt(); 
		  	  switch(choice){

		  	  case 1:
		  	  	   System.out.print("Enter how many employee you want");
		  	  	    int n = s.nextInt();
		  	  	    for(int i =0;i<n;i++)
		  	  	    {
		  	  	       System.out.print("Enter Employee No: ");
		  	  	      int empno = s.nextInt();

		  	  	      System.out.print("Enter Employee Name: ");
		  	  	      String ename = s1.nextLine();

		  	  	     System.out.println("Enter Employee Salary: ");
		  	  	     int salary = s.nextInt();

		  	  	    al.add(new Employee(empno,ename,salary));
		  	  	    

		  	  	}
		  	  	    oos =  new ObjectOutputStream(new FileOutputStream(file));
		  	  	    oos.writeObject(al);
		  	  	    oos.close();
		  	  	break;

		  	  	 case 2:
		  	  	 	    if(file.isFile()){
		  	  	 	    oos =  new ObjectOutputStream(new FileOutputStream(file));
		  	  	      oos.writeObject(al);
		  	  	      oos.close();

		  	  	 	   System.out.println("--------------------");
		  	  	 	   li = al.listIterator();
		  	  	 	   while(li.hasNext())
		  	  	 	   	System.out.println(li.next());
		  	  	 	    System.out.println("--------------------");
		  	  	 	}
		  	  	 	  else{
		  	  	 	  	System.out.println("file not Exist......!");
		  	  	 	  }
		  	  	 	 break;

		  	  	 	case 3:
		  	  	 		  if(file.isFile()){

		  	  	 		  	  oos =  new ObjectOutputStream(new FileOutputStream(file));
		  	  	          oos.writeObject(al);
		  	  	          oos.close();

		  	  	 		  boolean found = false;
		  	  	 		System.out.println("Enter empno to Searh : ");
		  	  	 		int empno =  s.nextInt();
		  	  	 		     System.out.println("----------------");
		  	  	 		     li = al.listIterator();
		  	  	 		     while(li.hasNext()){
		  	  	 		     	 Employee e =(Employee) li.next();
		  	  	 		     	 if(e.empno == empno){
		  	  	 		     	  System.out.println(e);
		  	  	 		     	    found = true;
		  	  	 		     	}
		  	  	 		   }
		  	  	 		   if(!found)
		  	  	 		   	 System.out.println("Record not found....!");
		  	  	 		     	System.out.println("--------------");
		  	  	 		   }
		  	  	 		     else{
		  	  	 		     	  System.out.println("file not Exist......!");
		  	  	 		     	}
		  	  	 	//System.out.println(al);
		  	  	 	break;
		  	  }

		  }while(choice !=0);
	}

}
*/

                 //SECOND LARGEST ARRAY
/*class Test{
	public static void main(String[] args) {
		    int a[] = {60,80,120,40,10,15};
		    int temp;
		    for(int i =0;i<a.length;i++)
		    {
		    	 for(int j =i+1;j<a.length;j++)
		    	 {
		    	 	   if(a[i] < a[j])
		    	 	   {
		    	 	   	    temp = a[i];
		    	 	   	    a[i] = a[j];
		    	 	   	    a[j] = temp;
		    	 	   }
		    	 }


		    }
		    System.out.println("second largest element is "+a[1]);
	}
}*/

/*class Test{
	public static void main(String[] args) {
		    String s = new String("monika");
		    String s1 = "monika";
		    System.out.println(s.ComapreTo(s1));
		     
		     
		     System.out.println(s.isEmpty());
		     System.out.println(s.equals(s1));

		    System.out.println(s.charAt(0));
		    System.out.println(s.length());
		    System.out.println(s.contains("monika"));
	}
}

*/
                                  

/*class Test{
	public static void main(String[] args) {
		   int a[] = {1,2,3};
		   int b[] = {4,5,6};
		   int c[] = {7,8,9};

		   int a_length = a.length;
		   int b_length = b.length;
		   int c_length = c.length;

		   int d_length = a.length+b.length+c.length;
		    int d [] = new int [d_length];

		    for(int i =0;i<a.length;i++)
		    {
		    	   d[i] = a[i];
		    }

		    for(int i =0;i<b.length;i++)
		    {
             d[a.length+i] = b[i];
		    }

		    for(int i=0;i<c.length;i++)
		    {
            d[a.length+b.length+i] = c[i];
		    }

		    for(int i =0;i<d.length;i++){
		    	System.out.println(d[i]);
		    }
	}
}*/


/*class Test
 {
	   public void m1()
	   {
	   	  System.out.println("m1 method parent");
	   }

	    public void m2()
	    {
	    	   System.out.println("m2 method parent");
	    }
}

class Child extends Test
{
	     public void m3()
	     {
	       	System.out.println("m3 method child");
	     }

	      public void m4()
	      {
	      	System.out.println("m4 method child");
	      }

	      public static void main(String[] args)
	       {
	      	   Child c = new Child();
	      	    c.m1();
	      	    c.m3();*/



/*class Test{
	public static void main(String[] args) {
		      int a[] = {0,2,3,4,5,6};
		      int arr[] = new int[a.length-1];
		      for(int i =0;i<a.length-1;i++)
		      {
                arr[i] = a[i+1];
		      }

		      for(int i=0;i<arr.length;i++){
		      	System.out.println(arr[i]);
		      }
	}
}*/


// class Test9999{
// 	public static void main(String[] args) {
// 		      String s = "hello i am monika";
// 		      char ch[] = s.toCharArray();
// 		      int start = 0,last = ch.length-1;
// 		      while(start<last)
// 		      {
// 		      	  char c = ch[start];
// 		      	  ch[start] = ch[last];
// 		      	  ch[last] = c;
// 		      	  start++;
// 		          last--;
// 		      }
// 		      s = new String(ch);
// 		      System.out.println(s);
// 		}
// }



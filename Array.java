/*class Test{
	public static void main(String[] args) {
		int a[]={1,2,3,4,5,6};
		for(int i=0;i<a.length;i++){
			System.out.println(a[i]);
		}

	}
}*/

//ARRAY EVEN VALUE SUM
/*class Test1{
	public static void main(String[] args) {
		int a[]={1,2,3,4,5,6};
		int sum=0;
		for(int i=0;i<a.length;i++){
			if(i%2!=0){
				sum=sum+a[i];
			}
		}
		System.out.println(sum);
	}

}*/

//ARRAY ODD VALUE SUM
/*class Test2{
	public static void main(String[] args) {
		int a[]={1,2,3,4,5,6,7,8};
		int sum=0;
		for(int i=0;i<a.length;i++){
			if(i%2==0){
				sum=sum+a[i];
			}
		}
		System.out.println(sum);
	}
}*/
                       //REVERSE ARRAY
/*class Test3{
	public static void main(String[] args) {
		  int a[]={1,2,3,4,5};
		  System.out.println("Before Rverese");
		  for(int i=0;i<a.length;i++){
             System.out.println(a[i]);
		  }
		  System.out.println("After Reverse");
		    int start=0;
		    int last=a.length-1;
		     while(start<last){
		     	int temp=a[start];
		     	 a[start]=a[last];
		     	 a[last]=temp;
		     	 start++;
		     	 last--;
		     }
		     for(int i=0;i<a.length;i++){
		     	System.out.println(a[i]+" ");
		     }
	}
}*/

                                     //  REVERSE ARRAY
/*class Test4{
	public static void main(String[] args) {
		    int a[]={1,2,3,4,5};
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
}*/

/*class Test5{
	public static void main(String[] args) {
		int a[]={1,2,3,4,5,6};
		int min=a[0];
		int smin=a[1];
		for(int i=0;i<a.length-1;i++){
			if(min>a[i]){
				smin=min;
				min=a[i];
		}
		else if(a[i]<smin && a[i]>min)
			 smin=a[i];
	
	}
	  System.out.println(min);
	  System.out.println(smin);
}
}




class Test6{
	public static void main(String[] args) {
		 int a[]={1,2,3,4,5};
		 int max=a[0];
		 int smax=a[1];
		 for(int i=0;i<a.length;i++){
		 	if(max<a[i]){
		 		smax=max;
		 		max=a[i];
		 }
		 else if(a[i]>smax && a[i]< max)
		 	 smax=a[i];
		 
	}
	System.out.println(max);
	System.out.println(smax);
}
}*/

/*class Test7{
	public static void main(String[] args) {
		int a[]={1,2,3,5,15,20,21};
		for(int i=0;i<a.length;i++){
			if(a[i]%4==0 && a[i]%5==0)
				System.out.println(a[i]);
		}
	    
	}
	
}

class Test8{
	public static void main(String[] args) {
		int a[]={1,2,3,4,5};
		int max=a[0];
		for(int i=0;i<a.length;i++){
			if(max<a[i]){
				max=a[i];
			}
			//System.out.println(max);
		}
		System.out.println(max);
	}
}*/

/*class Test9{
	public static void main(String[] args) {
		
		int a[]={1,2,3,4,5,3,5,6,3,3,3,3,3,3};
		System.out.println("Print Element");
		for(int i=0;i<a.length;i++){
			System.out.println(a[i]+"");
		}
		System.out.println("\n Counting Total Duplicate:");
		  int count=0;
		  for(int i=0;i<a.length;i++){
             for(int j=i+1;j<a.length;j++){
             	if(a[i]==a[j]){
             		count++;
             	   break;
             }
		  }
	}
	System.out.println(count);
}
	
}*/

/*class Test10{
	public static void main(String[] args) {
		int a[]={20,60,30,50,80,100};
		int delete=100;
		for(int i=0;i<a.length;i++)

		{

			if(delete==a[i])

			{
				for(int j=i;j<a.length-1;j++)
				{
					a[j]=a[j+1];
				}
				break;
			}*/
			/*for(i=0;i<a.length-1;i++){
				System.out.println(a[i]);*/
			
		/*}
		for(int i=0;i<a.length-1;i++){
			System.out.println(a[i]);
		}
	}
}*/

class Test11{
	public static void main(String[] args) {
		int a[]={10,30,40,50,70};
		int delete=50;
		for(int i=0;i<a.length;i++)
		{
			if(delete==a[i])
			{
               for(int j=i;j<a.length;j++)
               {
               	  a[j]=a[j+1];
               	  break;
               }
			}
			for( i=0;i<a.length;i++){
				System.out.println(a[i]);
			}
		}

	}
}


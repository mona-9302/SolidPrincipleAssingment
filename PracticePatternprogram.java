class Pattern{
	 public static void main(String[] args) {
	 	 int n = 5;
	 	 for(int i=0;i<n;i++)
	 	 {
	 	 	 for(int j=0;j<n;j++)
	 	 	 {
	 	 	 	if(i==j||i<j){
	 	 	 		System.out.print("*");
	 	 	 	}
	 	 	 	else {
	 	 	 		System.out.print("");
	 	 	 	}
	 	 	 }
	 	 	 System.out.println();
	 	 }
	 }
}


class Pattern1{
	public static void main(String[] args) {
		  int n=5;
		  for(int i=n;i>0;i--){
		  	for(int j=1;j<=i;j++){
		  		System.out.print(j); 
		  	}
		  	System.out.println();
		  }
	}
}

class  Pattern2{
	public static void main(String[] args) {
		 int n=5;
		 int num=1;
		 for(int i=1;i<n;i++){
		 	for(int j=1;j<=i;j++){
               System.out.print(num+"");
               num++;
		 	}
		 	System.out.println();
		 }
	}
}


class Pattern3{
	public static void main(String[] args) {
		 int n=5;
		 int num=1;
		 for(int i=1;i<n;i++){
		 	for(int j=0;j<i;j++){
              System.out.print(num+"");
              num--;
		 	}
		 	System.out.println();
		 }
	}
}


class NumberPattern{
	public static void main(String[] args) {
		 int n=5;
		 for(int i=n;i>0;i--)
		 {
		 	for(int j=1;j<=i;j++)
		 	{
                System.out.print(i);
               
		 	}
		 	System.out.println();
		 }
	}
}


class NumberPattern1{
    public static void main(String[] args) {
    	  int n = 5;
    	  for(int i=1;i<=n;i++){
    	  	for(int j=1;j>i;j++){
    	  		System.out.print(j);
    	  	}
    	  	System.out.println();
    	  }
    }
}


class NumberPattern2{
	public static void main(String[] args) {
		   
		      int n=5;
		      for(int i=0;i<=n;i++){
		      	for(int j=0;j<=i;j++)
		      	{
		      		if((i+j)%2==0)
		      	   {
		      		System.out.print("1");
		      	   }

		      	   else
		      	   {
		      	   	System.out.print("0");
		      	   }
		      	}
		      	System.out.println();
		  }
    }
}

class NumberPattern3{
	public static void main(String[] args) {
		  
		  int arr[] = {20,1,70,30,55,23};
		  for(int i=0;i<arr.length-1;i++)
		  {
		  	   int temp;
		  	  for(int j=0;j<arr.length-1;j++)
		  	  {
		  	  	if(arr[j]>arr[j+1])
		  	  	{
		  	  		temp = arr[j+1];
		  	  		arr[j+1] = arr[j];
		  	  		arr[j] = temp;
		  	  	}
		  	  }
		  }

		  for(int j=0;j<arr.length;j++){
		  	  	System.out.println(arr[j]);
		  	  }
	}
}

class StarA{
	public static void main(String[] args) {
		
		 int n = 6;
		 for(int i=0;i<=n;i++)
		 {
		 	for(int j=0;j<=n;j++)
		 	{
		 		// System.out.print(i+""+j+" ");
		 		if(i==0||j==n||j==0||i==n/2){
		 			System.out.print("*");
		 		}else{
                  
                    System.out.print(" ");
		 		}
		 	}
		 	System.out.println();
		 }

	}
}

class StarB{
	public static void main(String[] args) {
		 int n = 11;
		 if(n%2!=0)
		 	n+=1;
		 for(int i=0;i<=n;i++){
		 	for(int j=0;j<=n;j++){
		 		 if(j==0||i==0||j==n||i==n||i==n/2){
		 		 	System.out.print("*");
		 		 }
		 		 else {
		 		 	System.out.print(" ");
		 		 }
		 	}
		 	System.out.println();
		 }
	}
}

class StarC{
	public static void main(String[] args) {
		 
		  int  n = 5;
		  for(int i=0;i<=n;i++){
		  	 for(int j=0;j<=n;j++){
		  	 	if(i==0||j==0||i==n){
		  	 		System.out.print("*");
		  	 	}else {
		  	 		System.out.print(" ");
		  	 	}
		  	 }
		  	 System.out.println();
		  }
	}
}

class StarD{
	public static void main(String[] args) {
		 int  n = 8;
		 for(int i=0;i<=n;i++){
		 	for(int j=0;j<=n;j++){
		 		if(j==0||i==0||j==n||i==n){
		 			System.out.print("*");
		 		}else {
		 			System.out.print(" ");
		 		}
		 	}
		 	System.out.println();
		 }
	}
}

class StarE{
	public static void main(String[] args) {
		 int n = 5;
		 for(int i=0;i<=n;i++){
		 	for(int j=0;j<=n;j++){
		 		if(i==0||j==0||i==n/2||i==n){
		 			System.out.print("*");
		 		}else {
		 			System.out.print(" ");
		 		}
		 	}
		 	System.out.println();
		 }
	}
}

class IsPrimeNumber{

	  public static void main(String[] args) {
	  	
	  	  int n = 61;
          boolean flag = true;

	  	  for(int i=2;i<n/2;i++){

	  	  	   if(n/2!=0)
	  	  	   {
	  	  	   	    flag = false;
	  	  	   	    break;
	  	  	   }
	  	  }

	  	  if(flag){
	  	  	System.out.println("number is prime");
	  	  }
	  	  else {
	  	  	System.out.println("no is not prime");
	  	  }
	  }
}



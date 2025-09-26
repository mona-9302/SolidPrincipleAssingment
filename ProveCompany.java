class CountNumberProgram{

	public static void main(String[] args) {
		
		int n = 123456;
		int count = 0;

		while(n!=0){

			n = n/10;
			count++;
		}
		System.out.println(count);
	}
}


class PowerProgram{

	public static void main(String[] args) {
		
		 int n = 2 , p = 3 , data = 1;

		 for(int i=1;i<=p;i++){
		 	 data = data * n;
		 }
		 System.out.println(data);
	}
}


class PrintAmrStrongNumber{


	public static int count(int n){
		int count = 0;
		while(n!=0){
			n = n/10;
			count++;
		}
		return count++;
	}

	public static int powerProgram(int n , int p){
		int data = 1;
		for(int i=1;i<=p;i++){

			data = data*n;
		}
		return data;
	}

	public static void main(String[] args) {
		
         int n = 153,rem,sum=0;
		 int temp = n;

		 int value = count(n);
		 while(n!=0){
		 	rem = n%10;
		 	int Data = powerProgram(rem,value);
		 	sum = sum+Data;
		 	n = n/10;
		 }
		 if(sum==temp){
		 	System.out.println("number is armstrong");
		 }
		 else {
		 	System.out.println("number is  not armstrong");
		 }
	}
}

class PrintPrimeNumber{

	public static void main(String[] args) {
		
		 for(int num=2;num<=100;num++){
		 	boolean isPrime = true;


		 	for(int i=2;i<=num/2;i++){
		 		if(num%i==0){
		 			isPrime = false;
		 			break;
		 		}
		 	}
		 	System.out.println(num);
		 }
	}
}
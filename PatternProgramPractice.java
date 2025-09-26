class First{

	public static void main(String[] args) {
		
        printPattern(12);
	}

	 public static void printPattern(int n){

	 	 for(int i=0;i<=n;i++){
	 	 	 for(int j=0;j<=i;j++){
	 	 	 	System.out.print("*");
	 	 	 }
	 	 	 System.out.println();
	 	 }
	 }
}

class Second{

	public static void main(String[] args) {
		
		 printPattern(10);
	}

	public static void printPattern(int n){
		 for(int i=n;i>=1;i--){

		 	 for(int j=1;j<i;j++){
		 	 	System.out.print(" ");
		 	 }
		 	 for(int k=0;k<=n-i;k++){
		 	 	System.out.print("*");
		 	 }
		 	 System.out.println();
		 }
	}
}

class Third{

	public static void main(String[] args) {
		 
		  printPattern(12);
	}

	public static void printPattern(int n){

		for(int i=n;i>=0;i--){
			for(int j=i;j>=0;j--){
				System.out.print("*");
			}
			System.out.println();
		}
	}
}

class m {
	 public static void main(String[] args) {
	 	 int n =10;
	 	 for(int i=n;i>=0;i--){

             
	 	 	 for(int j=i;j>=0;j--){
	 	 	 	System.out.print("*");
	 	 	 }
	          
	 	 	 System.out.println();
	 	 }
	 }
}

class MO{
	public static void main(String[] args) {
		 int n = 5;
		 for(int i=n;i>=0;i--){
		 	 for(int j=0;j<i;j++){
		 	 	System.out.print(" ");
		 	 }
		 	 for(int j=0;j<=n-i;j++){
		 	 	System.out.print("*");
		 	 }
		 	 System.out.println();
		 }
	}
}

class  LeftSideTriangle{

	public static void main(String[] args) {
		
		 int n= 6;
		 for(int i=0;i<=n;i++){
		 	for(int j=0;j<=i;j++){
		 		System.out.print("*");
		 	}
		 	System.out.println();
		 }
	}
}

class RightSideTriangle{

	public static void main(String[] args) {
		
		 int n = 10;
		 for(int i=n;i>=0;i--){
		 	for(int j=i;j>=0;j--){
		 		System.out.print(" ");
		 	}
		 	for(int j=0;j<=n-i;j++){
		 		System.out.print("*");
		 	}
		 	System.out.println();
		 }
	}
}

class ReverseLeftSideTriangle{

	public static void main(String[] args) {
		
		 int n = 12;
		 for(int i=5;i>=0;i--){
		 	 for(int j=i;j>=0;j--){
		 	 	System.out.print("*");
		 	 }
		 	 System.out.println();
		 }
	}
}

class ReverseRightAngle{
	public static void main(String[] args) {
		 int n  = 5;
		 for(int i=n;i>0;i--){
		 	 for(int j=0;j<=n-i;j++){
		 	 	System.out.print(" ");
		 	 }

		 	 for(int j=0;j<i;j++){
		 	 	System.out.print("*");
		 	 }
		 	 System.out.println();
		 }
	}
}

class PrintTriangle{

	public static void main(String[] args) {
		
		 int n = 5;
		 
	}
}
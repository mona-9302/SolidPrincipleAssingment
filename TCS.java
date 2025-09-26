class  Pattern{
	public static void main(String[] args) {
		int n = 6;
		if(n%2==0)
			n+=1;
		for(int i=0;i<=n;i++){
			for(int j=0;j<=n;j++){
			  if(j==0||i==n||i==j||n/2==){
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
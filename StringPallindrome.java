class Test{
	public static void main(String[] args) {
		  
		    String s = "eye";
		    char ch[] = s.toCharArray();
		    int first = 0,last=ch.length-1;
		    boolean temp = true;
		    while(first<last)
		    {
		    	if(ch[first]!=ch[last])
		    	{
		    		temp= false;
                    break;
		    	}
                  first++;
		    	  last--;
           }
           if(temp)
           {
            	System.out.println("palindrome");
           }
           else 
           {
           	  System.out.println("not palindrome");
           }

	}
}

class UpperCaseProgram{
	public static void main(String[] args) {
		
		 String s = "MONIKA";
		 char ch[] = s.toCharArray();

		 for(int i=0;i<ch.length;i++){
		 	 ch[i] = (char)(ch[i] + 32);
		 }

		 String lower = new String(ch);
		 System.out.println("LowerCase =====>"+lower);
	}
}


class StringLowerProgram{
	public static void main(String[] args) {
		
		String s = "MONIKA";
		char ch[] = s.toCharArray();

		for(int i=0;i<ch.length;i++){
			 ch[i] = (char)(ch[i]+32);
		} 

		String lower = new String(ch);
		System.out.println(lower); 
	}
}


class FirstNonRepeatingCharacter{
	public static void main(String[] args) {
		
      String str = "aaoccdeff";
      char[] ch = str.toCharArray();

      for (int i = 0; i < ch.length; i++) {
      int count = 0;

      for (int j = 0; j < ch.length; j++) {
        if (ch[i] == ch[j]) {
            count++;
        }
    }

       if (count == 1) {
        System.out.println("First non-repeating character is: " + ch[i]);
        return;
    }
}
System.out.println("No non-repeating character found.");

	}
}


class FirstNon{
	public static void main(String[] args) {
		
		String s = "aaaffeddg";
		char ch[] = s.toCharArray();

		for(int i=0;i<ch.length;i++){
			 int count = 0;

			 for(int j=0;j<ch.length;j++){
			 	 if(ch[i]==ch[j]){
			 	 	count++;
			 	 }
			 }
			 if(count==1){
			 	System.out.println("first repetive character: " +ch[i]);
			 	return;
			 }
		}
		System.out.println("non repetive character ");
	}
}


class First{
	public static void main(String[] args) {
		
		 String s  = "monikamonkaa";
		 char ch[] = s.toCharArray();

		 for(int i=0;i<ch.length-1;i++){
		 	 int count  = 0;

		 	 for(int j=0;j<ch.length;j++){
		 	 	if(ch[i]==ch[j]){
		 	 		count++;

		 	 	}
		 	 }
		 	 if(count==1){
		 	 	System.out.println("first non repitive character "+ch[i]);
		 	 	break;
		 	 }
		 }

	}
}


class PrintPrimeNumber{
	public static void main(String[] args) {
		
		for(int num = 2;num<=100;num++){
			boolean isPrime = true;

			for(int i=2;i<num/2;i++){

				if(num%i==0){
					isPrime = false;
					break;
				}
			}

			if(isPrime){
				System.out.println(num+" ");
			}
		}
	}
}

class ReverseArrayProgramFre{
	public static void main(String[] args) {
		
		int arr[] = {1,2,3,4,5,6,1,1,1,1,1,4,2,5,3,7,3,3,3,6};

		for(int i=0;i<arr.length-1;i++){
			int count = 1;

			if(arr[i]==-1)
				continue;


			for(int j=i+1;j<arr.length;j++){
				if(arr[i]==arr[j]){
					count++;
					arr[j] = -1;
				}
			}

			System.out.println(arr[i]+" ======> " +count);
		}
	}
}


class FindDuplicateArray{

	public static void main(String[] args) {
		
		 int arr[] = {1,2,3,4,4,10,5,1,6,8,9,9,5,2,6,3,9};

		 for(int i=0;i<arr.length;i++){
		 	 int count = 0;

		 	 for(int j=0;j<arr.length;j++){
		 	 	 if(arr[i] == arr[j]){
		 	 	 	
		 	 	 	count++;
		 	 	 	
		 	 	 }
		 	 }

		 	 if(count==1){
		 	 	System.out.println("first non repitive character "+arr[i]);
		 	 	return;
		 	 }
		 }
	}
}
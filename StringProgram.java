class P1{
	public static void main(String[] args) {
		 
		  String s = "monika";
		  for(int i=s.length()-1;i>=0;i--){
		  	if(s.charAt(i)==' ')
		  		continue;
		  	System.out.println(s.charAt(i));
		  }
	}
}

class P2{
	public static void main(String[] args) {
		
		 String s = "monika";
		 char ch[] = s.toCharArray();

		 int start = 0,last=ch.length-1;
		 while(start<last){
		 	char c = ch[start];
		 	ch[start] = ch[last];
		 	ch[last] = c;

		 	start++;
		 	last--;
		 }

		 for(int i=0;i<ch.length;i++){
		 	System.out.println(ch[i]);
		 }
	}
}

class P3{
	public static void main(String[] args) {
		
		 String s = "eye";
		 char ch[] = s.toCharArray();
		 int start=0,last=ch.length-1;
         boolean temp = true;
		 for(int i=0;i<ch.length-1;i++){
		 	if(ch[i]==' ')
		 		continue;
		 	if(ch[start]!=ch[last]){
              temp = false;
              break;
		 	}
		 }

		 if(temp){
		 	System.out.println("is  pallindrome");
		 }
		 else {
		 	System.out.println("not pallindrome");
		 }
	}
}


class P4{
	public static void main(String[] args) {
		
		 String s = "aabbccddeeefff";
		 char ch[] = s.toCharArray();

         
		 for(int i=0;i<ch.length-1;i++){
		  int count = 1;	
           if(ch[i]=='0')
           	continue;
		 	for(int j=i+1;j<ch.length;j++){
		 		if(ch[i]==ch[j]){
		 			count++;
		 			ch[j] = '0';
		 		}
		 	}
		 	System.out.println(ch[i]+" ======> "+count);
		 }
	}
}


class P5{
	public static void main(String[] args) {
		 
		  String s = "abcceffffffggg";
		  char ch[] = s.toCharArray();

		  for(int i=0;i<ch.length-1;i++){
		  	int count = 1;

           if(ch[i]=='0')
           	continue;
		  	for(int j=i+1;j<ch.length;j++){
		  		if(ch[j]==ch[i]){
		  			count++;
		  			ch[j] = '0';
		  		}
		  	}

            if(count >1 && ch[i]!='0'){
		  		System.out.println(ch[i]);
		  	}
		  }
	}
}

class P6{
	public static void main(String[] args) {
		
		 String s = "monika";
		 char ch[] = s.toCharArray();

		 for(int i=0;i<ch.length;i++){
		 	 ch[i] = (char)(ch[i]-32);
		 }

		 String upper = new String(ch);
		 System.out.println(upper);
	}
}

class P7{
	public static void main(String[] args) {
		
		 String s = "monika@123";
		 char ch[] = s.toCharArray();

		 for(int i=0;i<ch.length-1;i++){
		 	 if((ch[i]>='a' && ch[i]<='z')||(ch[i]>='A' && ch[i]<='Z')){
		 	 	System.out.println(ch[i]);
		 	 }
		 }
	}
}

class P8{
	public static void main(String[] args) {
		
		 String s = "monikamarajputmo";
		 char ch[] = s.toCharArray();

		 for(int i=0;i<ch.length-1;i++){
		 	int count = 0;

		 	for(int j=0;j<ch.length;j++){
		 		if(ch[i]==ch[j]){
		 			count++;
		 			
		 		}
		 	}
		 	
		 	if(count==1){
		 		System.out.println("first non repitive character "+ch[i]);
		 		return;
		 	}
		 }
	}
}


class P9{
	public static void main(String[] args) {
		
		String s = "aabcmmksl";
		char ch[] = s.toCharArray();

		for(int i=0;i<ch.length-1;i++){
			int count = 0;
			for(int j=0;j<ch.length;j++){

				if(ch[i]==ch[j]){
					count++;
				}
			}
			if(count==1){
				System.out.println("first non repitive character ====> "+ch[i]);
				return;
			}
		}
	}
}

class CountDigitCharacterAndSymbol{
	public static void main(String[] args) {
		
		 String s = "monikaeurjpt@123%$4";
		 char ch[] = s.toCharArray();

		 int vowel = 0,consonant=0,symbol=0,digit=0;

		 for(int i=0;i<ch.length;i++){

		 	if((ch[i]>='a' && ch[i]<='z')||(ch[i]>='A' && ch[i]<='Z')){

		 		 if(ch[i]=='a'||ch[i]=='e'||ch[i]=='i'||ch[i]=='o'||ch[i]=='u'||ch[i]=='A'||ch[i]=='E'||ch[i]=='I'||ch[i]=='O'||ch[i]=='U'){
                   vowel++;
		 		 }
		 		 else {
		 		 	 consonant++;
		 		 }
		 	}

		 	else if(ch[i]>='0' && ch[i]<='9'){
		 		digit++;
		 	}
		 	else {
		 		symbol++;
		 	}

		 }
		 System.out.println("vowel ====> "+vowel);
         System.out.println("conosonant =====>"+consonant);
         System.out.println("digit =====>"+digit);
         System.out.println("symbol ======>"+symbol);
	}
}


class P10{
	public static void main(String[] args) {
		
		 String s = "monika";
		 char ch[] = s.toCharArray();
		 int count = 0;

		 for(int i=0;i<ch.length;i++){
		 	count++;
		 }
		 System.out.println(count);
	}
}

class P11{
	public static void main(String[] args) {
		
		 String s = "monika";
		 char ch[] = s.toCharArray();

		 for(int i=0;i<ch.length;i++){
		 	 if(i%2!=0){
		 	 	System.out.println("even characters ");
		 	 	System.out.println(ch[i]);
		 	 }
		 	 else {
		 	 	System.out.println("odd characters ");
		 	 	System.out.println(ch[i]);
		 	 }
		 }
	}
}


class  StrReverse{

	public static void main(String[] args) {
		
		String s = "nayana";
		char ch[] = s.toCharArray();
         boolean temp = true;

		int start=0,last=ch.length-1;
         for(int i=0;i<ch.length-1;i++){
         	if(ch[start]!=ch[last]){
         		temp = false;
         		break;
         	}
         }
         if(temp){
         	System.out.println("is pallindrome");
         }
         else {
         	System.out.println("not pallindrome");
         }
	}
}

class FrequencyCount{

	public static void main(String[] args) {
		
		 String s = "mzmonikafkgmona";
		 char ch[] = s.toCharArray();

		 for(int i=0;i<ch.length;i++){
		 	int count = 0;
		 	
		 	for(int j=0;j<ch.length;j++){
		 		 if(ch[i]==ch[j]){
		 		 	count++;
		 		 	
		 		 }
		 	}
		 	if(count==1){
		 		System.out.println(ch[i]);
		 		return;
		 	}
		 }
	}
}


class SortingString{

	public static void main(String[] args) {
		
		String s = "mfidnisniias";
		char ch[] = s.toCharArray();

		for(int i=0;i<ch.length;i++){
			 for(int j=i+1;j<ch.length;j++){

			 	 if(ch[i]<ch[j]){
			 	 	 char c = ch[i];
			 	 	 ch[i] = ch[j];
			 	 	 ch[j] = c;
			 	 }
			 }
			 System.out.println(ch[i]);
		}
	}
}

class CountChar{

	public static int count(String s){
		int count = 0;
		 for(int i=0;i<s.length();i++){
		 	 count++;
		 }
		 return count;
	}
	public static void main(String[] args) {
		
		 String s = "Pawanika";
		 System.out.println(count(s));

	}
}

class CheckVowelAndConsonant{

	public static void main(String[] args) {
		
		String s = "monika";
		char ch[] = s.toCharArray();
		int vowel = 0,consonant=0;

		for(int i=0;i<ch.length;i++){
			 if(ch[i]=='a' || ch[i]=='e'|| ch[i]=='i'||ch[i]=='o'||ch[i]=='u'){
			 	vowel++;
			 }
			 else {
			 	consonant++;
			 }
		}
		System.out.println("vowel -----> " +vowel);
		System.out.println("consonant -----> " +consonant);
	}
}

class RemoveFirstChar{

	public static void main(String[] args) {
		
		 String s = "monika";
         char ch[] = s.toCharArray();
         char c = ' ';

         for(int i=0;i<ch.length;i++){
         	 if(ch[i]==ch[i]){
                c = ch[i];
         	 }
         	 System.out.println(c);
         }	 
	}
}

class CheckPrimeNumber{

	public static void main(String[] args) {
		
		 int n = 8;
		 boolean temp = true;
		 for(int i=2;i<n/2;i++){
           if(i%2==0){
           	  temp = false;
           	  break;
           }
		 }
		 if(temp){
		 	System.out.println("prime number");
		 }
		 else {
		 	System.out.println("not prime number hai ");
		 }
	}
}




class ReverseArray{

	public static void main(String[] args) {
		
		int arr[] = {1,2,3,4,5,6};
		for(int i=arr.length-1;i>=0;i--){
			 System.out.println(arr[i]);
		}
	}
}

class FindDuplicateArray{

	public static void main(String[] args) {
		
		 int arr[] = {1,1,2,3,4,2,5};
		 for(int i=0;i<arr.length;i++){
		 	 // int count = 1;
          
             if(arr[i]==-1)
             	continue;

		 	 for(int j=i+1;j<arr.length;j++){
		 	 	 if(arr[i]==arr[j]){
		 	 	 	 // count++;
		 	 	 	 arr[j] = -1;
		 	 	 }
		 	 }
		 	 System.out.println(arr[i]);
		 }
	}
}

class CheckMinimum{

	public static void main(String[] args) {
		
		 int arr[] = {0,1,2,3,4,5,6,-1};
		 int min = arr[0];

		 for(int i=0;i<arr.length;i++){
		 	 if(min>arr[i]){
		 	 	 min = arr[i];
		 	 }
		 }
		 System.out.println(min);
	}
}

class deleteCharFirst{
	public static void main(String[] args) {
		 
		 String s = "zmonika";
		 String result = "";

		 for(int i=1;i<s.length();i++){
		 	 result = result+s.charAt(i);
		 }
		 System.out.println(result);
	}
}


class Mp{
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
	}
}
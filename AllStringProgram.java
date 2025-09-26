//Reverse String 
class ReverseStringProgram{
	public static void main(String[] args) {
		
		  String s = "Pawanika";
		  char ch[] = s.toCharArray();
		  int start = 0, last = ch.length-1;
          System.out.println("Before Reverse String");
          for(int i=0;i<ch.length;i++){
          	System.out.println(ch[i]);
          }
		  while(start<last){
		  	   char c = ch[start];
		  	   ch[start] = ch[last];
		  	   ch[last] = c;

		  	   start++;
		  	   last--;
		  }

          System.out.println("After Reverse String");
		  for(int i=0;i<ch.length;i++){
		  	System.out.println(ch[i]);
		  }
	}
}


class StringPallindromeProgram{
	public static void main(String[] args) {
		
		 String s = "eye";
		 char ch[] = s.toCharArray();
         boolean temp = true;
		 int start = 0,last = ch.length-1;

         for(int i=0;i<ch.length;i++){
         	if(ch[start]!=ch[last])
         		temp = false;
         	     break;
         }

         if(temp){
         	System.out.println("is pallindrome");
         }
         else {
         	System.out.println("not pallindrome");
         }
	}
}


class UpperToLowerCaseProgram{
	public static void main(String[] args) {
		
		  String s = "PAWANIKA";
		  char ch[] = s.toCharArray();

		  for(int i=0;i<ch.length;i++){
		  	 ch[i] = (char)(ch[i] + 32);

		  }

		  String lower = new String(ch);
		  System.out.println("Lowercase =====>"+lower);
	}
}


class LowerToUppercaseProgram{
  public static void main(String[] args) {
  	  
  	    String s = "pawanika";
  	    char ch[] = s.toCharArray();

  	    for(int i=0;i<ch.length;i++){
  	    	 ch[i] = (char)(ch[i]-32);
  	    }

  	    String upper = new String(ch);
  	    System.out.println("Uppercase =====>"+upper);
  }
}


class FrequencyCountEasy {
    public static void main(String[] args) {
        String s = "monmkaao";
        char[] ch = s.toCharArray();

        for (int i = 0; i < ch.length; i++) {
            int count = 1;

            // Skip already counted characters
            if (ch[i] == '0')
                continue;

            for (int j = i + 1; j < ch.length; j++) {
                if (ch[i] == ch[j]) {
                    count++;
                    ch[j] = '0'; // mark as counted
                }
            }

            System.out.println(ch[i] + " = " + count);
        }
    }
} 


class StringPractice1
{
	public static void main(String[] args) {
		  String s = "eyem";
		  char ch[] = s.toCharArray();
		  
		  for(int i=0;i<ch.length;i++){
		  	 ch[i] = (char) (ch[i] - 32);

		  	 System.out.println(ch[i]);
		  }


	}
}


class StringReverseWordProgram{
	public static void main(String[] args) {
		 String s = "I Love India";
		 char ch[] = s.toCharArray();
     
		  String words[] = new String[20];
		  int wordIndex = 0;
		  String word = " ";

		  for(int i=0;i<ch.length-1;i++){
		  	 if(ch[i]!=' '){
            word = word+ch[i];
		  	 }
		  	 else {
		  	 	  words[wordIndex] = word;
		  	 	  wordIndex++;
		  	 	  word = " ";
		  	 }
		  }
      words[wordIndex] = word;
		  for(int i=wordIndex;i>=0;i--){
		  	System.out.println(words[i]);
		  }
	}
}
		

class MaximumProgramArray{
	public static void main(String[] args) {
		
		  int arr[] = {10,20,30,50,70,0};
		  int target = 70;
		  boolean found = false;

		  for(int i=0;i<arr.length;i++){
		  	 if(arr[i] == target){
		  	 	  found = true;
		  	 	  break;
		  	 }
		  }
		  if(found){
		  	System.out.println("element found");
		  }

		  else 
		  {
		  	System.out.println("not found");
		  }
	}
}


//  class RemoveDuplicates {
//     public static void main(String[] args) {
//         int[] arr = {1, 2, 2, 3, 4, 4, 5};

//         for (int i = 0; i < arr.length; i++) {
//             boolean isDuplicate = false;

//             for (int j = 0; j < i; j++) {
//                 if (arr[i] == arr[j]) {
//                     isDuplicate = true;
//                     break;
//                 }
//             }

//             if (!isDuplicate) {
//                 System.out.print(arr[i] + " ");
//             }
//         }
//     }
// }


class Frequency{
	public static void main(String[] args) {
		
		  String s = "monikaamkeorrs";
		  char ch[] = s.toCharArray();

		  for(int i=0;i<ch.length;i++)
		  {
		  	 int count = 1 ;

		  	 if(ch[i] == '0')
		  	 	continue;

		  	 for(int j=i+1;j<ch.length;j++)
		  	 {
		  	 	 if(ch[i]==ch[j]){
		  	 	 	count++;

		  	 	 	ch[j]='0';
		  	 	 }
		  	 }

		  	 System.out.println("count " +count+ " is " +ch[i]);
		  }
	}
}


class StringFrequencyProgram{
	public static void main(String[] args) {
		
		   String s = "aabbbccccddddd";
		   char ch[] = s.toCharArray();
       int max = Integer.MAX_VALUE;
       char c = ' ';
		   for(int i=0;i<ch.length;i++){
		   	 int count = 1;

		   	 if(ch[i]=='0' || ch[i]==' ')
		   	 	continue;

		   	 for(int j=i+1;j<ch.length;j++){
		   	 	 if(ch[i]==ch[j]){
		   	 	 	count++;
		   	 	 	ch[j] = '0';
		   	 	 }
		   	 }

        if(count<max){
        		max = count;
        		c = ch[i];
        }
		   }
		    System.out.println("Character with maximum frequency: '" + c + "' occurred " + max + " times.");
	}
}


class ArrayFrequencyCount{
	 public static void main(String[] args) {
	 	
	 	   int arr[] = {1,2,3,1,22,4,6,3,7,1};
       int max = -1;
       int maxElement = -1;
	 	   for(int i=0;i<arr.length;i++){

	 	   	  int count = 1;
	 	   	  if(arr[i]==0)
	 	   	  	continue;

	 	   	  for(int j=i+1;j<arr.length;j++){
	 	   	  	  if(arr[i]==arr[j]){
	 	   	  	  	 count++;
	 	   	  	  	 arr[j] = 0;
	 	   	  	  }
	 	   	  }

	 	   	  if(count > max){
	 	   	  	 max = count;
             maxElement = arr[i];
	 	   	  }
	 	   }
	 	   System.out.println("count"+max+ " "+maxElement);

	 }
}


class StringPallindrome{
	public static void main(String[] args) {
		 
		 String s = "eye ";
		 char ch[] = s.toCharArray();
     boolean temp = true;

		 int start = 0,last = ch.length-1;
     
		 while(start<last){
		 	 if(ch[start]==' '){
		 	 	start++;
		 	 	continue;
		 	 }

		 	 if(ch[last]==' '){
		 	 	 last--;
		 	 	 continue;
		 	 }

		 	 if(ch[start]!=ch[last]){
		 	 	 temp = false;
		 	 	 break;
		 	 }
		 	 start++;
		 	 last--;
		 }

		 if(temp){
		 	System.out.println("is  pallindrome");
		 }
		 else {
		 	System.out.println("not pallindrome");
		 }
	}
}


class CountVowelAndConsonant{
	 public static void main(String[] args) {
	 	
	 	     String s = "pawanikam";
	 	     char ch[] = s.toCharArray();

	 	     int vowel = 0;
         int consonant = 0;
	 	     for(int i=0;i<ch.length;i++){
	 	     	  if(ch[i]=='a' || ch[i]== 'e' || ch[i]=='i' || ch[i]=='o' || ch[i]=='u'){
	 	     	  	 vowel++;
	 	     	  	 // System.out.println(ch[i]+" "+vowel+" vowel");
	 	     	  }
	 	     	  else {

	 	     	  	  consonant++;
	 	     	  	  // System.out.println(ch[i]+" "+consonant+" consonant");
	 	     	  }
	 	     }
	 	     System.out.println("vowel ====> "+vowel);
	 	     System.out.println("consonant ======> "+consonant);   
	 }
}


class SortingProgramString{
	public static void main(String[] args) {
		
		   String s = "fedcba";
		   char ch[] = s.toCharArray();

		   for(int i=0;i<ch.length-1;i++){
		   	  for(int j=0;j<ch.length-1-i;j++){
		   	  	 if(ch[j] > ch[j+1]){
		   	  	 	 char temp = ch[j];
		   	  	 	 ch[j] = ch[j+1];
		   	  	 	 ch[j+1] = temp;
		   	  	 }
		   	  }
		   }

		   String sortedString = new String(ch);
		   System.out.println("sorted string "+sortedString);
	}
}



class ArraySortingProgram{
	public static void main(String[] args) {
		
		  int arr[] = {6,5,4,3,2,1};

		  for(int i=0;i<arr.length-1;i++){
		  	 for(int j=0;j<arr.length-1-i;j++){
		  	 	  if(arr[j] > arr[j+1]){
		  	 	  	 int temp = arr[j];
		  	 	  	 arr[j] = arr[j+1];
		  	 	  	 arr[j+1] = temp;
		  	 	  }
		  	 }
		  }

		  for(int i=0;i<arr.length;i++){
		  	System.out.println("sorted array "+arr[i]+ " ");
		  } 
	}
}


class Test{
	public static void main(String[] args) {
		
		  String s = "pawanika";
		  System.out.println(s.toUpperCase());
	}
}


class PracticeStringFrequency{
	public static void main(String[] args) {
		
			    int arr[] = {1,2,3,42,2,1,3,1,3,4};

			    for(int i=0;i<arr.length;i++){
			    	  int count = 1;

			    	  if(arr[i]==-1)
			    	  	continue;

			    	  for(int j=i+1;j<arr.length;j++){
			    	  	if(arr[i]==arr[j]){
			    	  		count++;

			    	  		arr[j] = -1;
			    	  	}
			    	  }
			    	  System.out.println(arr[i]+" "+count);
			    }
		}
}

class RemoveDuplicates {
    public static void main(String[] args) {
        int[] arr = {1, 2, 2, 3, 4, 4, 5};

        for (int i = 0; i < arr.length; i++) {
            boolean isDuplicate = false;

            for (int j = 0; j < i; j++) {
                if (arr[i] == arr[j]) {
                    isDuplicate = true;
                    break;
                }
            }

            if (!isDuplicate) {
                System.out.print(arr[i] + " ");
            }
        }
    }
}



class FindMaximum{
	public static void main(String[] args) {
		
		  int arr[] = {0,1,2,3,4,5,9,6};
		  int max = arr[0];
      int secondMax = arr[0];

		  for(int i=0;i<arr.length;i++)
		  {
		  	 if(arr[i]>max){
		  	 	 max = arr[i];
		  	 }
		  }

      for(int i=0;i<arr.length;i++){
      	 if(arr[i]!=max){
      	 	 if(secondMax==max || arr[i]>secondMax){
      	 	 	  secondMax = arr[i];
      	 	 }
      	 }
      }
		  System.out.println(" Second Maximum Elements "+secondMax);
	}
}


class FindSecondMaximum{
	public static void main(String[] args) {
		
		  int arr[] = {1,2,3,4,5,6};
		  int max = arr[0];
		  int secondMax = arr[0];

		  for(int i=1;i<arr.length;i++){
		  	  if(arr[i] > max){
		  	  	max = arr[i];
		  	  }
		  }

		  for(int i=0;i<arr.length;i++){
		  	  if(arr[i]!= max){
		  	  	 if(secondMax == max || arr[i] > secondMax){
		  	  	 	 secondMax = arr[i];
		  	  	 }
		  	  }
		  }

		  System.out.println("SecondMaximum Element "+secondMax);
	}
}


class ArrayFrequencyCount1{

	public static void main(String[] args) {
		
		   int arr[] = {1,2,3,4,1,2,45,2,4,1};

		   for(int i=0;i<arr.length;i++){
		   	 int count = 1;

		   	 if(arr[i]==-1){
		   	 	 continue;
		   	 }

		   	 for(int j=i+1;j<arr.length;j++){
		   	 	  if(arr[i] == arr[j]){
		   	 	  	 count++;

		   	 	  	 arr[j] = -1;
		   	 	  }
		   	 }

		   	 System.out.println("element" + arr[i]+ "Count ====>" +count);
		   }
	}
}


class Pattern1{
	public static void main(String[] args) {
		
		    int n = 6;
		    for(int i=0;i<=n;i++){
		    	 for(int j=0;i<=n;j++){
		    	 	if(i==0 || j==0 || i+j==n){
		    	 		System.out.print("*");
		    	 	}
		    	 	else {
		    	 		System.out.print(" ");
		    	 	}
		    	 	// System.out.print("*");
		    	 }
		    	 System.out.println();
		    }
	}
}


class Pallindrome{
	public static void main(String[] args) {
		
		   String s = "nayan";
		   char ch[] = s.toCharArray();

		   boolean isPallindrome = true;
		   int start = 0,last = ch.length-1;

		   while(start<last){
		   	if(ch[start]!=ch[last]){
		   		  isPallindrome = false;
		   		  break;

		   		 
		   	}
		      	start++;
		   		  last--;
		   }
		   if(isPallindrome){
		   	System.out.println("is pallindrome");
		   }
		   else {
		   	System.out.println("not pallindrome");
		   }
	}
}

class StrFrequencyCount{
	public static void main(String[] args) {
		
		  String s = "monikaonikammmmmmmm";
		  char ch[] = s.toCharArray();
		  for(int i=0;i<ch.length-1;i++){

          int count = 1;
          if(ch[i] =='0'){
          	continue;
          }

          for(int j=i+1;j<ch.length;j++){
          	if(ch[i] == ch[j]){
          		count++;

          		ch[j] = '0';
          	}
          }
          System.out.println(ch[i]+" ===> "+count);
		  }

	}
}

class StrDuplicateCharacter{
	public static void main(String[] args) {
		
		    String s = "monikamomomo";
		    char ch[] = s.toCharArray();

		    for(int i=0;i<ch.length-1;i++){
		    	 int count = 1;

		    	 for(int j=i+1;j<ch.length;j++){
		    	 	 if(ch[i]==ch[j]){
		    	 	 	count++;
		    	 	 	ch[j] = '0';
		    	 	 }
		    	 }

		    	 if(count>1 && ch[i]!='0'){
		    	 	System.out.println(count + "====> " +ch[i]);
		    	 }
		    }
	}
}


class ArrayFrequencyCountProgram{
	public static void main(String[] args) {
		  
		   int arr[] = {1,2,3,5,1,3,5,1};

		    for(int i=0;i<arr.length-1;i++){
		    	 int count = 1;

		    	 for(int j=i+1;j<arr.length;j++){
		    	 	 if(arr[i] == arr[j]){
		    	 	 	 count++;

		    	 	 	 arr[j] = -1;
		    	 	 }
		    	 }

		    	 if(count>1 && arr[i]!=-1){
		    	 	System.out.println(arr[i]);
		    	 }
		    }
		  
		 }
}



class CheckVowelConsonantSpecialCharacter{

	 public static void main(String[] args) {
	 	
	 	    String s = "mona@123";
	 	    int vowel = 0,consonant=0,specialChar=0,digit=0;

	 	    for(int i=0;i<s.length();i++){
	 	    	char ch = s.charAt(i);

	 	    	  if((ch>='a'&&ch<='z') || (ch>='A' && ch<='Z'))
	 	    	  {

	 	    	  	  if(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u' || ch == 'A' || ch == 'E' || ch == 'I' ||
	 	    	  	   ch == 'O' || ch == 'U'){
	 	    	  	  	 vowel++;
	 	    	  	  }

	 	    	  	  else {
	 	    	  	  	 consonant++;
	 	    	  	  }

	 	    	  	  
	 	    	  }
	 	    	  else if(ch>='0' && ch<='9'){
	 	    	  	  	 digit++;
	 	    	  	  }
	 	    	  	  else {
	 	    	  	  	 specialChar++;
	 	    	  	  }
	 	    }
	 	    System.out.println("vowle ====> "+vowel);
	 	    System.out.println("consoant =====> "+consonant);
	 	    System.out.println("digit =====> "+digit);
	 	    System.out.println("special  =====> "+specialChar);
	 }
}


class PrintCharacter{

	  public static void main(String[] args) {
	  	
	  	  String s = "monika@1$%*&23";

	  	  for(int i=0;i<s.length();i++){
	  	  	 char ch = s.charAt(i);


	  	  	 if(!((ch>='a' && ch<='z') ||
	  	  	 	 (ch>='A' && ch<='Z') ||
	  	  	 	 (ch>='0' && ch<='9'))){
	  	  	 	System.out.println(ch);
	  	  	 }

 	  	  }
	  }
}  


//---------------------------------------------------------------------------------------------------------------

class Pattern{

	 public static void main(String[] args) {
	 	
	 	     int n = 5;
	 	     for(int i=1;i<=n;i++){
	 	     	 for(int j=1;j>=i;j++){
	 	     	 	 System.out.print(i + " ");
	 	     	 }
	 	     	 System.out.println();
	 	     }
	 }
}

class Pattern2{
	 public static void main(String[] args) {
	 	   
	 	   int n = 5;
	 	   for(int i=1;i<=n;i++){
	 	   	 for(int j=1;j<=i;j++){
	 	   	 	 System.out.print(i+ " ");
	 	   	 }
	 	   	 System.out.println();
	 	   }

	 }
}

class Pattern3{

	public static void main(String[] args) {
		   
		    int n = 5;
		    for(int i=n;i>=0;i--){
		    	 for(int j=1;j<=i;j++){
		    	 	 System.out.print(j+ " ");
		    	 }
		    	 System.out.println();
		    }
	}
}

// class Pattern4{
// 	 public static void main(String[] args) {
	 	
// 	 	   int n = 5;
// 	 	   for(int i=1;i<=n;i++){
// 	 	   	 for(int j=i;j<n;j++){
// 	 	   	 	  System.out.print(" ");
// 	 	   	 }

// 	 	   	 for(int k=1;k<=i;k++){
// 	 	   	 	  System.out.print(k+ " ");
// 	 	   	 }
// 	 	   	 System.out.println();
// 	 	   }
// 	 }
// }

// class Pattern5{
// 	 public static void main(String[] args) {
	 	
// 	 	    for (int i = 1; i <= 4; i++) {
//     for (int j = i; j < 4; j++) {
//         System.out.print("  ");
//     }
//     for (int k = 1; k <= i; k++) {
//         System.out.print(k + " ");
//     }
//     System.out.println();
// }
// 	 }
// }


class Pattern6{

	public static void main(String[] args) {
		
		  int n = 5;
		  for(int i=1;i<=n;i++){
		  	 for(int j=1;j<=n;j++){
		  	 	 System.out.print(j+" ");
		  	 }
		  	 System.out.println();
		  }
	}
}

class Pattern7{
	 public static void main(String[] args) {
	 	
	 	    int n = 5;
	 	    for(int i=n;i>=0;i--){
	 	    	  for(int j=i;j>=1;j--){
	 	    	  	 System.out.print(j+ " ");
	 	    	  }
	 	    	  System.out.println();
	 	    }
	 }
}

class Pattern8{

	public static void main(String[] args) {
		
		  int num = 1;
		  for(int i=1;i<=5;i++){
		  	 for(int j=1;j<=i;j++){
		  	 	 System.out.print(num+ " ");
		  	 	 num++;
		  	 }
		  	 System.out.println();
		  }
	}
}


class Pattern9{
	 public static void main(String[] args) {
	 	
	 	    int n = 5;
	 	    for(int i=n;i>=0;i--){
	 	    	 for(int j=1;j<=i;j++){
	 	    	 	 System.out.print(j+ " ");
	 	    	 }
	 	    	 System.out.println();
	 	    }
	 }
}

class Pattern10{
	public static void main(String[] args) {
		
		   int n = 5;
		   for(int i=1;i<=n;i++){
		   	 for(int j=1;j<=n;j++){
		   	 	 System.out.print(i+" ");
		   	 }
		   	 System.out.println();
		   }
	}
}


class Pattern11{
	public static void main(String[] args) {
		  
		   int n = 5;
		   for(int i=n;i>=0;i--){
		   	 for(int j=1;j<=i;j++){
		   	 	 System.out.print(i+" ");
		   	 }
		   	 System.out.println();
		   }
	}
}


class MRP{
	public static void main(String[] args) {
		 
		  String s = "monika@1234";
		  char ch[] = s.toCharArray();
      
      for(int i=0;i<ch.length-1;i++){
      	 if((ch[i]>='a'&&ch[i]<='z')||(ch[i]>='A'&&ch[i]<='Z')){
      	 	System.out.println(ch[i]);
      	 }
      }
	}
}

class UpperToLowerStringProgram{
	public static void main(String[] args) {
		
		  String s = "monika";
		  char ch[] = s.toCharArray();

		  for(int i=0;i<ch.length;i++){
		  	  ch[i] = (char)(ch[i]-32);
		  }

		  String lower = new String(ch);
		  System.out.println(lower);
	}
}

class LengthCount{
	public static void main(String[] args) {
		 
		  String s = "monikaaaaaaa";
		  char ch[] = s.toCharArray();
      int count = 0;
		  for(int i=0;i<ch.length;i++){
  
        count++;
		  }

		  System.out.println(count);
	}
}


class PrintDuplicate{

	public static void main(String[] args) {
		
       String s = "monikamo";
       char ch[] = s.toCharArray();

       for(int i=0;i<ch.length-1;i++){
       	 int count = 1;

       	 for(int j=i+1;j<ch.length;j++){
       	 	 if(ch[i] == ch[j]){
       	 	 	count++;
       	 	 	ch[j] = '0';
       	 	 }
       	 }

       	 if(count>1 && ch[i]!='0'){
       	 	System.out.println(ch[i]);
       	 }
       }
	}
}





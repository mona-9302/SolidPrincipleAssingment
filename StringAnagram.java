import java.util.*;
class Angram{
	public static void main(String[] args) {
		  String s = "silent";
		  String s1 = "listen";

		  char ch[] = s.toCharArray();
		  char ch1[]= s1.toCharArray();

		  Arrays.sort(ch);
		  Arrays.sort(ch1);

		  boolean result = Arrays.equals(ch,ch1);

		  if(result==true)
		  {
		  	 System.out.println("string is anagram");
		  }

		  else 
		  {
		  	 System.out.println("string not anagram");
		  }
	}
}
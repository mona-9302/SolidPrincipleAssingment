// class RevString{
// 	public static void main(String[] args) {
// 		  String s = "monika";
// 		  char ch[] = s.toCharArray();
// 		  int start = 0,last = ch.length-1;
// 		  while(start<last)
// 		  {
// 		  	  char c = ch[start];
// 		  	  ch[start] = ch[last];
// 		  	  ch[last] = c;
// 		  	  start++;
// 		  	  last--;
// 		  }

// 		  for(int i = 0;i<ch.length;i++)
// 		  {
// 		  	System.out.println(ch[i]);
// 		  }
// 	}
// }

class  RevString{
	public static void main(String[] args) {
		  int a[] = {1,2,3};
		  int b[] = {4,5,6};
		  int a_length = a.length;
		  int b_length = b.length;
		  int c_length = a_length+b_length;
		  int c[] = new int[c_length];
		  for(int i =0;i<a.length;i++)
		  {
		  	    c[i] = a[i];
		  }
		  for(int i =0;i<b.length;i++)
		  {
		  	 c[a.length+i]  = b[i];
		  }

		  for(int i =0;i<c.length;i++)
		  {
		  	System.out.println(c[i]);
		  }
	}
}

class StringReverseFirst{
	public static void main(String[] args) {
		
		  String s = "monika";
		  char ch[] = s.toCharArray();
		  int start = 0,last = ch.length-1;
		  while(start<last)
		  {
		  	  char c = ch[start];
		  	  ch[start] = ch[last];
		  	  ch[last] = c;

		  	  start++;
		  	  last--;
		  }

		  for(int i=0;i<ch.length-1;i++)
		  {
		  	System.out.println(ch[i]);
		  }
	}
}
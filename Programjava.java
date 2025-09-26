class Test
 {
   public static void main(String[] args)
     {
	      String s="nayan";
        char ch[]=s.toCharArray();
      
	    int start=0;
	   int last=ch.length-1;
	   while(start<last)
	   {
       if(ch[start]!=ch[last])
       	System.out.println(s+"is not pollindrum");
       System.out.println(ch);
      
       start++;
       last--;
     }
      if(start>=last)
      	System.out.println(s+"is pollindrum");
      System.out.println(ch);

	  }
  }


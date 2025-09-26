class Stack
{
	private Object stk[];
    private int top;

	  Stack()
	  {
	  	  this(5);
	  }

	  Stack(int size)
	  {
         stk = new Object[size];
         top = -1;
	  }
	  Stack(Stack s){
	  	this(5);
	  	push(s);
	  }

	   public int size()
	   {
	   	  return top+1;
	   }

	   public int capacity()
	   {
            return stk.length;
	   }

	    public void push(Object val)
	    {
         if(top == stk.length-1)
         {
         	    //System.out.println("stack is full");
         	  increaseSize();
         	  // return ;
         }
             top++;
             stk[top] = val;
	    }
	      public void  push(Stack stack)
	      {
            for(int i =stack.top;i>=0;i--)
            {
                 push(stack.stk[i]);
            }
	      }

	      public Object pop()
	      {
           if(top == -1)
           {
           	   return null;
           }
              Object ob = stk[top];  
             top--;
             return ob;
             
	      }

	      public Object peak()
	      {
           if(top == -1)
           {
           	   return null;
           }

           Object ob = stk[top];
             return ob;
	      }

	     public void increaseSize()
	     {
          int old_size = stk.length;
          int new_size = old_size + 5;
          Object ob [] = new Object[new_size];
           for(int i =top;i>=0;i--)
           
               ob[i] = stk[i];
             stk = ob;
           
	     }



	     /* public void reverse()
	      {
	      	      int bottom=top,i=0;
	      	      Object t=0;
	      	   while(i++ <= top)
	      	   {
	      	   	   t= stk[bottom];
	      	   	   stk[bottom]= stk[i];
	      	   	   stk[i]=t;
                 
                  bottom++;
             }
            
	      }*/
             
	      
	     public String toString()
	     {
            String s = "";
            for(int i =top;i>=0;i--)
            {
                s = s+","+stk[i];
            }

            return "["+s.substring(1)+"]";
	     }

}

class Test
{
	public static void main(String[] args) 
	{
		 Stack s = new Stack();
		 s.push(10);
		 s.push(20);
		 s.push(20);
		 s.push(20);
		 s.push(20);
		 s.push(20);
		 s.push(20);
		 s.push(20);
		 s.push(20);
		 s.push(40);
		 s.push(50);
		 s.push(60);
		System.out.println(s);

		
		  Stack s2 = new Stack();
	    s2.push(100);
		  s2.push(200);
		  s2.push(300);
		  s2.push(s);
		  System.out.println(s2);
	 }
}


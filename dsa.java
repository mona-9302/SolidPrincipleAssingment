/*class Node{
	  Object value;
	  Node next;

	  Node(Object value)
	  {
          this.value = value;
          next = null;
	  }

	 
}

class Linklist{
	    Node head,tail;
	    /*public void reverse(){
	    	 Node curr,pre,next;
	    	 //head,tail;
	    	 while(curr!=null)
	    	 {
                next = curr.next;
                curr.next = pre;
                pre = curr;
                curr = next;
	    	 }

	    	  tail = head;
	    	  head = pre;

	    }*/

	   /*public void addAtFirst(Object val)
	   {
            Node newNode = new Node(Object val);
             if(head==null)
             {
               head = tail = newNode;
             }
             else 
             {
             	 newNode.next = head;
             	 head
             }
	   }
}

class Test{
	public static void main(String[] args) {
		  Linklist list = new Linklist();
		  list.addAtFirst(10);
		  list.addAtFirst(20);
		  list.addAddFirst(30);
		  System.out.println(list);
		  System.out.println(list.addAtFirst());
		  

	}
}*/
/*class Test
{
	public static void main(String[] args) 
	{
		   int n =5;
		   for(int i =1;i<=n;i++)
		   {
           for(int j =1;j<=i;j++)
           {
              System.out.print("*");

           }
          
            System.out.println();
		   }
		 
		}
}
		
          
          
		   

	
*/


class Test{
	public static void main(String[] args) {
		   int a [] = {10,20,30,40,50};
		   int start = 0,last = a.length-1;
         System.out.println("before reverse array");
		   for(int i =0;i<a.length-1;i++)
		   {
          System.out.println(a[i]);
		   }
		   while(start<last)
		   	
		   {
		   	    int temp = a[start];
		   	   a[start] = a[last];
		   	   a[last] =  temp;
		   	   start++;
		   	   last--;
		   }
          System.out.println("after reverse array");
		   for(int i =0;i<a.length;i++)
		   {
            System.out.println(a[i]);
		   }
	}
}























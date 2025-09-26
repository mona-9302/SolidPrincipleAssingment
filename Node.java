class Node
{
	   Object value;
	   Node next;

	  
	  Node(Object value)
	  {
	  	    this.value = value;
	  	    next = null;
	  }
}

class LinkList
{
  Node head,tail;
public void addAtFirst(Object val)

  {
	 Node newNode = new Node(val);
	   if(head==null)
	     {
	      	head = tail =newNode;
	      }

	      else {
	      	      newNode.next= head;
	      	   	 head = newNode;
	      	   }
  }




     
     /*public Object deletefromAynPos(int pos)
     {
          int c = 1;
          Node temp = head;
          if(pos == 1)
          {
             return removeLast();
          }

          else 
          {
          	  while(c<pos-1 && temp.next!=null)
          	  {
                 temp = temp.next;
                 c++;
        
          	  }
          	  Node t = temp.next;
          	  temp.next = t.next;
          	  return t.value;
          }
     }

       public Node revbyPos(Node s,Node e,int k)
       {
           Node pre = e.next,curr = s,next=null;
           int c = 0;
             while(curr != null && c++ < k)
             {
                 next = curr.next;
                 curr.next = pre;
                 pre = curr;
                 curr = next;

             }

             return pre;
       }

         public Node getNext(Node s,int k)
         {
         	  int c = 1;
         	
         	  while(s.next != null && c++ <k)
         	  {
                    s = s.next;
         	  }

         	  return s;
         }
     

       public void groupRev(int k)
       {
             //head.next =  revbyPos(head.next,head.next.next.next,k);
       	      //System.out.println(getNext(head,3).value);
       	       if( k < 2)
       	       	 return;

       	       Node s = head;
       	       Node e = getNext(head,k);
       	        head =revbyPos(s,e,k);
       	        while(s.next!=null)
       	        {
                   Node t = s.next;
                   e = getNext(s.next,k);
                   s.next = revbyPos(t,e,k);
                   s = t;
       	        }
       }

        public void addAtLast(Object val)
         {
	      	   Node newNode = new Node(val);
	      	   if(head==null)
	      	   	head=tail=newNode;
	      	   else{
	      	   tail.next = newNode;
	      	    tail = newNode;
	      	 }

	      	   
	      }


	      public Object removeFirst()
	      {
           if(head == null)
           {
           	  return null;
           }

            Node temp = head;
            if(head == tail)
            {



            	   head = tail = null;
            }

            else
             {
                head = head.next;
            }

            return head.value;
	      }

	      

	    public int allAdd()
	    {
              Node temp = head;
              int sum = 0;
              int i=0;
              while(temp!=null)
              {
                 sum=sum + (Integer)valueOf(i);
                  i++;
                  temp = temp.next;
              }
                return sum;
      }

        /*public void addAtFirst(Linklist list)
        {
            Node temp = list.head;
            int pos = 0;
            System.out.println(temp.value);
            while(temp!=null)
            {
                addAtLast(temp.value);
                temp = temp.next;
            }
        }

          LinkList()
          {
              LinkList(LinkList list)
              {
                   addAtFirst(list);
              }
          }
*/

	      /*public void reverse()
	      {
	      	    int current,next,previous;
	      	    while(current!=null)
	      	    {
                   next = current.next;
                   current.next = previous;
                   previous = current;
                   current = next;
               }
	      	    
	      	     tail = head;
	      	     head =  previous;
	        }*/
	    public int indexOf(Object val){
	    	  Node temp = head;
	    	  int count = 0;
	    	  while(temp != null)
	    	  {
                 if(temp.value == val)
                  {
                     return  count;
                 } 


                  temp = temp.next;
                  ++count;
	    	  }
	    	  
	    	  return -1;
	    }


              
	   public Object valueOf(int index)
	     {
             Node temp = head;
             int count =0;
             if(index==0)
             {
             	  return head.value;
             }
             while(count<index)
             {
             	 

             	  if(temp.next==null)
             	  {
             	  	  return null;
             	  }
             	  temp = temp.next;
             	  count++;

            }
             return temp.value;
            

	    }

	      public Object remove()
	      {
            Node temp = head;
            if(head == null)
            {
                return head.value;
            }
             if(head   == null)
             {
                return null;
             }

              else
              {
                 temp =temp.next;
              }

              return head.value;
	      }

	      public Object removeLast(){
	      	   if(head == null)
	      	     return null;
	      	   Node temp = head;
	      	   if(head == tail)
	      	   	  head = tail = null;
	      	   	else
	      	   	 {
	      	   		while(temp.next.next!= null)
	      	   		{
	      	   			 temp  = temp.next;
	      	   		}

	      	   		Node t  = temp.next;

	      	   		temp.next = null;
	      	   		tail = temp;
	      	   		temp =t;
                 }

                 return temp.value;
	      	   	

	      }

	      public String toString()
	      {
	      	     Node temp = head ; 
	      	    if(temp == null)
	      	     {
	      	     	  return "[]";
	      	     }

	      	       String s = "";
	      	       while(temp != null)
	      	       {
	      	       	    s  = s+ ","+temp.value;
	      	       	    temp = temp.next;
	      	       }
	      	       return "["+s.substring(1)+"]";
	       }
	   

}
class Mona
{
	 public static void main(String[] args)
	  {
	 	    LinkList list = new LinkList();
	 	     for(int i =1;i<=11;i++)
	 	     {
	 	     	list . addAtLast(10*i);
	 	     }

	 	     System.out.println(list);
	 	     list.groupRev(6);
	 	     System.out.println(list);
	 	    
	 	     /*list.addAtFirst(10);
	 	     list.addAtFirst(20);
	 	     list.addAtFirst(30);
	 	    */
      }
  }     
	 	    


	 	
              
                  
              

         



             
             
	    

           
            

	  	  


	  
	 	    
	 	    



	    





	 





                 
	      


	   
	   




	 	    
















/*class Test{
	   private int Empid;
	   public void getEmpid( int eid)
	   {
	   	      Empid = eid;
	   }

	   public void setEmpid()
	   {
	   	     return Empid;
	   }

	   /*public String toString(){
	   	    return 101;
	   }*/

	   /*public static void main(String[] args) {
	   	        Test t= new Test();
	   	        t.setEmpid(101);
	   	        System.out.println(t.getEmpid());
	   }
}



	     */
/*class Test{
	    private String name;
	    public void  setName(String name)
	    {
                this.name =name;
	    }


	    public String getName(){
	    	 return name;
	    }

	    public static void main(String[] args) {
	    	    Test t = new Test() ;
	    	    t.setName("ankit");
	    	    System.out.println(t.getName());
	    }
}

*/
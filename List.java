 /*import java.util.*;
 class Test{

	public static void main(String[] args) {
		ArrayList al=new ArrayList();
		al.add(null);
		al.add(220);

		ArrayList al1=new ArrayList(al);

		al1.addAll(al);
		al1.add(30);
		System.out.println(al.size());
		System.out.println(al1.size());
 

	}
}*/

//import java.util.Scanner;
/*class Test{
	public static void main(String[] args) {
		//System.out.println("Enter any case");
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter 1 for pizza");
		System.out.println("Enter 2 for burger");
		System.out.println("Enter 3 for sandwich");
		System.out.println("Enter your choice");
		int choice =sc.nextInt();
	    switch(choice){
	       case 1:
	       	  System.out.println("thanks for pizza order");
	       	  break;
	       case 2:
	       	  System.out.println("thanks for buger");
	       	  break;
	       case 3:
	       	 System.out.println("thanks for sandwich order");
	       	 break;
	       	 default:
	       	 	System.out.println("invailid choice");


	    }

		
	}
}*/

/*class Demo{
	public static void main(String[] args) {
		  Scanner sc=new Scanner(System.in);
		  System.out.println("going to mumbai");
		  System.out.println("going to delhi");
		  System.out.println("going to indore");
		  System.out.println("Enter your place ");
		  int place =sc.nextInt();
		  switch(place){
		     case 1:
		          System.out.println("thanks for arriving mumbai");
		          break;
		     case 2:
		     	  System.out.println("thanks for arriving delhi");
		     	  break;
		     case 3:
		     	 System.out.println("thanks for arriving indore");
		     	 break;
		         default:
		    	System.out.println("wrong place arriving");

		  }
	}
}*/

/*class Demo1{
	public static void main(String[] args) {
		int choice =0;
		while(choice!=5678){
		System.out.println("Welcome to SMS");
		System.out.println("please authenticate System");
		System.out.println("Enter your choice:\n 1:Login \n 2:signup \n 3:exit");
		 int menu=0;
		 Scanner sc=new Scanner(System.in);
		 menu=sc.nextInt();
		 switch(menu){
		           case 1:
		           	   System.out.println("Login");
		               break;
		            case 2:
		            	System.out.println("signup");
		            	break;
		            case 3:
		            	choice =5678;
		            	break;
		   
		 }
	}
}
}*/

//import java.util.*;
/*class Test{
	public static void main(String[] args) {
		 //ArrayList al=new ArrayList();
		 Vector al=new Vector();
		 al.add(10);
		 al.add(20);
		 al.add(30);
		 al.add(40);  
		 System.out.println(al);  
		List t=Collections.synchronizedList(al);
		 System.out.println(t);
		// System.out.println(al.toArray());
}
}*/


/*class  Test1{
	public static void main(String[] args) {
		ArrayList al=new ArrayList();
		al.add(10);
		al.add(20);
		System.out.println(al);

		LinkedList list=new LinkedList(al);
		list.add(30);
		list.add(40);
		System.out.println(list);*/

		/*LinkedList al=new LinkedList();
		  al.add(10);
		  al.add(20);
		  al.add(30);
		  System.out.println(al);*/


/*class Test2{
	public static void main(String[] args) {
		LinkedList list=new LinkedList();
		 list.add(10);
		 list.add(20);
		 list.add(30);
		 list.add(40);
		 //list.addFirst(100);
		// System.out.println(list.getLast());
		 System.out.println(list.removeFirst());
	}
}*/

/*class Test3{
	public static void main(String[] args) {
		Stack s=new Stack();
		s.push(10);
		s.push(20);
		s.push(30);

		//System.out.println(s.pop());
		//System.out.println(s);
		System.out.println(s.peek());
		System.out.println(s.peek());
		System.out.println(s);

	}
}*/



               //Enumeration
/*class Test4{
	public static void main(String[] args) {
		Stack v=new Stack();
		v.add(10);
		v.add(21);
	    v.add(30);
	    System.out.println(v);

	    Enumeration e=v.elements();
	    while(e.hasMoreElements()){
	    	Integer i= (Integer)e.nextElement();
	    	if(i%5==0)
	    	System.out.println(i);
	    }

		
	}
}*/
               //ITERATOR 

/*class Test5{
	public static void main(String[] args) {
		 ArrayList al=new ArrayList();
		 al.add(10);
		 al.add(20);
		 al.add(6);

		 System.out.println(al);
		 Iterator itr=al.iterator();
		 while(itr.hasNext()){

		 	Integer i=(Integer)itr.next();
		 	if(i%3==0)
		 	itr.remove();
		 }
		 System.out.println(al);
	}
}*/

                   //HASHSET
/*class Test6{
	public static void main(String[] args) {
		   HashSet h=new HashSet();
		   /*h.add(10);
		   h.add(20);
		   h.add(30);
		   h.add(40);
		   h.add("10");
		   h.add(null);
		   h.add(null);*/
		   /*System.out.println(h.add(10));
		   System.out.println(h.add(10));
		   System.out.println(h.add(10));
		   System.out.println(h.add(20));
		   System.out.println(h);*/

	//}
//}


/*class Test7{
	public static void main(String[] args) {
		LinkedHashSet lhs=new LinkedHashSet();
		 lhs.add(10);
		 lhs.add(20);
		 lhs.add(30);
		 lhs.add(40);
		 lhs.add(40);

		 System.out.println(lhs);
	}
}*/



            //SORTED SET ,NAVIGABLE ,AND TREE SET
  
 /*class Test8{
	public static void main(String[] args) {*/ 
		// TreeSet t=new TreeSet();
		/* t.add(10);
		 t.add(50);
		 t.add(30);
		 t.add(40);*/
		 /*t.add("A");
		 t.add("B");
		 t.add("C");
		 t.add("a");
		 t.add("D");*/ //unique code get value;
		// t.add(10);//classcastexception;
		 //t.add(null);//nullpointerexception;
		 /*t.add("Ram");
		 t.add("Shyam");
		 t.add("Mohan");
		 t.add("Ramesh");
		 t.add("Mahesh");*/   //sorting order

		 //System.out.println(t);
		   /*String ob1="A";
		   String ob2="A";*/  //RETURN =0

		   /*String ob1="A";
		   String ob2="B";

		   System.out.println(ob2.compareTo(ob1));

		
	}
}*/
  /*import java.util.*;     
class Test9{
	public static void main(String[] args) {
		  TreeSet t=new TreeSet();
		  /*t.add("A");
		  t.add("B");
		  t.add("D");
		  t.add("C");*/
		  /*t.add(new StringBuffer("A"));
		  t.add(new StringBuffer("B"));
		  t.add(new StringBuffer("D"));
		  t.add(new StringBuffer("C"));*/
		 

		 // System.out.println(t);
	//}
//}


                                    //COLLECTION BY DEEPAK SIR

/*import java.util.HashMap;
class Monika7{
	public static void main(String[] args) {
		HashMap h=new HashMap();
		h.put(101,"monika");

		System.out.println(h);
		
		
	}
}*/

/*import java.util.*;
class Monika{

	public static void main(String[] args) {
		ArrayList al=new ArrayList();
		al.add(10);
		al.add(20);
		al.add("monika");*/

		/*ArrayList al1=new ArrayList();
		al1.add(40);
		al1.addAll(al);

		

		System.out.println(al1);*/
		//System.out.println(al.add("aaa"));
		//System.out.println(al.contains(20));
		//System.out.println(al.isEmpty());
		//System.out.println(al.size());
		/*System.out.println(al);
		 al.remove(0);//Arraylist
		 al.remove("monika");//Collection

		System.out.println(al);

	}
}*/

/*class Monika6{
	public static void main(String[] args) {
		 ArrayList al=new ArrayList();
		 al.add(10);
		 al.add(20);
		 al.add(30);

		 System.out.println(al);

		 ArrayList al1=new ArrayList();
		 al1.add(30);
		 al1.removeAll(al);

		 System.out.println(al1);
	}
}*/

              //difference between set and list

/*import java.util.*;
class Monika8{
	public static void main(String[] args) {
	List al=new ArrayList();
		al.add(10);
		al.add(20);
		al.add(40);
		al.add(50);
		al.add(10);
		al.add(null);
		al.add(null);

           System.out.println(al);*/

		 /*Iterator itr=al.iterator();    
		 while(itr.hasNext()){      
		 	System.out.println(itr.next());
         }*/
		/* ListIterator itr=al.listIterator();
		 while(itr.hasNext())
		 	System.out.println(itr.next());*/

		  //System.out.println(al);
	//}
//}

/*import java.util.*;	
class Mumy{
	public static void main(String[] args) {
		    List al=new ArrayList();
		    al.add(10);
		    al.add(20);
		    al.add(30);
		    al.add(40);

		    System.out.println(al);
		    ListIterator itr=al.listIterator();
		    /*while(itr.hasNext()){
		    	System.out.println(itr.next());
		    }

		    System.out.println("-----");*/
		    // itr.next();
		    // itr.next();
		    // itr.next();
		    // itr.next();

		    // while(itr.hasPrevious()){
		    // 	System.out.println(itr.previous());
		    // }
		    // itr.add(100);
		    // System.out.println(al);
		   
	

/*class Mumy1{
	public static void main(String[] args) {
		  Vector v=new Vector();
		       v.add(10);
		       v.add(20);
		       v.add(30);

		       Enumeration e=v.elements();
		       while(e.hasMoreElements()){
		       	System.out.println(e.nextElement());
		       }
		     }
		   }

		                  //ArrayList
class Mummy{
	public static void main(String[] args) {
		  ArrayList al=new ArrayList();
		  al.add(10);
		  al.add("deepak");
		  al.add(40);
		  al.add(90);
		  al.add(50);
		    System.out.println(al.get(0));
		  /* ArrayList al1=new ArrayList();

		    al1.add(90);
		    al1.add("deepak");
		    al1.add(120);
		    al1.add("rahul");

		    al.removeAll(al1);

		    System.out.println(al);*/

	


                 // Linkedlist

/*class Stack{
	  private Object stk[];
	  private  int top;


	   Stack(){
	   	   this(5);

	   }

	    Stack(int size){
	    	  stk=new Object[size];
	    	  top=-1;
	    }

	    Stack(Stack s){
	    	 this(5);
	    	 push(s);

	    }

	     public int size(){
	     	    return top+1;
	     }

	      public int capacity(){
	      	    return stk.length;
	      }

	      public void increaseSize(){
	      	 int old_size = stk.length;
	      	 int new_size = old_size+5;
	      	 Object ob[]=new Object[new_size];
	      	 for(int i=top;i>=0;i--)
	      	 	ob[i] = stk[i];
	      	 stk = ob;
	      }

	      public void push(Object value){
	      	  if(top == stk.length-1){
               //System.out.println("Stack is Full");
               //return;
	      	  	 increaseSize();
	      	  }

	      	  //top++;
	      	  stk[++top]=value;
	      }

	       public void push(Stack stack){
               for(int i=stack.top;i>=0;i--){
               	    push(stack.stk[i]);
               }
          }

	      public String toString(){
	      	  String s="";
	      	  if(top==-1)
	      	  	 return "[]";

	      	  for(int i=top;i>=0;i--){
                 s = s+","+stk[i];

	      	  }
	      	return "["+s.substring(1)+"]";
	      }

	      public Object pop(){
	      	  if(top==-1)
	      	  	 return null;
	      	  	Object ob=stk[top--];
	      	  	 //top--;
	      	  	 return ob;
	      }


	      public Object peak(){
	      	  if(top==-1)
	      	  	 return null;
	      	  	Object ob=stk[top];
	      	  	 //top--;
	      	  	 return ob;
	      }
}*/

/*class Test{
	public static void main(String[] args) {
		   Stack s=new Stack();
		   s.push(10);
		   s.push(20);
		   s.push(100);
		   s.push(200);
		   s.push(300);
		   s.push(400);

		   s.push(10);
		   s.push(20);
		  // System.out.println(s);
		  // System.out.println(s.peak());

		   System.out.println(s.pop());*/

		  // System.out.println(s);
		    //System.out.println(s.size());
		   //System.out.println(s.capacity());

   


		   
		   
		  
		  // System.out.println(s.peak());9
		   //System.out.println(s.pop());

		  /* Stack s2=new Stack(s);
		   s2.push(100);
		   s2.push(200);
		   s2.push(300);

		   //s2.push(s);

		   System.out.println(s2);*/
	



            //STATIC QUEUE



/*class Stack {
	   private Object stk[];
	   private int top; 


	    Stack ()
	    {
	    	   this(5);
	    }



	    Stack(int size)
	    {
            stk = new Object[size];  
            top = -1;
	    }


          Stack(Stack s)
          {
               this(5);
               push(s);
          }



	    public int size()
	    {
	    	 return top+1;
	    }


	    public int capacity(){
	    	 return stk.length;
	    }


	    public void increaseSize()
	    {
            int old_size = stk.length;
            int new_size = old_size+5;
             Object ob [] = new Object[new_size];
             for(int i=top;i>=0;i--)
             {
                 ob[i] = stk[i];
             }
             stk  = ob; 
	    }


	     public void push(Object value)
	     {
              if(top == stk.length-1)
              {
              	 increaseSize();
                 /* System.out.println("Stack is full");
     /*             return ; */
           /*   }
              
              stk[++top] = value;
        }




        public void push(Stack stack)
        {
        	 for(int i =stack.top;i>=0;i--)
        	 {
                push(stack.stk[i]);
        	 }
        }



         public String toString()
         {
         	String s = "";
         	if(top == -1)
         		 return "[]" ;

         	for(int i=top;i>=0;i--)
         	{
                  s = s+"," + stk[i];
         	  
             }

             return "["+s.substring(1)+"]";

         }



         public Object pop(){
             if(top == -1)
             	  return null;
             	Object  ob =stk[top];
             	top--;
             	return ob;
         }


          public Object peak(){
          	 if(top == -1)
          	 	 return null;
          	 	Object ob = stk[top];
          	 	return ob;
          }
}


class Test{
	public static void main(String[] args) {
		  Stack s = new Stack();
		  
		  s.push(10);
          s.push(20);
		  s.push(30);
		  s.push(50);
		  s.push(60);

		  System.out.println(s);  
		 
		  s.push(60);

		  System.out.println(s);
		 


		   */

          /* System.out.println(s);

		   Stack s1 = new Stack(s);
		   s1.push(50);
		   s1.push(60);*/
		   
		   //s1.push(s);
		   

		   //System.out.println(s);
		  
		  /*System.out.println(s.peak());
		  System.out.println(s.peak());
		  System.out.println(s.peak());
		  System.out.println(s.peak());*/

		 // System.out.println(s.capacity());
		  //System.out.println(s.size());
	// 	}
	// }

	                    // STATIC QUEUE DS


/*class Test2{
	public static void main(String[] args) {
		   Queue ob= new Queue();
		   ob.insert(10);
		   ob.insert(20);
		   ob.insert(30);
		   ob.insert(40);
		   //System.out.println(q.size());
		   System.out.println(ob);
		   System.out.println(ob.delete());
		   System.out.println(ob.delete());
		   System.out.println(ob.delete());
		   System.out.println(ob.delete());
		   ob.insert(50);
		   System.out.println(ob);

		
	}
}


class Queue{
	   int rear,front;
	   Object values[];

	   Queue()
       {
           this(5);
	   }

	   Queue(int size)
	   {
	   	    values =new Object[size];
	   	    rear = front = -1;
	   }

	    public void insert(Object val)
	    {
	    	 if(rear == values.length-1){
	    	 	System.out.println("Queue is full");
	    	 	return ;
	    	 }

	    	 if(rear == -1)
	    	 {
                  rear = front = 0;
	    	 }

	    	 else 
	    	 {
	    	 	   rear++;
	    	 }
	    	 values[rear] = val;
	    }


	     public Object delete(){
	     	  if(front == -1)
	     	  {
	     	  	return null;
	     	  }
	     	    Object ob =values[front];
	     	      if(rear == front){
	     	      	    front = rear = -1;
	     	      }

	     	      else {
	     	      	front ++;
	     	      }

	     	       return ob;
	     }







	    public String toString(){
	    	 String s ="";
	    	 if(rear == -1)
	    	 	return "[]";
	    	 for(int i= front;i<=rear;i++)
	    	 {
	    	 	 s+= ","+values[i];
	    	 }

	    	  return "["+s.substring(1)+"]";
	    	 
	    }

	   
}*/


                    // SHIFT QUEUE CONCEPT

/*class Test3{
	public static void main(String[] args) {
		   Queue ob= new Queue();
		   ob.insert(10);
		   ob.insert(20);
		   ob.insert(30);
		   ob.insert(40);
		   ob.insert(50);
		   ob.insert(60);
		   //System.out.println(q.size());
		   System.out.println(ob);
		   System.out.println(ob.delete());
		   System.out.println(ob);
		  
		  
		   
	}
}

class Queue{
	   int rear,front;
	   Object values[];

	   Queue()
       {
           this(5);
	   }

	   Queue(int size)
	   {
	   	    values =new Object[size];
	   	    rear = front = -1;
	   }

	    public void insert(Object val)
	    {
	    	 if(rear == values.length-1){
	    	 	System.out.println("Queue is full");
	    	 	return ;
	    	 }

	    	 if(rear == -1)
	    	 {
                  rear = front = 0;
	    	 }

	    	 else 
	    	 {
	    	 	   rear++;
	    	 }
	    	 values[rear] = val;
	    }


	     public Object delete(){
	     	  if(front == -1)
	     	  {
	     	  	return null;
	     	  }
	     	    Object ob =values[front];
	     	      if(rear == front){
	     	      	    front = rear = -1;
	     	      }

	     	      else {
	     	      	front ++;
	     	      }

	     	       return ob;
	     }

	    public String toString(){
	    	 String s ="";
	    	 if(rear == -1)
	    	 	return "[]";
	    	 for(int i= front;i<=rear;i++)
	    	 {
	    	 	 s+= ","+values[i];
	    	 }

	    	  return "["+s.substring(1)+"]";
	    	 
	    }

	   
}*/


             //CIRCULAR QUEUE CONCEP 

/*class Test3{
	public static void main(String[] args) {
		 Circular c = new Circular();
		 c.insert(10);
		 c.insert(20);
		 c.insert(30);
		 c.insert(40);
		 c.insert(50);
       System.out.println("before delete");
		 System.out.println(c);
		 c.delete();
		 System.out.println("after delete");
		 System.out.println(c);
		 
	}
}

class Circular{

         int rear,front;
         Object values[];

         Circular()
         {
         	 this(5);
         }

         Circular(int size)
         {
             values = new Object[size];
             rear = front =-1;
         }


         public void insert(Object val)
         {
            if((front == 0 && rear == values.length-1) || (rear +1 == front))
            {
            	System.out.println("Circular is full");
            	return ;

            }

              
               if(rear == -1)
               {
               	   rear = front = 0;
               }

               else
                {
               	   rear =  ( rear + 1)% values.length;
               }
               values [rear] = val;
           }


          public Object delete()
          {
             if(rear == 0 && front == values.length-1)
             {
                    return null;

             }

              Object ob  = values[rear];
              if(rear == front ){
              	 front = rear = -1;
              }
               else {
               	      front++;
               }

               return ob;


         }



             public String toString() 

             {
                  if(front == -1) 
                  {
                  	 return "[]";
                  }

                  String s ="";
                  int t = front;
                  while(t!= rear)
                  {
                  	  System.out.println(values[t]);
                  	  t  = (t+1)% values.length;
                  }
                  System.out.println(values[t]);
                     return "";
             }


       }*/


class Node
{
	   Object value;
	   Node next;

	  
	  Node(Object val)
	  {
	  	    this.value = value;
	  	    next = null;
	  }
}

class LinkList{
	   Node head,tail;
	      public void addAtFirst(Object val){
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

	      public String toString(){
	      	     Node temp = head ; 
	      	    /* if(temp == null)
	      	     {
	      	     	  return "[]";
	      	     }*/

	      	       String s = "";
	      	       while(temp != null)
	      	       {
	      	       	    s  = s+ ","+temp.value;
	      	       	    temp = temp.next;
	      	       }
	      	       return "["+s.substring(1)+"]";
	           }

	  }      



class Mona{
	 public static void main(String[] args) {
	 	    LinkList list = new LinkList();
	 	    list.addAtFirst(10);

	 	    System.out.println(list);
	 }
}



	     

	  

	  




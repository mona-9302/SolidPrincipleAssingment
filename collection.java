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
		    /*itr.next();
		    itr.next();
		    itr.next();
		    itr.next();

		    while(itr.hasPrevious()){
		    	System.out.println(itr.previous());
		    }
		    itr.add(100);
		    System.out.println(al);
		   
	}
}

class Mumy1{
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

	//}
//}

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
}

class Test{
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

		   System.out.println(s.pop());

		  // System.out.println(s);
		    //System.out.println(s.size());
		   //System.out.println(s.capacity*//*/*///();

   


		   
		   
		  
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
                  return ; */
            /*  }
              
              stk[++top] = value;
        }




        public void push(Stack stack)
        {
        	 for(int i =stack.top;i>=0;i--)
        	 {
                push(stack.stk[i]);
        	 }
        }*/



        /* public String toString()
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

        
}*/


/*class Test{
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
		 

*//*/
		   

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


/*class Node
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

	      	       /*String s = "";
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
	 	    list.addAtFirst(20);

	 	    System.out.println(list);
	 }
}
}
}*/

/*class Test
{
	  String name;
	  int sal;

	  Test(String n,int s)
	  {
	  	 name=n;
	  	 sal=s;
	  }

	  void msg(){
	  	System.out.println(name+" "+sal);
	  }

	  public static void main(String[] args) {
	  	  Test t= new Test("monika",100);
	  	  t.msg();
	  }
}


class Animal{
	  void msg(){
	  	System.out.println("monika");
	  }
}

class Dog extends Animal{
	  public static void main(String[] args) {
	  	  Dog d= new Dog();
	  	  d.msg();
	  }
}*/

/*class Monika{
	 public void msg(){
	 	System.out.println("monika");
	 }
}

class Demo extends Monika
{
	 public void demo()
	 {
	 	System.out.println("rajput");
	 }

	 public static void main(String[] args) {
	 	 Monika d = new Monika();
	 	 d.msg();
	 	 //d.demo();

	 }
}*/

/*class Monika{
	  public void msg()
	  {
	  	System.out.println("monika");
	  }
}

class Child extends Monika{
	 public void demo()
	 {
	 	System.out.println("rajput");
	 }
}

class Delta extends Child{
	  public void m(){
	  	System.out.println("mona");
	  }

	  public static void main(String[] args) {
	  	  Delta d= new Delta();
	  	  d.demo();
	  	  d.m();
	  	  d.msg();
	  }
}*/

/*class Demo {
	 public void msg()
	 {
	 	System.out.println("monika");
	 }
}

class Delta extends Demo
{
	 public void mengo()
	 {
	 	System.out.println("rajput");
	 }
}

class Monika extends Demo
{
	 public void m()
	 {
	 	 System.out.print("mona");
	 }
	 public static void main(String[] args) {
	 	  Monika m= new Monika();
	 	  Delta d= new Delta();
	 	  m.msg();
	 	  d.mengo();
	 	  m.m();
	 }
}*/

/*class Test{
	 public void msg()
	 {
	 	System.out.println("monika");
	 }
}

class Child extends Test{
	 public void delta()
	 {
	 	System.out.println("rajput");
	 }

	 public static void main(String[] args) {
	 	  Test c= new Child();
	 	  c.msg();
	 	  c.delta();
	 }
}*/

/*class Test{
	 public void mush(){
	 	System.out.println("monika");
	 }
}

class Demo{
	 public static void main(String[] args) {
	 	  Test d = new Test();
	 	  d.mush();
	 }
}*/

/*import java.util.*;
import java.io.*;
class Employee implements Serializable{
	  int empno;
	  String ename;
	  int salary;

	    Employee(int empno,String ename,int salary){
	    	    this.empno = empno;
	    	    this.ename = ename;
	    	    this.salary = salary;
	    }

	    public String toString()
	    {
	    	  return empno+" "+ename+" "+salary;
	    }

}

class EmployeeDemo{
	public static void main(String[] args) throws Exception {
		  int choice = -1;
		   Scanner s = new Scanner(System.in);
		   Scanner s1 = new Scanner(System.in);
		   File file = new File("employee .txt");
		   ArrayList<Employee> al  = new ArrayList<Employee>();
		   ObjectOutputStream oos = null;
		   ObjectInputStream ois = null;
		   ListIterator li = null;

		   if(file.isFile()){
		   	ois = new ObjectInputStream(new FileInputStream(file));
		   	al = (ArrayList<Employee>)ois.readObject();
		   	 ois.close();
		   }

		  do{
		  	System.out.println("1.INSERT");
		  	System.out.println("2.DISPLAY");
		  	System.out.println("3.SEARCH");
		  	System.out.println("0.EXIT");
		  	System.out.println("Enter your choice:");
		  	 choice = s.nextInt(); 
		  	  switch(choice){

		  	  case 1:
		  	  	   System.out.print("Enter how many employee you want");
		  	  	    int n = s.nextInt();
		  	  	    for(int i =0;i<n;i++)
		  	  	    {
		  	  	       System.out.print("Enter Employee No: ");
		  	  	      int empno = s.nextInt();

		  	  	      System.out.print("Enter Employee Name: ");
		  	  	      String ename = s1.nextLine();

		  	  	     System.out.println("Enter Employee Salary: ");
		  	  	     int salary = s.nextInt();

		  	  	    al.add(new Employee(empno,ename,salary));
		  	  	    

		  	  	}
		  	  	    oos =  new ObjectOutputStream(new FileOutputStream(file));
		  	  	    oos.writeObject(al);
		  	  	    oos.close();
		  	  	break;

		  	  	 case 2:
		  	  	 	    if(file.isFile()){
		  	  	 	    oos =  new ObjectOutputStream(new FileOutputStream(file));
		  	  	      oos.writeObject(al);
		  	  	      oos.close();

		  	  	 	   System.out.println("--------------------");
		  	  	 	   li = al.listIterator();
		  	  	 	   while(li.hasNext())
		  	  	 	   	System.out.println(li.next());
		  	  	 	    System.out.println("--------------------");
		  	  	 	}
		  	  	 	  else{
		  	  	 	  	System.out.println("file not Exist......!");
		  	  	 	  }
		  	  	 	 break;

		  	  	 	case 3:
		  	  	 		  if(file.isFile()){

		  	  	 		  	  oos =  new ObjectOutputStream(new FileOutputStream(file));
		  	  	          oos.writeObject(al);
		  	  	          oos.close();

		  	  	 		  boolean found = false;
		  	  	 		System.out.println("Enter empno to Searh : ");
		  	  	 		int empno =  s.nextInt();
		  	  	 		     System.out.println("----------------");
		  	  	 		     li = al.listIterator();
		  	  	 		     while(li.hasNext()){
		  	  	 		     	 Employee e =(Employee) li.next();
		  	  	 		     	 if(e.empno == empno){
		  	  	 		     	  System.out.println(e);
		  	  	 		     	    found = true;
		  	  	 		     	}
		  	  	 		   }
		  	  	 		   if(!found)
		  	  	 		   	 System.out.println("Record not found....!");
		  	  	 		     	System.out.println("--------------");
		  	  	 		   }
		  	  	 		     else{
		  	  	 		     	  System.out.println("file not Exist......!");
		  	  	 		     	}
		  	  	 	//System.out.println(al);
		  	  	 	break;
		  	  }

		  }while(choice !=0);
	}

}


*/

import java.util.*;
/*class Test{
	public static void main(String[] args)
	 {

         ArrayList  al = new ArrayList();
         al.add(10);
         al.add(20);
         al.add(30);
         al.add(40);

         ArrayList al1 = new ArrayList();
         al1.add(50);
         al.addAll(al1);

         System.out.println(al);
	}
}
*/


/*class Test

{
	public static void main(String[] args) 
	{
		  ArrayList al = new ArrayList();
		    al.add(10);
		    al.add(20);
		    al.add(30);
		    al.add(40);
		    al.add(70);
		  
		    //al.clear();
		    System.out.println(al);
		  /*ArrayList al1 = new ArrayList();
		    al1.add(50);
		    al1.add(60);

		    //al1.removeAll(al);
		  //System.out.println(al.add("aaa"));
		  //System.out.println(al.contains(1));
		  // System.out.println(al.isEmpty());
		 //System.out.println(al.size());
		 /* al.remove(0);                     
		  System.out.println(al);*/        
		    
		   



	//}
//}

/*import java.util.*;
class Test{
	public static void main(String[] args) {
		 ArrayList al = new ArrayList();
		 al.add(10);
		 al.add(20);
		 al.add(30);
		 al.add(40);
		 al.add(null);
		 al.add(50);
        

        ArrayList al1 = new ArrayList();
        al1.add(60);
        al1.add(70);
        
		 System.out.println(al1.retainAll(al));
	}
}
*/

/*import java.util.ArrayList;
import java.util.List;
 class Test{
 	public static void main(String[] args) 
 	{
 		  List al = new ArrayList();
 		  al.add(10);
 		  al.add(20);
 		  al.add(30);
 		  al.add(40);

 		  ListIterator itr  = al.listIterator();
 		  while(itr.hasNext()){
 		  	System.out.println(itr.next());
 		  }
 	}
 }*/

/*class Test{
	public static void main(String[] args) {
		  Integer i = 100;
		  Integer j = 100;
		  System.out.println(100==100);
	}
}

*/

/*class Test{
	public static void main(String[] args) {
		Float f = 10.23f;
		Float f1 = f.floatValue();

		System.out.println(f);
		System.out.println(f1);
		 
	}
}*/

/*class Test{
	public static void main(String[] args) {
		 String s = "10";
		 int i  = Integer.parseInt(s);

		 System.out.println(i);
	}
}*/


                             //exception handling
/*
import java.util.*;
class Test{
	public static void main(String[] args) {
		  Vector v = new Vector();
		  v.add(10);
		  v.add(20);
		  v.add(30);

		  Enumeration e = v.elements();
		  while(e.hasMoreElements()){
		  	  System.out.println(e.nextElement());
		  }
	}
}

*/

/*import java.util.ArrayList;
import java.util.List;
class Test
{
	public static void main(String[] args)
	 {
		   ArrayList al = new ArrayList();
		   al.add(10);
		   al.add(20);
		   al.add(30);
		   System.out.println(al);
           List t =  Collections.synchronizedList(al);
          

		   System.out.println(t);
	}
}  


*/
/*import java.util.ArrayList;
import java.util.List;
class Test{
	public static void main(String[] args) {
		 Vector v = new Vector();
		 v.add(10);
		 v.add(20);
		 v.add(30);
		 v.add(40);

		 System.out.println(v);

		 List l = Collections.synchronizedList(v);
		 System.out.println(l);
	}
}*/

/*import java.util.*;
class Test{
	public static void main(String[] args) {
		  Vector v = new Vector();
		  v.add(10);
		  v.add(20);
		  v.add(30);
		  v.add(40);

		  System.out.println(v);
		  Enumeration e = v.elements();

		  while(e.hasMoreElements())
		  {
		  	  Integer i = (Integer)e.nextElement();
		  	  System.out.println(i);
		  }
	}
}
*/
/*import java.util.*;
class Test
{
	public static void main(String[] args)
	 {
		  ArrayList al = new ArrayList();
		  al.add(10);
		  al.add(20);
		  al.add(30);
		  al.add(40);

		  System.out.println(al);
		  Iterator itr = 

	}
}


*/
/*public class Insertbook3 {
   private static final String DB_URL="jdbc:mysql://localhost:3306/INDORE4";
   private static final String DB_UNAME="root";
   private static final String DB_PWD="Mona@@@";
   
   
   public static final String INSERT_SQL="INSERT INTO STUDENT VALUES(101,'monika','indore')";
   
   public static void main(String[]args)throws Exception
   {
	    Class.forName("com.mysql.cj.jdbc.Driver");
	    
	    Connection con = DriverManager.getConnection(DB_URL,DB_UNAME,DB_PWD);
	    
	    Statement stmt = con.createStatement();
	    
	    int rowsaffected = stmt.executeUpdate(INSERT_SQL);
	    
	    
	    System.out.println("Inserted Count:"+rowsaffected);
	    
	    con.close();
	    
   }
}
*/

/*import java.util.*;
class Test
{
	  public static void main(String[] args)
	   {
	  	   ArrayList al = new ArrayList();
	  	   al.add(10);
	  	   al.add(20);
	  	   al.add(30);
	  	   al.add(40);

	  	   System.out.println(al);
	  	   Iterator itr = al.iterator();

	  	   while(itr.hasNext())
	  	   {
	  	   	   Integer i = (Integer)itr.next();
	  	   	   if(i%3==0)
	  	   	   {
	  	   	   	    itr.remove();
	  	   	   }
	  	   	   System.out.println(al);
	  	   }
	  }
}*/

/*import java.util.*;
class Test{
	public static void main(String[] args) {
		  HashSet s = new HashSet();
		 
		 System.out.println(s.add(10));
		 System.out.println(s.add(10));
         System.out.println(s.add(40));
         System.out.println(s.add(30));
        System.out.println(s.add(20));



		  System.out.println(s);
	}
}*/

// class Test{
// 	public static void main(String[] args) {
// 		  LinkedHashSet s = new LinkedHashSet();
// 		  s.add(10);
// 		  s.add(20);
// 		  s.add(30);
// 		  s.add(40);
// 		  s.add(10);

// 		  System.out.println(s);
// 	}
// }

// class Test{
// 	public static void main(String[] args) {
// 		 String s = "monika";
// 		String s1 =  s.concat("rajput");

// 		 System.out.println(s);
// 		 System.out.println(s1);
// 	}
// }

// class Test1{
// 	 public static void main(String[] args) {
// 	 	 StringBuffer s = new StringBuffer("monikarajput");
// 	 	 s.append("rajput");
// 	 	 System.out.println(s);

// 	 }
// }


// class Test2{
// 	public static void main(String[] args) {
// 		 StringBuffer s = new StringBuffer();
// 		 System.out.println(s.capacity());
// 	}
// }

// class Test3{
// 	 public static void main(String[] args) {
// 	 	   StringBuffer s = new StringBuffer("monarajput");
// 	 	   System.out.println(s.capacity());
// 	 }
// }

// class Test4{
// 	public static void main(String[] args) {
// 		  StringBuffer s = new StringBuffer(100);
// 		  System.out.println(s.capacity());

// 	}
// }

//  class Test5{
// 	public static void main(String[] args) {
// 		   StringBuffer s = new StringBuffer();
// 		   System.out.println(s.capacity());

// 		   s.append("monika");
//           System.out.println(s.capacity());

//           s.append("monikarajput");
//           System.out.println(s.capacity());
// 	}
// }



/*class Test6{
	public static void main(String[] args) {
		StringBuffer  s = new StringBuffer("monika rajput");
		System.out.println(s.length());
		//System.out.println(s.reverse());

     }
 }*/

 // class Test7{
 // 	public static void main(String[] args) {
 // 		 StringBuffer s = new StringBuffer("monika");
 // 		 s.append("rajput");

 // 		 System.out.println(s);

 // 	}
 // }


// class Test8{
// 	public static void main(String[] args) {
// 		  StringBuffer s = new StringBuffer("mona rajput");
		  //StringBuffer s1 = s.append("rajput");


		  //System.out.println(s.charAt(2));
		  //System.out.println(s.delete(2,3));
		  //System.out.println(s.deleteCharAt(0));
		  //System.out.println(s.equals(s1));
          //System.out.println(s.indexOf("a"));
          //System.out.println(s.lastIndexOf("a"));
         // System.out.println(s.insert(1,"rajput"));
// 		  System.out.println(s.subSequence(0,3));

// 	}
// }

// class Test9{
// 	public static void main(String[] args) {
// 		  StringBuilder s = new StringBuilder("monika");
// 		  //System.out.println(s.length());
// 		  //System.out.println(s.indexOf("n"));
// 		  //System.out.println(s.lastIndexOf("a"));
// 		  System.out.println(s.deleteCharAt(2));

// 	}
// }


// class Test10{
// 	public static void main(String[] args) {
// 		  Vector v = new Vector();
// 		  v.add(10);
// 		  v.add(20);
// 		  v.add(30);
// 		  v.add(40);
// 		  v.add(50);


// 		  //System.out.println(v);

// 		  Enumeration e = v.elements();
// 		  while(e.hasMoreElements())
// 		  {
// 		  	   System.out.println(e.nextElement());
// 		  }
// 	}
// }


// class Test12{
// 	static int a = 10;
// 	static int b = 20;
// }

// class Demo{
// 	public static void main(String[] args) {
// 		  System.out.println(Test12.a);
// 		  System.out.println(Test12.b);
// 	}
// }


// class Demo{
// 	 int id ;
// 	String name;
// 	static String city;

// 	Demo(int id,String name)
// 	{
// 		  this.id = id;
// 		  this.name = name;
		  //this.city = city;
// 	}

// 	public  void std()
// 	{
// 		System.out.println(id+" "+name+" "+city);
// 	}
// }


// class Data{
// 	public static void main(String[] args) {
// 		 // Demo d = new Demo(101,"monika");
// 		 // d.std();
// 		 Demo d1= new Demo(102,"mona","dewas");
// 		 d1.std();
// 	}
// }


// class Employee{
// 	private int  empid;
// 	public void setEmp(int Empid1){
//           empid = Empid1;
// 	}

// 	public int getEmpid2(){
// 		return empid;
// 	} 

	
// }

// class Company{
// 	public static void main(String[] args) {
// 		Employee e = new Employee();
// 		e.setEmp(101);
// 		System.out.println(e.getEmpid2());
// 	}
// }



// interface A{
// 	  void print();
// }

// class B implements A{
// 	 public void print(){
// 	 	System.out.println("it is warm up");
// 	 }
// 	 public static void main(String[] args) {
// 	 	  A a;
// 	 	  a=new B();
// 	 	  a.print();
// 	 }
// }

//  public interface Myinterface{
// 	int a = 10;
// 	void display();
// }

// class Myclass implements Myinterface{
// 	  public void display(){
// 	  	System.out.println("fine");
// 	  }

// 	  public static void main(String[] args) {
// 	  	   Myclass m =  new Myclass();
// 	  	   m.display();
// 	  }
// }

// interface I1{
// 	 double x = 44.00;
// 	void methodI1();
// }

// interface I2 extends I1{
// 	 double y = 55.00;
// 	 void methodI2();

// }

// class A1 implements I2{
// 	public void methodI1()
// 	{
// 		 System.out.println("From I1:"+x+y);
// 	}

// 	public void methodI2(){
// 		System.out.println("from I2"+(x+y));
// 	}
// }

// class myClass{
// 	public static void main(String[] args) {
// 		  A1 a  = new A1();
// 		  a.methodI1();
// 		  a.methodI2();
// 	}
// }

//   interface IOne{
// 	void print1();
// }

//  interface ITwo {
// 	void print2();
// }

//  interface IThree extends IOne,ITwo{
// 	void print3();
// }
//  class Main implements IThree{
// 	public void print1(){
// 		System.out.println("Method of IOne");
// 	}

// 	public void print2(){
// 		System.out.println("Method of ITwo");
// 	}

// 	public void print3(){
// 		System.out.println("Method of IThree");
// 	}

// 	public static void main(String[] args) {
// 		   Main m = new Main();
// 		   m.print1();
// 		   m.print2();
// 		   m.print3();
// 	}
// }


// class Mona{
// 	public static void main(String[] args) {
// 		    int a[] = {1,2,3,4,5};
// 		    int start = 0,last = a.length-1;
// 		    System.out.println("Before Reverse Array");
// 		    for(int i =0;i<a.length;i++)
// 		    {
// 		    	System.out.println(a[i]);
// 		    }
// 		    while(start<last)
// 		    {
// 		    	   int temp = a[start];
// 		    	   a[start] = a[last];
// 		    	   a[last] = temp;
// 		    	   start++;
// 		    	   last --;
// 		    }

//             System.out.println("after reverse array");
// 		    for(int i =0;i<a.length;i++)
// 		    {
// 		    	System.out.println(a[i]);
// 		    }
// 	}
// }


// interface I{
// 	   int a = 10;
	  
// 	  void data();
// }

// class Test90 implements I{
// 	    public void data()
// 	    {
// 	    	System.out.println("monika");
// 	    }

// 	    public static void main(String[] args) {
// 	    	   I i = new Test();
// 	    	   i.data();
// 	    }
// }


// interface Drawable{
// 	void draw();
// }

// class Circle implements Drawable{
// 	public void draw()
// 	{
// 		System.out.println("monika");
// 	}
// }

// class Rectangle implements Drawable{
// 	  public void draw()
// 	  {

// 	  	System.out.println("mona");
// 	  }
// }

// class TestDraw{
// 	public static void main(String[] args) {
// 		    Drawable d = new Rectangle();
// 		    d.draw();
// 	}
// }



// interface Printable{
// 	void show();
// }


// interface Printable1{
// 	  void print();
// }


// class Growable implements Printable,Printable1{
// 	  public void show()
// 	  {
// 	  	System.out.println("monika");
// 	  }

// 	  public void print()
// 	  {
// 	  	System.out.println("mona");
// 	  }

// 	  public static void main(String[] args) {
// 	  	   Growable g = new Growable();
// 	  	   g.print();
// 	  	   g.show();
// 	  }
// }


// interface printable{
// 	void print();
// 	interface MessagePrintable{
// 		void msg();
		
// 	}
// }


// import java.security.NoSuchAlgorithmException;  
// import java.security.MessageDigest;  
  
// public class PassEncTech1   
// {  
//     /* Driver Code */  
//     public static void main(String[] args)   
//     {  
//         /* Plain-text password initialization. */  
//         String password = "myPassword";  
//         String encryptedpassword = null;  
//         try   
//         {  
//             /* MessageDigest instance for MD5. */  
//             MessageDigest m = MessageDigest.getInstance("MD5");  
              
//             /* Add plain-text password bytes to digest using MD5 update() method. */  
//             m.update(password.getBytes());  
              
//             /* Convert the hash value into bytes */   
//             byte[] bytes = m.digest();  
              
//             /* The bytes array has bytes in decimal form. Converting it into hexadecimal format. */  
//             StringBuilder s = new StringBuilder();  
//             for(int i=0; i< bytes.length ;i++)  
//             {  
//                 s.append(Integer.toString((bytes[i] & 0xff) + 0x100, 16).substring(1));  
//             }  
              
//             /* Complete hashed password in hexadecimal format */  
//             encryptedpassword = s.toString();  
//         }   
//         catch (NoSuchAlgorithmException e)   
//         {  
//             e.printStackTrace();  
//         }  
          
//         /* Display the unencrypted and encrypted passwords. */  
//         System.out.println("Plain-text password: " + password);  
//         System.out.println("Encrypted password using MD5: " + encryptedpassword);  
//     }  
// }  


// class Data{
// 	public static void main(String[] args) {
// 		  Scanner sc = new Scanner(System.in);
// 		  System.out.println("enter the number");
// 		  int n = sc.nextInt();
// 		  if(n>0)
// 		  {
// 		  	System.out.println("number positive" +n);
// 		  }
		  
// 		  else
// 		  {
// 		  	  if(n<0)
// 		  	  {
// 		  	  	System.out.println("number negative" +n);
// 		  	  }
// 		  	  else 
// 		  	  {
// 		  	  	System.out.println("number is zero "+n);
// 		  	  }
// 		  }
// 	}
// }

//    import java.io.*;
//     class Login {
//     public static void main(String[] args) throws Exception {

//         String greeting = "Hello";
//         String username;
//         String password;
//         String user = new String("User");
//         String pass = new String("Password");


//         BufferedReader br = new BufferedReader(
//             new InputStreamReader(System.in));

//         System.out.println("*** Welcome to the program ***\n");
//         System.out.println(greeting);

//         System.out.println("Please type your username :");
//         username = br.readLine();   
//         System.out.println("Please type your password :");
//         password = br.readLine();


//         if (username.equals(user))
//             System.out.println("They are the same");
//         else 
//             System.out.println("That is wrong");

//         System.exit(0);

//         if (password.equals(pass))
//             System.out.println("They are the same");
//         else 
//             System.out.println("That is wrong");
//         System.exit(0);                 
//     }
// }



// class Test{
// 	public static void main(String[] args) {
// 		    Character  d= 'm';
// 		     char d1 = d.charValue();
// 		    System.out.println(d1);
            
// 	}

// }

 // class Test{
 // 	public static void main(String[] args) {
 // 		   Integer s = 10;
 //           int c = s.intValue();
 //           System.out.println(c);

 // 	}
 // }

 // class Test{
 // 	public static void main(String[] args) {
 // 		   Float s = 10.00f;
 // 		   float s1 = s.floatValue();
 // 		   System.out.println(s1);
 // 	}
 // }

 // class Test{
 // 	public static void main(String[] args) {
 // 		     String s = "10";
 // 		     Integer i = Integer.valueOf(s);
 // 		     System.out.println(i);
 // 	}
 // }

 // class Test{
 // 	public static void main(String[] args) {
 // 		   String s = "6";
 // 		   Float f = Float.valueOf(s);
 // 		   System.out.println(f);
 // 	}
 // }

 // class Test{
 // 	public static void main(String[] args) {
 // 		   String s = "1234";
 // 		   Short s1 = Short.valueOf(s);
 // 		   System.out.println(s1);
 // 	}
 // }

 // class Test{
 // 	public static void main(String[] args) {
 // 		  String s = "12";
 // 		  Byte b = Byte.valueOf(s);
 // 		  System.out.println(b);
 // 	}
 // }

 // class Test{
 // 	public static void main(String[] args) {
 // 		   String f  = "20.00f";
 //           Float f1 = Float.valueOf(f);
 //           System.out.println(f1);
 // 	}
 // }

 // class Test{
 // 	public static void main(String[] args) {
 // 		  String s = "monika";
 // 		  int index = s.indexOf('k');
 // 		  System.out.println("string index value::"+index);
 // 	}
 // }


 // class Test{
 // 	   int a;
 // 	   String name;
 // 	   Test(int a,String name)
 // 	   {
 //            System.out.println("monika inside parament");
 // 	   }

 // 	   Test()
 // 	   {
 // 	   	  this(1,"");
 // 	   	System.out.println("monika default coonstructor");
 // 	   }

 // 	   public void m1()
 // 	   {
 // 	   	   System.out.println(a+" "+name);
 // 	   }
 // 	   public static void main(String[] args) {
 // 	   	     Test t = new Test();

 // 	   	     t.m1();
 // 	   }
 // }

//  class Test{
//  	  int roll;
//  	  String name;
//  	  String address;

//  	  Test(int roll,String name,String address)
//  	  {
//  	  	this.roll = roll;
//  	  	this.name = name;
//  	  	this.address = address;
//  	  }

//  	  public void m1()
//  	  {
//  	  	  System.out.println(roll+" "+name+" "+address);
//  	  }

//       public static void main(String[] args) {
//       	     Test t = new Test(101,"monika","indore");
//       	     t.m1();
//       }
// }

// class Test{

// 	  static  String color = "black";

// }

// class Demo extends Test{
// 	  String color = "blue";

// 	 public void m1()
// 	 {
	 	
	 	
// 	 	System.out.println(color);
// 	 	System.out.println(super.color);
// 	 }

// 	 public static void main(String[] args) {
// 	 	    Demo d = new Demo();
// 	 	    d.m1();
// 	 }
// }

 // class Test{
 // 	  public void m1()
 // 	  {
 // 	  	System.out.println("m1 method");
 // 	  }
 // }

 // class Demo extends Test{
 // 	  public void m2()
 // 	  {
 // 	  	System.out.println("m2 method");
 // 	  }

 // 	  public static void main(String[] args) {
 // 	  	    Test d = new Test ();
 // 	  	    d.m1();
 	  	    
 // 	  }
 // }

  
//   class Test1{
//  	   Test1()
//  	    {
//  	    	System.out.println("Test1");

//  	    } 


// 	     {
// 	         System.out.println(" non static Test1");
//          }

 	  
//  }


// class Test extends Test1{
// 	        static  int count = 5;

	     	
// 	     Test()
// 	     {
             
// 	     	System.out.println(count);
// 	     }

//           Test(String name)
//           {
       
//           	System.out.println("monika");
//          }

// 	     static {                                           
														
	     												
	     												
// 	      System.out.println(count+" static");

// 	     }


// 	     {
// 	         System.out.println(" non static Test");
//          }
// 	     public static void main(String[] args) {
// 	     	   Test t = new Test();
	     	   
// 	     }
// }


//  class Pawan{

//  	  Pawan()
//  	  {
 	  	 
//  	  	System.out.println("pawan's constructor");
//  	  }

//       static 
//       {
//       	System.out.println("pawan's static block");
//       }

//       {
//       	System.out.println("pawan's non static block");
//       }
//  }


//  class Demo extends Pawan {

//  	     public void m1()
//  	     {
//  	     	System.out.println("m1 method");
//  	     }

//  	     Demo()
//  	     {   
//  	     	System.out.println("parent constructor");
//  	     }

//  	     Demo(String pass)
//  	     {  
 	     	
//  	     	System.out.println("parent parameter");
//  	     }

//  	     static {
//  	     	System.out.println("parent static block");
//  	     }
 	    
//  	     {
//  	     	System.out.println("parent non static block");
//  	     }
//  }

//  class Data extends Demo{
//  	  public void m2()
//  	  {
//  	  	System.out.println("m2 method");
//  	  }

//  	  Data()
//  	  {
//         this("");
        
//  	  	System.out.println("Child constructor");                       
//  	  }                                                  
                                                         
                                                         
//  	  Data(String name)                                 
//  	  {                                               
//         super("m");                                       
 	  	                                        
//         System.out.println("mp");                        
//  	  }                                                  
//  	  static                                             
//  	  {                                                  
//  	  	System.out.println("child static block");        
//  	  }

//  	  {
//  	  	System.out.println("child non static block");
//  	  }

//  	  public static void main(String[] args) {
//  	  	    Data d = new Data();

//  	  }
//  }


// class Test{
	    

// 	    Test()
// 	    {
// 	    	  int count = 0;
// 	    	 count++;
// 	    	System.out.println(count);
// 	    }

// 	    public static void main(String[] args) {
// 	    	   Test t = new Test();
// 	    	   Test t1 = new Test();
// 	    	   Test t2 = new Test();
// 	    }
// }

 // class Test{
 // 	  public static  void m1()
 // 	  {
 // 	  	System.out.println("monika"+"+rajput+");
 // 	  }
 // }

 // class Demo extends Test{
 // 	  public static  void m1()
 // 	  {
 // 	  	System.out.println("ritu rajput");
 // 	  }

 // 	  public static void main(String[] args) {
 // 	  	 Demo d = new Demo();
 // 	  	        d.  m1(); 

 // 	  }
 // }

 // class Test{
 // 	    Test()
 // 	    {    
 // 	    	System.out.println("parent constructor");
 // 	    }

 // 	    {
 // 	    	System.out.println("non static parent");  // static parent,static child,non parent,parent construcot
 // 	    }

 // 	    static {
 // 	    	System.out.println("static parent");
 // 	    }

 // }

 // class Demo extends Test{
 // 	 Demo()
 // 	 {     
 // 	 	System.out.println("child demo");
 // 	 }

 	 
 // 	 static {
 // 	 	System.out.println("child static");
 // 	 }

 // 	 {
 // 	 	System.out.println("chld non static ");
 // 	 }

 // 	 public static void main(String[] args) {
 // 	 	    Demo d  = new Demo();
 // 	 }
 // }

 

 // class Mona{
 // 	   public void m1()
 // 	   {
 //          System.out.println("monika rajput");
 // 	   }

 // 	   public void m2()
 // 	   {
 // 	   	System.out.println("m2 method");
 // 	   }
 // }

 // class Rajput extends Mona{
 // 	  public void m3()
 // 	  {
 // 	  	System.out.println("m3 method");
 // 	  }

 // 	  public void m4()
 // 	  {
 // 	  	System.out.println("m4 method");
 // 	  }
 // 	  public static void main(String[] args) {
 // 	  	    Mona r = new Rajput();
 // 	  	    r.m2();
 // 	  	    System.out.println(r instanceof Rajput);
 // 	  }
 // }

 
 // class Test{
 // 	  static int a = 10;
 // 	  static int b = 20;

 // 	  public static void main(String[] args) {
 	  	      
 // 	  	      Test t = new Test();
 // 	  	      System.out.println(t.b);

 // 	  	      b = 300;
 // 	  	      System.out.println(b);

 // 	  	      Test t1 = new Test();
 //             a = 500;
 //             b = 600;

 //             System.out.println(t1.a);
 //             System.out.println(t1.b);

 // 	  }
 // }

 // class Test{
 // 	    static int a = 10;
 // 	    void show()
 // 	    {
 // 	    	int b = 20;
 // 	    	System.out.println(a+" "+b);
 // 	    	++a; ++b;
 // 	    	System.out.println(b);
 // 	    }
 	    

 // 	    public static void main(String[] args) {
 // 	    	    Test t = new Test();
 // 	    	    t.show();
 // 	    	    t.show();


 // 	    }


 // }



 // class Monika{
 // 	   public void m1()
 // 	   {
 // 	   	  int a = 10;
 // 	   	  System.out.println(a);
 // 	   }

 // 	   {
 // 	   	  int b = 20;
 // 	   	  System.out.println(b);
 // 	   }                                                         

 // 	   Monika()
 // 	   {   
 // 	   	  int c = 30;
 // 	   	  System.out.println(c);
 // 	   }
 // 	   static {
 // 	   	   int m1 = 100;
 // 	   	   System.out.println(m1);    
 // 	   }
 // 	     public void m2()
 // 	  {
 // 	  	 {
 // 	  	 	 int m  = 40;
 // 	  	   System.out.println(m+"monika");
 // 	  	 }
 // 	  }
 // }

 // class Moni extends Monika
 // {
 // 	  public void m2()
 // 	  {
 // 	  	 {
 // 	  	 	 int m  = 40;
 // 	  	   System.out.println(m);
 // 	  	 }
 // 	  }

 // 	  static {
 // 	  	        {
 // 	  	        	 {
 // 	  	        	 	{
 // 	  	        	 		int a=10;
 // 	  	        	 		System.out.println("mp");
 // 	  	        	 	}
 // 	  	        	 	final int a=40;
                      
 // 	  	        	 System.out.println(a);
 // 	  	        	 }
 // 	  	        }
 // 	  }

 // 	  {
 // 	  	{
 // 	  		{
 // 	  			int a=9000;
 // 	  			{
 // 	  				{
 // 	  					{
 // 	  					    System.out.println("mp"+a);
 // 	  					}
 // 	  				}
 // 	  			}
 // 	  		}
 // 	  	}
 // 	  }

 // 	  public void m1()
 // 	   {
 // 	   	  int a = 10;
			 	   	    
 // 	   }

 // 	  Moni()
 // 	  {      
 // 	  	  int q = 70;
 // 	  	  System.out.println(q);
 // 	  }

 // 	  public static void main(String[] args) {
 // 	  	   Monika m = new Moni();
 // 	  	   m.m1();
 // 	  	   m.m2();
 // 	  }
 // }


  
 //  class M{
 //  	    final public void m1()
 //  	    {
 //  	    	System.out.println("mona rajputt");
 //  	    }

 //  	    M()
 //  	    {
 //  	    	final int a = 10;
 //  	    	System.out.println(a);

 //  	    }

 //  	    M()
 //  	    {
 //  	    	 String name = "monika";
 //  	    }
 //  }

 //  class N extends M{
 //  	  public void m1()
 //  	  {
 //  	  	System.out.println("m1 method");
 //  	  }

 //  	  N()
 //  	  {
 //  	  	  final int b = 5;
 //  	  	  System.out.println(b);
 //  	  }

 //  	  public static void main(String[] args) {
 //  	  	    M m = new M();
 //  	  	    N n = new N();
 //  	  }
 //  }


 
 // enum Monika{
 // 	     p
 	     
 // }

//      class  Monika{
  
//    	Monika(){

       
//         System.out.println("pp");
//    	}
//  	     static void m1()
//  	     {
//  	     	m2();
//  	     	System.out.println("abstract");
//  	     } 

//  	      void m2()
//  	     {
 	     	
//  	     	System.out.println("abstract");
//  	     }

//  	     {
//  	     	System.out.println("non static");
//  	     }
//  }                                                                


//    class Mona extends  Monika{
 	   
//  	     Mona()
//  	     {   
//             System.out.println("mona constructor");         
//  	     }
//  	      public void m1()
//  	     {
//  	     	System.out.println("monika");
//  	     }

//  	     public static void main(String[] args) {
//  	     	    Monika.m1();
 	     	      
//  	     }
     
//       {
//       	super.m1();
//       }

// }

  // interface Test{
  // 	   public  void m1()
  // 	   {
  // 	   	System.out.println("monika");
  // 	   }

  // }

  // interface Mona extends Test{
  // 	  public void m2()
  // 	  {
  // 	  	System.out.println("mona");
  // 	  }
  // 	  public static void main(String[] args) {
  // 	  	    Test t= new Test();
  // 	  	   t. m2();
  // 	  }
  // }
  // 


// class Monika2{
// 	public static void main(String[] args) {
// 		     int a = 10;
// 		     if(a>15)
// 		     {
// 		     	System.out.println("moniika");
// 		     }
// 		     else if(a>18)
// 		     {
// 		     	System.out.println("siddhi");
// 		     }
// 		     else if(a==9)
// 		     {
// 		     	System.out.println("rajput");
// 		     }
// 		     else 
// 		     {
// 		     	System.out.println("i am in else part");
// 		     }
// 	}
// }


//   class M{
// 	   int a=10;
// 	  public   void m1(){
// 	  	System.out.println("parent");
// 	  }
	  
// }

// class N extends  M{
	
// 	// int a = 20;
// 	 public  void m1()
// 	 {
// 	   super.m1();
// 	   // 
// 	 	System.out.println("monika rajput"+a);
// 	 	//System.out.println(a);
// 	 }

// 	 public static void main(String[] args) {
// 	 	    M n = new N();
// 	 	  n.m1();
// 	 	    System.out.println(n.a);

// 	 }
// }

 // interface M{
 // 	  public void m1();
 	  
 // }

 // interface N extends M{
 // 	   public void m2();
 	   
 // }

 // interface O extends N{
 // 	   public void m3();
 	   
 // }

 // interface P extends O{
 // 	  public void m4();
 	  
 	  
 // }

 // class Test implements M,N,O{
 // 	public void m1()
 // 	{
 // 		System.out.println("mona");
 // 	}
 // 	   public static void main(String[] args) {
 // 	   	      M m = new Test();
 // 	   	      m.m1();
 // 	   }
 // }


 // interface creation {
 // 	     void a();
 // 	     void b();
 // 	     void c();
 // 	     void d();
 // }

 // abstract class Demo implements creation{
         
 //         public void a()
 //         {
 //         	System.out.println(" i am in a");
 //         }
 // }

 //  class Data extends Demo{
 // 	    public void b()
 // 	    {
 //            System.out.println(" i am in b");
 // 	    }

 // 	    public void c ()
 // 	    {
 //            System.out.println(" i am in c");
 // 	    }

 // 	    public void d()
 // 	    {
 //            System.out.println(" i am in d");
 // 	    }

 // 	    public static void main(String[] args) {
 // 	    	   creation cd = new Data();
 //               cd.a();
 //               cd.b();
 //               cd.c();
 //               cd.d();
 // 	    }
 // }

import java.util.*;
// interface Calc{
// 	public int sqr(int n);
// }


// class Test{
// 	public static void main(String[] args) {
// 		 Calc c = (int n)->{return n*n;};
// 		 System.out.println(5*5);     
// 	}
// }


// interface Sum{
// 	 public int sum(int a,int b);
// }

// class Data{
// 	public static void main(String[] args) {
// 		 Sum s = (int a,int b)->{return a+b;};
// 		 System.out.println(6+5);
// 	}
// }

// interface Mult{
// 	  public int mult(int a ,int b);
// }

// class Demo{
// 	public static void main(String[] args) {
// 		    Mult m =  (a , b)-> a*b;
// 		    System.out.println(7*5);
// 	}
// }

// interface Div{
// 	  public int div(int m,int n);
// }

// class Divide{
// 	public static void main(String[] args) {
// 		   Div d = (m,n)->{return m/n;};
// 		   System.out.println(10/2);
// 	}
// }

// interface Add{
// 	 public int add(int a,int b,int c);
// }

// class Addition{
// 	public static void main(String[] args) {
// 		 Add add= (a,b,c)->{return a+b+c;};
// 		 System.out.println(10+20+30);
// 	}
// }


// class RevString{
// 	  public static void main(String[] args) {
// 	  	      String s = "hello";
// 	  	      char ch[] = s.toCharArray();
// 	  	      String start[] = 0;
// 	  	      String last[] = ch.length-1;
//               System.out.println("before reverse array");

// 	          while(start<last)
// 	          {
//                   char ch1 = ch1[start];
//                   ch1[start] = ch1[last];
//                   ch1[last]  = ch1;
// 	          }
// 	          start++;
// 	          last--;

// 	          for(int i =0; i<ch1.length;i++)
// 	  	      {
// 	  	      	System.out.println(ch1[i]);
	  	      
// 	          }
// 	      }
// }


// @FunctionalInterface
// interface Demo{
// 	      String changeStr(String str)
// 	    ;
// }

// @FunctionalInterface
// interface Data extends Demo{
//         default String newStringStr(String str1)
//         {
//                   return "";
//         }default String newStringStr1(String str1)
//         {
//                   return "";
        	
//         }default String newStringStr2(String str1)
//         {
//                   return "";
        	
//         }

     
// }


// class MaxArray{
// 	public static void main(String[] args) {
		
	
// 	   int a[] = {10,20,30,40,50};
// 	   int max = a[0];
	  
// 	   for(int i =1;i<a.length;i++)
// 	   {
// 	   	  if(a[i]>max)
// 	   	  {

// 	   	  	 max = a[i];
	   	  	 
	   	  	
// 	   	  }

// 	   }
// 	   System.out.println(max);
    
// }
// }

// class ElemntFind{
// 	public static void main(String[] args) {
// 		   int a[] = {1,2,3,4,5,6};
// 		   int a1[] ;
// 		   int element = 6;
// 		   for(int i =0;i<a.length;i++)
// 		   {
// 		   	  if(element == a[i])
// 		   	  {
// 		   	  	  element = a[i];
// 		   	  }
// 		   }
// 		   System.out.println("element find"+element);
// 	}
// }

// import java.io.*;
// class Array2D{
// 	 public static void main(String[] args) {
	 	
// 	 	  Scanner sc = new Scanner(System.in);
// 	 	  System.out.println("Enter rows::");
//           int rows = sc.nextInt();
//           System.out.println("Enter column::");
//           int cols = sc.nextInt();
//           int a[][] = new int[rows][cols];
//           for(int i = 0;i<rows;i++)
//           {
//           	  for(int j =0;j<cols;j++)
//           	  {
//           	  	  a[i][j] = sc.nextInt();
//           	  }
          	
//           }
//            for(int i =0;i<rows;i++)
//            {
//            	for(int j =0;j<cols;j++)
//            	{
//            		 System.out.print(a[j][i]);
//            	}
//            	System.out.println();
           	
//            }
//         }
// }

                        // TRANSPOSE  PROGRAMME
// import java.io.*;
// class Array2D{
// 	 public static void main(String[] args) {
	 	
// 	 	  Scanner sc = new Scanner(System.in);
// 	 	  System.out.println("Enter rows::");
//           int rows = sc.nextInt();
//           System.out.println("Enter column::");
//           int cols = sc.nextInt();
//           int a[][] = new int[rows][cols];
//           for(int i = 0;i<rows;i++)
//           {
//           	  for(int j =0;j<cols;j++)
//           	  {
//           	  	  a[i][j] = sc.nextInt();

//           	  }
          	
//           }
//           System.out.println("before transpose::");
//            for(int i =0;i<rows;i++)
//            {
//            	for(int j =0;j<cols;j++)
//            	{
//            		 System.out.print(a[j][i]);
//            	}
//            	System.out.println();
           	
//            }
//            System.out.println("after transpose::");
//            for(int i =0;i<cols;i++)
//            {
//            	for(int j =0;j<rows;j++)
//            	{
//            		 System.out.print(a[i][j]);
//            	}
//            	System.out.println();
           	
//            }
//         }
// }


                      //PRINT ALL EVEN ELEMENT VALUE
// class ArrayElement{
// 	    public static void main(String[] args) {
// 	    	   Scanner sc = new Scanner(System.in);
// 	    	   System.out.println("Enter rows::");
// 	    	   int rows = sc.nextInt();
// 	    	   System.out.println("Enter column:");
// 	    	   int column = sc.nextInt();
// 	    	   int sum = 0;
// 	    	   int arr[][] = new int[rows][column];
// 	    	   for(int i =0;i<rows;i++)
// 	    	   {
// 	    	   	  for(int j=0;j<column;j++)
// 	    	   	  {
// 	    	   	  	  arr[i][j] = sc.nextInt();
// 	    	   	  }
// 	    	   }
//                 System.out.println("after print value");
// 	    	   for(int i =0;i<rows;i++)
// 	    	   {
// 	    	   	 for(int j = 0;j<column;j++)
// 	    	   	 {
// 	    	   	 	if(arr[i][j]%2==0)
// 	    	   	 	{
// 	    	   	 		sum = sum+arr[i][j];
	    	   	 		
// 	    	   	 	}
	    	   	 	
// 	    	   	 }
	    	   

// 	    	   }
// 	    	   System.out.print(sum); 
// 	    }
// }
                      //TWO DIAGONAL VALUES PRINT
// import java.io.*;
// class ArrayDiagonalElement{
// 	  public static void main(String[] args) {
// 	  	      Scanner sc = new Scanner(System.in);
// 	  	      System.out.println("Enter rows::");
// 	  	      int rows = sc.nextInt();
// 	  	      System.out.println("Enter colmn");
// 	  	      int colmn = sc.nextInt();
// 	  	      int arr[][] = new int[rows][colmn];
// 	  	      int temp = 0;
// 	  	      System.out.println("before get element");
// 	  	      for(int i = 0;i<rows;i++)
// 	  	      {
// 	  	      	 for(int j = 0;j<colmn;j++)
// 	  	      	 {
// 	  	      	 	 arr[i][j] = sc.nextInt();
// 	  	      	 }
// 	  	      }
// 	  	     System.out.println("after print data");
// 	  	     for(int i =0;i<rows;i++)
// 	  	     {
// 	  	     	for(int j = 0;j<colmn;j++)
// 	  	     	{
// 	  	     		System.out.print(arr[i][j]);

// 	  	     	}
// 	  	     	System.out.println();
// 	  	     }
	  	     
//             System.out.println("diagonal  values");
//             for(int i =0;i<rows;i++)
// 	  	     {
// 	  	     	for(int j = 0;j<colmn;j++)
// 	  	     	{

	  	     		
// 	  	     		if(i==j || i+j==rows-1)
// 	  	     		{
	  	     			
// 	  	     			System.out.print(arr[i][j]+" ");
	  	     			
	  	     			
// 	  	     		}

// 	  	     		// if(i+j==rows-1){
// 	  	     		// 	System.out.print(arr[i][j]);
// 	  	     		// 	// j++;
// 	  	     		// }
//                  }
// 	  	     	System.out.println();
// 	  	     }
// 	  }
// }



// int maxFunction(int arr[],int arr1[])
// {
//       int size = arr.length-1;
//       int size = arr1.length-1;
// }


// class NumberPrint{
// 	public static void main(String[] args) {
// 		  int arr[] = {1,2,3,4};
// 		  int arr1[] = {7,8,9,3};
// 		  int arr2[] = maxSize(arr,+arr1)
// 		  int carry = 0;

// 		  for(int i =0;i<arr.length;i++)
// 		  {
// 		  	    System.out.println(max(arr[0]+arr1[0]));
// 		  }
// }
// }


    

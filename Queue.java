/*class Node{

	 Object value;
	 Node next;

	 Node(Object value)
	 {
	 	  this.value = value;
	 }
}

class Queue{

	  Node front,rear;

	   public void insert(Object val)
	   {
	   	  Node newNode = new Node(val);
           Node temp = rear;
           if(rear == null)
           {
              rear = front = newNode;
           }

           else
           {
           	  newNode.next = rear;
           	  rear = newNode;
           }
	   }
	   public Object delete(){
	   	if(front==null)
	   		return null;
	   	Node t=rear;
	   	if(front==rear){
	   		front=rear=null;
	   	}
	   	else{
	   		rear=rear.next;
	   	}
	   	return t.value;
	   }

	     public String toString()
	     {
	     	 String s = "";
             if(rear==null)
                 return "[]";
             if(rear==front)
             {
             	  rear = front = null;
             }
              	Node t=rear;
              while(t!=null)
              {
                  s = s+","+t.value;
                  t=t.next;
              }
              return s.substring(1);
	     }
}

class Test{
	public static void main(String[] args) 
	{
		 Queue queue = new Queue();
		 queue.insert(10);
		 queue.insert(20);
		 queue.insert(30);
		 queue.insert(40);

		 System.out.println(queue);
		 System.out.println(queue.delete());
		 System.out.println(queue);
	}
}*/



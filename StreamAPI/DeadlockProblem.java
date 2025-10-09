//------------------------------------------deadlock problem in multithreading----------------------------------------
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;



class Task1 implements Runnable{

	private Pen pen;
	private Paper paper;

	public Task1(Pen pen,Paper paper){
		this.pen = pen;
		this.paper = paper;
	}

	public void run(){
		System.out.println("Task - 1");
	}
}

class Task2 implements Runnable{

      private Pen pen;
      private Paper paper;

      public Task2(Pen pen,Paper paper){

      	  this.pen = pen;
      	  this.paper = paper;
      }

      public void run(){
      	 System.out.println("Task -2 methods ");
      }
}

 class Pen {

    private final Lock lock  = new ReentrantLock();

    public void writeWithPaperAndPen(Paper paper) {
        lock.lock(); 
        try {
            paper.getLock().lock();
            try {
                System.out.println(Thread.currentThread().getName() + " is writing using pen and paper");
            } finally {
                paper.getLock().unlock();
            }
        } finally {
            lock.unlock();
        }
    }

    public   void finishWriting(){
        System.out.println("finish writing with pen");
    }

    public Lock getLock() {
        return lock;
    }
}

 class Paper {

    private final Lock lock = new ReentrantLock();

    public void writeWithPenAndPaper(Pen pen) {
      
        pen.getLock().lock();
        try {
            lock.lock();
            try {
                System.out.println(Thread.currentThread().getName() + " is writing using paper and pen");
            } finally {
                lock.unlock();
            }
        } finally {
            pen.getLock().unlock();
        }
    }

    public Lock getLock() {
        return lock;
    }

}

class TestThread{

	 public static void main(String[] args) {
	 	
	 	  Pen pen = new Pen();
	 	  Paper paper = new Paper();

	 	  Thread thread1 = new Thread(new Task1(pen,paper),"Thread-1");
	 	  Thread thread2 = new Thread(new Task2(pen,paper),"Thread-2");

	 	  thread1.start();
	 	  thread2.start();
	 }
}
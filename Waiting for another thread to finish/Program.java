public class Program {
  public static void main(String[] args) {
    ThreadClass t = new ThreadClass();
    t.start();
    try {
      t.join(); //wait for thread t
      System.out.println("Created thread finished");
	} catch(InterruptedException e) { 
	  // handle exception
	}
    
  }
}
 
class ThreadClass extends Thread  {
  @Override
  public void run() {
    System.out.println("Started new thread...");
    try {
      Thread.sleep(1000);
    } catch(InterruptedException e) {
      // handle exception
    }
    System.out.println("Finishing new thread...");
  }
}
class Program
{ 
  public static void main(String[] args) {
    ThreadClass t = new ThreadClass();
    t.start();
    System.out.println("Wait for notification..."); 
    synchronized(t) {
      try {
        t.wait();
      } catch(InterruptedException e) {
        //handle exception
      }
    }
    System.out.println("Notification received.");
  }
}
 
class ThreadClass extends Thread {
  @Override
  public void run() {
  	try {
      Thread.sleep(1000);
    } catch(InterruptedException e) {
      //handle exception
    }    
    System.out.println("Sending notification...");
    synchronized(this) {
      notify();
    }
  }
}
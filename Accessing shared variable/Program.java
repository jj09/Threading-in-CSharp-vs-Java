public class Program {
  public static int sharedVariable;
  public static final Object lock = new Object();
  public static void main(String[] args) {
    ThreadClass t = new ThreadClass();
    t.start(); 
    synchronized(lock)
    {
      //sample operation
      if(sharedVariable==0) {
        Program.sharedVariable = 1;
      }
    }      
  }
}
 
class ThreadClass extends Thread {
  @Override
  public void run() {
    synchronized(Program.lock) {
      //sample operation
      if(Program.sharedVariable>0) {      
        Program.sharedVariable++;
      }
    }
  }
}
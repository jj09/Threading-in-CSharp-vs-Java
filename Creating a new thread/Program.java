public class Program {
  public static void main(String[] args) {
    ThreadClass t = new ThreadClass();
    t.start(); 
  }
}
 
class ThreadClass extends Thread {
  @Override
  public void run() {
    System.out.println("Thread started");
  }
}
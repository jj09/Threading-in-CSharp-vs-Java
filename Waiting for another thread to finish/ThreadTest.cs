using System;
using System.Threading;

class ThreadTest
{
  static void Main()
  {
    Thread t = new Thread (Method);
    t.Start();   
    t.Join(); //wait for thread t
    Console.WriteLine("Created thread finished");
  }
 
  static void Method()
  {
    Console.WriteLine("Started new thread...");
    Thread.Sleep(1000);
    Console.WriteLine("Finishing new thread...");
  }
}
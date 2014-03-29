using System;
using System.Threading;

class ThreadTest
{
  static void Main()
  {
    Thread t = new Thread (Method);
    t.Start();    
  }
 
  static void Method()
  {
    Console.WriteLine("Thread started");
  }
}
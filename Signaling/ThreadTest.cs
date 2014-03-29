using System;
using System.Threading;

class ThreadTest
{
  static EventWaitHandle _waitHandle
    = new AutoResetEvent (false);
 
  static void Main()
  {
    new Thread (Waiter).Start();    
    Console.WriteLine("Wait for notification...");
    _waitHandle.WaitOne();
    Console.WriteLine("Notification received.");
  }
 
  static void Waiter()
  {
    Thread.Sleep (1000);
    Console.WriteLine("Sending notification...");
    _waitHandle.Set();
  }
}
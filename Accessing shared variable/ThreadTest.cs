using System;
using System.Threading;

class ThreadTest
{
  static readonly object locker
    = new object();
  static int sharedVariable;

  static void Main()
  {
    Thread t = new Thread (Method);
    t.Start();   
    lock(locker)
    {
      // sample operation
      if(sharedVariable==0)
      {
        sharedVariable = 1;
      }
    }
  }
 
  static void Method()
  {
    lock(locker)
    {
      // sample operation
      if(sharedVariable>0)
      {
        sharedVariable++;
      }
    }
  }
}
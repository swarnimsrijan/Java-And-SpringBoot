# Multithreading in java
- A multi-threaded program contains two or more parts that can run concurrently and each part can handle a different task at the same time making optimal use of the available resources specially when your computer has multiple CPUs
-  Multi-threading extends the idea of multitasking into applications where you can subdivide specific operations within a single application into individual threads. Each of the threads can run in parallel.
- OS divides processing time not only among different applications, but also among each thread within an application
## Java Multithreading
- To achieve the multithreading (or, write multithreaded code), you need java.lang.Thread class.
## Life Cycle of a Thread in Java Multithreading
- Stages
  - New − A new thread begins its life cycle in the new state. It remains in this state until the program starts the thread. It is also referred to as a born thread. 
  - Runnable − After a newly born thread is started, the thread becomes runnable. A thread in this state is considered to be executing its task. 
  - Waiting − Sometimes, a thread transitions to the waiting state while the thread waits for another thread to perform a task. A thread transitions back to the runnable state only when another thread signals the waiting thread to continue executing. 
  - Timed Waiting − A runnable thread can enter the timed waiting state for a specified interval of time. A thread in this state transitions back to the runnable state when that time interval expires or when the event it is waiting for occurs. 
  - Terminated (Dead) − A runnable thread enters the terminated state when it completes its task or otherwise terminates.
## Thread Priorities
- Every Java thread has a priority that helps the operating system determine the order in which threads are scheduled.
- range between MIN_PRIORITY (a constant of 1) and MAX_PRIORITY (a constant of 10)
- By default, every thread is given priority NORM_PRIORITY (a constant of 5).
- thread priorities cannot guarantee the order in which threads execute and are very much platform dependent.

# Creating a Thread
## Implementing Runnable Interface
- Step 1: Implement run() Method
  - implement a run() method provided by a Runnable interface
  - provides an entry point for the thread and you will put your complete business logic inside this method.
    - ```public void run( )```
- Step 2: Instantiate a Thread Object
  -  will instantiate a Thread object using constructor
    - ```Thread(Runnable threadObj, String threadName);```
  - threadObj is an instance of a class that implements the Runnable interface and threadName is the name given to the new thread.
- Step 3: Call Thread using start() Method
  -  you can start it by calling start() method, which executes a call to run( ) method.
  - ```void start();```
## Extending a Thread Class
- create a new class that extends Thread class using the following two simple steps
- provides more flexibility in handling multiple threads created using available methods in Thread class
- Step 1: Override run() Method
  - ```public void run( )```
- Step 2: Call Thread using start() Method
  - ```void start( );```

--- 
# Thread Methods
- invoked on a particular Thread object.
  - public void start() : Starts the thread in a separate path of execution, then invokes the run() method on this Thread object.
  - public void run() : If this Thread object was instantiated using a separate Runnable target, the run() method is invoked on that Runnable object.
  - public final void setName(String name) : Changes the name of the Thread object. There is also a getName() method for retrieving the name.
  - public final void setPriority(int priority) : Sets the priority of this Thread object. The possible values are between 1 and 10.
  - public final void setDaemon(boolean on) : A parameter of true denotes this Thread as a daemon thread.
  - public final void join(long millisec) : The current thread invokes this method on a second thread, causing the current thread to block until the second thread terminates or the specified number of milliseconds passes.
  - public void interrupt() : Interrupts this thread, causing it to continue execution if it was blocked for any reason.
  - public final boolean isAlive() : Returns true if the thread is alive, which is any time after the thread has been started but before it runs to completion.
- Static methods (Invoking one of the static methods performs the operation on the currently running thread.)
  - public static void yield() : Causes the currently running thread to yield to any other threads of the same priority that are waiting to be scheduled.
  - public static void sleep(long millisec) : Causes the currently running thread to block for at least the specified number of milliseconds.
  - public static boolean holdsLock(Object x) : Returns true if the current thread holds the lock on the given Object.
  - public static Thread currentThread() : Returns a reference to the currently running thread, which is the thread that invokes this method.
  - public static void dumpStack() : Prints the stack trace for the currently running thread, which is useful when debugging a multithreaded application.
  - 

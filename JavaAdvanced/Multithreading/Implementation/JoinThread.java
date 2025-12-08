class RunnableDemo implements Runnable {
    RunnableDemo( ) {
        System.out.println("Thread: " + Thread.currentThread().getName() + ", " + "State: New");
    }

    public void run() {
        System.out.println("Thread: " + Thread.currentThread().getName() + ", " + "State: Running");
        for(int i = 4; i > 0; i--) {
            System.out.println("Thread: " + Thread.currentThread().getName() + ", " + i);
        }
        System.out.println("Thread: " + Thread.currentThread().getName() + ", " + "State: Dead");
    }
}

public class JoinThread {
    public static void main(String args[]) throws InterruptedException {
        Thread t1 = new Thread( new RunnableDemo(), "Thread-1");
        Thread t2 = new Thread( new RunnableDemo(), "Thread-2");
        Thread t3 = new Thread( new RunnableDemo(), "Thread-3");
        Thread t4 = new Thread( new RunnableDemo(), "Thread-4");
        // start t1 thread and join main thread
        t1.start();
        t1.join(200);
        // t2 will start when t1 is dead
        t2.start();
        t2.join(200,100000);
        // t3 will start when t2 is dead
        t3.start();
        t3.join();
        // t4 will start when t3 is dead
        t4.start();
    }
}
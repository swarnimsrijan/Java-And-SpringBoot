
class RunnableDemo implements Runnable {
    private String threadName;
    RunnableDemo( String name) {
        threadName = name;
        System.out.println("Thread: " + threadName + ", " + "State: New");
    }

    public void run() {
        System.out.println("Thread: " + threadName + ", " + "State: Running");
        for(int i = 4; i > 0; i--) {
            System.out.println("Thread: " + threadName + ", " + i);
        }
        System.out.println("Thread: " + threadName + ", " + "State: Dead");
    }
}

public class CreateThreadUsingRunnable {
    public static void main(String args[]) {
        RunnableDemo runnableDemo1 = new RunnableDemo( "Thread-1");
        RunnableDemo runnableDemo2 = new RunnableDemo( "Thread-2");

        Thread thread1 = new Thread(runnableDemo1);
        Thread thread2 = new Thread(runnableDemo2);

        thread1.start();
        thread2.start();
    }
}
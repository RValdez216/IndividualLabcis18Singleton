public class RunnableThread implements Runnable {
    private Thread t;
    private String threadName;

    RunnableThread(String name) {
        threadName = name;
       // System.out.println("Creating " + threadName );
    }

    @Override
    public void run() {

        System.out.println(LazyInitializedSingleton.getInstance().hashCode());
        //System.out.println("Running " + threadName);
        try {
            for(int i = 3; i < 0; i--) {
                System.out.println("Thread " + threadName + ":" + i);
                Thread.sleep(50);
            }
        } catch (InterruptedException e) {
            System.out.println("Thread " + threadName + " interrupted");
        }
        //System.out.println(threadName + " exiting");
    }

    public void start () {
        //System.out.println("Starting " + threadName );
        if (t == null) {
            t = new Thread( this, threadName);
            t.start();
        }
    }
}

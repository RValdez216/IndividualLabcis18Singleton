public class Main {

    public static void main(String args[]) {
        RunnableThread R1 = new RunnableThread("Thread 1");
        RunnableThread R2 = new RunnableThread("Thread 2");
        RunnableThread R3 = new RunnableThread("Thread 3");

        R1.start();
        R2.start();
        R3.start();
    }
}

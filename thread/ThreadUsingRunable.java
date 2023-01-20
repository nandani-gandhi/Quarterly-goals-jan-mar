package thread;

public class ThreadUsingRunable implements Runnable {
    public void run() {
        System.out.println("Now the thread is running ...");
    }

    public static void main(String arg[]) {

        Runnable r1 = new ThreadUsingRunable();

        Thread th1 = new Thread(r1, "My thread");

        th1.start();

        String str = th1.getName();
        System.out.println(str);
    }
}

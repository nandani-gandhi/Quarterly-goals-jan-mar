package thread;

class MyThread extends Thread
{
    public  void run()
    {
        for (int i = 0; i < 10 ; i++)
        {
            System.out.println("This is child thread");
        }
    }
}
public class ThreadUsingExtends {
    public static void main(String[] args) {
        MyThread myThread =new MyThread();
        myThread.start();
        for (int i = 0; i < 10 ; i++)
        {
            System.out.println("This is main thread");
        }
    }
}

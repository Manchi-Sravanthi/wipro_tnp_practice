package multithreading.threadsynchronization;
class MyThread extends Thread {

    public MyThread(String name) {
        super(name);
    }

    public void run() {

        for (int i = 1; i <= 5; i++) {
            System.out.println(getName() + " : " + i);
        }

        System.out.println(getName() + " Completed");
    }
}

public class Q3 {

    public static void main(String[] args) {

        MyThread t1 = new MyThread("MAX");
        MyThread t2 = new MyThread("MIN");
        MyThread t3 = new MyThread("NORM");

        t1.setPriority(Thread.MAX_PRIORITY);
        t2.setPriority(Thread.MIN_PRIORITY);
        t3.setPriority(Thread.NORM_PRIORITY);

        t1.start();
        t2.start();
        t3.start();
    }
}

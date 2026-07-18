package multithreading.miniproject;


class Race extends Thread {

    public Race(String name) {
        super(name);
    }

    @Override
    public void run() {

        for (int i = 1; i <= 100; i++) {

            System.out.println(getName() + " : " + i + " meters");
            if (getName().equals("Hare") && i == 60) {
                try {
                    System.out.println("Hare is sleeping...");
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }

        System.out.println(getName() + " finished the race!");
    }
}

public class Project1 {

    public static void main(String[] args) {

        Race hare = new Race("Hare");
        Race tortoise = new Race("Tortoise");
        hare.setPriority(Thread.MAX_PRIORITY);
        tortoise.setPriority(Thread.MIN_PRIORITY);

        hare.start();
        tortoise.start();
    }
}
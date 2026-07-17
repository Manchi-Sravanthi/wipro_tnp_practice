package multithreading.threadcreation;
import java.util.Random;

class ColourThread implements Runnable {

    public void run() {

        String colours[] = {"white", "blue", "black", "green", "red", "yellow"};

        Random random = new Random();

        while (true) {

            int index = random.nextInt(colours.length);

            System.out.println(colours[index]);
            if (colours[index].equals("red")) {
                System.out.println("Red colour found. Thread stopped.");
                break;
            }
        } 
    }
}

public class Q2 {

    public static void main(String[] args) {

        ColourThread obj = new ColourThread();

        Thread t = new Thread(obj);

        t.start();
    }
}
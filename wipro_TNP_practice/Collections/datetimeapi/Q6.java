package Collections.datetimeapi;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class Q6 {

    public static void main(String[] args) {

        LocalTime currentTime = LocalTime.now();
        LocalTime beforeTime = currentTime.minusHours(5).minusMinutes(30);

        DateTimeFormatter format = DateTimeFormatter.ofPattern("HH:mm:ss");

        System.out.println("Current Time : " + currentTime.format(format));
        System.out.println("Time before 5 Hours 30 Minutes : " + beforeTime.format(format));
    }
}

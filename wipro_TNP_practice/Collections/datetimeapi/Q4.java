package Collections.datetimeapi;
import java.time.Year;

import java.time.LocalDate;

public class Q4 {

    public static void main(String[] args) {

        LocalDate today = LocalDate.now();

        int year = today.getYear();

        if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0))
            System.out.println(year + " is a Leap Year");
        else
            System.out.println(year + " is Not a Leap Year");
    }
}
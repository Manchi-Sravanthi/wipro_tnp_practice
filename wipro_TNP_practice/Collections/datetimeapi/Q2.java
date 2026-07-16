package Collections.datetimeapi;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.temporal.TemporalAdjusters;

public class Q2 {

    public static void main(String[] args) {
    	LocalDate today = LocalDate.now();
        LocalDate nextMonth = today.plusMonths(1).withDayOfMonth(1);
        LocalDate secondSunday = nextMonth.with(
        TemporalAdjusters.dayOfWeekInMonth(2, DayOfWeek.SUNDAY));

        System.out.println("Today's Date : " + today);
        System.out.println("Second Sunday of Next Month : " + secondSunday);
    }
}
package junit.assertions;


import static org.junit.jupiter.api.Assertions.assertArrayEquals;

import org.junit.jupiter.api.Test;

import junit.com.wipro.task.DailyTask;

public class Q1 {

    @Test
    public void testSortValues() {

        DailyTask dt = new DailyTask();

        int input[] = {5, 2, 8, 1, 4};

        int expected[] = {1, 2, 4, 5, 8};

        int actual[] = dt.sortValues(input);

        assertArrayEquals(expected, actual);
    }
}
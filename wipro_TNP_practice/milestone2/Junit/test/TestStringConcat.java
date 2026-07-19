package junit.com.wipro.test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

import junit.com.wipro.task.DailyTask;

public class TestStringConcat {

    @Test
    public void testDoStringConcat() {

        DailyTask dt = new DailyTask();

        String actual = dt.doStringConcat("Hello", "World");

        assertEquals("Hello World", actual);
    }
}
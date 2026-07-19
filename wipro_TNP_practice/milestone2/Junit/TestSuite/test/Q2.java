package junit.com.wipro.test;


import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.Assertions.assertFalse;

import org.junit.jupiter.api.Test;

import junit.com.wipro.task.DailyTask;

public class Q2 {

    @Test
    public void testCheckPresenceTrue() {

        DailyTask dt = new DailyTask();

        assertTrue(dt.checkPresence("Wipro Technologies", "Tech"));
    }

    @Test
    public void testCheckPresenceFalse() {

        DailyTask dt = new DailyTask();

        assertFalse(dt.checkPresence("Wipro Technologies", "Java"));
    }
}

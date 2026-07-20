package junit.miniproject.test;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import junit.miniproject.main.Student;
import junit.miniproject.service.StudentReport;

public class NullCountTest {

    StudentReport report = new StudentReport();

    @Test
    public void testNullNames() {

        Student s1 = new Student(null, new int[] {90});
        Student s2 = new Student("Ram", new int[] {80});
        Student s3 = new Student(null, new int[] {70});

        Student arr[] = {s1, s2, s3};

        assertEquals(2, report.findNumberOfNullNames(arr));
    }

    @Test
    public void testNullStudents() {

        Student s1 = new Student("Ram", new int[] {90});

        Student arr[] = {s1, null, null};

        assertEquals(2, report.findNumberOfNullStudents(arr));
    }

    @Test
    public void testNullMarks() {

        Student s1 = new Student("Ram", null);
        Student s2 = new Student("Ravi", new int[] {90});
        Student s3 = new Student("Kiran", null);

        Student arr[] = {s1, s2, s3};

        assertEquals(2, report.findNumberOfNullMarks(arr));
    }
}
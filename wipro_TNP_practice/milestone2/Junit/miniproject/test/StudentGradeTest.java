package junit.miniproject.test;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import junit.miniproject.main.Student;
import junit.miniproject.service.StudentService;

public class StudentGradeTest {

    StudentService service = new StudentService();

    @Test
    public void testGradeA() throws Exception {

        Student s = new Student("Ram",
                new int[]{90,85,95});

        assertEquals("A", service.findGrade(s));
    }

    @Test
    public void testGradeD() throws Exception {

        Student s = new Student("Ravi",
                new int[]{45,40,50});

        assertEquals("D", service.findGrade(s));
    }

    @Test
    public void testGradeF() throws Exception {

        Student s = new Student("Kiran",
                new int[]{10,20,25});

        assertEquals("F", service.findGrade(s));
    }

}
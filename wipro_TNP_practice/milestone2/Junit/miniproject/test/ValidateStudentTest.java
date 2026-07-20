package junit.miniproject.test;


import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.Test;

import junit.miniproject.exception.*;
import junit.miniproject.main.Student;
import junit.miniproject.service.StudentService;

public class ValidateStudentTest {

    StudentService service = new StudentService();

    @Test
    public void testNullStudent() {

        assertThrows(NullStudentException.class,
                () -> service.findGrade(null));
    }

    @Test
    public void testNullName() {

        Student s = new Student(null,
                new int[]{80,80,80});

        assertThrows(NullNameException.class,
                () -> service.findGrade(s));
    }

    @Test
    public void testNullMarks() {

        Student s = new Student("Ram", null);

        assertThrows(NullMarksArrayException.class,
                () -> service.findGrade(s));
    }

}
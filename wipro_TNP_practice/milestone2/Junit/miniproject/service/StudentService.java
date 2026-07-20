package junit.miniproject.service;


import junit.miniproject.main.Student;
import junit.miniproject.exception.*;

public class StudentService {

    public String findGrade(Student student)
            throws NullStudentException,
                   NullNameException,
                   NullMarksArrayException {

        if (student == null)
            throw new NullStudentException();

        if (student.getName() == null)
            throw new NullNameException();

        if (student.getMarks() == null)
            throw new NullMarksArrayException();

        int sum = 0;

        for (int mark : student.getMarks()) {
            sum += mark;
        }

        double avg = sum / (double) student.getMarks().length;

        if (avg >= 80)
            return "A";

        else if (avg >= 60)
            return "B";

        else if (avg >= 40)
            return "C";

        else
            return "F";
    }
}
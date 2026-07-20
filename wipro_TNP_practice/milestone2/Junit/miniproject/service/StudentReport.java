package junit.miniproject.service;


import junit.miniproject.main.Student;

public class StudentReport {

    public int findNumberOfNullStudents(Student[] students) {

        int count = 0;

        for (Student s : students) {
            if (s == null)
                count++;
        }

        return count;
    }

    public int findNumberOfNullNames(Student[] students) {

        int count = 0;

        for (Student s : students) {
            if (s != null && s.getName() == null)
                count++;
        }

        return count;
    }

    public int findNumberOfNullMarks(Student[] students) {

        int count = 0;

        for (Student s : students) {
            if (s != null && s.getMarks() == null)
                count++;
        }

        return count;
    }
}
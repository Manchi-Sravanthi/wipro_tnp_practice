package junit.miniproject.exception;


public class NullStudentException extends Exception {

    public NullStudentException() {
        super("Student object is null");
    }
}
package abstraction.miniproject3.exception;
public class NullStudentObjectException extends Exception {

    @Override
    public String toString() {
        return "Student object is null";
    }
}
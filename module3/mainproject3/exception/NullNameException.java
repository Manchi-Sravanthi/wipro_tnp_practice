package abstraction.miniproject3.exception;

public class NullNameException extends Exception {

    @Override
    public String toString() {
        return "Name is null";
    }
}
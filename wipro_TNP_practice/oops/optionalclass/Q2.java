package optionalclass;
import java.util.Optional;

public class Q2 {
    public static void main(String[] args) {

        String address = null;

        Optional<String> add = Optional.ofNullable(address);

        System.out.println(add.orElse("India"));
    }
}

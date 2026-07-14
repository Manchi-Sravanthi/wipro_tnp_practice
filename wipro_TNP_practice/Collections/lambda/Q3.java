package Collections.lambda;
import java.util.ArrayList;

public class Q3 {

    public static void main(String[] args) {

        ArrayList<String> al = new ArrayList<>();
        al.add("Java");
        al.add("Python");
        al.add("C");
        al.add("HTML");
        al.add("CSS");
        al.add("SQL");
        al.add("Oracle");
        al.add("React");
        al.add("Spring");
        al.add("MongoDB");

        System.out.println("Strings with Odd Length:");
        al.forEach(word -> {
            if (word.length() % 2 != 0) {
                System.out.println(word);
            }
        });
    }
}
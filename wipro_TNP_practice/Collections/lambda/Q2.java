package Collections.lambda;
import java.util.ArrayList;
import java.util.Collections;

public class Q2 {

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
        Collections.reverse(al);

        System.out.println("Strings in Reverse Order:");
        al.forEach(word -> System.out.println(word));
    }
}
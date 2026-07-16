package Collections.functionalinterface;
import java.util.ArrayList;
import java.util.function.Predicate;

public class Q3 {

    public static void main(String[] args) {

        ArrayList<String> list = new ArrayList<>();
        list.add("madam");
        list.add("java");
        list.add("level");
        list.add("hello");
        list.add("radar");
        list.add("world");
        list.add("malayalam");
        list.add("apple");
        list.add("noon");
        list.add("computer");
        Predicate<String> p = word -> {
            String rev = new StringBuilder(word).reverse().toString();
            return word.equalsIgnoreCase(rev);
        };

        System.out.println("Palindrome Words:");

        for (String word : list) {
            if (p.test(word)) {
                System.out.println(word);
            }
        }
    }
}

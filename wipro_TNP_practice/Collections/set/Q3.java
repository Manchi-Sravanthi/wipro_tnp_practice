package Collections.set;
import java.util.Iterator;
import java.util.TreeSet;

public class Q3 {

    public static void main(String[] args) {

        TreeSet<String> ts = new TreeSet<>();

        ts.add("Java");
        ts.add("Python");
        ts.add("C");
        ts.add("SQL");
        ts.add("HTML");
        System.out.println("Reverse Order:");
        System.out.println(ts.descendingSet());
        System.out.println("\nUsing Iterator:");

        Iterator<String> itr = ts.iterator();

        while (itr.hasNext()) {
            System.out.println(itr.next());
        }
        System.out.println("\nChecking Elements:");

        if (ts.contains("Java")) {
            System.out.println("Java is present");
        } else {
            System.out.println("Java is not present");
        }

        if (ts.contains("Python")) {
            System.out.println("Python is present");
        } else {
            System.out.println("Python is not present");
        }
    }
}

package Collections.functionalinterface;
import java.util.ArrayList;
import java.util.function.Consumer;

public class Q6 {

    public static void main(String[] args) {

        ArrayList<String> list = new ArrayList<>();

        list.add("Java");
        list.add("Python");
        list.add("Oracle");
        list.add("HTML");
        list.add("CSS");
        list.add("Spring");
        list.add("React");
        list.add("SQL");
        list.add("MongoDB");
        list.add("Android");
        Consumer<ArrayList<String>> c = al -> {

            for (int i = 0; i < al.size(); i++) {

                String rev = new StringBuilder(al.get(i)).reverse().toString();

                al.set(i, rev);
            }
        };
        c.accept(list);
        System.out.println(list);
    }
}
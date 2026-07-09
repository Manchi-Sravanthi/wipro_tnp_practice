package Stringjoiner;
import java.util.ArrayList;
import java.util.StringJoiner;

public class Q1 {

    public static void main(String[] args) {

        ArrayList<String> names = new ArrayList<>();

        names.add("Ram");
        names.add("Ravi");
        names.add("Sita");
        names.add("Gita");

        StringJoiner sj = new StringJoiner(",", "{", "}");

        for (String name : names) {
            sj.add(name);
        }

        System.out.println(sj);
    }
}
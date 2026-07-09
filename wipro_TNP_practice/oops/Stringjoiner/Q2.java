package Stringjoiner;

import java.util.StringJoiner;

public class Q2 {

    public static void main(String[] args) {

        StringJoiner s1 = new StringJoiner("-");
        s1.add("Hyderabad");
        s1.add("Chennai");
        s1.add("Delhi");

        StringJoiner s2 = new StringJoiner("-");
        s2.add("Mumbai");
        s2.add("Pune");
        s2.add("Bangalore");

        // s1 merged to s2
        StringJoiner j1 = new StringJoiner("-");
        j1.merge(s2);
        j1.merge(s1);
        System.out.println("s1 merged to s2 : " + j1);

        // s2 merged to s1
        StringJoiner j2 = new StringJoiner("-");
        j2.merge(s1);
        j2.merge(s2);
        System.out.println("s2 merged to s1 : " + j2);
    }
}

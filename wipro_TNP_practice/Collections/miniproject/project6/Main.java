package Collections.miniproject.project6;
import java.util.*;

public class Main {

    public static ArrayList<String> stringOperations(String S1, String S2) {

        ArrayList<String> list = new ArrayList<>();

        // Operation 1
        StringBuilder op1 = new StringBuilder();
        int i = 0;
        while (i < S1.length()) {
            if (i % 2 == 0) {
                op1.append(S2);
            } else {
                op1.append(S1.charAt(i));
            }
            i++;
        }
        list.add(op1.toString());
        int count = 0;
        int index = 0;
        while ((index = S1.indexOf(S2, index)) != -1) {
            count++;
            index += 1;
        }
        if (count > 1) {
            int last = S1.lastIndexOf(S2);
            String rev = new StringBuilder(S2).reverse().toString();
            list.add(S1.substring(0, last) + rev + S1.substring(last + S2.length()));
        } else {
            list.add(S1 + S2);
        }
        if (count > 1) {
            int first = S1.indexOf(S2);
            list.add(S1.substring(0, first) + S1.substring(first + S2.length()));
        } else {
            list.add(S1);
        }
        int mid;
        if (S1.length() % 2 == 0)
            mid = S1.length() / 2;
        else
            mid = S1.length() / 2 + 1;

        String firstHalf = S1.substring(0, mid);
        String secondHalf = S1.substring(mid);
        list.add(secondHalf + firstHalf);
        StringBuilder op5 = new StringBuilder();

        for (char ch : S1.toCharArray()) {
            if (S2.indexOf(ch) != -1)
                op5.append(ch);
            else
                op5.append('*');
        }

        list.add(op5.toString());

        return list;
    }
    public static void main(String[] args) {

        String S1 = "JAVAJAVA";
        String S2 = "VA";

        ArrayList<String> result = stringOperations(S1, S2);

        for (String s : result) {
            System.out.println(s);
        }
    }
}
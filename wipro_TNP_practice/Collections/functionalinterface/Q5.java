package Collections.functionalinterface;

import java.util.ArrayList;
import java.util.function.Predicate;

public class Q5 {

    public static void main(String[] args) {

        ArrayList<Integer> list = new ArrayList<>();
        list.add(4);
        list.add(7);
        list.add(9);
        list.add(12);
        list.add(16);
        list.add(20);
        list.add(25);
        list.add(31);
        list.add(36);
        list.add(40);
        Predicate<Integer> p = n -> {

            int root = (int) Math.sqrt(n);

            return root * root == n;

        };

        System.out.println("Perfect Square Numbers:");

        for (Integer num : list) {

            if (p.test(num)) {
                System.out.println(num);
            }

        }
    }
}

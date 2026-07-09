package string.stringbuffer;

import java.util.Scanner;

public class Q9 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String a = sc.next();
        String b = sc.next();

        StringBuilder result = new StringBuilder();

        int min = Math.min(a.length(), b.length());

        for (int i = 0; i < min; i++) {
            result.append(a.charAt(i));
            result.append(b.charAt(i));
        }

        if (a.length() > b.length()) {
            result.append(a.substring(min));
        } else {
            result.append(b.substring(min));
        }

        System.out.println(result);

        sc.close();
    }
}
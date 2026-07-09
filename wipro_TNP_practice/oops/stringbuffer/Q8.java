package string.stringbuffer;

import java.util.Scanner;

public class Q8 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String s = sc.next();
        StringBuilder ans = new StringBuilder();

        for (int i = 0; i < s.length(); i++) {

            if (s.charAt(i) == '*')
                continue;

            if (i > 0 && s.charAt(i - 1) == '*')
                continue;

            if (i < s.length() - 1 && s.charAt(i + 1) == '*')
                continue;

            ans.append(s.charAt(i));
        }

        System.out.println(ans);

        sc.close();
    }
}
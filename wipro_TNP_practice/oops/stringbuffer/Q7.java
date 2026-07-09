package string.stringbuffer;
import java.util.Scanner;
public class Q7 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String s = sc.next();

        if (s.charAt(0) == 'x') {
            s = s.substring(1);
        }

        if (s.length() > 0 && s.charAt(s.length() - 1) == 'x') {
            s = s.substring(0, s.length() - 1);
        }

        System.out.println(s);

        sc.close();
    }
}
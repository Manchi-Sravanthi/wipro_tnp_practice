package logicbuilding.lc4;
import java.util.Scanner;

public class Q5 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter String1: ");
        String str1 = sc.nextLine();

        System.out.print("Enter String2: ");
        String str2 = sc.nextLine();

        String rev = "";

        for(int i = str2.length() - 1; i >= 0; i--) {
            rev += str2.charAt(i);
        }

        String result = str1 + rev;

        System.out.println(result);
    }
}

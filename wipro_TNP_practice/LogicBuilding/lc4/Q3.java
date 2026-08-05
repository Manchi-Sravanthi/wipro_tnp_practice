package logicbuilding.lc4;
import java.util.Scanner;

public class Q3 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter String1: ");
        String str1 = sc.nextLine();

        System.out.print("Enter String2: ");
        String str2 = sc.nextLine();

        String str3 = str1 + str2;

        System.out.println("String3 = " + str3);
    }
}

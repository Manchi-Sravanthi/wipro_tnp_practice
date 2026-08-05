package logicbuilding.lc3;
import java.util.Scanner;

public class Q4 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int[] count = new int[101];

        System.out.println("Enter marks of 30 students:");

        for(int i = 0; i < 30; i++) {
            int mark = sc.nextInt();
            count[mark]++;
        }

        System.out.println("Frequency of Marks:");

        for(int i = 0; i <= 1; i++) {
            System.out.println(i + " = " + count[i]);
        }
    }
}
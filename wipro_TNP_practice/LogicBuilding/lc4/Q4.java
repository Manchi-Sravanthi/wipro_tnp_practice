package logicbuilding.lc4;
import java.util.Scanner;
public class Q4 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a String: ");
        String str = sc.nextLine();

        for(int i = 0; i < str.length(); i++) {

            char ch = str.charAt(i);
            int count = 1;

            if(ch == ' ')
                continue;

            for(int j = i + 1; j < str.length(); j++) {
                if(ch == str.charAt(j)) {
                    count++;
                }
            }

            boolean alreadyPrinted = false;

            for(int k = 0; k < i; k++) {
                if(ch == str.charAt(k)) {
                    alreadyPrinted = true;
                    break;
                }
            }

            if(!alreadyPrinted)
                System.out.println(ch + " - " + count);
        }
    }
}

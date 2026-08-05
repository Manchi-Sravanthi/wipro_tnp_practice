package logicbuilding.lc4;
import java.util.Scanner;

public class Q2 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a String: ");
        String str = sc.nextLine();

        boolean found = false;
        String result = "";

        for(int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);

            if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u'||
               ch=='A'||ch=='E'||ch=='I'||ch=='O'||ch=='U') {
                result += '*';
                found = true;
            }
            else {
                result += ch;
            }
        }

        if(found)
            System.out.println(result);
        else
            System.out.println(str + " - No vowels present");
    }
}
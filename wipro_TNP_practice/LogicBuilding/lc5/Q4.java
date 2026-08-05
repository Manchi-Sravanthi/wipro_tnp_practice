package logicbuilding.lc5;
import java.util.Scanner;

public class Q4 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int[] arr = new int[15];

        System.out.println("Enter 15 numbers:");

        for(int i = 0; i < 15; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.print("Enter number to search: ");
        int x = sc.nextInt();

        boolean found = false;

        for(int i = 0; i < 15; i++) {
            if(arr[i] == x) {
                System.out.println("Position = " + (i + 1));
                found = true;
                break;
            }
        }

        if(found) {
            System.out.println("found");
        }else {
        	System.out.println("Not found");
        }
    }
}
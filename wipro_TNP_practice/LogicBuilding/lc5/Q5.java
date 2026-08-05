package logicbuilding.lc5;
import java.util.Scanner;

public class Q5 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int[] arr1 = new int[5];
        int[] arr2 = new int[5];
        int[] merge = new int[10];

        System.out.println("Enter first array:");

        for(int i = 0; i < 5; i++) {
            arr1[i] = sc.nextInt();
        }

        System.out.println("Enter second array:");

        for(int i = 0; i < 5; i++) {
            arr2[i] = sc.nextInt();
        }
        for(int i = 0; i < 5; i++) {
            for(int j = i + 1; j < 5; j++) {
                if(arr1[i] < arr1[j]) {
                    int temp = arr1[i];
                    arr1[i] = arr1[j];
                    arr1[j] = temp;
                }
            }
        }
        for(int i = 0; i < 5; i++) {
            for(int j = i + 1; j < 5; j++) {
                if(arr2[i] < arr2[j]) {
                    int temp = arr2[i];
                    arr2[i] = arr2[j];
                    arr2[j] = temp;
                }
            }
        }

        int k = 0;

        for(int i = 0; i < 5; i++) {
            merge[k] = arr1[i];
            k++;
        }

        for(int i = 0; i < 5; i++) {
            merge[k] = arr2[i];
            k++;
        }

        System.out.println("Merged Array:");

        for(int i = 0; i < 10; i++) {
            System.out.print(merge[i] + " ");
        }
    }
}

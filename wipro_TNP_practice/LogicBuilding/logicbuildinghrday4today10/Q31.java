package logicbuildinghrday4today10;
import java.util.Scanner;
public class Q31 {
	public static int MostFrequentDigit(int input1, int input2, int input3, int input4) {

        int[] freq = new int[10];
        int[] numbers = {input1, input2, input3, input4};

        for (int num : numbers) {
            while (num > 0) {
                int digit = num % 10;
                freq[digit]++;
                num /= 10;
            }
        }

        int maxFreq = 0;
        int result = 0;

        for (int i = 0; i < 10; i++) {
            if (freq[i] > maxFreq || (freq[i] == maxFreq && i > result)) {
                maxFreq = freq[i];
                result = i;
            }
        }

        return result;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int input1 = sc.nextInt();
        int input2 = sc.nextInt();
        int input3 = sc.nextInt();
        int input4 = sc.nextInt();

        System.out.println(MostFrequentDigit(input1, input2, input3, input4));

        sc.close();
    }
}

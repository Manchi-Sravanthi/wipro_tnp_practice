package Collections.methodreference;
interface DigitCount {

    int countDigits(int n);

}

class NumberUtil {

    public static int digitCount(int n) {

        int count = 0;

        while (n != 0) {
            count++;
            n = n / 10;
        }

        return count;
    }
}

public class Q2 {

    public static void main(String[] args) {
        DigitCount d = NumberUtil::digitCount;

        System.out.println("Number of Digits = " + d.countDigits(12345));
    }
}
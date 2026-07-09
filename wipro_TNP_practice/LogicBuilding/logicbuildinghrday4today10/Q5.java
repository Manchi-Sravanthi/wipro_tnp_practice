package logicbuildinghrday4today10;

public class Q5 {
	public static int lastDigitOf(int input1)
    {
        input1 = Math.abs(input1);
        return input1 % 10;
    }

    public static void main(String[] args)
    {
        System.out.println(lastDigitOf(197));    // 7
        System.out.println(lastDigitOf(-456));   // 6
        System.out.println(lastDigitOf(120));    // 0
    }
}

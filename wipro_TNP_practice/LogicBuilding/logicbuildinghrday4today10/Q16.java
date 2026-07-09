package logicbuildinghrday4today10;

public class Q16 {
	public static int uniqueDigitsCount(int input1)
    {
        boolean[] digit = new boolean[10];
        int count = 0;

        while(input1 > 0)
        {
            int rem = input1 % 10;

            if(digit[rem] == false)
            {
                digit[rem] = true;
                count++;
            }

            input1 = input1 / 10;
        }

        return count;
    }

    public static void main(String[] args)
    {
        System.out.println(uniqueDigitsCount(292));    // 2
        System.out.println(uniqueDigitsCount(1015));   // 3
        System.out.println(uniqueDigitsCount(12345));  // 5
        System.out.println(uniqueDigitsCount(11111));  // 1
    }
}

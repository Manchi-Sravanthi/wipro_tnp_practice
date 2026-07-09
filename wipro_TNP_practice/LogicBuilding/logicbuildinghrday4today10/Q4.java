package logicbuildinghrday4today10;

public class Q4 {
	public static int isOdd(int input1)
    {
        if(input1 % 2 != 0)
            return 2;
        else
            return 1;
    }

    public static void main(String[] args)
    {
        System.out.println(isOdd(7));
        System.out.println(isOdd(10));
    }
}

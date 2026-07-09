package logicbuildinghrday4today10;

public class Q12 {
	public static int nthFibonacci(int input1)
    {
        if(input1 == 1)
            return 0;

        if(input1 == 2)
            return 1;

        int a = 0;
        int b = 1;
        int c = 0;

        for(int i = 3; i <= input1; i++)
        {
            c = a + b;
            a = b;
            b = c;
        }

        return c;
    }

    public static void main(String[] args)
    {
        System.out.println(nthFibonacci(1)); //0
        System.out.println(nthFibonacci(2)); //1
        System.out.println(nthFibonacci(5)); //3
        System.out.println(nthFibonacci(7)); //8
    }
}

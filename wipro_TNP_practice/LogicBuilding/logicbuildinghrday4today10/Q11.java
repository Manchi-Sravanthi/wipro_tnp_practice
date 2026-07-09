package logicbuildinghrday4today10;

public class Q11 {
	public static int factorial(int input1)
    {
        int fact = 1;

        for(int i = 1; i <= input1; i++)
        {
            fact = fact * i;
        }

        return fact;
    }

    public static void main(String[] args)
    {
        System.out.println(factorial(5)); //120
        System.out.println(factorial(6)); //720
    }
}

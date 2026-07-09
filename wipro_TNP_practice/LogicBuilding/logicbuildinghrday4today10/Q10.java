package logicbuildinghrday4today10;

public class Q10 {
	public static int isPrime(int input1)
    {
        if(input1 <= 1)
            return 1;

        for(int i = 2; i <= input1 / 2; i++)
        {
            if(input1 % i == 0)
            {
                return 1;
            }
        }

        return 2;
    }

    public static void main(String[] args)
    {
        System.out.println(isPrime(17)); // 2
        System.out.println(isPrime(20)); // 1
        System.out.println(isPrime(2));  // 2
    }
}

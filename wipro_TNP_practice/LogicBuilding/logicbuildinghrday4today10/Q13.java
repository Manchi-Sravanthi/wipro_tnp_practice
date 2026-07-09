package logicbuildinghrday4today10;

public class Q13 {
	public static int nthPrime(int input1)
    {
        int count = 0;
        int num = 1;

        while(count < input1)
        {
            num++;
            boolean isPrime = true;

            for(int i = 2; i <= num / 2; i++)
            {
                if(num % i == 0)
                {
                    isPrime = false;
                    break;
                }
            }

            if(isPrime)
            {
                count++;
            }
        }

        return num;
    }

    public static void main(String[] args)
    {
        System.out.println(nthPrime(1));   //2
        System.out.println(nthPrime(5));   //11
        System.out.println(nthPrime(10));  //29
        System.out.println(nthPrime(13));  //41
    }
}

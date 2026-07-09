package logicbuildinghrday4today10;

public class Q17 {
	public static int countPrimesInRange(int input1, int input2)
    {
        int count = 0;

        for(int num = input1; num <= input2; num++)
        {
            boolean prime = true;

            if(num < 2)
            {
                prime = false;
            }
            else
            {
                for(int i = 2; i <= num / 2; i++)
                {
                    if(num % i == 0)
                    {
                        prime = false;
                        break;
                    }
                }
            }

            if(prime)
            {
                count++;
            }
        }

        return count;
    }

    public static void main(String[] args)
    {
        System.out.println(countPrimesInRange(2, 20));     // 8
        System.out.println(countPrimesInRange(700, 725));  // 3
    }
}

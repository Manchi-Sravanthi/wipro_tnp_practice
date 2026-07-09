package logicbuildinghrday4today10;

public class Q22 {
	 public static int digitSum(int input1, String input2)
	    {
	        int sum = 0;

	        while(input1 != 0)
	        {
	            int digit = input1 % 10;

	            if(input2.equals("even"))
	            {
	                if(digit % 2 == 0)
	                    sum += digit;
	            }
	            else if(input2.equals("odd"))
	            {
	                if(digit % 2 != 0)
	                    sum += digit;
	            }

	            input1 /= 10;
	        }

	        return sum;
	    }

	    public static void main(String[] args)
	    {
	        System.out.println(digitSum(108, "even")); // 8
	        System.out.println(digitSum(9625, "odd")); // 14
	        System.out.println(digitSum(2134, "even")); // 6
	    }
}

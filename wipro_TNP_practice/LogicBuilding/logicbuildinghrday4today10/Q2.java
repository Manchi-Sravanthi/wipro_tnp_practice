package logicbuildinghrday4today10;

public class Q2 {
	 public static int sumOfLastDigits(int input1, int input2)
	    {
	        int lastDigit1 = Math.abs(input1) % 10;
	        int lastDigit2 = Math.abs(input2) % 10;

	        return lastDigit1 + lastDigit2;
	    }

	    public static void main(String[] args)
	    {
	        System.out.println(sumOfLastDigits(197, 456));   
	        System.out.println(sumOfLastDigits(-123, 45));   
	        System.out.println(sumOfLastDigits(10, 20));     
	    }
}

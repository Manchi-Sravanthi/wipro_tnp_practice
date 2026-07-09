package logicbuildinghrday4today10;

public class Q1 {
	  public static int secondLastDigitOf(int input1)
	    {
	        input1 = Math.abs(input1);

	        if(input1 < 10)
	            return -1;
	        else
	            return (input1 / 10) % 10;
	    }

	    public static void main(String[] args)
	    {
	        System.out.println(secondLastDigitOf(197));
	        System.out.println(secondLastDigitOf(-12345));
	        System.out.println(secondLastDigitOf(5));
	    }
}

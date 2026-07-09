package logicbuildinghrday4today10;

public class Q3 {
	 public static int isEven(int input1)
	    {
	        if(input1 % 2 == 0)
	            return 2;
	        else
	            return 1;
	    }

	    public static void main(String[] args)
	    {
	        System.out.println(isEven(8));
	        System.out.println(isEven(15));
	    }
}

package logicbuildinghrday4today10;

public class Q8 {
	 public static int countOdd(int input1, int input2, int input3, int input4, int input5)
	    {
	        int count = 0;
	            if(input1 % 2 != 0) count++;
	            if(input2 % 2 != 0) count++;
	            if(input3 % 2 != 0) count++;
	            if(input4 % 2 != 0) count++;
	            if(input5 % 2 != 0) count++;
	       

	        return count;
	    }

	    public static void main(String[] args)
	    {
	        System.out.println(countOdd(12, 17, 19, 14, 115));
	    }
}

package logicbuildinghrday4today10;

public class Q25 {
	 public static int createPIN(int input1, int input2, int input3)
	    {
	        int units = Math.min(input1 % 10, Math.min(input2 % 10, input3 % 10));

	        int tens = Math.min((input1 / 10) % 10,
	                Math.min((input2 / 10) % 10, (input3 / 10) % 10));

	        int hundreds = Math.min(input1 / 100,
	                Math.min(input2 / 100, input3 / 100));

	        int max = 0;

	        while (input1 > 0) {
	            max = Math.max(max, input1 % 10);
	            input1 /= 10;
	        }

	        while (input2 > 0) {
	            max = Math.max(max, input2 % 10);
	            input2 /= 10;
	        }

	        while (input3 > 0) {
	            max = Math.max(max, input3 % 10);
	            input3 /= 10;
	        }

	        return max * 1000 + hundreds * 100 + tens * 10 + units;
	    }

	    public static void main(String[] args) {
	        System.out.println(createPIN(123, 582, 175));
	    }
	}


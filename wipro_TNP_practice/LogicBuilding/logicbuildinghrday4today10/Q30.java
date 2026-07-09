package logicbuildinghrday4today10;

public class Q30 {
	 public static int weightOfString(String input1, int input2) {

	        int sum = 0;

	        input1 = input1.toUpperCase();

	        for (int i = 0; i < input1.length(); i++) {

	            char ch = input1.charAt(i);

	            // Alphabet check
	            if (ch >= 'A' && ch <= 'Z') {

	                // Ignore vowels if input2 == 0
	                if (input2 == 0 &&
	                    (ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U')) {
	                    continue;
	                }

	                sum = sum + (ch - 'A' + 1);
	            }
	        }

	        return sum;
	    }

	    public static void main(String[] args) {

	        System.out.println(weightOfString("Hello World!!", 0));
	        System.out.println(weightOfString("Hello World!!", 1));

	    }
}

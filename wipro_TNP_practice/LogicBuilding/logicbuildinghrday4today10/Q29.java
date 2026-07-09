package logicbuildinghrday4today10;

public class Q29 {
	 public static int isPalinNum(int input1) {

	        int original = input1;
	        int rev = 0;

	        while (input1 != 0) {
	            int digit = input1 % 10;
	            rev = rev * 10 + digit;
	            input1 = input1 / 10;
	        }

	        if (original == rev) {
	            return 2;
	        } else {
	            return 1;
	        }
	    }

	    public static void main(String[] args) {

	        int num = 18891;

	        if (isPalinNum(num) == 2) {
	            System.out.println("Palindrome");
	        } else {
	            System.out.println("Not Palindrome");
	        }
	    }
}

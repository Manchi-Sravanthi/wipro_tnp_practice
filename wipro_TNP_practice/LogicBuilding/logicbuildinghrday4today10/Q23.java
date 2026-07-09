package logicbuildinghrday4today10;

public class Q23 {
	 public int isPalinNumPossible(int input1)
	    {
	        int[] freq = new int[10];

	        while(input1 != 0)
	        {
	            int digit = input1 % 10;
	            freq[digit]++;
	            input1 = input1 / 10;
	        }

	        int oddCount = 0;

	        for(int i = 0; i < 10; i++)
	        {
	            if(freq[i] % 2 != 0)
	            {
	                oddCount++;
	            }
	        }

	        if(oddCount <= 1)
	        {
	            return 2;
	        }
	        else
	        {
	            return 1;
	        }
	    }
}

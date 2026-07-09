package javafundamentals.arrays;

import java.util.Arrays;

public class Q5 {
	public static void main(String[] args) {
		int[] a= {1,2,3,9,10,0,19};
		int n=a.length;
		Arrays.sort(a);
			System.out.println("2 largest numbers: "+a[n-1]+" "+a[n-2]);
			System.out.println("2 smallest numbers: "+a[0]+" "+a[1]);
	}
}

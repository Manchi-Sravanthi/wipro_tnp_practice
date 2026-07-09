package javafundamentals.arrays;

import java.util.Arrays;

public class Q6 {
public static void main(String[] args) {
	int[] a= {1,4,2,8,6,0};
	int n=a.length;
	Arrays.sort(a);
	for(int i=0;i<n;i++) {
	System.out.print(a[i]+" ");
	}
}
}

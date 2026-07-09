package javafundamentals.arrays;

public class Q2 {
	public static void main(String[] args) {
		int[] a= {1,3,5,7};
		int n=a.length;
		int min=Integer.MAX_VALUE;
		int max=Integer.MIN_VALUE;
		for(int i=0;i<n;i++) {
			if(a[i]<min) {
				min=a[i];
			}
			if(a[i]>max) {
				max=a[i];
			}
		}
		System.out.println("Maximum: "+max);
		System.out.println("Minimum: "+min);
	}
}

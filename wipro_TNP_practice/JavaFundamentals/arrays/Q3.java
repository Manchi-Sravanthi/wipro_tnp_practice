package javafundamentals.arrays;

public class Q3 {
	public static void main(String[] args) {
		int[] a= {1,43,56,2,67,9};
		int n=a.length;
		int target=7;
		int index=-1;
		for(int i=0;i<n;i++) {
			if(a[i]==target) {
				index=i;
				break;
			}
		}
		System.out.println(index);

		
	}
}

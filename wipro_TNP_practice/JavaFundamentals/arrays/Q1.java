package javafundamentals.arrays;
public class Q1 {
	public static void main(String[] args) {
	int[] a= {1,2,3,4};
	int sum=0;
	int n=a.length;
	for(int i=0;i<n;i++) {
		sum+=a[i];
	}
	double avg=(double)(sum/n);
	System.out.println(sum+" "+avg);
}
}

package javafundamentals.arrays;

public class Q10 {
public static void main(String[] args) {
	int[] a= {3,3,2};
	int n=a.length;
	int[] b=new int[n];
	int index=0;
	for(int i=0;i<n;i++) {
		if(a[i]%2==0) {
			b[index]=a[i];
			index++;
		}
		
	}
	for(int i=0;i<n;i++) {
		if(a[i]%2!=0) {
			b[index]=a[i];
			index++;
		}
	}
	for(int i=0;i<n;i++) {
		System.out.print(b[i]+" ");
	}
	
}
}

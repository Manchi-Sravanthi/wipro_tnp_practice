package javafundamentals.arrays;

public class Q9 {
public static void main(String[] args) {
	int[] a= {1,10,10,0};
	int n=a.length;
	int index=0;
	for(int i=0;i<n;i++) {
		if(a[i]!=10) {
			a[index]=a[i];
			index++;
		}
	}
		while(index<n) {
			a[index]=0;
			index++;
		}
	for(int i=0;i<n;i++) {
		System.out.print(a[i]+" ");
	}
}
}

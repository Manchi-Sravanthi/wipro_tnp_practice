package javafundamentals.arrays;

public class Q11 {
public static void main(String[] args) {
	int[] a= {1,4,5,6};
	int n=a.length;
	boolean flag=false;
	for(int i=0;i<n;i++) {
		if(a[i]==1 || a[i]==4) {
			flag=true;
			break;
		}
	}
	System.out.println(flag);
}
}

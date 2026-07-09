package javafundamentals.arrays;

public class Q7 {
public static void main(String[] args) {
	int[] a= {12,34,12,37,65,1,34};
	int n=a.length;
	for(int i=0;i<n;i++) {
		boolean duplicate=false;
		for(int j=0;j<i;j++) {
			if(a[i]==a[j]) {
				duplicate=true;
				break;
			}
		}
	if(!duplicate) {
		System.out.print(a[i]+" ");
	}
	}
}
}


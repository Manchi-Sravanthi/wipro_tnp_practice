package javafundamentals.arrays;
import java.util.Scanner;
public class Q8 {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	int n=sc.nextInt();
	int[] a=new int[n];
	for(int i=0;i<n;i++) {
		a[i]=sc.nextInt();
	}
	if(n!=a.length) {
		System.out.println("Invalid");
	}
	int sum=0;
	boolean add=true;
	for(int i=0;i<n;i++) {
		if(a[i]==6) {
			add=false;
		}
		if(add) {
			sum+=a[i];
		}
		if(a[i]==7) {
			add=true;
		}
	}
	System.out.println(sum);
	
}
}

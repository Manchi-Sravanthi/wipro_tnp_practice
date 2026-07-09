package javafundamentals.flowcontrolstatements;
import java.util.*;
public class Q1a {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		if(n<0) {
			System.out.println("Negative");
		}else if(n>0) {
			System.out.println("Positive");
		}else {
			System.out.println("Zero");
		}
	}
}

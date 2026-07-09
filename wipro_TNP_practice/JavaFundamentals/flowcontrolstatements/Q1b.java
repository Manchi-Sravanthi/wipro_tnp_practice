package javafundamentals.flowcontrolstatements;
import java.util.Scanner;
public class Q1b {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int a=sc.nextInt();
		int b=sc.nextInt();
		if(a%10==b%10) {
			System.out.println("True");
		}else {
			System.out.println("False");
		}
		sc.close();
	}

}

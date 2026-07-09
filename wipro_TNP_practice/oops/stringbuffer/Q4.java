package string.stringbuffer;
import java.util.Scanner;
public class Q4 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String s=sc.next();
		int n=s.length();
		int n1=n/2;
		if(n%2==0) {
			System.out.println(s.substring(0,n1));
		}else {
			System.out.println("null");
		}
	}
}

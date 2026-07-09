package string.stringbuffer;
import java.util.Scanner;
public class Q5 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String s=sc.next();
		String n=s.substring(1,s.length()-1);
		System.out.println(n);
	}
}

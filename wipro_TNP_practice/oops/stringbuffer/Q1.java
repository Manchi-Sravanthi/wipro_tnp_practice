package string.stringbuffer;
import java.util.Scanner;
public class Q1 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String s=sc.next();
		String rev="";
		for(int i=s.length()-1;i>=0;i--) {
			rev=rev+s.charAt(i);
		}
		if(rev.equalsIgnoreCase(s)) {
			System.out.println("Plaindrome");
		}else {
			System.out.println("Not Palindrome");
		}
	}
}

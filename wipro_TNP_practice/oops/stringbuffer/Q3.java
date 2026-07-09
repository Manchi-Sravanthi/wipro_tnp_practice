package string.stringbuffer;
import java.util.Scanner;
public class Q3 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String s=sc.next();
		int n=s.length();
		StringBuilder str=new StringBuilder();
		for(int i=0;i<n;i++) {
			str.append(s.substring(0,2));
		}
		System.out.println(str);
	}
}

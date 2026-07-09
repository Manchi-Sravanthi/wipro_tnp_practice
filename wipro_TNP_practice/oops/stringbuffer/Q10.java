package string.stringbuffer;
import java.util.Scanner;
public class Q10 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String s=sc.next();
		int n=s.length();
		int n1=sc.nextInt();
		String str=s.substring(n-n1);
		StringBuilder ans=new StringBuilder();
		for(int i=0;i<n1;i++) {
			ans.append(str);
		}
		System.out.println(ans);
	}
}

package string.stringbuffer;
import java.util.Scanner;
public class Q2 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String s=sc.next();
		String s1=sc.next();
		String result;
		if(s.charAt(s.length()-1)==s1.charAt(s1.length()-1)) {
			result=s+s1.substring(1);
		}else {
			result=s+s1;
		}
		System.out.println(result.toLowerCase());
		sc.close();
	}
}

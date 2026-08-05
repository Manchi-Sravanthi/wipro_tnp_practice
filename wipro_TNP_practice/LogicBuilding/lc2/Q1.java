package logicbuilding.lc2;
import java.util.*;
public class Q1 {
	public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	int n=sc.nextInt();
	int cnt=0;
	while(n>0) {
		int digit=n%10;
		n/=10;
		cnt++;
	}
	System.out.println(cnt);
}
}

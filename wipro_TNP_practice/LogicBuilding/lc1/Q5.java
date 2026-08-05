package logicbuilding.lc1;
import java.util.*;
public class Q5 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int sum=0;
		for(int i=1;i<=3;i++) {
			int n=sc.nextInt();
			sum+=n;
		}
		System.out.println(sum);
	}
}

package logicbuilding.lc1;
import java.util.*;
public class Q2 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int cnt=0;
		for(int i=1;i<=3;i++) {
			int marks=sc.nextInt();
			if(marks>=35) {
				cnt++;
			}
		}
		System.out.println(cnt);
}
}

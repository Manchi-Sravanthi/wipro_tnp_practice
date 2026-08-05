package logicbuilding.lc1;
import java.util.*;
public class Q3 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int pos=0;
		int neg=0;
		for(int i=1;i<=5;i++) {
			int n=sc.nextInt();
			if(n>=0) {
				pos++;
			}else {
				neg++;
			}
		}
		System.out.println(pos+" "+neg);
		
	}
}

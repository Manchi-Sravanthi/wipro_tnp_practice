package logicbuilding.lc2;
import java.util.*;
public class Q4 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int binary=sc.nextInt();
		int decimal=0;
		int power=1;
		while(binary>0) {
			int digit=binary%10;
			decimal+=power*digit;
			power=power*2;
			binary/=10;
		}
		System.out.println(decimal);
	}
}

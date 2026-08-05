package logicbuilding.lc2;
import java.util.*;
public class Q3 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int num=sc.nextInt();;
		String binary="";
		if(num==0) {
			System.out.println("Binary=0");
		}else {
			while(num>0) {
				binary=(num%2)+binary;
				num/=2;
			}
			System.out.println("Binary="+binary);
		}
	}
}

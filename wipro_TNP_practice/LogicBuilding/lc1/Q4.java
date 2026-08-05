package logicbuilding.lc1;
import java.util.*;
public class Q4 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		if(n==0) {
			System.out.println("zero");
		}else if(n%2==0) {
			System.out.println("Even");
		}else {
			System.out.println("Odd");
		}
		sc.close();
	}
}

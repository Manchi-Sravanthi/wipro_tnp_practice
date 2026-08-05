package logicbuilding.lc1;
public class Q1 {
	public static void main(String[] args) {
		int a=10;
		int b=20;
		int c=30;
		int temp;
		temp=c;
		c=b;
		b=a;
		a=temp;
		System.out.print("a="+a+","+"b="+b+","+"c="+c);
	}
}

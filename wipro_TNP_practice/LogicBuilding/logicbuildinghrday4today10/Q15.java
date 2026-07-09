package logicbuildinghrday4today10;

public class Q15 {
	public static int countDigits(int n) {
		int cnt=0;
		while(n!=0) {
			int digit=n%10;
			cnt++;
			n=n/10;
		}
		return cnt;
	}
	public static void main(String[] args) {
		System.out.println(countDigits(123));
	}
}

package logicbuilding.loops;
public class Q4 {
	public static void main(String[] args) {
		int n=10;
		for(int i=1;i<=10;i++) 
		{
			for(int j=1;j<=n-i;j++) 
			{
				System.out.print(" ");
			}
			for(int j=1;j<=i;j++) 
			{
				System.out.print(j);
			}
			for(char c=(char)('A'+i-2);c>='A';c--) {
				System.out.print(c);
			}
			System.out.println();
		}
	}
}

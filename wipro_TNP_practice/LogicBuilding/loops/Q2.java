package logicbuilding.loops;
public class Q2 {
	public static void main(String[] args) {
		int n=10;
		for(int i=1;i<=10;i++) 
		{
			for(int j=1;j<=n-i;j++) 
			{
				System.out.print(" ");
			}
			for(int k=1;k<=i;k++) {
				System.out.print("*");
			}
			System.out.println();
		}
		}
	}
	

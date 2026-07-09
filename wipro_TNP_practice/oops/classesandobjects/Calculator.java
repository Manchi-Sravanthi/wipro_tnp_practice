package oops.classesandobjects;

public class Calculator {
	public static int powerInt(int num1,int num2) {
		return (int)Math.pow(num1, num2);
	}
	public static double powerDouble(double num1,int num2) {
		return Math.pow(num1, num2);
	}
public static void main(String[] args) {
	int result=Calculator.powerInt(2,5);
	System.out.println(result);
	double result1=Calculator.powerDouble(2.5,3);
	System.out.println(result1);
}
}

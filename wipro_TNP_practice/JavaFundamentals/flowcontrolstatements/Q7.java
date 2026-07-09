package javafundamentals.flowcontrolstatements;

public class Q7 {
	public static void main(String[] args) {
		char ch='a';
		if(Character.isUpperCase(ch)) {
			System.out.println(Character.toLowerCase(ch));
		}else {
			System.out.println(Character.toUpperCase(ch));
		}
	}

}

package interfaces;
interface check {

    int myFunction(int a, int b, int c);
}

public class Main
{

    public static void main(String[] args) {

        // Addition
        check t1 = (a, b, c) -> a + b + c;

        // Multiplication
        check t2 = (a, b, c) -> a * b * c;

        System.out.println("Addition = " + t1.myFunction(10, 20, 30));
        System.out.println("Multiplication = " + t2.myFunction(10, 20, 30));
    }
}
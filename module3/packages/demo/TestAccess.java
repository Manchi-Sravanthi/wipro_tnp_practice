package demo;

import test.Foundation;

public class TestAccess {

    public static void main(String[] args) {

        Foundation obj = new Foundation();

        //System.out.println(obj.var1); // Error (private)
        //System.out.println(obj.var2); // Error (default)
        //System.out.println(obj.var3); // Error (protected)

        System.out.println(obj.var4);    // Accessible
    }
}
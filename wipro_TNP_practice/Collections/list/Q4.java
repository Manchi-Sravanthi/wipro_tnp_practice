package Collections.list;

import java.util.ArrayList;

public class Q4 {

    public static void main(String[] args) {

        ArrayList<Number> list = new ArrayList<>();

        list.add(10);       
        list.add(20.5);     
        list.add(15.8f);    
        list.add(100L);     
        list.add((short)5); 
        list.add((byte)2);  

        System.out.println(list);
    }
}

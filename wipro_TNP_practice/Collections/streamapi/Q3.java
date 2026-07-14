package Collections.streamapi;
import java.util.ArrayList;

class Student {

    int rollNo;
    String name;
    int mark;
    Student(int rollNo, String name, int mark) {
        this.rollNo = rollNo;
        this.name = name;
        this.mark = mark;
    }
}

public class Q3 {

    public static void main(String[] args) {

        ArrayList<Student> list = new ArrayList<>();
        list.add(new Student(101, "Sravanthi", 85));
        list.add(new Student(102, "Rahul", 45));
        list.add(new Student(103, "Anitha", 70));
        list.add(new Student(104, "Kiran", 50));
        list.add(new Student(105, "Ravi", 35));
        long count = list.stream()
                         .filter(s -> s.mark >= 50)
                         .count();

        System.out.println("Students Cleared = " + count);
    }
}
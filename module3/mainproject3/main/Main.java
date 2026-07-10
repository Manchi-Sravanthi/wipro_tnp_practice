package abstraction.miniproject3.main;

import abstraction.miniproject3.bean.Student;
import abstraction.miniproject3.service.StudentReport;
import abstraction.miniproject3.service.StudentService;

public class Main {

    static Student[] data = new Student[4];

    public Main() {

        data[0] = new Student("Sekar", new int[] {85, 75, 95});
        data[1] = new Student(null, new int[] {11, 22, 33});
        data[2] = null;
        data[3] = new Student("Manoj", null);
    }

    public static void main(String[] args) {

        Main obj = new Main();

        StudentReport report = new StudentReport();
        StudentService service = new StudentService();

        System.out.println("----- Student Report -----");

        for (Student s : data) {

            try {

                report.validate(s);

                String grade = report.findGrades(s);

                System.out.println("Name  : " + s.getName());
                System.out.println("Grade : " + grade);
                System.out.println();

            } catch (Exception e) {

                System.out.println(e);
            }
        }

        System.out.println();
        System.out.println("Null Marks Array Count : "
                + service.findNumberOfNullMarksArray(data));

        System.out.println("Null Name Count : "
                + service.findNumberOfNullName(data));

        System.out.println("Null Student Object Count : "
                + service.findNumberOfNullObjects(data));
    }
}

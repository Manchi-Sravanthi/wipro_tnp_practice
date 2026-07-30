package preparedstatements;

import java.sql.*;
import java.util.Scanner;

public class Q2 {

    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Roll Number : ");
        int rollno = sc.nextInt();
        sc.nextLine();

        System.out.print("Enter Student Name : ");
        String name = sc.nextLine();

        System.out.print("Enter Standard : ");
        String standard = sc.nextLine();

        System.out.print("Enter Date Of Birth (yyyy-mm-dd): ");
        String dob = sc.nextLine();

        System.out.print("Enter Fees : ");
        double fees = sc.nextDouble();

        if (rollno < 1000 || rollno > 9999) {
            System.out.println("Invalid Roll Number");
            return;
        }

        if (name.length() > 20 || !name.matches("[A-Z ]+")) {
            System.out.println("Invalid Student Name");
            return;
        }
        if (!(standard.equals("I") || standard.equals("II")
                || standard.equals("III") || standard.equals("IV")
                || standard.equals("V") || standard.equals("VI")
                || standard.equals("VII") || standard.equals("VIII")
                || standard.equals("IX") || standard.equals("X"))) {

            System.out.println("Invalid Standard");
            return;
        }

        try {

            Class.forName("oracle.jdbc.driver.OracleDriver");

            Connection con = DriverManager.getConnection(
                    "jdbc:oracle:thin:@localhost:1521/FREEPDB1",
                    "hr",
                    "hr");

            String sql = "INSERT INTO STUDENT VALUES(?,?,?,?,?)";

            PreparedStatement ps = con.prepareStatement(sql);

            ps.setInt(1, rollno);
            ps.setString(2, name);
            ps.setString(3, standard);
            ps.setDate(4, Date.valueOf(dob));
            ps.setDouble(5, fees);

            int rows = ps.executeUpdate();

            if (rows > 0)
                System.out.println("Record Inserted Successfully");
            else
                System.out.println("Insertion Failed");

            ps.close();
            con.close();

        } catch (Exception e) {

            System.out.println(e);

        }

        sc.close();
    }
}
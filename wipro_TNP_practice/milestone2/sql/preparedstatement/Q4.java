package preparedstatements;
import java.sql.*;

public class Q4 {

    public static void main(String[] args) {

        int rollno = Integer.parseInt(args[0]);
        double fees = Double.parseDouble(args[1]);

        try {

            Class.forName("oracle.jdbc.driver.OracleDriver");

            Connection con = DriverManager.getConnection(
                    "jdbc:oracle:thin:@localhost:1521/FREEPDB1",
                    "hr",
                    "hr");

            String sql = "UPDATE STUDENT SET FEES=? WHERE ROLLNO=?";

            PreparedStatement ps = con.prepareStatement(sql);

            ps.setDouble(1, fees);
            ps.setInt(2, rollno);

            int rows = ps.executeUpdate();

            if (rows > 0)
                System.out.println("Student Record Updated Successfully");
            else
                System.out.println("Student Record Not Found");

            ps.close();
            con.close();

        } catch (Exception e) {

            System.out.println(e);

        }

    }

}
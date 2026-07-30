package preparedstatements;
import java.sql.*;

public class Q3 {

    public static void main(String[] args) {

        int rollno = Integer.parseInt(args[0]);

        try {

            Class.forName("oracle.jdbc.driver.OracleDriver");

            Connection con = DriverManager.getConnection(
                    "jdbc:oracle:thin:@localhost:1521/FREEPDB1",
                    "hr",
                    "hr");

            String selectQuery = "SELECT * FROM STUDENT WHERE ROLLNO=?";

            PreparedStatement ps1 = con.prepareStatement(selectQuery);
            ps1.setInt(1, rollno);

            ResultSet rs = ps1.executeQuery();

            if (rs.next()) {

                // Insert into STUDENTLOG
                String insertQuery =
                        "INSERT INTO STUDENTLOG VALUES(?,?,?,SYSDATE)";

                PreparedStatement ps2 =
                        con.prepareStatement(insertQuery);

                ps2.setInt(1, rs.getInt("ROLLNO"));
                ps2.setString(2, rs.getString("NAME"));
                ps2.setString(3, rs.getString("STANDARD"));

                ps2.executeUpdate();
                String deleteQuery =
                        "DELETE FROM STUDENT WHERE ROLLNO=?";

                PreparedStatement ps3 =
                        con.prepareStatement(deleteQuery);

                ps3.setInt(1, rollno);

                int rows = ps3.executeUpdate();

                if (rows > 0)
                    System.out.println("Student Record Deleted Successfully");
                else
                    System.out.println("Student Record Not Found");

                ps2.close();
                ps3.close();

            } else {

                System.out.println("Student Record Not Found");

            }

            rs.close();
            ps1.close();
            con.close();

        } catch (Exception e) {

            System.out.println(e);

        }

    }

}
package preparedstatements;
import java.sql.*;

public class Q5 {

    public static void main(String[] args) {

        try {

            Class.forName("oracle.jdbc.driver.OracleDriver");

            Connection con = DriverManager.getConnection(
                    "jdbc:oracle:thin:@localhost:1521/FREEPDB1",
                    "hr",
                    "hr");

            PreparedStatement ps;
            ResultSet rs;

            if (args.length == 0) {

                String sql = "SELECT * FROM STUDENT";

                ps = con.prepareStatement(sql);

                rs = ps.executeQuery();

            } else {

                String sql = "SELECT * FROM STUDENT WHERE ROLLNO=?";

                ps = con.prepareStatement(sql);

                ps.setInt(1, Integer.parseInt(args[0]));

                rs = ps.executeQuery();

            }

            System.out.println("ROLLNO\tNAME\tSTANDARD\tDATEOFBIRTH\tFEES");

            while (rs.next()) {

                System.out.println(
                        rs.getInt("ROLLNO") + "\t" +
                        rs.getString("NAME") + "\t" +
                        rs.getString("STANDARD") + "\t" +
                        rs.getDate("DATEOFBIRTH") + "\t" +
                        rs.getDouble("FEES"));

            }

            rs.close();
            ps.close();
            con.close();

        } catch (Exception e) {

            System.out.println(e);

        }

    }

}

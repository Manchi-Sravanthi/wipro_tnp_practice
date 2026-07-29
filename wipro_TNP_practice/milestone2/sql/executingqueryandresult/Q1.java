package executingqueryandresult;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class Q1 {

    public static void main(String[] args) {

        String url = "jdbc:oracle:thin:@localhost:1521/FREEPDB1";
        String username = "hr";
        String password = "hr";

        Connection con = null;
        Statement stmt = null;
        ResultSet rs = null;

        try {
            Class.forName("oracle.jdbc.driver.OracleDriver");
            con = DriverManager.getConnection(url, username, password);
            stmt = con.createStatement();
            rs = stmt.executeQuery("SELECT employee_id, last_name FROM employees");
            while (rs.next()) {
                int empno = rs.getInt(1);
                String ename = rs.getString("last_name");
                System.out.println(empno + "  " + ename);
            }

        } catch (Exception e) {

            System.out.println("Exception : " + e);

        } finally {

            try {
                if (rs != null)
                    rs.close();
                if (stmt != null)
                    stmt.close();
                if (con != null)
                    con.close();
            } catch (Exception e) {
            }
        }
    }
}

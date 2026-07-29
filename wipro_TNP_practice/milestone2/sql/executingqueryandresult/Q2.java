package executingqueryandresult;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class Q2 {

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

            rs = stmt.executeQuery(
                    "SELECT last_name, job_id, salary, commission_pct " +
                    "FROM employees " +
                    "WHERE salary > 1000 AND salary < 2000");

            while (rs.next()) {

                String ename = rs.getString("last_name");
                String job = rs.getString("job_id");
                double sal = rs.getDouble("salary");
                double comm = rs.getDouble("commission_pct");

                System.out.println(
                        ename + "\t" +
                        job + "\t" +
                        sal + "\t" +
                        comm);

            }

        } catch (Exception e) {

            System.out.println(e);

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

package miniproject;


import java.sql.Connection;
import java.sql.DriverManager;

public class DBUtil {

    private static final String DRIVER =
            "oracle.jdbc.driver.OracleDriver";

    private static final String URL =
            "jdbc:oracle:thin:@localhost:1521/FREEPDB1";

    private static final String USERNAME = "hr";

    private static final String PASSWORD = "hr";

    public static Connection getConnection() {

        Connection con = null;

        try {

            Class.forName(DRIVER);

            con = DriverManager.getConnection(
                    URL,
                    USERNAME,
                    PASSWORD);

        } catch (Exception e) {

            System.out.println("Database Connection Failed");
            System.out.println(e);

        }

        return con;
    }

    public static void closeConnection(Connection con) {

        try {

            if (con != null) {

                con.close();

            }

        } catch (Exception e) {

            System.out.println(e);

        }

    }

}
package callablestatements;
import java.sql.*;

public class Q1 {

    public static void main(String[] args) {

        try {

            Class.forName("oracle.jdbc.driver.OracleDriver");

            Connection con = DriverManager.getConnection(
                    "jdbc:oracle:thin:@localhost:1521/FREEPDB1",
                    "hr",
                    "hr");

            Statement st = con.createStatement();

            ResultSet rs = st.executeQuery(
                    "SELECT EMPLOYEE_ID, FIRST_NAME FROM EMPLOYEES");

            while (rs.next()) {

                int empId = rs.getInt("EMPLOYEE_ID");
                String name = rs.getString("FIRST_NAME");

                CallableStatement cs =
                        con.prepareCall("{call CAL_NETSAL(?,?)}");

                cs.setInt(1, empId);

                cs.registerOutParameter(2, Types.DOUBLE);

                cs.execute();

                double netSalary = cs.getDouble(2);

                System.out.println(empId + "\t"
                        + name + "\t"
                        + netSalary);

                cs.close();
            }

            rs.close();
            st.close();
            con.close();

        } catch (Exception e) {

            System.out.println(e);

        }

    }
}

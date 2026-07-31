package miniproject;



import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class UserDao {

    // ==========================
    // Scenario 1
    // ==========================

    public String getUserType(String userID) {

        String userType = null;

        try {

            Connection con = DBUtil.getConnection();

            String sql =
                    "SELECT USERTYPE FROM USERS WHERE USERID=?";

            PreparedStatement ps =
                    con.prepareStatement(sql);

            ps.setString(1, userID);

            ResultSet rs = ps.executeQuery();

            if (rs.next()) {

                userType = rs.getString("USERTYPE");

            }

            rs.close();
            ps.close();
            DBUtil.closeConnection(con);

        }

        catch (Exception e) {

            System.out.println(e);

        }

        return userType;

    }

    // ==========================
    // Scenario 2
    // ==========================

    public String getIncorrectAttempts(String userID) {

        String result = "";

        try {

            Connection con = DBUtil.getConnection();

            String sql =
                    "SELECT INCORRECTATTEMPTS FROM USERS WHERE USERID=?";

            PreparedStatement ps =
                    con.prepareStatement(sql);

            ps.setString(1, userID);

            ResultSet rs = ps.executeQuery();

            if (rs.next()) {

                int attempts =
                        rs.getInt("INCORRECTATTEMPTS");

                if (attempts == 0)

                    result = "No Incorrect Attempt";

                else if (attempts == 1)

                    result = "One Time";

                else

                    result = "Incorrect Attempt exceeded";

            }

            rs.close();
            ps.close();
            DBUtil.closeConnection(con);

        }

        catch (Exception e) {

            System.out.println(e);

        }

        return result;

    }

    // ==========================
    // Scenario 3
    // ==========================

    public int changeUserType(String userID) {

        int rows = 0;

        try {

            Connection con = DBUtil.getConnection();

            String sql =
                    "UPDATE USERS SET USERTYPE='Admin' WHERE USERID=?";

            PreparedStatement ps =
                    con.prepareStatement(sql);

            ps.setString(1, userID);

            rows = ps.executeUpdate();

            ps.close();
            DBUtil.closeConnection(con);

        }

        catch (Exception e) {

            System.out.println(e);

        }

        return rows;

    }
    // ==========================
    // Scenario 4
    // ==========================

    public int getNoOfAttempts() {

        int count = 0;

        try {

            Connection con = DBUtil.getConnection();

            String sql =
                    "SELECT COUNT(*) FROM USERS WHERE INCORRECTATTEMPTS=0";

            PreparedStatement ps =
                    con.prepareStatement(sql);

            ResultSet rs = ps.executeQuery();

            if (rs.next()) {

                count = rs.getInt(1);

            }

            rs.close();
            ps.close();
            DBUtil.closeConnection(con);

        }

        catch (Exception e) {

            System.out.println(e);

        }

        return count;

    }

    // ==========================
    // Scenario 5
    // ==========================

    public int changePassword(String userID, String password) {

        int rows = 0;

        try {

            Connection con = DBUtil.getConnection();

            String sql =
                    "UPDATE USERS SET PASSWORD=? WHERE USERID=?";

            PreparedStatement ps =
                    con.prepareStatement(sql);

            ps.setString(1, password);
            ps.setString(2, userID);

            rows = ps.executeUpdate();

            ps.close();
            DBUtil.closeConnection(con);

        }

        catch (Exception e) {

            System.out.println(e);

        }

        return rows;

    }

    // ==========================
    // Scenario 6
    // ==========================

    public int changePasswordOfAdmin() {

        int rows = 0;

        try {

            Connection con = DBUtil.getConnection();

            String sql =
                    "UPDATE USERS SET PASSWORD='ADMIN123' WHERE USERTYPE='Admin'";

            PreparedStatement ps =
                    con.prepareStatement(sql);

            rows = ps.executeUpdate();

            ps.close();
            DBUtil.closeConnection(con);

        }

        catch (Exception e) {

            System.out.println(e);

        }

        return rows;

    }
 // ==========================
 // Scenario 7
 // ==========================

 public int addUser(UserBean user) {

     int rows = 0;

     try {

         Connection con = DBUtil.getConnection();

         String sql =
         "INSERT INTO USERS VALUES(?,?,?,?,?,?)";

         PreparedStatement ps =
         con.prepareStatement(sql);

         ps.setString(1, user.getUserID());
         ps.setString(2, user.getPassword());
         ps.setString(3, user.getName());
         ps.setInt(4, user.getIncorrectAttempts());
         ps.setInt(5, user.getLockStatus());
         ps.setString(6, user.getUserType());

         rows = ps.executeUpdate();

         ps.close();
         DBUtil.closeConnection(con);

     } catch(Exception e) {

         System.out.println(e);

     }

     return rows;
 }
}
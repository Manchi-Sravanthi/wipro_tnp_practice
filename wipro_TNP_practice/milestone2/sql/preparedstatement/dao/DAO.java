package com.wipro.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class DAO {

    String url = "jdbc:oracle:thin:@localhost:1521/FREEPDB1";
    String username = "hr";
    String password = "hr";

    // Connection Method
    public Connection getConnection() {

        Connection con = null;

        try {

            Class.forName("oracle.jdbc.driver.OracleDriver");

            con = DriverManager.getConnection(url, username, password);

        } catch (Exception e) {

            System.out.println(e);

        }

        return con;
    }

    // Insert Method
    public void insert(int rollno, String name, String standard,
            String dob, double fees) {

        Connection con = null;
        PreparedStatement ps = null;

        try {

            con = getConnection();

            String sql = "INSERT INTO STUDENT VALUES(?,?,?,?,?)";

            ps = con.prepareStatement(sql);

            ps.setInt(1, rollno);
            ps.setString(2, name);
            ps.setString(3, standard);
            ps.setDate(4, java.sql.Date.valueOf(dob));
            ps.setDouble(5, fees);

            int rows = ps.executeUpdate();

            if (rows > 0)
                System.out.println("Record Inserted Successfully");
            else
                System.out.println("Record Not Inserted");

        } catch (Exception e) {

            System.out.println(e);

        } finally {

            try {

                if (ps != null)
                    ps.close();

                if (con != null)
                    con.close();

            } catch (Exception e) {
            }

        }

    }

    // Delete Method
    public void delete(int rollno) {

        Connection con = null;
        PreparedStatement ps = null;

        try {

            con = getConnection();

            String sql = "DELETE FROM STUDENT WHERE ROLLNO=?";

            ps = con.prepareStatement(sql);

            ps.setInt(1, rollno);

            int rows = ps.executeUpdate();

            if (rows > 0)
                System.out.println("Record Deleted Successfully");
            else
                System.out.println("Record Not Found");

        } catch (Exception e) {

            System.out.println(e);

        } finally {

            try {

                if (ps != null)
                    ps.close();

                if (con != null)
                    con.close();

            } catch (Exception e) {
            }

        }

    }

    // Modify Method
    public void modify(int rollno, double fees) {

        Connection con = null;
        PreparedStatement ps = null;

        try {

            con = getConnection();

            String sql = "UPDATE STUDENT SET FEES=? WHERE ROLLNO=?";

            ps = con.prepareStatement(sql);

            ps.setDouble(1, fees);
            ps.setInt(2, rollno);

            int rows = ps.executeUpdate();

            if (rows > 0)
                System.out.println("Record Updated Successfully");
            else
                System.out.println("Record Not Found");

        } catch (Exception e) {

            System.out.println(e);

        } finally {

            try {

                if (ps != null)
                    ps.close();

                if (con != null)
                    con.close();

            } catch (Exception e) {
            }

        }

    }

    // Display Single Record
    public void display(int rollno) {

        Connection con = null;
        PreparedStatement ps = null;
        ResultSet rs = null;

        try {

            con = getConnection();

            String sql = "SELECT * FROM STUDENT WHERE ROLLNO=?";

            ps = con.prepareStatement(sql);

            ps.setInt(1, rollno);

            rs = ps.executeQuery();

            while (rs.next()) {

                System.out.println(rs.getInt("ROLLNO") + " "
                        + rs.getString("NAME") + " "
                        + rs.getString("STANDARD") + " "
                        + rs.getDate("DATEOFBIRTH") + " "
                        + rs.getDouble("FEES"));

            }

        } catch (Exception e) {

            System.out.println(e);

        } finally {

            try {

                if (rs != null)
                    rs.close();

                if (ps != null)
                    ps.close();

                if (con != null)
                    con.close();

            } catch (Exception e) {
            }

        }

    }

    public void display() {

        Connection con = null;
        PreparedStatement ps = null;
        ResultSet rs = null;

        try {

            con = getConnection();

            String sql = "SELECT * FROM STUDENT";

            ps = con.prepareStatement(sql);

            rs = ps.executeQuery();

            while (rs.next()) {

                System.out.println(rs.getInt("ROLLNO") + " "
                        + rs.getString("NAME") + " "
                        + rs.getString("STANDARD") + " "
                        + rs.getDate("DATEOFBIRTH") + " "
                        + rs.getDouble("FEES"));

            }

        } catch (Exception e) {

            System.out.println(e);

        } finally {

            try {

                if (rs != null)
                    rs.close();

                if (ps != null)
                    ps.close();

                if (con != null)
                    con.close();

            } catch (Exception e) {
            }

        }

    }

}
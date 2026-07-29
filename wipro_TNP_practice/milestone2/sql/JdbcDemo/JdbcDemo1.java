package com.wipro.JdbcDemo;

import java.sql.Connection;
import java.sql.DriverManager;

public class JdbcDemo1 {

    public static void main(String[] args) {

        String url = "jdbc:oracle:thin:@localhost:1521/FREEPDB1";
        String username = "hr";
        String password = "hr";

        Connection con = null;

        try {
            con = DriverManager.getConnection(url, username, password);

            System.out.println("Connection Established successfully");

        } catch (Exception e) {

            System.out.println("Connection could not be established");
            System.out.println("Exception : " + e);

        } finally {

            try {
                if (con != null) {
                    con.close();
                }
            } catch (Exception e) {
                System.out.println(e);
            }

        }
    }
}
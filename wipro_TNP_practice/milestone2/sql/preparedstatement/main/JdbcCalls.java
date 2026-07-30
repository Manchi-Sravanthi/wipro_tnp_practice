package com.wipro.main;

import com.wipro.dao.DAO;

public class JdbcCalls {

    public static void main(String[] args) {

        DAO dao = new DAO();

        if (args.length == 0) {
            System.out.println("Please provide valid arguments");
            return;
        }

        int option = Integer.parseInt(args[0]);

        switch (option) {

        case 1:

            // Insert
            dao.insert(
                    Integer.parseInt(args[1]),
                    args[2],
                    args[3],
                    args[4],
                    Double.parseDouble(args[5]));

            break;

        case 2:

            // Delete
            dao.delete(
                    Integer.parseInt(args[1]));

            break;

        case 3:

            // Modify
            dao.modify(
                    Integer.parseInt(args[1]),
                    Double.parseDouble(args[2]));

            break;

        case 4:


            if (args.length == 1)
                dao.display();

            else
                dao.display(Integer.parseInt(args[1]));

            break;

        default:

            System.out.println("Invalid Option");

        }

    }

}

package miniproject;


public class Main {

    public static void main(String[] args) {

        UserDao dao = new UserDao();

        System.out.println("Scenario 1");
        System.out.println(dao.getUserType("AB1001"));

        System.out.println();

        System.out.println("Scenario 2");
        System.out.println(dao.getIncorrectAttempts("AB1001"));

        System.out.println();

        System.out.println("Scenario 3");

        int rows = dao.changeUserType("TA1002");

        System.out.println(rows);

    }

}
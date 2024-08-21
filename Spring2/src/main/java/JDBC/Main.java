package JDBC;

import java.sql.*;

public class Main {

    public static void main(String[] args) {

        System.out.println("Hello world");


        try {
            JDBC();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }


    }

    private static void JDBC() throws ClassNotFoundException, SQLException {
        Class.forName("com.mysql.cj.jdbc.Driver");

        final String url = "jdbc:mysql://localhost:3306/mydbs";
        final String user = "root";
        final String password = "root";

        String query = "select * from students";

        Connection connection = DriverManager.getConnection(url, user, password);
        Statement statement = connection.createStatement();
        ResultSet resultSet = statement.executeQuery(query);

        while (resultSet.next()){
            int id = resultSet.getInt("id");
            String name = resultSet.getString("name");
            int marks = resultSet.getInt("marks");

            System.out.println(STR."id : \{id}, name : \{name}, marks : \{marks}");
        }

        statement.close();
        connection.close();

    }

}

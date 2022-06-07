package jm.task.core.jdbc.util;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class Util {

    private static final String PASSWORD = "root";
    private static final String USER_NAME = "root";
    private static final String URL = "jdbc:mysql://localhost:3306/mysql";
    private static Connection connection;

    public static Connection getConnection () {
        try {
            return connection = DriverManager.getConnection(URL, USER_NAME, PASSWORD);
        } catch (SQLException throwables) {
            throwables.printStackTrace();
            throw new RuntimeException();
        }
    }
}

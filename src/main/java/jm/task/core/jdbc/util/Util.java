package jm.task.core.jdbc.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Util {
    // реализуйте настройку соеденения с БД
    private static final String url = "jdbc:mysql://localhost:3306/test12";
    private static final String user = "root";
    private static final String password = "11201995vgvg";

    public static Connection createConnection() {
        Connection connection = null;
        {
            try {
                connection = DriverManager.getConnection(url, user, password);
                connection.setAutoCommit(false);

            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
        return connection;
    }
}

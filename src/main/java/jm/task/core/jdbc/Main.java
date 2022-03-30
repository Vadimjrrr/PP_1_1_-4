package jm.task.core.jdbc;

import jm.task.core.jdbc.service.UserServiceImpl;

public class Main {
    public static void main(String[] args) {
        UserServiceImpl user = new UserServiceImpl();

        user.createUsersTable();

        user.saveUser("Nikolay", "Ivanov", (byte) 22);
        user.saveUser("Igor", "Sidorov", (byte) 23);
        user.saveUser("Vasiliy", "Petrov", (byte) 24);
        user.saveUser("Petr", "Sinichkin", (byte) 25);

        System.out.println(user.getAllUsers().toString());
        user.cleanUsersTable();
        user.dropUsersTable();
    }
}

package jm.task.core.jdbc;

import jm.task.core.jdbc.service.UserServiceImpl;

public class Main {
    public static void main(String[] args) {
        UserServiceImpl userService = new UserServiceImpl();
        userService.createUsersTable();
        userService.saveUser("Nikolay", "Ivanov", (byte)22);
        userService.saveUser("Igor", "Sidorov", (byte)23);
        userService.saveUser("Vasiliy", "Petrov", (byte)24);
        userService.saveUser("Petr", "Sinichkin", (byte)25);
        System.out.println(userService.getAllUsers().toString());
        userService.cleanUsersTable();
        userService.dropUsersTable();
    }
}

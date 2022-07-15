package jm.task.core.jdbc;

import jm.task.core.jdbc.model.User;
import jm.task.core.jdbc.service.UserService;
import jm.task.core.jdbc.service.UserServiceImpl;

public class Main {
    public static void main(String[] args) {
        UserService userService = new UserServiceImpl();
        userService.createUsersTable();
        User user1 = new User("Руслан","Белый",(byte)33);
        User user2 = new User("Нурлан","Сабуров",(byte)23);
        User user3 = new User("Сергей","Щербаков",(byte)27);
        User user4 = new User("Ваня","Усович",(byte)25);

        userService.saveUser(user1.getName(), user1.getLastName(), user1.getAge());
        System.out.println("User: " + user1.getName() + " добавлен");

        userService.saveUser(user2.getName(), user2.getLastName(), user2.getAge());
        System.out.println("User: " + user2.getName() + " добавлен");

        userService.saveUser(user3.getName(), user3.getLastName(), user3.getAge());
        System.out.println("User: " + user3.getName() + " добавлен");

        userService.saveUser(user4.getName(), user4.getLastName(), user4.getAge());
        System.out.println("User: " + user4.getName() + " добавлен");

        userService.getAllUsers();

        userService.cleanUsersTable();
        userService.dropUsersTable();
    }
}

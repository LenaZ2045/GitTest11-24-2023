package com.telran.org.lesson15;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class TestPredicate {
    public static void main(String[] args) {
        List<User> users = Arrays.asList(
                new User("Alex", "Admin", 25),
                new User("Oleg", "Member", 32),
                new User("Max", "Member", 30));

        List<User> admins = collect(users);
        System.out.println(admins);

        // predicate interface returns true or false
        Predicate<User> userAdminPredicate = new Predicate<User>() {
            @Override
            public boolean test(User user) {
                return "Admin".equals(user.getRole());
            }
        };
        boolean test = userAdminPredicate.test(users.get(0));
        System.out.println("User with name " + users.get(0) + " is admin ? = " + test);

        List<User> adminList = collect1(users, userAdminPredicate);
        System.out.println("Admin users" + adminList);

        Predicate<User> memebrUsr = user -> "Member".equals(user.getRole());
        List<User> mmerbList = collect1(users, memebrUsr);
        System.out.println("Member user " + mmerbList);

        Predicate<User> ageUser = user -> user.getAge() > 30;
        List<User> oldUsers = collect1(users, ageUser);
        System.out.println("Older user " + oldUsers);
    }
    private static List<User> collect(List<User> users) {
        List<User> result = new ArrayList<>();
        for (User user : users) {
            if ("Admin".equals(user.getRole())) {
                result.add(user);
            }
        }
        return result;
    }
    private static List<User> collect1(List<User> users, Predicate<User> filter) { // universal method using filter
        List<User> result = new ArrayList<>();
        for (User user : users) {
            if (filter.test(user)) {
                result.add(user);
            }
        }
        return result;
    }
}

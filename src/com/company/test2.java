package com.company;

import java.util.*;

/**
 * @author 张子行
 * @class
 */
public class test2 {

    public static void main(String[] args) {
        TreeSet<User> users = new TreeSet<User>();
        users.add(new User(1, "未接单"));
        users.add(new User(2, "已接单"));
        users.add(new User(3, "预接单"));
        users.add(new User(4, "已接单"));
        users.add(new User(5, "未接单"));
        users.add(new User(6, "已接单"));
        users.add(new User(7, "未接单"));
        users.add(new User(8, "预接单"));
        users.add(new User(9, "未接单"));
        users.add(new User(10, "已接单"));
        users.add(new User(11, "未接单"));
        users.add(new User(12, "已接单"));
        users.add(new User(13, "预接单"));
        users.add(new User(14, "未接单"));
        users.add(new User(15, "预接单"));
        users.add(new User(14, "未接单"));

        Iterator<User> iterator = users.iterator();
        while (iterator.hasNext()) {
            User next = iterator.next();
            System.out.println("id: " + next.getId() + " name: " + next.getName());
        }

    }
}

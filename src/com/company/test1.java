package com.company;

import java.util.*;

/**
 * @author 张子行
 * @class Comparator接口：正数排后面 0原样输出 负数排前面
 */
public class test1 {

    public static void main(String[] args) {
        List<User> users = new LinkedList<User>();
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

        Iterator<User> iterator2 = users.iterator();
        while (iterator2.hasNext()) {
            User next = iterator2.next();
            System.out.println("id: " + next.getId() + " name: " + next.getName());
        }
        Collections.sort(users, new Comparator<User>() {
            @Override
            public int compare(User o1, User o2) {
                if ("未接单".equals(o2.getName()) && ("预接单".equals(o1.getName()) || "已接单".equals(o1.getName()))) {
                    return 1;
                }
                if ("未接单".equals(o1.getName()) && ("预接单".equals(o2.getName()) || "已接单".equals(o2.getName()))) {
                    return -1;
                }
                if ("预接单".equals(o1.getName())) {
                    return -1;
                }
                if ("预接单".equals(o2.getName())) {
                    return 1;
                }
                return 0;
            }
        });
        System.out.println("-----------");
        Iterator<User> iterator = users.iterator();
        while (iterator.hasNext()) {
            User next = iterator.next();
            System.out.println("id: " + next.getId() + " name: " + next.getName());
        }

    }
}

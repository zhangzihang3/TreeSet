package com.company;

import java.util.Objects;

/**
 * @author 张子行
 * @class
 */
public class User implements Comparable<User> {
    private int id;
    private String name;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof User)) return false;
        User user = (User) o;
        return getId() == user.getId() &&
                Objects.equals(getName(), user.getName());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getId(), getName());
    }

    /**
     * @param
     * @method //参数o: 正在添加的元素
     * > //return 0只添加第一个元素
     * > //return 一个正数，都能添加到集合当中，参数o排前面
     * > //return 一个负数，都能添加到集合当中，参数o排后面
     * 且按照id顺序排序
     */
    @Override
    public int compareTo(User o) {
        if ("未接单".equals(o.getName()) && ("预接单".equals(this.getName()) || "已接单".equals(this.getName()))) {
            return 1;
        }
        if ("未接单".equals(this.getName()) && ("预接单".equals(o.getName()) || "已接单".equals(o.getName()))) {
            return -1;
        }
        if ("预接单".equals(o.getName()) && "已接单".equals(this.getName())) {
            return 1;
        }
        if ("预接单".equals(this.getName()) && "已接单".equals(o.getName())) {
            return -1;
        }
        return this.getId() - o.getId();

    }

    public User() {
    }

    public User(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }

}

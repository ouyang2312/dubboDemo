package com.entity;

import java.io.Serializable;

/**
 * @author oy
 * @description
 * @date 2019/3/31
 */
public class User implements Serializable {

    private int id;
    private String name;

    public User() {
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
}

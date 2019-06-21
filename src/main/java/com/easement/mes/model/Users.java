package com.easement.mes.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Users {

    @Id
    @GeneratedValue
    private long id;
    @Column(nullable = false,unique = true)
    private String userName;
    @Column(nullable = false)
    private int age;
    @Column(nullable = false)
    private String password;

    public Users() {}

    public Users(String name, int age, String password) {
        this.userName = name;
        this.age = age;
        this.password = password;
    }


    @Override
    public String toString() {
        return ("name=" + this.userName + ",age=" + this.age + ",pass=" + this.password);
    }


    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}

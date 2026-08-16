package com.example.harsh;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table
public class MyDtoUser {

    @Id
    private  int id;
    private  String name;
    private  int age;
    private int bc;

    public int getBc() {
        return bc;
    }

    public void setBc(int bc) {
        this.bc = bc;
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

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}

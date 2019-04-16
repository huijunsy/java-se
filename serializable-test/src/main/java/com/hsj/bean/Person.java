package com.hsj.bean;

import java.io.Serializable;

public class Person/* implements Serializable*/ {

//    private static final long serialVersionUID = -2937419425822597936L;
    private int  id;
//    private String  name;
//    private int age;

    public Person() {
    }

    public Person(int id, String name) {
        this.id = id;
//        this.name = name;
    }

    @Override
    public String toString() {
        return "Person{" +
                "id=" + id +
//                ", name='" + name + '\'' +
//                ", age=" + age +
                '}';
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }


}

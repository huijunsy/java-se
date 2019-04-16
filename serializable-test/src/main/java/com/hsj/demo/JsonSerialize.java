package com.hsj.demo;

import com.alibaba.fastjson.JSON;
import com.hsj.bean.Person;

import java.io.*;

public class JsonSerialize {

    public static void main(String[] args) throws IOException, ClassNotFoundException {
//        write2File();
        readFromFile();
    }

    private static void write2File() throws IOException {
        Person person = new Person(12,"tom");
        ObjectOutputStream o = new ObjectOutputStream(new FileOutputStream("object_json.txt"));
        o.writeObject(JSON.toJSONString(person));
        o.flush();
        o.close();
    }

    private static void readFromFile() throws IOException, ClassNotFoundException {
        ObjectInputStream o = new ObjectInputStream(new FileInputStream("object_json.txt"));
        String personStr = (String) o.readObject();
        Person person = JSON.parseObject(personStr,Person.class);
        o.close();
        System.out.println(person);
    }

}

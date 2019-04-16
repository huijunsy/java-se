package com.hsj.demo;

import com.hsj.bean.Person;

import java.io.*;

public class JavaSerialize {

    public static void main(String[] args) throws IOException, ClassNotFoundException {
//        write2File();
        readFromFile();

    }

    private static void write2File() throws IOException{
        Person person = new Person(12,"tom");
        ObjectOutputStream o = new ObjectOutputStream(new FileOutputStream("object.txt"));
        o.writeObject(person);
        o.flush();
        o.close();
    }

    private static void readFromFile() throws IOException, ClassNotFoundException {
        ObjectInputStream o = new ObjectInputStream(new FileInputStream("object.txt"));
        Person person = (Person) o.readObject();
        o.close();
        System.out.println(person);
    }

}

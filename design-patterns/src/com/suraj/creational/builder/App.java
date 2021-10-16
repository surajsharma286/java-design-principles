package com.suraj.creational.builder;

public class App {
    public static void main(String[] args) {
        Person person = new Person.Builder("Kevin","Kevin@gmail.com").setAge(12).setAddress("NYC").build();
        System.out.println(person);

        Student student = new Student.Builder("Suraj","Stanford").setAge(30).build();
        System.out.println(student);

    }
}

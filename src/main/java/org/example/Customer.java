package org.example;

public class Customer {
    public int id;
    public String name;
    public int age;

    public Customer(int id, String name, int age) {
        this.id = id;
        this.name = name;
        this.age = age;
    }


    public int getId() {
        return id;

    }

    public String getName() {
        return name;


    }

    public int getAge() {
        return age;
    }

    @Override
    public String toString() {
        return id + ": " + name + ", " + "Age: " + age;

    }
}
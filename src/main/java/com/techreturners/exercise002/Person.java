package com.techreturners.exercise002;

public class Person {
    private String firstname;
    private String lastname;
    private String hometown;
    private int age;

    public Person(String firstname, String lastname, String hometown, int age) {
        this.firstname = firstname;
        this.lastname = lastname;
        this.hometown = hometown;
        this.age = age;
    }

    public String getFirstname() {
        return firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public String getHometown() {
        return hometown;
    }

    public int getAge() {
        return age;
    }
}
package com.statefarm;

class Person {
    private String name; //Some piece of private state

    public Person(String name) { //the constructor
        this.name = name;
    }

    public String getName() {
        return name;
    }
}
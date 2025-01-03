package com.example.demo;

import lombok.Data;

@Data
public class Employee {

    private String name;

    public Employee(String name) {
        this.name = name;
    }

    public void printName() {
        System.out.println(name);
    }

}

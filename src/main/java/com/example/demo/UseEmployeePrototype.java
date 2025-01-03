package com.example.demo;

import lombok.Data;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.stereotype.Component;

@Component
@Data
public class UseEmployeePrototype {

    private ApplicationContext applicationContext;

    @Autowired
    public UseEmployeePrototype(ApplicationContext applicationContext) {
        this.applicationContext = applicationContext;
    }

    public void usePrototype() {
        Employee employee = (Employee) applicationContext.getBean("Employee", "Alice");
        employee.printName();
    }

}

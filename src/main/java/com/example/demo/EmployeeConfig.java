package com.example.demo;

import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

@Configuration
public class EmployeeConfig {

    @Bean(name = "Employee")
    @Scope(BeanDefinition.SCOPE_PROTOTYPE)
    public Employee createPrototype(String name) {
        return new Employee(name);
    }

}

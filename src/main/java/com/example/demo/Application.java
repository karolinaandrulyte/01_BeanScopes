package com.example.demo;

import com.example.demo.scope.PrototypeBean;
import com.example.demo.scope.SingletonBean;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import java.util.Objects;

@SpringBootApplication
public class Application {

	public static void main(String[] args) {
		ApplicationContext context = SpringApplication.run(Application.class, args);

		// Retrieve and print hash codes of singleton beans
		SingletonBean singletonBean1 = context.getBean(SingletonBean.class);
		System.out.println(singletonBean1.hashCode());

		SingletonBean singletonBean2 = context.getBean(SingletonBean.class);
		System.out.println(singletonBean2.hashCode());

		// check if singleton beans are equal
		System.out.println(Objects.equals(singletonBean1, singletonBean2));

		// Retrieve and print hash codes of prototype beans
		PrototypeBean prototypeBean1 = context.getBean(PrototypeBean.class);
		System.out.println(prototypeBean1.hashCode());

		PrototypeBean prototypeBean2 = context.getBean(PrototypeBean.class);
		System.out.println(prototypeBean2.hashCode());

		// check if prototype beans are equal
		System.out.println(Objects.equals(prototypeBean2, prototypeBean1));

		// get the name of the Employee
		UseEmployeePrototype useEmployeePrototype = context.getBean(UseEmployeePrototype.class);
		useEmployeePrototype.usePrototype();

	}

}

package com.xyz;

import com.xyz.config.ProjectConfig;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class MainCLass {
    public static void main(String[] args) {

        var context = new AnnotationConfigApplicationContext(ProjectConfig.class);

        var person = context.getBean(Person.class);

        System.out.println("Person Name = " + person.getName());
        System.out.println("Vehicle Name = " + person.getVehicle().getName());

    }
}

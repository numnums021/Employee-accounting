package com.danya.spring.rest;

import com.danya.spring.rest.configuration.MyConfig;
import com.danya.spring.rest.entity.Employee;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.List;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args ) {

        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(MyConfig.class);

        Communication communication = context.getBean("communication", Communication.class);
        //List<Employee> allEmployees = communication.getAllEmployees();
        //System.out.println(allEmployees);

//        Employee empByID = communication.getEmployee(5);
//        System.out.println(empByID);

//        Employee emp = new Employee("Sveta", "Sokolova", "IT", 1200);
//        emp.setId(11);
//
//        communication.saveEmployee(emp);

        communication.deleteEmployee(11);
    }
}

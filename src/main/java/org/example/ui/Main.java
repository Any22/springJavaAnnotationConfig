/********************************************************************************************************************
 * In this configuration , the need for explicit configuration of beans gets eliminated
 * Spring automatically scans , detects and instantiates the bean from specified package through component scanning
 * it looks for class annotated with @Configuration , @Service and  @Repository annotations
 ********************************************************************************************************************/
package org.example.ui;

import org.example.config.SpringConfig;
import org.example.demo.Customer;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
public class Main {
    public static void main(String[] args) {
        ApplicationContext applicationContext ;
        applicationContext = new AnnotationConfigApplicationContext(SpringConfig.class);

        Customer customer = (Customer) applicationContext.getBean("customer")  ;
        customer.setCustomerName("Jonathan");

        System.out.println(customer.register(customer.getCustomerName()));

    }
}
package org.example.demo;
import org.springframework.stereotype.Component;

//General purpose Annotation
@Component
public class Customer {
    private String customerName;

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public String register (String CustomerName){
        return CustomerName+ " "+ "is our new registered user !!";
    }
}

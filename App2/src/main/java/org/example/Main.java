package org.example;


import org.example.controller.CustomerManagment;
import org.example.model.*;

public class Main {
    public static void main(String[] args) {
        Logger [] loggers={new EmailLogger(),new DatabaseLogger()};

        CustomerManagment customerManagment=new CustomerManagment(loggers);
        customerManagment.addCustomer(new Customer(1L,"Mehmet","Akay"));
        System.out.println("---------------");
        customerManagment.delete(new Customer(2L,"Yasemin","Akay"));
    }
}
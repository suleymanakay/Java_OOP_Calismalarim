package org.example.controller;

import org.example.model.Customer;
import org.example.model.DatabaseLogger;
import org.example.model.FileLogger;
import org.example.model.Logger;

public class CustomerManagment {

    private Logger [] loggers;
    public CustomerManagment(Logger [] loggers) {
        this.loggers = loggers;
    }

    public void addCustomer(Customer customer){
        System.out.println("Musteri eklendi "+customer.getFirstName());
        Utils.runLoggers(loggers);

    }
    public void delete(Customer customer){
        System.out.println("Musteri silindi "+customer.getFirstName());
        Utils.runLoggers(loggers);

    }
}

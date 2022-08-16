package org.example.Customer;

import org.example.Customer.Customer;

public class CustomerManager {
    public void add(Customer customer){
        System.out.println("Musteri sisteme eklendi: "+customer.getCustomerNumber());
    }
    //toplu ekleme (bulk insert)
    public void addMultiple(Customer [] customers){
        for (Customer customer:customers
             ) {
            add(customer);
        }
    }
}

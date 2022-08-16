package org.example.Customer;

public class Customer {
    private Long id;
    private String customerId;

    private String customerNumber;



    public String getCustomerNumber() {
        return customerNumber;
    }


    public Customer(String customerNumber) {
        this.customerNumber = customerNumber;
    }

    public void setCustomerNumber(String customerNumber) {
        this.customerNumber = customerNumber;
    }

    public Customer() {
    }

    public Customer(Long id, String customerId) {
        this.id = id;
        this.customerId = customerId;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getCustomerId() {
        return customerId;
    }

    public void setCustomerId(String customerId) {
        this.customerId = customerId;
    }
}

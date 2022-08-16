package org.example.Customer;

import org.example.Customer.Customer;

public class CorporateCustomer extends Customer {
    private String customerCorporateNo;
    private double customerCorporateMaas;

    public String getCustomerCorporateNo() {
        return customerCorporateNo;
    }

    public void setCustomerCorporateNo(String customerCorporateNo) {
        this.customerCorporateNo = customerCorporateNo;
    }

    public double getCustomerCorporateMaas() {
        return customerCorporateMaas;
    }

    public void setCustomerCorporateMaas(double customerCorporateMaas) {
        this.customerCorporateMaas = customerCorporateMaas;
    }
}

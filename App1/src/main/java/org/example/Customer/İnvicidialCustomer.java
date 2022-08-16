package org.example.Customer;

import org.example.Customer.Customer;

public class İnvicidialCustomer extends Customer {
    private String musteriNo;
    private double musteriMaas;

    public String getMusteriNo() {
        return musteriNo;
    }

    public void setMusteriNo(String musteriNo) {
        this.musteriNo = musteriNo;
    }

    public double getMusteriMaas() {
        return musteriMaas;
    }

    public void setMusteriMaas(double musteriMaas) {
        this.musteriMaas = musteriMaas;
    }
}

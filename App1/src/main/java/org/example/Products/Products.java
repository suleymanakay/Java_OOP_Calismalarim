package org.example.Products;


public class Products {
    private Long id;
    private String name;
    private double unitPrice;
    private String detail;
    private int discount;
    private double unitPriceAfterDiscount;

    public Products(Long id, String name, double price, String detail,int discount) {
        this.id = id;
        this.name = name;
        this.unitPrice = price;
        this.detail = detail;
        this.discount=discount;
    }

    public int getDiscount() {
        return discount;
    }


    public void setDiscount(int discount) {
        this.discount = discount;
    }

    public Long getId() {
        return id;
    }

    public double getUnitPrice() {
        return unitPrice;
    }

    public void setUnitPrice(double unitPrice) {
        this.unitPrice = unitPrice;
    }

    public double getUnitPriceAfterDiscount() {
        return this.unitPrice-(this.unitPrice/this.discount);
    }

    public void setUnitPriceAfterDiscount(double unitPriceAfterDiscount) {
        this.unitPriceAfterDiscount = unitPriceAfterDiscount;
    }

    public Products() {
    }

    public Long getId(long l) {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return unitPrice;
    }

    public void setPrice(double price) {
        this.unitPrice = price;
    }

    public String getDetail() {
        return detail;
    }

    public void setDetail(String detail) {
        this.detail = detail;
    }
}

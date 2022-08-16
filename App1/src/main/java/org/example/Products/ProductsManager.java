package org.example.Products;

import org.example.Products.Products;

public class ProductsManager {
    public void addToCart(Products products){
        System.out.println("Sepete Ekelndi! "+products.getName());
    }
}

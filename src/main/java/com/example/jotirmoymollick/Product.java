package com.example.jotirmoymollick;

import java.time.LocalDate;
import java.util.ArrayList;

public class Product {
    private String productName,category,description;
    private ArrayList<String> productList;
    private int price;
    private LocalDate manufacturerDate, expiryDate;

    public Product() {
    }

    public Product(ArrayList<String> productList) {
        this.productList = productList;
    }

    public Product(String productName,ArrayList<String> productList, String category, String description, int price, LocalDate manufacturerDate, LocalDate expiryDate) {
        this.productName = productName;
        this.productList = productList;
        this.category = category;
        this.description = description;
        this.price = price;
        this.manufacturerDate = manufacturerDate;
        this.expiryDate = expiryDate;
    }

    public ArrayList<String> getProductList() {
        return productList;
    }

    public void setProductList(ArrayList<String> productList) {
        this.productList = productList;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public LocalDate getManufacturerDate() {
        return manufacturerDate;
    }

    public void setManufacturerDate(LocalDate manufacturerDate) {
        this.manufacturerDate = manufacturerDate;
    }

    public LocalDate getExpiryDate() {
        return expiryDate;
    }

    public void setExpiryDate(LocalDate expiryDate) {
        this.expiryDate = expiryDate;
    }

    @Override
    public String toString() {
        return "Product{" +
                "productName='" + productName + '\'' +
                "productList='" + productList +'\'' +
                ", category='" + category + '\'' +
                ", description='" + description + '\'' +
                ", price=" + price +
                ", manufacturerDate=" + manufacturerDate +
                ", expiryDate=" + expiryDate +
                '}';

    }
}

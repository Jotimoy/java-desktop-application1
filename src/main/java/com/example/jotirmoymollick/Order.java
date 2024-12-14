package com.example.jotirmoymollick;

import java.time.LocalDate;

public class Order {
    private int orderId;
    private String customerName, quantity, price;
    private LocalDate orderDate;
    private double totalAmount;

    public Order() {
    }

    public Order(int orderId, String customerName, String quantity, String price, LocalDate orderDate) {
        this.orderId = orderId;
        this.customerName = customerName;

        this.quantity = quantity;
        this.price = price;
        this.orderDate = orderDate;
        this.totalAmount = totalAmount;

    }

    public Order(int i, String text, String text1, String text2, String text3, LocalDate value) {
        this.orderId = i;
        this.customerName = text;
        this.quantity = text1;
        this.price = text2;
        this.orderDate = value;
        this.totalAmount = Double.parseDouble(text3);
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public double getTotalAmount() {
        return totalAmount;
    }

    public void setTotalAmount(double totalAmount) {
        this.totalAmount = totalAmount;
    }

    public int getOrderId() {
        return orderId;
    }

    public void setOrderId(int orderId) {
        this.orderId = orderId;
    }

    public String getCustomername() {
        return customerName;
    }

    public void setCustomername(String customername) {
        this.customerName = customername;
    }

    public String getQuantity() {
        return quantity;
    }

    public void setQuantity(String quantity) {
        this.quantity = quantity;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    public LocalDate getOrderDate() {
        return orderDate;
    }

    public void setOrderDate(LocalDate orderDate) {
        this.orderDate = orderDate;
    }

    @Override
    public String toString() {
        return "Order{" +
                "orderId=" + orderId +
                ", customerName='" + customerName + '\'' +
                ", quantity='" + quantity + '\'' +
                ", price='" + price + '\'' +
                ", orderDate=" + orderDate + '\'' +
                ", totalAmount" + totalAmount +
                '}';
    }
}

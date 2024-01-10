package com.example.drivedealz2.Model;

import androidx.room.Entity;
import androidx.room.PrimaryKey;

@Entity
public class Order {
    @PrimaryKey
    private int orderId;
    private int carId;
    private int userId;
    private String orderDate;


    public Order(int orderId, int carId, int userId, String orderDate) {
        this.orderId = orderId;
        this.carId = carId;
        this.userId = userId;
        this.orderDate = orderDate;
    }

    // Getters and setters f or each property
    public int getOrderId() {
        return orderId;
    }

    public void setOrderId(int orderId) {
        this.orderId = orderId;
    }

    public int getCarId() {
        return carId;
    }

    public void setCarId(int carId) {
        this.carId = carId;
    }

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public String getOrderDate() {
        return orderDate;
    }

    public void setOrderDate(String orderDate) {
        this.orderDate = orderDate;
    }


}




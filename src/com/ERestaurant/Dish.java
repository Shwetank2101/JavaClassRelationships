package com.ERestaurant;

public class Dish {

    private int dishId;
    private String dishName;
    private int dishPrice;
    private int dishMakeTime;

    public Dish(int dishId, String dishName, int dishPrice, int dishMakeTime) {
        this.dishId=dishId;
        this.dishName=dishName;
        this.dishPrice=dishPrice;
        this.dishMakeTime=dishMakeTime;
    }
    public int getDishId() {
        return dishId;
    }
    public void setDishId(int dishId) {
        this.dishId = dishId;
    }
    public String getDishName() {
        return dishName;
    }
    public void setDishName(String dishName) {
        this.dishName = dishName;
    }
    public int getDishPrice() {
        return dishPrice;
    }
    public void setDishPrice(int dishPrice) {
        this.dishPrice = dishPrice;
    }
    public int getDishMakeTime() {
        return dishMakeTime;
    }
    public void setDishMakeTime(int dishMakeTime) {
        this.dishMakeTime = dishMakeTime;
    }

    @Override
    public String toString() {
        return "Dish ID is: "+dishId+"\nDish name is: "+dishName+"\nDish price is: "+dishPrice+"\nDish making time is: "+dishMakeTime+"min";
    }

}


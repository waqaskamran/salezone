package com.example.Domain;

/**
 * Created by kamran on 8/23/2017.
 */
public class Car {

    private String VIN;
    private String color;
    private Integer miles;

    //...

    public Car(){}


    public Car(String VIN, String color, Integer miles) {
        this.VIN = VIN;
        this.color = color;
        this.miles = miles;
    }

    public String getVIN() {
        return VIN;
    }

    public void setVIN(String VIN) {
        this.VIN = VIN;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public Integer getMiles() {
        return miles;
    }

    public void setMiles(Integer miles) {
        this.miles = miles;
    }
}

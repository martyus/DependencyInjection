package com.version1;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;


public class Car {
    private String model;
    private Engine e;
    private int currentGear;
    private int speed;


    public void setEngine(Engine e){
        this.e = e;
    }


    public Car(String model, Engine e, int currentGear, int speed) {
        this.model = model;
        this.e = e;
        this.currentGear = currentGear;
        this.speed = speed;
    }

    public int getSpeed(){
        return this.speed;
    }


    @Override
    public java.lang.String toString() {
        return "Car{" +
                "model='" + model + '\'' +
                ", e=" + e.getRevs() +
                ", currentGear=" + currentGear +
                ", speed=" + speed + '}';
    }
}

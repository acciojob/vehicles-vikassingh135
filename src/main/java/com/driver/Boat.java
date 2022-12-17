/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.driver;

/**
 *
 * @author Vikas_Singh
 */
public class Boat implements WaterVehicle{

   private String name;
   private int capacity;

    public Boat(String name, int capacity) {
        this.name = name;
        this.capacity = capacity;
    }

    

    public String getVehicleName() {
        return name;
    }

   
    public int getVehicleCapacity() {
        return capacity;
    }
}

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

   private String VehicleName;
   private int VehicleCapacity;

    public Boat(String VehicleName, int VehicleCapacity) {
        this.VehicleName = VehicleName;
        this.VehicleCapacity = VehicleCapacity;
    }

    public String getVehicleName() {
        return VehicleName;
    }

    public void setVehicleName(String VehicleName) {
        this.VehicleName = VehicleName;
    }

    public int getVehicleCapacity() {
        return VehicleCapacity;
    }

    public void setVehicleCapacity(int VehicleCapacity) {
        this.VehicleCapacity = VehicleCapacity;
    }

   
}

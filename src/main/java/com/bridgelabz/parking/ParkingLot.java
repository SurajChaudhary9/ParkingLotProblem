package com.bridgelabz.parking;

public class ParkingLot {
    Vehicle vehicle;
    /*
    method to park the vehicle
     */
    public boolean park(Vehicle vehicle) {
        if(this.vehicle != null)
            return false;
        this.vehicle=vehicle;
        return true;
    }
    /*
    method to unpark the vehicle
     */
    public boolean unPark(Vehicle vehicle) {
        if(this.vehicle == null)
            return false;
        if(this.vehicle.equals(vehicle))
        {
            this.vehicle=null;
            return true;
        }
        return false;
    }
}

package com.bridgelabz.parking;

public class ParkingLot {
    Vehicle vehicle;

    public boolean park(Vehicle vehicle) {
        if (this.vehicle != null)
            return false;
        this.vehicle = vehicle;
        return true;
    }
}

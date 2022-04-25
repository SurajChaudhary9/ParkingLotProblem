package com.bridgelabz.parking;

public class ParkingLot {
    Object vehicle;
    public boolean park(Object vehicle) {
        if(this.vehicle != null)
            return false;
        this.vehicle=vehicle;
        return true;
    }
}

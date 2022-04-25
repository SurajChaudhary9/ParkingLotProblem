package com.bridgelabz.parking;

import org.testng.Assert;
import org.testng.annotations.Test;

public class ParkingLotTest {
    //UC1 : Ability To Park Car
    @Test
    public void givenVehicle_WhenParked_ShouldReturnTrue() {
        Vehicle audi = new Vehicle("Audi Q8");
        ParkingLot parkingLot = new ParkingLot();
        boolean isParked = parkingLot.park(audi);
        Assert.assertTrue(isParked);
    }

    @Test
    public void givenVehicle_WhenUnparked_ShouldReturnTrue() {
        Vehicle audi = new Vehicle("Audi Q8");
        ParkingLot parkingLot = new ParkingLot();
        parkingLot.park(audi);
        boolean isUnParked = parkingLot.unPark(audi);
        Assert.assertTrue(isUnParked);
    }
}

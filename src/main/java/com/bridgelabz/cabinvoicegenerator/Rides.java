package com.bridgelabz.cabinvoicegenerator;

public class Rides {

    public double distance;
    public int time;
    RideType rideType;

    public Rides(RideType rideType, double distance, int time) {
        this.rideType = rideType;
        this.distance = distance;
        this.time = time;
    }

    public enum RideType {NORMAL_RIDE, PREMIUM_RIDE}
}

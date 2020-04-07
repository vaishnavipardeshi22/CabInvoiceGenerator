package com.bridgelabz.cabinvoicegenerator;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class RideRepository {

    Map<String, ArrayList<Rides>> userRides;

    public RideRepository() {
        this.userRides = new HashMap<>();
    }

    public void addRides(String userId, Rides[] rides) {
        this.userRides.put(userId, new ArrayList<Rides>(Arrays.asList(rides)));
    }

    public Rides[] getRides(String userId) {
        return this.userRides.get(userId).toArray(new Rides[0]);
    }
}

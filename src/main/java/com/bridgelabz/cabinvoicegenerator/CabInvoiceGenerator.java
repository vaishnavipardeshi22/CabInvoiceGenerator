package com.bridgelabz.cabinvoicegenerator;

public class CabInvoiceGenerator {

    //CONSTANTS
    private static final double NORMAL_RIDE_COST_PER_KILOMETER = 10;
    private static final int NORMAL_RIDE_COST_PER_MINUTE = 1;
    private static final int NORMAL_RIDE_MINIMUM_FARE = 5;
    private static final double PREMIUM_RIDE_COST_PER_KILOMETER = 15;
    private static final int PREMIUM_RIDE_COST_PER_MINUTE = 2;
    private static final int PREMIUM_RIDE_MINIMUM_FARE = 20;

    public RideRepository rideRepository;

    public CabInvoiceGenerator() {
        this.rideRepository = new RideRepository();
    }

    //MAIN METHOD
    public static void main(String[] args) {
        System.out.println("******************** WELCOME TO CAB INVOICE GENERATOR ********************");
    }

    //FUNCTION TO CALCULATE TOTAL FARE FOR THE JOURNEY OF RIDES ACCORDING TO THEIR TYPE
    public double getTotalFare(Rides[] rides) {
        double totalFare = 0;
        for (Rides ride : rides) {
            if (ride.rideType.equals(Rides.RideType.NORMAL_RIDE)) {
                totalFare += (ride.distance * NORMAL_RIDE_COST_PER_KILOMETER) + (ride.time * NORMAL_RIDE_COST_PER_MINUTE);
                totalFare = Math.max(totalFare, NORMAL_RIDE_MINIMUM_FARE);
            }
            if (ride.rideType.equals(Rides.RideType.PREMIUM_RIDE)) {
                totalFare += (ride.distance * PREMIUM_RIDE_COST_PER_KILOMETER) + (ride.time * PREMIUM_RIDE_COST_PER_MINUTE);
                totalFare = Math.max(totalFare, PREMIUM_RIDE_MINIMUM_FARE);
            }
        }
        return totalFare;
    }

        //FUNCTION TO GET INVOICE SUMMARY BY USING RIDE DATA
        public InvoiceSummary getInvoiceSummary (Rides[]rides){
            double totalFare = getTotalFare(rides);
            return new InvoiceSummary(rides.length, totalFare);
        }

        //FUNCTION TO GET INVOICE SUMMARY BY USING USER
        public InvoiceSummary getInvoiceSummary (String userId){
            Rides[] rideList = rideRepository.getRides(userId);
            double totalFare = getTotalFare(rideList);
            return new InvoiceSummary(rideList.length, totalFare);
        }

        //FUNCTION TO ADD RIDES
        public void addRides (String userId, Rides[]rides){
            rideRepository.addRides(userId, rides);
        }

    }

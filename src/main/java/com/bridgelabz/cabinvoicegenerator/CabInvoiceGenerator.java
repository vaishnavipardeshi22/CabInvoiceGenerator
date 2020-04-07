package com.bridgelabz.cabinvoicegenerator;

public class CabInvoiceGenerator {

    //CONSTANTS
    private static final double COST_PER_KILOMETER = 10;
    private static final int COST_PER_MINUTE = 1;
    private static final int MINIMUM_FARE = 5;

    //MAIN METHOD
    public static void main(String[] args) {
        System.out.println("******************** WELCOME TO CAB INVOICE GENERATOR ********************");
    }

    //FUNCTION TO CALCULATE TOTAL FARE FOR THE JOURNEY OF SINGLE RIDE
    public double getTotalFare(double distance, int time) {
        double totalFare = (COST_PER_KILOMETER * distance) + (COST_PER_MINUTE * time);
        totalFare = Math.max(totalFare, MINIMUM_FARE);
        return totalFare;
    }

    //FUNCTION TO CALCULATE TOTAL FARE FOR THE JOURNEY OF MULTIPLE RIDES
    public double getTotalFare(Rides[] rides) {
        double totalFare = 0;
        for (Rides ride : rides) {
            totalFare += ride.distance * COST_PER_KILOMETER + ride.time * COST_PER_MINUTE;
        }
        totalFare = Math.max(totalFare, MINIMUM_FARE);
        return totalFare;
    }

    //FUNCTION TO GET INVOICE SUMMARY
    public InvoiceSummary getInvoiceSummary(Rides[] rides) {
        double totalFare = getTotalFare(rides);
        return new InvoiceSummary(rides.length, totalFare);
    }
}

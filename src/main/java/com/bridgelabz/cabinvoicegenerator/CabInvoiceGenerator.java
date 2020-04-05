package com.bridgelabz.cabinvoicegenerator;

public class CabInvoiceGenerator {

    //CONSTANTS
    private static final double COST_PER_KILOMETER = 10;
    private static final int COST_PER_MINUTE = 1;

    //MAIN METHOD
    public static void main(String[] args) {
        System.out.println("******************** WELCOME TO CAB INVOICE GENERATOR ********************");
    }

    //FUNCTION TO CALCULATE TOTAL FARE FOR THE JOURNEY
    public double getTotalFare(double distance, int time) {
        double totalFare = (COST_PER_KILOMETER * distance) + (COST_PER_MINUTE * time);
        return totalFare;
    }
}

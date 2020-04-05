package com.bridgelabz.cabinvoicegeneratortest;

import com.bridgelabz.cabinvoicegenerator.CabInvoiceGenerator;
import org.junit.Assert;
import org.junit.Test;

public class CabInvoiceGeneratorTest {

    CabInvoiceGenerator cabInvoiceGenerator = new CabInvoiceGenerator();

    @Test
    public void givenDistanceAndTime_WhenCalculated_ReturnTotalFare() {
        double cabInvoiceGeneratorTotalFare = cabInvoiceGenerator.getTotalFare(5.0, 5);
        Assert.assertEquals(55.0, cabInvoiceGeneratorTotalFare, 0);
    }
}

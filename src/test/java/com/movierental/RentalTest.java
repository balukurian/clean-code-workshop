package com.movierental;

import org.junit.Assert;
import org.junit.Test;

public class RentalTest {

    @Test
    public void testCharge() {

        Movie badla = new Movie("Badla", Movie.REGULAR);
        Movie predator = new Movie("Predator", Movie.NEW_RELEASE);

        Rental r1 = new Rental(badla, 3);
        Rental r2 = new Rental(predator, 4);

        Assert.assertEquals(3.5, r1.charge(), 0);
        Assert.assertEquals(12.0 ,r2.charge(), 0);
    }

}

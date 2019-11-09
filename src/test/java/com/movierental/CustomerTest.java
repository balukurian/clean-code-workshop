package com.movierental;

import org.junit.Assert;
import org.junit.Test;

public class CustomerTest {
    @Test
    public void test(){
        Movie badla = new Movie("Badla", Movie.REGULAR);
        Movie predator = new Movie("Predator", Movie.NEW_RELEASE);

        Customer c = new Customer("Luke Skywalker");
        c.addRental(new Rental(badla, 3));
        c.addRental(new Rental(predator, 4));

        String output = c.statement();

        Assert.assertEquals("Rental Record for Luke Skywalker\n" +
                "\tBadla\t3.5\n" +
                "\tPredator\t12.0\n" +
                "Amount owed is 15.5\n" +
                "You earned 3 frequent renter points", output);

    }

}
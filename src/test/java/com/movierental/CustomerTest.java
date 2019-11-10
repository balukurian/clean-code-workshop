package com.movierental;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class CustomerTest {

    private Customer c;

    @Before
    public void setup() {

        c = new Customer("Luke Skywalker");
        c.addRental(new Rental(new Movie("Badla", Movie.REGULAR), 3));
        c.addRental(new Rental(new Movie("Predator", Movie.NEW_RELEASE), 4));
    }

    @Test
    public void statementTest(){

        Assert.assertEquals("Rental Record for Luke Skywalker\n" +
                "\tBadla\t3.5\n" +
                "\tPredator\t12.0\n" +
                "Amount owed is 15.5\n" +
                "You earned 3 frequent renter points", c.statement());

    }

    @Test
    public void htmlStatementTest() {

        Assert.assertEquals("<h1>Rental Record for <b>Luke Skywalker</b></h1>" +
                "Badla 3.5<br/>" +
                "Predator 12.0<br/>" +
                "Amount owed is 15.5<br/>" +
                "You earned <b>3</b> frequent renter points", c.htmlStatement());
    }

}
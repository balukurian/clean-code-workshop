package com.movierental;

import java.util.ArrayList;
import java.util.List;

public class Customer {
    private String name;
    private int frequentRentalPoints;
    private List<Rental> rentals = new ArrayList<>();

    public Customer(String name) {
        this.name = name;
        this.frequentRentalPoints = 0;
    }

    public void addRental(Rental arg) {
        rentals.add(arg);
    }

    public String getName() {
        return name;
    }

    public String statement() {
        String result = "Rental Record for " + getName() + "\n";
        for (Rental rental : rentals) {

            //show figures for this rental
            result += "\t" + rental.getMovie().getTitle() + "\t" +
                    String.valueOf(rental.charge()) + "\n";
        }

        //add footer lines result
        result += "Amount owed is " + String.valueOf(totalAmount()) + "\n";
        result += "You earned " + String.valueOf(frequentRenterPoints())
                + " frequent renter points";
        return result;
    }

    public int frequentRenterPoints() {
        int frequentRenterPoints = 0;
        for (Rental rental : rentals) {
            frequentRenterPoints += rental.frequentRenterPoints();
        }
        return frequentRenterPoints;
    }

    public double totalAmount() {
        double totalAmount = 0;
        for (Rental rental : rentals) {
            totalAmount += rental.charge();

        }
        return totalAmount;
    }

}


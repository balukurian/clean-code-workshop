package com.movierental;

public class Customer {
    private String name;
    private int frequentRentalPoints;
    private Rentals rentals;

    public Customer(String name) {
        this.name = name;
        this.rentals = new Rentals();
        this.frequentRentalPoints = 0;
    }

    public void addRental(Rental arg) {
        rentals.add(arg);
    }

    public String getName() {
        return name;
    }

    public String statement() {
        return new TextStatement().display(rentals, name);
    }

    public String htmlStatement() {
        return new HtmlStatement().display(rentals, name);
    }

}


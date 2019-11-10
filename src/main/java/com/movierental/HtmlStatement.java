package com.movierental;

public class HtmlStatement {

    public String display(Rentals rentals, String customerName) {
        String result = "<h1>Rental Record for <b>" + customerName + "</b></h1>";

        for (Rental rental : rentals) {
            //show figures for this rental
            result += rental.getMovie().getTitle() + " " +
                    String.valueOf(rental.charge()) + "<br/>";
        }

        //add footer lines result
        result += "Amount owed is " + String.valueOf(rentals.totalAmount()) + "<br/>";
        result += "You earned <b>" + String.valueOf(rentals.frequentRenterPoints())
                + "</b> frequent renter points";
        return result;

    }
}
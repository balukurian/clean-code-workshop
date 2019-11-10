package com.movierental;

public class TextStatement {

    public String display(Rentals rentals, String customerName) {
        String result = "Rental Record for " + customerName + "\n";
        for (Rental rental : rentals) {

            //show figures for this rental
            result += "\t" + rental.getMovie().getTitle() + "\t" +
                    String.valueOf(rental.charge()) + "\n";
        }

        //add footer lines result
        result += "Amount owed is " + String.valueOf(rentals.totalAmount()) + "\n";
        result += "You earned " + String.valueOf(rentals.frequentRenterPoints())
                + " frequent renter points";
        return result;
    }

}

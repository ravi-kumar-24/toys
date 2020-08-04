package com.healthedge;

import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

/** Assumptions
* ------------
* 1. Variety of toys are pre defined based on given problem.
* 2. Price for toys are defined based on given problem.
* 3. Toys stocks provided by user as input
* 4. Purchased amount provided by user as input
* 5. Extra amount which is left after calculation or not sufficient to purchase a toy will not use
* 6. Unknown Constraints are not handled.
**/

/** Solution
* ---------
* 1. Created a Enum ToyPrice which is used to pre defined toys an their prices.
* 2. Created a Toy class to capture toys details
* 3. Created a main class to handle calculation login
*
* Run the program and enter values for stocks and purchased amount as below
* example.
*
* Please enter Toys availability in shop for A B C D E :: 1 10 5 3 0
* Please enter the purchased amount :: 25
* Maximum purchased quantity/quantities :: 16 **/

public class Main {

    public static void main(String[] args) {
        Set<Toy> toys = new TreeSet<Toy>();
        int purchaseAmount;
        try (Scanner sc = new Scanner(System.in)) {
            Toy toy;
            //User stock input
            System.out.print("Please enter Toys availability in shop for A B C D E :: ");
            for (ToyPrice toyPrice : ToyPrice.values()) {
                int quantities = sc.nextInt();
                if (quantities > 0) {
                    toy = new Toy(toyPrice.getName(), toyPrice.getPrice(), quantities);
                    toys.add(toy);
                }
            }
            System.out.print("Please enter the purchased amount :: ");
            //User purchased input
            purchaseAmount = sc.nextInt();
        }

        int calculatePurchasedQuantities = 0;

        if (purchaseAmount > 0 && !toys.isEmpty()) {
            calculatePurchasedQuantities = calculateQuantities(toys, purchaseAmount);
        }
        System.out.println("Maximum purchased quantity/quantities :: " + calculatePurchasedQuantities);
    }


    private static int calculateQuantities(Set<Toy> toys, int purchaseAmount) {
        int quantities = 0;
        for (Toy t : toys) {
            int toyTypeTotal = t.getPrice() * t.getQuantity(); // total amount for each type of toy
            //if toyTypeTotal is getter that purchased amount, than calculating max how many quantities can purchased
            if (toyTypeTotal > purchaseAmount) {
                quantities = quantities + (int) (Math.floor(purchaseAmount / t.getPrice()));
                break;
            } else {
                quantities = quantities + t.getQuantity(); //if toyTypeTotal is less or equal than purchased amount, than adding all the quantities
            }
            purchaseAmount = purchaseAmount - toyTypeTotal; // subtracting the purchased amount from total amount
        }
        return quantities;
    }
}


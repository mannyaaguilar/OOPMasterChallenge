package com.manny;

public class Main {

    public static void main(String[] args) {
	// Challenge!
        /* The purpose of the application is to help a fictitious company called Bill's Burgers to manage
           their process for selling hamburgers.
           Our application will help Bill select types of burgers, some of the additional items (additions) to
           be added to the burgers and pricing.
           We want to create a base hamburger, but also two other types of hamburgers that are popular in Bill's store.
           The basic hamburger should have the following items:
           bread roll type, meat and up to 4 additional toppings (lettuce, tomato, onion, etc) that the customer
           can select to be added to the burger. Each one of these items gets charged an additional price. So, you need
           some way to track how many items got added and to calculate the price (for the base burgers and all the
           additional toppings).
           This burger has a base price and the additional toppings are all separately priced.
           Create a Hamburger class to deal with all the above.
           The constructor should only include the roll type, meat and price.
           Also, create two extra varieties of Hamburgers (classes) to cater for:
           a) Healthy Burger (on a brown rye bread roll), plus two additional items can be added.
           The Healthy Burger can have a total of 6 items (toppings) in total.
           hint: You probably want to process the 2 additional items in this new class, not the base class,
           since the 2 additional items are only appropriate for this new class (Healthy Burger).
           b) Deluxe Hamburger = Comes with chips and drinks as additions, but no extra additions are allowed.
           hint: You have to find a way to automatically add these new additions at the time the deluxe burger object is
           created, and then prevent other additions from being made(sold as package that can't be modified).
           Al 3 classes should have a method that can be called anytime to show the base price of the hamburger plus all
           additions, each showing the addition name, and additional price, and grand total for the burger.
           For 2 additional classes this may require you to be looking at the base class for pricing and then adding
           totals on to that.
         */

        Hamburger hamburger = new Hamburger("Basic", "Sausage", 3.56, "White");
        double price = hamburger.itemizeHamburger();
        hamburger.addHamburgerAddition1("Tomato", 0.27);
        hamburger.addHamburgerAddition2("Lettuce", 0.75);
        hamburger.addHamburgerAddition3("Cheese", 1.13);
        System.out.println("Total burger price is " + hamburger.itemizeHamburger());

        HealthyBurger healthyBurger = new HealthyBurger("Bacon", 5.67);
        healthyBurger.addHamburgerAddition1("Egg", 5.43);
        healthyBurger.addHealthAddition1("Lentils", 3.41);
        System.out.println("Total Healthy Burger price is " + healthyBurger.itemizeHamburger());

        DeluxeBurger db = new DeluxeBurger();
        db.itemizeHamburger();
        db.addHamburgerAddition3("Should not do this", 50.53);
        db.itemizeHamburger();

    }
}

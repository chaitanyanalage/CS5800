package Assignment4.Q1;

import java.util.ArrayList;
import java.util.List;

class Pizza {
    private String size;
    private String chain; // Add the pizza chain
    private List<String> toppings;

    // Constructor
    public Pizza(String chain) {
        this.chain = chain;
        this.toppings = new ArrayList<>();
    }

    //getters and setters
    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }

    public List<String> getToppings() {
        return toppings;
    }

    //method for adding toppings
    public void addTopping(String topping) {
        toppings.add(topping);
    }

    //eat method
    public void eat() {
        System.out.println(chain + " - Have fun and enjoy your " + size + " pizza with your favorite toppings:");
        for (String topping : toppings) {
            System.out.println("        * " + topping);
        }
        System.out.println("------------------------------------------------------------------------------------------------");
    }
}


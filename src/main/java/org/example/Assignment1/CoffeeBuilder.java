package org.example.Assignment1;

import java.util.ArrayList;
import java.util.List;

public class CoffeeBuilder {
    private String coffeeName; // Holds the name of the coffee
    private List<String> ingredients = new ArrayList<>(); // List to hold ingredients

    // Method to set the coffee name
    public CoffeeBuilder setCoffeeName(String coffeeName) {
        this.coffeeName = coffeeName;
        return this; // Returning 'this' for method chaining
    }

    // Method to add an ingredient to the list
    public CoffeeBuilder addIngredient(String ingredient) {
        ingredients.add(ingredient); // Add the ingredient to the list
        return this; // Returning 'this' for method chaining
    }

    // Method to build the Coffee object
    public Coffee build() {
        String ingredientList = String.join(", ", ingredients); // Join ingredients into a single string
        return new Coffee(coffeeName, ingredientList) { // Create an anonymous Coffee instance
            @Override
            protected void addSpecificSteps() {
                System.out.println("Preparing custom coffee with: " + ingredientList);
            }
        };
    }
}

package org.example.Assignment1;

// Define the CoffeeIngredients interface
public interface CoffeeIngredients {
    String createCoffee();
    String createMilk();
    String createWater();
    String createSyrup();
    String createFoam();
}

// Implementing LatteIngredientsFactory class (without public modifier)
class LatteIngredientsFactory implements CoffeeIngredients {
    @Override
    public String createCoffee() {
        return "Adding coffee";
    }

    @Override
    public String createMilk() {
        return "Adding milk";
    }

    @Override
    public String createWater() {
        return "Adding water"; // Implement this method
    }

    @Override
    public String createSyrup() {
        return "Adding syrup"; // Implement this method
    }

    @Override
    public String createFoam() {
        return "Adding foam";
    }
}

// Implementing EspressoIngredientsFactory class (without public modifier)
class EspressoIngredientsFactory implements CoffeeIngredients {
    @Override
    public String createCoffee() {
        return "Adding coffee";
    }

    @Override
    public String createMilk() {
        return "";
    }

    @Override
    public String createWater() {
        return "Adding water";
    }

    @Override
    public String createSyrup() {
        return ""; // No syrup in espresso
    }

    @Override
    public String createFoam() {
        return ""; // No foam in espresso
    }
}

// Implementing CappuccinoIngredientsFactory class (without public modifier)
class CappuccinoIngredientsFactory implements CoffeeIngredients {
    @Override
    public String createCoffee() {
        return "Adding coffee";
    }

    @Override
    public String createMilk() {
        return "Adding milk";
    }

    @Override
    public String createWater() {
        return ""; // No water in cappuccino
    }

    @Override
    public String createSyrup() {
        return "Adding syrup";
    }

    @Override
    public String createFoam() {
        return ""; // No foam in cappuccino
    }
}

// Implementing ViennaIngredientsFactory class (without public modifier)
class ViennaIngredientsFactory implements CoffeeIngredients {
    @Override
    public String createCoffee() {
        return "Adding coffee";
    }

    @Override
    public String createMilk() {
        return ""; // No milk in vienna
    }

    @Override
    public String createWater() {
        return ""; // No water in vienna
    }

    @Override
    public String createSyrup() {
        return ""; // No syrup in vienna
    }

    @Override
    public String createFoam() {
        return "Adding foam";
    }
}
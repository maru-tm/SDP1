package org.example.Assignment1;

public class CoffeeOrder implements Cloneable {
    private Coffee coffee;

    public CoffeeOrder(Coffee coffee) {
        this.coffee = coffee;
    }

    public Coffee getCoffee() {
        return coffee;
    }

    // Глубокое копирование
    @Override
    public CoffeeOrder clone() throws CloneNotSupportedException {
        CoffeeOrder clonedOrder = (CoffeeOrder) super.clone();
        clonedOrder.coffee = (Coffee) coffee.clone(); // Клонируем объект Coffee
        return clonedOrder;
    }

    @Override
    public String toString() {
        return "Order: " + coffee.getCoffeeName() + " with " + coffee.getIngredient();
    }
}

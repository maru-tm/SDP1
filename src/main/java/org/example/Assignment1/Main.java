package org.example.Assignment1;

public class Main {
    public static void main(String[] args) {
        CoffeeShop coffeeShop = CoffeeShop.getInstance();

        // Используем фабрику для создания кофе
        Coffee latte = Factory.createCoffee("Latte");
        CoffeeOrder order1 = new CoffeeOrder(latte);
        coffeeShop.order(latte);

        // Клонирование заказа
        try {
            CoffeeOrder clonedOrder = order1.clone();
            System.out.println("Клонированный заказ: " + clonedOrder);
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }

        // Используем строителя для создания кастомного кофе
        Coffee customCoffee = new CoffeeBuilder()
                .setCoffeeName("Custom Coffee")
                .addIngredient("Almond Milk")
                .addIngredient("Vanilla Syrup")
                .addIngredient("Chocolate Syrup")
                .build();

        coffeeShop.order(customCoffee);
    }
}

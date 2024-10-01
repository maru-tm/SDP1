package org.example.Assignment1;

public class Factory {
    public static Coffee createCoffee(String type) {
        switch (type.toLowerCase()) {
            case "latte":
                return new Latte();
            case "espresso":
                return new Espresso();
            case "cappuccino":
                return new Cappuccino();
            case "vienna":
                return new Vienna();
            default:
                throw new IllegalArgumentException("Неверный тип кофе: " + type);
        }
    }
}

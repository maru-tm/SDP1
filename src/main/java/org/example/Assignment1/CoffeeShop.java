package org.example.Assignment1;

public class CoffeeShop {
    private static CoffeeShop instance = new CoffeeShop();
    private CoffeeShop(){}
    public static CoffeeShop getInstance(){
        return  instance;
    }

    public void order(Coffee coffee) {
        System.out.println("Заказ принят: " + coffee.getCoffeeName() + " с ингредиентами: " + coffee.getIngredient());
        coffee.prepare();
    }
}

package org.example.Assignment1;

public abstract class Coffee implements Cloneable {
    protected String coffeeName;
    protected String ingredient;

    // Конструктор для инициализации полей
    public Coffee(String coffeeName, String ingredient) {
        this.coffeeName = coffeeName;
        this.ingredient = ingredient;
    }

    // Метод клонирования
    @Override
    public Coffee clone() throws CloneNotSupportedException {
        return (Coffee) super.clone(); // Клонируем объект Coffee
    }

    // Геттер для coffeeName
    public String getCoffeeName() {
        return coffeeName;
    }

    // Геттер для ingredient
    public String getIngredient() {
        return ingredient;
    }

    // Метод для приготовления кофе
    public void prepare() {
        System.out.println("Preparing " + coffeeName + " with " + ingredient);
        addSpecificSteps();
    }

    // Абстрактный метод для специфических шагов
    protected abstract void addSpecificSteps();
}

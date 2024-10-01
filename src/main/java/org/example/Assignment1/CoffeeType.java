package org.example.Assignment1;

class Latte extends Coffee {
    public Latte() {
        super("Latte", "steamed milk + foam");
    }

    @Override
    protected void addSpecificSteps() {
        System.out.println("Steaming the milk and adding foam.");
    }
}

class Espresso extends Coffee {
    public Espresso() {
        super("Espresso", "highly concentrated coffee");
    }

    @Override
    protected void addSpecificSteps() {
        System.out.println("Extracting a shot of espresso.");
    }
}

class Cappuccino extends Coffee {
    public Cappuccino() {
        super("Cappuccino", "steamed milk");
    }

    @Override
    protected void addSpecificSteps() {
        System.out.println("Steaming the milk.");
    }
}

class Vienna extends Coffee {
    public Vienna() {
        super("Vienna", "whipped cream");
    }

    @Override
    protected void addSpecificSteps() {
        System.out.println("Adding whipped cream.");
    }
}

interface Pizza {
    String getDescription();
    double getCost();
}

class PlainPizza implements Pizza {
    public String getDescription() {
        return "Plain Dough & Sauce";
    }

    public double getCost() {
        return 5.0;
    }
}

abstract class PizzaDecorator implements Pizza {
    protected Pizza pizza;

    public PizzaDecorator(Pizza pizza) {
        this.pizza = pizza;
    }

    public String getDescription() {
        return pizza.getDescription();
    }

    public double getCost() {
        return pizza.getCost();
    }
}

class Cheese extends PizzaDecorator {
    public Cheese(Pizza pizza) { super(pizza); }

    public String getDescription() { return pizza.getDescription() + ", Cheese"; }
    public double getCost() { return pizza.getCost() + 2.0; }
}

class Olives extends PizzaDecorator {
    public Olives(Pizza pizza) { super(pizza); }

    public String getDescription() { return pizza.getDescription() + ", Olives"; }
    public double getCost() { return pizza.getCost() + 1.0; }
}

class Pineapple extends PizzaDecorator {
    public Pineapple(Pizza pizza) { super(pizza); }

    public String getDescription() { return pizza.getDescription() + ", Pineapple"; }
    public double getCost() { return pizza.getCost() + 1.5; }
}

public class Main {
    public static void main(String[] args) {
        Pizza myPizza = new Pineapple(new Olives(new Cheese(new PlainPizza())));

        System.out.println("Description: " + myPizza.getDescription());
        System.out.println("Total Cost: $" + myPizza.getCost());
    }
}
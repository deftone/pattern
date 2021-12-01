package main.factory_presentation.version1;

import main.factory_presentation.version1.model.Pizza;

public class PizzaStore_2 {
    SimplePizzaFactory factory;

    public PizzaStore_2(SimplePizzaFactory factory) {
        this.factory = factory;
    }

    public Pizza orderPizza(String type) {
        Pizza pizza;

        pizza = factory.createPizza(type);

        pizza.prepare();
        pizza.bake();
        pizza.cut();
        pizza.box();

        return pizza;
    }

}

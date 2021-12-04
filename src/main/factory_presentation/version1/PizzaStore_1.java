package main.factory_presentation.version1;

import main.factory_presentation.version1.pizza.CheesePizza;
import main.factory_presentation.version1.pizza.PepperoniPizza;
import main.factory_presentation.version1.pizza.Pizza;
import main.factory_presentation.version1.pizza.VeggiePizza;

public class PizzaStore_1 {


    public Pizza orderPizza(String type) {
        Pizza pizza = null;

        if (type.equals("cheese")) {
            pizza = new CheesePizza();
        } else if (type.equals("pepperoni")) {
            pizza = new PepperoniPizza();
        } else if (type.equals("veggie")) {
            pizza = new VeggiePizza();
        }

        if (pizza != null) {
            pizza.prepare();
            pizza.bake();
            pizza.cut();
            pizza.box();
        }

        return pizza;
    }

}

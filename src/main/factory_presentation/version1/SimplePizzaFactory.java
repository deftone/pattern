package main.factory_presentation.version1;

import main.factory_presentation.version1.pizza.CheesePizza;
import main.factory_presentation.version1.pizza.PepperoniPizza;
import main.factory_presentation.version1.pizza.Pizza;
import main.factory_presentation.version1.pizza.VeggiePizza;

//Achtung: das hier ist kein Entwurfsmuster, sondern nur ein Programmieridiom (wird oft verwechselt)
// pizzaStore_2 ist der Client dieser Fabrik, dort kein "new" mehr
public class SimplePizzaFactory {

    // oft macht man diese methode statisch um keine Objekt der Fabrik instanziert werden muss
    public Pizza createPizza(String type) {
        // Pizza ist das Produkt der Fabrik
        Pizza pizza = null;

        // das Veraenderliche aus dem Code rausholen und an einer einzigen Stelle pflegen
        if (type.equals("cheese")) {
            pizza = new CheesePizza();
        } else if (type.equals("pepperoni")) {
            pizza = new PepperoniPizza();
        } else if (type.equals("veggie")) {
            pizza = new VeggiePizza();
        }
        return pizza;
    }
}

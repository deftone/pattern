package main.factory_presentation.version2.hersteller;

import main.factory_presentation.version2.produkte.ChicagoStyleCheesePizza;
import main.factory_presentation.version2.produkte.ChicagoStylePepperoniPizza;
import main.factory_presentation.version2.produkte.ChicagoStyleVeggiePizza;
import main.factory_presentation.version2.produkte.Pizza;

// die unterklasse muss die abstrakte methode implementieren und erzeugt das Pizza objekt, hier im chicago style
public class ChicagoPizzaStore extends PizzaStore {

	Pizza createPizza(String item) {
        	if (item.equals("cheese")) {
            		return new ChicagoStyleCheesePizza();
        	} else if (item.equals("veggie")) {
        	    	return new ChicagoStyleVeggiePizza();
        	} else if (item.equals("pepperoni")) {
            		return new ChicagoStylePepperoniPizza();
        	} else return null;
	}
}

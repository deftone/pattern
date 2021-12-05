package main.factory_presentation.version2.hersteller;

import main.factory_presentation.version2.produkt.NYStyleCheesePizza;
import main.factory_presentation.version2.produkt.NYStylePepperoniPizza;
import main.factory_presentation.version2.produkt.NYStyleVeggiePizza;
import main.factory_presentation.version2.produkt.Pizza;

// die unterklasse muss die abstrakte methode implementieren und erzeugt das Pizza objekt, hier im NY style
public class NYPizzaStore extends PizzaStore {

	Pizza createPizza(String item) {
		if (item.equals("cheese")) {
			return new NYStyleCheesePizza();
		} else if (item.equals("veggie")) {
			return new NYStyleVeggiePizza();
		} else if (item.equals("pepperoni")) {
			return new NYStylePepperoniPizza();
		} else return null;
	}
}

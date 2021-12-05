package main.factory_presentation.version3.hersteller_client;

import main.factory_presentation.version3.produkt.CheesePizza;
import main.factory_presentation.version3.produkt.Pizza;
import main.factory_presentation.version3.produkt.VeggiePizza;
import main.factory_presentation.version3.zutaten_abstract_factory.fabriken.NYPizzaIngredientFactory;
import main.factory_presentation.version3.zutaten_abstract_factory.fabriken.PizzaIngredientFactory;

// die konkreten Pizzarien sind die Clients der abstrakten Fabrik
// hier nur ein konkreter PizzaStore wegen Uebersichtlichkeit
public class NYPizzaStore extends PizzaStore {
 
	protected Pizza createPizza(String item) {
		Pizza pizza = null;
		PizzaIngredientFactory ingredientFactory =
			new NYPizzaIngredientFactory();
 
		if (item.equals("cheese")) {
  
			pizza = new CheesePizza(ingredientFactory);
			pizza.setName("New York Style Cheese Pizza");
  
		} else if (item.equals("veggie")) {
 
			pizza = new VeggiePizza(ingredientFactory);
			pizza.setName("New York Style Veggie Pizza");
 
		}
		return pizza;
	}
}

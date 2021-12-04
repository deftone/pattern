package main.factory_presentation.version3.hersteller;

import main.factory_presentation.version3.produkte.CheesePizza;
import main.factory_presentation.version3.produkte.Pizza;
import main.factory_presentation.version3.produkte.VeggiePizza;
import main.factory_presentation.version3.zutaten.NYPizzaIngredientFactory;
import main.factory_presentation.version3.zutaten.PizzaIngredientFactory;

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

package main.factory_presentation.version3;

import main.factory_presentation.version3.hersteller.NYPizzaStore;
import main.factory_presentation.version3.hersteller.PizzaStore;
import main.factory_presentation.version3.produkte.Pizza;

public class PizzaTestDrive {
 
	public static void main(String[] args) {
		PizzaStore nyStore = new NYPizzaStore();

		Pizza pizza = nyStore.orderPizza("cheese");
		System.out.println("Michael ordered a " + pizza + "\n");

		pizza = nyStore.orderPizza("veggie");
		System.out.println("Jean Luc ordered a " + pizza + "\n");
 
	}
}

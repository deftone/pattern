package main.factory_presentation.version3;

import main.factory_presentation.version3.hersteller_client.NYPizzaStore;
import main.factory_presentation.version3.hersteller_client.PizzaStore;
import main.factory_presentation.version3.produkt.Pizza;

public class PizzaTestDrive {
 
	public static void main(String[] args) {
		PizzaStore nyStore = new NYPizzaStore();

		Pizza pizza = nyStore.orderPizza("cheese");
		System.out.println("Michael ordered a " + pizza + "\n");

		pizza = nyStore.orderPizza("veggie");
		System.out.println("Jean Luc ordered a " + pizza + "\n");
 
	}
}

package main.factory_presentation.version2.hersteller_klassen;

import main.factory_presentation.version2.model_produkt_klassen.Pizza;

public class PizzaTestDrive {

    public static void main(String[] args) {
        System.out.println("\nTestlauf 3 mit Fabrikmuster \n");

        PizzaStore nyStore = new NYPizzaStore();
        PizzaStore chicagoStore = new ChicagoPizzaStore();

        Pizza pizza = nyStore.orderPizza("cheese");
        System.out.println("Felix ordered a " + pizza.getName() + "\n");

        pizza = chicagoStore.orderPizza("cheese");
        System.out.println("Lutz ordered a " + pizza.getName() + "\n");

        pizza = nyStore.orderPizza("pepperoni");
        System.out.println("Martin ordered a " + pizza.getName() + "\n");

        pizza = chicagoStore.orderPizza("pepperoni");
        System.out.println("Mario ordered a " + pizza.getName() + "\n");

        pizza = chicagoStore.orderPizza("veggie");
        System.out.println("Manuel ordered a " + pizza.getName() + "\n");

        pizza = nyStore.orderPizza("veggie");
        System.out.println("Katrin ordered a " + pizza.getName() + "\n");
    }
}

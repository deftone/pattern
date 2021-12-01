package main.factory.factory_method.hersteller_klassen;

import main.factory.factory_method.produkt_klassen.Pizza;
import main.factory.factory_method.produkt_klassen.SalamiPizza;
import main.factory.factory_method.produkt_klassen.VeggiPizza;
import main.factory.abstrac_factory.zutaten_klassen.hersteller_klassen.AachenerZutatenFabrik;
import main.factory.abstrac_factory.zutaten_klassen.hersteller_klassen.PizzaZutatenFabrik;

public class AachenPizzaria extends Pizzaria {

    @Override
    Pizza erstellePizza(String pizzaSorte) {

        PizzaZutatenFabrik pizzaZutatenFabrik = new AachenerZutatenFabrik();
        Pizza pizza;

        switch (pizzaSorte) {
            case "salami":
                pizza = new SalamiPizza(pizzaZutatenFabrik);
                pizza.name = "oecher Salami";
                return pizza;
            case "veggi":
                pizza = new VeggiPizza(pizzaZutatenFabrik);
                pizza.name = "oecher veggi";
                return pizza;
            default:
                throw new IllegalArgumentException("den Typ '" + pizzaSorte + "' gibt es nicht!");
        }
    }

}

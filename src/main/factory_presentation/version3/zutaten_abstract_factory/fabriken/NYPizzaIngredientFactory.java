package main.factory_presentation.version3.zutaten_abstract_factory.fabriken;

import main.factory_presentation.version3.zutaten_abstract_factory.produkt_familie.*;

// die konkrteten Fabriken (hier nur eine, der uebersichtlichkeit halber)
// stellen die jeweils richtigen zutaten (Produkte) fuer ihre Region her (NY, Chicago, Koeln, Berlin...)
public class NYPizzaIngredientFactory implements PizzaIngredientFactory {

    public Dough createDough() {
        return new ThickCrustDough();
    }

    public Sauce createSauce() {
        return new MarinaraSauce();
    }

    public Cheese createCheese() {
        return new MozzarellaCheese();
    }

    public Veggies[] createVeggies() {
        return new Veggies[] {new Onion(), new RedPepper()};
    }

}

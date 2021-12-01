package main.factory.factory_method.produkt_klassen;

import main.factory.abstrac_factory.zutaten_klassen.hersteller_klassen.PizzaZutatenFabrik;

public class VeggiPizza extends Pizza {

    PizzaZutatenFabrik zutatenFabrik;

    public VeggiPizza(PizzaZutatenFabrik zutatenFabrik){
        this.zutatenFabrik = zutatenFabrik;
    }

    @Override
    public void vorbereiten() {
        teig = zutatenFabrik.erstelleTeig();
        kaese = zutatenFabrik.erstelleKaese();
        gemuese = zutatenFabrik.erstelleGemuese();
        isVorbereitet = name + " vorbereiten";
    }
}

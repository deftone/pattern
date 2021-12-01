package main.factory.abstrac_factory.zutaten_klassen.hersteller_klassen;

import main.factory.abstrac_factory.zutaten_klassen.produkt_klassen.*;

public class AachenerZutatenFabrik implements PizzaZutatenFabrik {

    @Override
    public Teig erstelleTeig() {
        return new TeigMitDuennerKruste();
    }

    @Override
    public Salami erstelleSalami() {
        return new SalamiMitPrintenGeschmack();
    }

    @Override
    public Kaese erstelleKaese() {
        return new NLGouda();
    }

    @Override
    public Gemuese erstelleGemuese() {
        return new Tomate();
    }

}

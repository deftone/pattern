package main.factory.abstrac_factory.zutaten_klassen.hersteller_klassen;

import main.factory.abstrac_factory.zutaten_klassen.produkt_klassen.*;

// von der abstrakten fabrik werden fabriken abgeleitet, welche die produkte produzieren
// mit jeweils versch. Implementierungen, d.h.
// die regionalen zutaten fabriken kuemmern sich um die zutaten
// die regional verschieden sind
public class KoelnerZutatenFabrik implements PizzaZutatenFabrik{

    @Override
    public Teig erstelleTeig() {
        return new TeigMitDickerKruste();
    }

    @Override
    public Salami erstelleSalami() {
        return new SalamieMitKoelschGeschmack();
    }

    @Override
    public Kaese erstelleKaese() {
        return new BioGouda();
    }

    @Override
    public Gemuese erstelleGemuese() {
        return new Paprika();
    }

}

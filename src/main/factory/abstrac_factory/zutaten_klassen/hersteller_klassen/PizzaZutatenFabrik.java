package main.factory.abstrac_factory.zutaten_klassen.hersteller_klassen;

import main.factory.abstrac_factory.zutaten_klassen.produkt_klassen.Gemuese;
import main.factory.abstrac_factory.zutaten_klassen.produkt_klassen.Kaese;
import main.factory.abstrac_factory.zutaten_klassen.produkt_klassen.Salami;
import main.factory.abstrac_factory.zutaten_klassen.produkt_klassen.Teig;

//eine abstrakte fabrik bietet eine schnittstelle fuer eine familie von produkten
//hier: Teig, Salamie, Kaese und Gemuese, also Dinge, die wir fuer eine pizza brauchen
public interface PizzaZutatenFabrik {
    Teig erstelleTeig();
    Salami erstelleSalami();
    Kaese erstelleKaese();
    Gemuese erstelleGemuese();

    //Nachteil: wenn neue Produkte hinzugefuegt werden (Tunfisch), dann aendert sich diese
    //schnittstelle und alle Klassen, die sie implementieren muessen angepasst werden

    //dafuer wird eine ganze familie von produkten gruppiert

    //bei factory method gibt es nur eine produkt und daher nur die eine fabrik methode
}

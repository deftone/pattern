package main.observer;

public class AktuelleAnzeige implements Beobachter, AnzeigeElement {

    private float temp;
    private int druck;
    //wir speichern es hier, weil wir vielleicht spaeter mal die beobachtung beenden wollen,
    //dann brauchen wir das objekt wetterdaten!
    private Verteiler wetterdaten;

    public AktuelleAnzeige(WetterDaten wetterDaten) {
        this.wetterdaten = wetterDaten;
        wetterDaten.registriereBeobachter(this);
    }

    @Override
    public String aktualisieren(float temp, int druck) {
        this.temp = temp;
        this.druck = druck;
        return anzeigen();
    }

    @Override
    public String anzeigen() {
        return "Temp: " + temp + ", Druck: " + druck;
    }
}

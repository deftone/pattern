package main.observer;

import java.util.ArrayList;
import java.util.List;

public class StatistischeAnzeige implements Beobachter, AnzeigeElement {

    private List<Float> temps = new ArrayList<>();
    private List<Integer> druecke = new ArrayList<>();
    private float tempAvg;
    private int druckAvg;

    public StatistischeAnzeige(WetterDaten wetterDaten) {
        wetterDaten.registriereBeobachter(this);
    }

    @Override
    public String aktualisieren(float temp, int druck) {
        temps.add(temp);
        druecke.add(druck);
        var sumT = 0f;
        for (float t : temps) {
            sumT += t;
        }
        tempAvg = sumT/temps.size();

        var sumP = 0;
        for (int p : druecke) {
            sumP += p;
        }
        druckAvg = sumP/druecke.size();

        return anzeigen();


    }

    @Override
    public String anzeigen() {
        return "Temp: " + tempAvg + ", Druck: " + druckAvg;
    }
}

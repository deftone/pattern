package main.observer;


import java.util.ArrayList;
import java.util.List;

public class WetterDaten implements Verteiler {

    private float temp;
    private int druck;
    private final List<Beobachter> beobachter = new ArrayList<>();

    @Override
    public void registriereBeobachter(Beobachter beobachter) {
        this.beobachter.add(beobachter);
    }

    @Override
    public String benachrichtigeBeobachter() {
        StringBuilder result = new StringBuilder();
        for (Beobachter b : beobachter) {
            result.append(b.aktualisieren(temp, druck));
        }
        return result.toString();
    }

    public String messwerteGeandert() {
        return benachrichtigeBeobachter();
    }

    //wenn wir neue Messwerte bekommen werden die beobachter benachrichtigt
    public String setMesswerte(float temp, int druck) {
        this.temp = temp;
        this.druck = druck;
        return messwerteGeandert();
    }

}

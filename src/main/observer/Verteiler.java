package main.observer;

//die ober"klasse" fuer die Wetterdaten, welche die beobachter benachrichtigt
// warum brauchen wir die eigentlich?
// falls wir mehrere verteiler haben? wetterdaten, fitnessdaten, politische daten usw?
public interface Verteiler {
    //es fehlt entfernen (wenn ein beobachter nicht mehr beobachten moechte)

    void registriereBeobachter(Beobachter beobachter);

    String benachrichtigeBeobachter();
}

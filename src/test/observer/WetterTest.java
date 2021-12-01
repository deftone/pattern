package test.observer;

import main.observer.AktuelleAnzeige;
import main.observer.StatistischeAnzeige;
import main.observer.WetterDaten;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class WetterTest {

    @Test
    void testAktuelleAnzeige() {
        WetterDaten wetterDaten = new WetterDaten();
        new AktuelleAnzeige(wetterDaten);

        assertEquals("Temp: 30.5, Druck: 780",  wetterDaten.setMesswerte(30.5f, 780));
        assertEquals("Temp: 31.5, Druck: 770",  wetterDaten.setMesswerte(31.5f, 770));
        assertEquals("Temp: 32.5, Druck: 760",  wetterDaten.setMesswerte(32.5f, 760));
    }

    @Test
    void testStatistischeAnzeige(){
        WetterDaten wetterDaten = new WetterDaten();
        new StatistischeAnzeige(wetterDaten);
        assertEquals("Temp: 30.0, Druck: 780",  wetterDaten.setMesswerte(30f, 780));
        assertEquals("Temp: 30.5, Druck: 790",  wetterDaten.setMesswerte(31f, 800));

    }


}

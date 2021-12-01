package test.strategy;

import main.strategy.Ente;
import main.strategy.QuitschEnte;
import main.strategy.StandardEnte;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class EnteTest {

    @Test
    void testStandardEnte(){
        // auf der schnittstelle programmieren (superklasse = new konkrete klasse)
        Ente testEnte = new StandardEnte();
        assertEquals("quak", testEnte.quak());
        assertEquals("schnabel", testEnte.getNase());

        // auf der konkreten implementierung programmieren (beides mal konkrete klasse)
        StandardEnte standardEnte = new StandardEnte();
        assertEquals("quak", standardEnte.quak());
        assertEquals("schnabel", standardEnte.getNase());
    }

    @Test
    void testQuitschEnde(){
        Ente testEnte = new QuitschEnte();
        assertEquals("quitsch", testEnte.quak());
        assertEquals("schnabel", testEnte.getNase());
    }

}

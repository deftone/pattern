package test.decorator;

import main.decorator.*;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class GetraenkeTest {

    @Test
    void testKaffe() {
        Getraenk kaffe = new Kaffee();
        kaffe = new Milchschaum(kaffe);
        kaffe = new Milchschaum(kaffe);
        kaffe = new Schoko(kaffe);

        Assertions.assertEquals("Kaffee, Milchschaum, Milchschaum, Schoko", kaffe.getBeschreibung());
        Assertions.assertEquals(2.99 + .5 + .5 + .30, kaffe.getPreis());
    }

    @Test
    void testKakao() {
        Getraenk kakao = new Kakao();

        Assertions.assertEquals("Kakao", kakao.getBeschreibung());
        Assertions.assertEquals(1.99, kakao.getPreis());
    }
}

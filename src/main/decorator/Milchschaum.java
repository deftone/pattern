package main.decorator;

public class Milchschaum extends ZutatenDekorierer {

    private Getraenk getraenk;

    public Milchschaum(Getraenk getraenk){
        // das getraenk, welches eingepackt (dekoriert) werden soll
        this.getraenk = getraenk;
    }

    @Override
    public String getBeschreibung() {
        return getraenk.getBeschreibung() + ", Milchschaum";
    }

    @Override
    public double getPreis() {
        return getraenk.getPreis() + 0.50;
    }
}

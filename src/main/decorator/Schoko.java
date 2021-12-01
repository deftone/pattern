package main.decorator;

public class Schoko extends ZutatenDekorierer {

    private Getraenk getraenk;

    public Schoko(Getraenk getraenk){
        // das getraenk, welches eingepackt (dekoriert) werden soll
        this.getraenk = getraenk;
    }

    @Override
    public String getBeschreibung() {
        return getraenk.getBeschreibung() + ", Schoko";
    }

    @Override
    public double getPreis() {
        return getraenk.getPreis() + 0.30;
    }
}

package at.ac.fh_kufstein.uebung;

public class Mensch extends Saeugetiere {


    public Mensch(String name, int alter, String geschlecht) {
        super(name, alter, geschlecht);
    }

    @Override
    public String prntAll() {
        return String.format(getName()+"#"+getAlter()+"#"+getGeschlecht());
    }
}

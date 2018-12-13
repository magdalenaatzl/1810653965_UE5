package at.ac.fh_kufstein.Aufgabe1;

public class Mensch extends Saeugetiere {


    public Mensch(String name, int alter, String geschlecht) {
        super(name, alter, geschlecht);
    }

    @Override
    public String printAll() {
        return String.format("%s#%d#%s",getName(), getAlter(), getGeschlecht());
        /*Platzhalter:
        %s für String
        %d für int

         */
    }
}

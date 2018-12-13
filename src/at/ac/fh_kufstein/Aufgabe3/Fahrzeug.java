package at.ac.fh_kufstein.Aufgabe3;

public class Fahrzeug {
    private short reifen;
    private String farbe;
    private short ps;
    private short tueren;
    private boolean gestartet;
    private short geschwindigkeit;
    public static int anzahl;

    //Konstruktor

    public Fahrzeug(short reifen, String farbe, short ps, short tueren) {
        this.reifen = reifen;
        this.farbe = farbe;
        this.ps = ps;
        this.tueren = tueren;
        this.gestartet = false;
        this.geschwindigkeit = 0;
        this.anzahl=+1;
    }

    //Methoden

    public void starten (){
        if (getGestartet()==false){
            setGestartet(true);}
        else {System.err.println("Auto ist bereits gestartet");}
    }

    public void stoppen () {
        if (getGestartet()==true){
            setGestartet(false);}
        else {System.err.println("Auto steht bereits");}
    }

    public void beschleunigen (short speed){
        if (getGestartet()==true && getGeschwindigkeit() <= 250){
            setGeschwindigkeit((short) (getGeschwindigkeit()+speed));}
        else {System.err.println("Fehler");}
    }
    public void bremsen(short speed){
        if (getGestartet()==true && getGeschwindigkeit() >0){
            setGeschwindigkeit((short) (getGeschwindigkeit()-speed));
        }
    }

    //Getter und Setter

    public short getReifen() {
        return reifen;
    }

    public void setReifen(short reifen) {
        this.reifen = reifen;
    }

    public String getFarbe() {
        return farbe;
    }

    public void setFarbe(String farbe) {
        this.farbe = farbe;
    }

    public short getPs() {
        return ps;
    }

    public void setPs(short ps) {
        this.ps = ps;
    }

    public short getTueren() {
        return tueren;
    }

    public void setTueren(short tueren) {
        this.tueren = tueren;
    }

    public boolean getGestartet() {
        return gestartet;
    }

    public void setGestartet(boolean gestartet) {
        this.gestartet = gestartet;
    }

    public short getGeschwindigkeit() {
        return geschwindigkeit;
    }

    public void setGeschwindigkeit(short geschwindigkeit) {
        this.geschwindigkeit = geschwindigkeit;
    }

    public static int getAnzahl() {
        return anzahl;
    }

    public static void setAnzahl(int anzahl) {
        Fahrzeug.anzahl = anzahl;
    }
}

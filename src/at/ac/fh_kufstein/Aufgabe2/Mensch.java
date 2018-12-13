package at.ac.fh_kufstein.Aufgabe2;

public class Mensch {
    //Attribute
    private String vorname;
    private String nachname;
    private int alter;

    //Konstruktor

    public Mensch (String vorname, String nachname, int alter){
        this.vorname=vorname;
        this.nachname=nachname;
        this.alter=alter;
    }
    //Methode
    public void Status(){
        System.out.println(getVorname()+" "+getNachname()+" ist ein Mensch und ist "+getAlter()+" Jahre alt");
    }
    //Getter und Setter
    public String getVorname() {
        return vorname;
    }

    public void setVorname(String vorname) {
        this.vorname = vorname;
    }

    public String getNachname() {
        return nachname;
    }

    public void setNachname(String nachname) {
        this.nachname = nachname;
    }

    public int getAlter() {
        return alter;
    }

    public void setAlter(int alter) {
        this.alter = alter;
    }
}

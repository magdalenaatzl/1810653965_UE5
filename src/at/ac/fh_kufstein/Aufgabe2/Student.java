package at.ac.fh_kufstein.Aufgabe2;

public class Student extends Mensch {
    //Attribute
    private int martrikelnummer;
    private String studienggang;
    //Konstruktor
    public Student(String vorname, String nachname, int alter, int martrikelnummer, String studienggang) {
        super(vorname, nachname, alter);
        this.martrikelnummer=martrikelnummer;
        this.studienggang=studienggang;
    }
    @Override
    public void Status(){
        System.out.println(getVorname()+" "+getNachname()+" ist ein Student und ist "+getAlter()+" Jahre alt und studiert "
                +getStudienggang() + ". Die Martrikelnummer lautet: "+getMartrikelnummer());
    }

    public int getMartrikelnummer() {
        return martrikelnummer;
    }

    public void setMartrikelnummer(int martrikelnummer) {
        this.martrikelnummer = martrikelnummer;
    }

    public String getStudienggang() {
        return studienggang;
    }

    public void setStudienggang(String studienggang) {
        this.studienggang = studienggang;
    }
}

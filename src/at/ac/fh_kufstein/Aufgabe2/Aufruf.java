package at.ac.fh_kufstein.Aufgabe2;

public class Aufruf {
    public static void main(String[] args) {
        Mensch a = new Mensch ("Magdalena", "Atzl", 21);
        a.Status();
        Student b = new Student("Magdalena", "Atzl", 21, 1810653965, "WB&T");
        b.Status();
    }
}

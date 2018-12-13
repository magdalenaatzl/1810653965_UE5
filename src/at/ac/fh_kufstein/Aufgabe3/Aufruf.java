package at.ac.fh_kufstein.Aufgabe3;


import java.util.*;

public class Aufruf {

    public static void main(String[] args) {

        Auto bmw = new Auto ((short)4, "silber", (short)220, (short)5, (short)4);
        Auto audi = new Auto ((short)4, "schwarz", (short)180, (short)5, (short)8);
        Auto audi2 = new  Auto ((short)4, "rot", (short)150, (short)3, (short)4);
        Auto audi3 = new Auto ((short)4, "weiß", (short)200, (short)5, (short)8);
        Auto audi4 = new Auto ((short)4, "grau", (short)160, (short)5, (short)4);

        List<Auto> liste = new LinkedList<>();
        liste.add(audi);
        liste.add(bmw);
        liste.add(audi2);
        liste.add(audi3);
        liste.add(audi4);
        Collections.sort(liste);

        for (Auto item : liste){
            System.out.println(item);
        }




    }
}

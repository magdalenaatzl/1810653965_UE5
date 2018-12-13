package at.ac.fh_kufstein.Aufgabe4;

import javax.swing.*;

public class Main {
    public static void main(String[] args) {


        String a = JOptionPane.showInputDialog("gib etwas ein");
        String b = JOptionPane.showInputDialog("gib etwas ein");
        String c = JOptionPane.showInputDialog("gib etwas ein");

        //mit .equals vergleicht man Strings (auf keinen Fall ==)

        if (a.equals(b)){
            System.out.println("mindestens zwei der Werte sind gleich");
        }
        else if (a.equals(c)){
            System.out.println("mindestens zwei der Werte sind gleich");
        }
        else if (b.equals(c)){
            System.out.println("mindestens zwei der Werte sind gleich");
        }
        else{
            System.out.println("es wurden keine gleichen Werte eingegeben");
        }


    }
}

import javax.swing.*;

public class Aufgabe2
{
    public static void main (String[]args)
    {
        while(true) // weil er solange einlesen soll, bis eine Zahl herauskommt
        {

            try // soll eine Zahl versuchen, wenn man Zahl eingibt ok, sonst geht er ins catch und gibt aus dass keine Zahl eingegeben wurde
            {

                int zahl1 = Integer.parseInt(JOptionPane.showInputDialog("Bitte geben Sie einen Wert ein!")); // Zahl erstellen, Nutzer soll einlesen

                System.out.println("Die Zahl ist: " + zahl1); // gibt die Zahl aus

                break; // weil es nachdem man eine Zahl eingegeben hat stoppen soll

            }


            catch(NumberFormatException ex) // NumberFormat - versucht string in numerischen Tyo umzuwandeln, string hat nicht entsprechendes Format, man kann mehrere catch haben, geht durch
            {
                JOptionPane.showMessageDialog(null, "Sie haben einen String eingegeben!");

                // damit es ganz oben ist null bei showMessageDialig, Ausgabe wenn keine Zahl eingegeben wurde
            }

        }
    }
}

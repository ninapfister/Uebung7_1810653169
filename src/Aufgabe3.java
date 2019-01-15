import javax.swing.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Aufgabe3
{
    public static void main (String[]args)
    {
        try // soll prüfen ob ein String Email ist
        {

            String email = JOptionPane.showInputDialog("Bitte geben Sie Ihre E-Mail Adresse ein!"); // zuerst String anlegen, Nutzer liest ein

            checkEmail(email); // Methode, die prüft ob ein String eine Email Adresse ist

            JOptionPane.showMessageDialog(null, "Ihre E-Mail Adresse lautet: " + email); // gibt die Email Adresse aus

        }

        catch(Exception ex) // wenn ein falsches Format eingegeben wird
        {
            JOptionPane.showMessageDialog(null, "Sie haben keine gültige E-Mail Adresse eingegeben!"); // wird das ausgegeben
        }

    }

    public static void checkEmail(String email) throws Exception  // Methode checkEmail, throws Konstrukt Exceptions an aufrufende Methode weitergeleitet, singnalisiert ein Methode die nicht lokal abfängt, sondern Fehlerbehandlung Aufrufer überlasst
    {

        Pattern pattern = Pattern.compile("[\\w|-]+@\\w[\\w|-]*\\.[a-z]{2,3}"); // Pattern/Matcher Konstrukt, wenn hinten mehr als 2 Zeichen geht es nicht
        Matcher m = pattern.matcher(email);

        if (m.find()) //  wenn Methode m.find, mit neuer Exception ausgeben
        {
            throw new Exception(); // ausgeben, throws Konstrukt Exception
        }

    }
}

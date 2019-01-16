import java.io.FileNotFoundException;
import java.io.FileReader;

public class Aufgabe5
{
    public static void main (String[]args) throws FileNotFoundException // nicht vollständig
    {
        // Unterschied checked und unchecked Exception
        // bei checked Exceptions überprüft der Compiler, ob diese entsprechend behandelt werden
        // unchecked Exceptions sind dem Java Compiler egal


        // checked Beispiel
       // Treten schon während der Kompilierung auf und werden rot markiert, FileNotFoundException

        FileReader file = new FileReader("test");

        // unchecked Beispiel
        //Treten während der Laufzeit auf, ArrayIndexOutOfBoundsException

        int[] arr = {1, 2, 3, 4, 5};

        System.out.println(arr[10]);
    }
}

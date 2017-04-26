package Clases;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.NoSuchElementException;
import java.util.Scanner;

/**
 *
 * @author diego pinto Descripcion: Fecha:18-04-17
 */
public class LecturaArchivo {

    private Scanner entrada2;

    // permite al usuario abrir el archivo
    public void abrirArchivo() {
        try {
            entrada2 = new Scanner(new File("Factura.txt"));
        } // fin de try
        catch (FileNotFoundException fileNotFoundException) {
            System.err.println("Error al abrir el archivo.");
            System.exit(1);
        } // fin de catch
    } // fin del método abrirArchivo

    // lee registro del archivo
    public boolean leerInformacion() {
        boolean bolValidar = false;
        String strNickname;
        try // lee registros del archivo, usando el objeto Scanner
        {
            while (entrada2.hasNext()) {
                String linea = entrada2.nextLine();
                ArrayList<String> linea_partes = new ArrayList<String>(Arrays.asList(linea.split(";")));
                
            } // fin de while

        } // fin de try
        catch (NoSuchElementException elementException) {
            System.err.println("El archivo no esta bien formado.");
            entrada2.close();
            System.exit(1);
        } // fin de catch
        catch (IllegalStateException stateException) {
            System.err.println("Error al leer del archivo.");
            System.exit(1);
        } // fin de catch
        return bolValidar;
    }// fin try

    public void cerrarArchivo() {
        if (entrada2 != null) {
            entrada2.close(); // cierra el archivo
        }
    } // fin del metodo cerrarArchivo
} // fin de la clase LeerArchivoTexto

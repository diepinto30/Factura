package Clases;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.FileNotFoundException;

/**
 *
 * @author diego pinto Descripcion: Fecha:25-04-17
 */
public class CrearArchivo {

    public void agregarRegistro(String cadena) throws IOException {
        try {
            FileWriter fichero = new FileWriter("Factura.txt", true);
            BufferedWriter buffer = new BufferedWriter(fichero);

            fichero.write(cadena);
            buffer.newLine();
            fichero.write("\n");
            fichero.close();

        } // fin de try
        catch (FileNotFoundException filesNotFoundException) {
            System.err.println("Error al crear el archivo.");
            System.exit(1);
        } // fin de catch
    }

}

/*
    private Formatter salida; // objeto usado para enviar texto al archivo

    public void abrir_archivo() {
        try {
            salida = new Formatter("factura.txt");
        } // fin de try
        catch (FileNotFoundException filesNotFoundException) {
            System.err.println("Error al crear el archivo.");
            System.exit(1);
        } // fin de catch
    } // fin del método abrir_archivo

    // agrega registros al archivo
    public void agregarinformacion(String cadena) {
        // el archivo permite el ingreso
        // de edad, nombre, apellido de una persona

        Scanner entrada = new Scanner(System.in);
        boolean bandera = true;

        while (bandera) // itera hasta que bandera sea false
        {
            try // envía valores al archivo
            {
                // obtiene los datos que se van a enviar


                // escribe el nuevo registro (escribe en el archivo
                salida.format(cadena);


            } // fin de try
            catch (FormatterClosedException formatterClosedException) {
                System.err.println("Error al escribir en el archivo.");
                return;
            } // fin de catch
            catch (NoSuchElementException elementException) {
                System.err.println("Entrada invalida. Intente de nuevo.");
                entrada.nextLine(); // descarta la entrada para que el usuario intente de nuevo
            } // fin de catch

        } // fin de while
    } // fin del método agregarRegistros

    // cierra el arrchivo
    public void cerrar_archivo() {
        if (salida != null) {
            salida.close();
        }
    } // fin del método cerrarArchivo
 */


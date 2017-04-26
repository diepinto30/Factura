package Ejecutor;

import Clases.CrearArchivo;
import Clases.Domicilio;
import Clases.Factura;
import Clases.LecturaArchivo;
import Clases.Producto;
import java.util.Scanner;
import java.io.*;

/**
 *
 * @author diego pinto and bryant portilla Descripcion: Fecha:18/04/2017
 *
 */
public class Main {

    public static void main(String[] args) throws IOException {
        // TODO code application logic here
        Scanner entrada = new Scanner(System.in);

        //Variables
        String strNombre;
        String strCalle;
        String strCiudad;
        String strEstado;
        double dbCantidad;
        String strDescripcion;
        double dbPrecio;
        boolean bandera = true;

        //objetos
        Domicilio objDomicilio;
        Producto objProducto;
        CrearArchivo objCrear = new CrearArchivo();
        LecturaArchivo objLec = new LecturaArchivo();
        Factura objFactura = null;


        System.out.println("------ Datos Factura ------");
        System.out.print("Ingrese el nombre: ");
        strNombre = entrada.nextLine();
        System.out.print("Ingrese las calles: ");
        strCalle = entrada.next();
        System.out.print("Ingrese la cuidad: ");
        strCiudad = entrada.next();
        System.out.print("Ingrese el estado: ");
        strEstado = entrada.next();

        System.out.println("\n------ Datos del Producto ------");
        System.out.print("Ingrese la cantidad: ");
        dbCantidad = entrada.nextDouble();
        System.out.print("Ingrese la Descripcion: ");
        strDescripcion = entrada.next();
        System.out.print("Ingese el precio: ");
        dbPrecio = entrada.nextDouble();
        
        objLec.abrirArchivo();
        
        objDomicilio = new Domicilio(strNombre, strCalle, strCiudad, strEstado);

        objFactura = new Factura(objDomicilio);
        objProducto = new Producto(strDescripcion, dbPrecio);

        objFactura.AddProducto(objProducto, (int) dbCantidad);
        System.out.print(objFactura.toString());
        objLec.leerInformacion();
        objLec.cerrarArchivo();

        String cadena = String.format("%s;%s;%s;%s;%.2f;%s;%.2f;", strNombre, strCalle, strCiudad, strEstado, dbCantidad, strDescripcion, dbPrecio);
        objCrear.agregarRegistro(cadena);
        
        System.out.println("\n------------------------");
        System.out.println("   Factura Registrada");
    }

}


package Clases;

/**
 *
 * @author diego
 */
public class Domicilio {

    private String strNombre;
    private String strCalle;
    private String strCiudad;
    private String strEstado;

    public Domicilio(String strNombre, String strCalle, String strCiudad, String strEstado) {
        this.strNombre = strNombre;
        this.strCalle = strCalle;
        this.strCiudad = strCiudad;
        this.strEstado = strEstado;
    }
    
    
    @Override
    public String toString() {
        String cadena;
        cadena = String.format("------ Datos Factura ------\nNombre: %s\nCalle: %s\nCuidad: %s\nEstado: %s\n", strNombre, strCalle, strCiudad, strEstado);
        return  cadena;
    }

}

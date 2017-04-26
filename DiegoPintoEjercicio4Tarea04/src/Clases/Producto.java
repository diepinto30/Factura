
package Clases;

/**
 *
 * @author diego
 */
public class Producto {
    String strDescripcion;
    double dbPrecio;

    public Producto(String strDescripcion, double dbPrecio) {
        this.strDescripcion = strDescripcion;
        this.dbPrecio = dbPrecio;
    }

    public String getStrDescripcion() {
        return strDescripcion;
    }

    public double getDbPrecio() {
        return dbPrecio;
    }
    
    

    
}

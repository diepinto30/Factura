package Clases;

/**
 *
 * @author diego
 */
public class LineItems {

    private double dbCantidad;
    private Producto objPro;

    public LineItems(double dbCantidad, Producto objPro) {
        this.dbCantidad = dbCantidad;
        this.objPro = objPro;
    }

        public double getPrecioTotal(){
        return objPro.getDbPrecio() * dbCantidad;
    }

    @Override
    public String toString() {
        return "Cantidad de productos: " + dbCantidad +"\n"+ "Valor del producto: "+ objPro.getDbPrecio() +"\n"+ "Precio Total: " + getPrecioTotal();
    }
        

}
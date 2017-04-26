package Clases;

import java.util.ArrayList;

/**
 *
 * @author diego
 */
public class Factura {

    private Domicilio objDomicilio;
    private ArrayList<LineItems> lstItems;

    public Factura(Domicilio objDomicilio) {
        this.objDomicilio = objDomicilio;
        lstItems = new ArrayList<LineItems>();
    }

    public void AddProducto(Producto objProducto, int intCantidad) {
        LineItems anItem = new LineItems(intCantidad, objProducto);
        lstItems.add(anItem);
    }

    private double getCantidadPago() {
        double dbMontoPago = 0;
        for (LineItems lineItems : lstItems) {
            dbMontoPago = dbMontoPago + lineItems.getPrecioTotal();
        }
        return dbMontoPago;
    }

    @Override
    public String toString() {
        String cadena = objDomicilio.toString();
        for (LineItems lineItems : lstItems) {
            cadena = cadena + lineItems.toString() + "\n" + "Cantidad Pendiente: " + getCantidadPago();
        }
        return cadena;
    }
}

package Clases;

public class Papeleria extends Producto{
    private String cantidad;

    public Papeleria(String nombre, int precio, int unidadesDisponibles, int unidadesVendidas, int unidadesAbastecidas, String cantidad) {
        super(nombre, precio, unidadesDisponibles, unidadesVendidas, unidadesAbastecidas);
        this.cantidad = cantidad;
    }

    @Override
    public void mostrarDetalles() {
        super.mostrarDetalles();
        System.out.println("Cantidad: " + cantidad);
    }
}
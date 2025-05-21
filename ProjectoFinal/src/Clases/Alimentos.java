package Clases;

public class Alimentos extends Producto {
    private String fechaDeCaducidad;
    private String cantidad;

    public Alimentos(String nombre, int precio, int unidadesDisponibles, int unidadesVendidas, int unidadesAbastecidas, String fechaDeCaducidad, String cantidad){
        super(nombre, precio, unidadesDisponibles, unidadesVendidas, unidadesAbastecidas);
        this.fechaDeCaducidad = fechaDeCaducidad;
        this.cantidad = cantidad;
    }

    @Override
    public void mostrarDetalles() {
        super.mostrarDetalles();
        System.out.println("Fecha de caducidad: " + fechaDeCaducidad);
        System.out.println("Cantidad: " + cantidad);
    }

}
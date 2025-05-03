package Clases;

public class Alimentos extends Producto {
    private String fechaDeCaducidad;
    private String cantidad;

    public Alimentos(String nombre, int precio, int unidadesDisponibles, String fechaDeCaducidad, String cantidad){
        super(nombre, precio, unidadesDisponibles);
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
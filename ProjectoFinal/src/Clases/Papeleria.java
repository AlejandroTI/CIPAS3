package Clases;

public class Papeleria extends Producto{
    private String cantidad;

    public Papeleria(String nombre, int precio, int unidadesDisponibles, String cantidad) {
        super(nombre, precio, unidadesDisponibles);
        this.cantidad = cantidad;
    }

    @Override
    public void mostrarDetalles() {
        super.mostrarDetalles();
        System.out.println("Cantidad:" + cantidad);
    }
}
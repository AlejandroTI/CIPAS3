package Clases;

public class Producto{
    protected String nombre;
    protected int precio;
    protected int unidadesDisponibles;

    public Producto(String nombre, int precio, int unidadesDisponibles){
        this.nombre = nombre;
        this.precio = precio;
        this.unidadesDisponibles = unidadesDisponibles;
    }

    public void mostrarDetalles() {
        System.out.println("Nombre:" + nombre);
        System.out.println("Precio:$" + precio);
        System.out.println("Unidades disponibles:" + unidadesDisponibles);
    }
}

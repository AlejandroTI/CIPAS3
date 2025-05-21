package Clases;

public class Producto {
    protected String nombre;
    protected int precio;
    protected int unidadesDisponibles;
    protected int unidadesVendidas;
    protected int unidadesAbastecidas;

    public Producto(String nombre, int precio, int unidadesDisponibles, int unidadesVendidas, int unidadesAbastecidas) {
        this.nombre = nombre;
        this.precio = precio;
        this.unidadesDisponibles = unidadesDisponibles;
        this.unidadesVendidas = unidadesVendidas;
        this.unidadesAbastecidas = unidadesAbastecidas;
    }
    public void mostrarDetalles() {
        System.out.println("Nombre: " + nombre);
        System.out.println("Precio: $" + precio);
        System.out.println("Unidades disponibles: " + unidadesDisponibles);
        System.out.println("Unidades vendidas: " + unidadesVendidas);
    }
    public void restarUnidades() {
        unidadesDisponibles -= unidadesVendidas;
        if (unidadesDisponibles <= 0) {
            unidadesDisponibles = 0;
            System.out.println("¡¡No hay más unidades disponibles!!,(NO SE PUEDE VENDER MÁS UNIDADES DE LAS EXISTENTES,DEBES SURTIR EL PRODUCTO)");
        } else {
            System.out.println("Cantidad de productos disponibles luego de las ventas: " + unidadesDisponibles);
        }
    }
    public void abastecer() {
        unidadesDisponibles += unidadesAbastecidas;
        System.out.println("Cantidad de productos disponibles luego de surtir: " + unidadesDisponibles);
    }
}



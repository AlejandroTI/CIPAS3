package Clases;

public class Ropa extends Producto{
    private String talla;
    private String material;
    private String color;


    public Ropa(String nombre, int precio, int unidadesDisponibles, int unidadesvendidas, int unidadesAbastecidas, String talla, String material, String color) {
        super(nombre, precio, unidadesDisponibles, unidadesvendidas, unidadesAbastecidas);
        this.talla = talla;
        this.material = material;
        this.color= color;
    }

    @Override
    public void mostrarDetalles() {
        super.mostrarDetalles();
        System.out.println("Talla: " + talla);
        System.out.println("Material " + material);
        System.out.println("Color: " + color);
    }


}
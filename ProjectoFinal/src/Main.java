import Clases.*;

public class Main {
    static void Informar (Producto cualquiera) {
        System.out.println("Información del producto: ");
        cualquiera.mostrarDetalles();
        cualquiera.restarUnidades();
        cualquiera.abastecer();
        System.out.println();
    }
    public static void main(String[] args) {
        Producto blusa = new Ropa("blusa", 18500, 20, 50,12,"S", "Seda", "Rojo");
        Producto arroz = new Alimentos("arroz", 1700, 70, 30,15,"15-julio-2026", "1 Libra");
        Producto cuaderno = new Papeleria("Lapicero negro", 1200, 150, 90, 20, "100 hojas");
        Producto jabonLiquidoM = new Aseo("Jabón líquido para manos",5200, 32, 29,10, "500mL" );

        Informar(blusa);
        Informar(arroz);
        Informar(cuaderno);
        Informar(jabonLiquidoM);
    }
}
import Clases.*;

public class Main {
    public static void main(String[] args) {
        Ropa blusa = new Ropa("blusa", 18500, 20, "S", "Seda", "Rojo");
        Alimentos arroz = new Alimentos("arroz", 1700, 70, "15-julio-2026", "1 Libra");
        Papeleria cuaderno = new Papeleria("Lapicero negro", 1200, 150, "100 hojas");
        Aseo jabonLiquidoM = new Aseo("Jabón líquido para manos",5200, 32, "500mL" );

        System.out.println("Información del producto:");
        blusa.mostrarDetalles();

        System.out.println(" ");

        System.out.println("Información del producto:");
        arroz.mostrarDetalles();

        System.out.println(" ");

        System.out.println("Información del producto:");
        cuaderno.mostrarDetalles();

        System.out.println(" ");

        System.out.println("Información del producto:");
        jabonLiquidoM.mostrarDetalles();
    }
}
import Clases.Familia;
import Clases.Hijo;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Hijo h1= new Hijo("Jaime", 6, "A+", "Hijo", "Estudiante");

        h1.setGrado("Quinto (5)");
        h1.saludar();
        h1.informar();
    }
}
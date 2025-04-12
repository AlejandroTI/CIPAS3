package Clases;
public class Familia {
    public String nombre;
    public int edad;
    public String tipodesangre;
    public String rolenlafamilia;
    public String profesion;

    public Familia(String nombre, int edad, String tipodesangre, String rolenlafamilia, String profesion) {
        this.nombre = nombre;
        this.edad = edad;
        this.tipodesangre = tipodesangre;
        this.rolenlafamilia = rolenlafamilia;
        this.profesion = profesion;
    }

    Familia(){}

    public void saludar() {
      System.out.println("Hola, soy " + this.nombre + " y tengo " + this.edad + " años.");
    }

    public void informar(){
        System.out.println("Mi rol en la familia es ser " + this.rolenlafamilia + " y soy " + this.profesion + ".");
    }
}

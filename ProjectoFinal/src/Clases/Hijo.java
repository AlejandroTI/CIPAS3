package Clases;

public class Hijo extends Familia{
    public  String grado;

    public void setGrado(String grado) {
        this.grado = grado;
    }

    public Hijo(String nombre, int edad, String tipodesangre, String rolenlafamilia, String profesion) {
        super(nombre, edad, tipodesangre, rolenlafamilia, profesion);
    }

    @Override
    public void informar(){
        System.out.println("Mi rol en la familia es ser " + this.rolenlafamilia + " y soy " + this.profesion + ". Yo estoy en el grado " + grado);
    }
}

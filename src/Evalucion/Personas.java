package Evalucion;

public class Personas {
    protected int id;
    protected String nombre;
    protected String apellido;
    protected int edad;

    public Personas() {
    }

    public Personas(int id, String nombre, String apellido, int edad) {
        this.id = id;
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
    }

    public void mostrarInfo() {
        System.out.println("Id :" + id);
        System.out.println("Nombre :" + nombre);
        System.out.println("Apellido: " + apellido);
        System.out.println("Edad :" + edad);

    }

    public void darOpiniones() {
        System.out.println(" doy mi opinion sobre : ");


    }
}





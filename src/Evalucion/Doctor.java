package Evalucion;

class Doctor extends Personas{
    protected String especialidad;
    protected int aniosExperiencia;

    public Doctor() {
    }

    public Doctor(int id, String nombre, String apellido, int edad, String especialidad, int aniosExperiencia) {
        super(id, nombre, apellido, edad);
        this.especialidad = especialidad;
        this.aniosExperiencia = aniosExperiencia;
    }
    @Override
    public void darOpiniones() {
        System.out.println(" doy mi opinion como Doctor");}
    @Override
    public void mostrarInfo(){
        super.mostrarInfo();
        System.out.println("Especialidad :"+ especialidad);
        System.out.println("Años de experiencia: "+aniosExperiencia);
    }
    public void diagnosticar(){
        System.out.println("diagnosticar");
    }
    public void prescribirTratamiento(){
        System.out.println("Preescripcion");
    }
    public  void darSeguimiento(){
        System.out.println("Darseguimiento");
    }
}


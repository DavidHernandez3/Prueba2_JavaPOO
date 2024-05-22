package Evalucion;


class Enfermero extends Personas{
    protected String turno;
    protected int anioExperiencia;

    public Enfermero() {
    }

    public Enfermero(int id, String nombre, String apellido, int edad, String turno, int anioExperiencia) {
        super(id, nombre, apellido, edad);
        this.turno = turno;
        this.anioExperiencia = anioExperiencia;
    }
    @Override
    public void darOpiniones() {
        System.out.println(" doy mi opinion como enfermero");}


    public void asistirDoctor(){
        System.out.println("Asistir al Doctor");
    }
    public void aplicarMedicamento(){
        System.out.println(nombre+ apellido+ "Aplico medicamento");
    }
    public  void asistirPaciente(){
        System.out.println("Asistir al paciente");
    }
    @Override
    public void mostrarInfo(){
        super.mostrarInfo();
        System.out.println("Turno :"+ turno);
        System.out.println("Año de experiencia: "+anioExperiencia);
    }
}

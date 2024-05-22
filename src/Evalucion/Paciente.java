package Evalucion;

class Paciente extends Personas{
    protected String historiaClinica;
    protected String numeroSeguro;

    public Paciente() {
    }

    public Paciente(int id, String nombre, String apellido, int edad, String historiaClinica, String numeroSeguro) {
        super(id, nombre, apellido, edad);
        this.historiaClinica = historiaClinica;
        this.numeroSeguro = numeroSeguro;
    }

    @Override
    public void darOpiniones() {
        System.out.println(" doy mi opinion como pacinete");}

    public void registrase(){
        System.out.println("Me registro como paciente");
    }
    public void solicitarCita(){
        System.out.println("Solicitar cita ");
    }
    public void recibirTratamiento(){
        System.out.println("Recibe tratamiento");
    }
    @Override
    public void mostrarInfo(){
        super.mostrarInfo();
        System.out.println("Historial Clinico :"+ historiaClinica);
        System.out.println("Numero Seguro : "+ numeroSeguro);
    }
}
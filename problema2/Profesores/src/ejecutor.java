class Profesor_1 {
    private String nombre;
    private String apellido;
    private double sueldo;
    private double sueldo_Total;
    private String cedula;
    private double SueldoBasico_20;

    public Profesor_1() {}

    public Profesor_1(String nombre,String apellido,double sueldo,String cedula) {
        this.nombre = nombre;
        this.apellido=apellido;
        this.sueldo=sueldo;
        this.sueldo_Total=sueldo_Total;
        this.cedula=cedula;
    }

    public String getNombre() {

        return nombre;
    }

    public void setNombre(String nombre) {

        this.nombre = nombre;
    }

    public String getApellido() {

        return apellido;
    }

    public void setApellido(String apellido) {

        this.apellido = apellido;
    }

    public double getSueldo() {

        return sueldo;
    }

    public void setSueldo(double sueldo) {

        this.sueldo = sueldo;
    }
    public void calcularSueldoBsico_20(){

        SueldoBasico_20=sueldo*20/100;
    }
    public double SueldoBasico_20(){

        return SueldoBasico_20;
    }

    public double getSueldo_Total() {

        return sueldo_Total;
    }

    public void CalcularSueldo_Total(double sueldo_Total) {
        this.sueldo_Total =SueldoBasico_20+sueldo;
    }

    public String getCedula() {
        return cedula;
    }

    public void setCedula(String cedula) {
        this.cedula = cedula;
    }

    @Override
    public String toString() {
        return "Profesor_1{" +
                "nombre='" + nombre + '\'' +
                ", apellido='" + apellido + '\'' +
                ", sueldo=" + sueldo +
                ", sueldo_Total=" + sueldo_Total +
                ", cedula='" + cedula + '\'' +
                '}';
    }
}
public class ejecutor {
    public static void main(String[] args) {
        Profesor_1 profesor1=new Profesor_1("mario","gonzales",500,"1104301062");
        profesor1.getSueldo_Total();
        System.out.println(profesor1);

    }
}

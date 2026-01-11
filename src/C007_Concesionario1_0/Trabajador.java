package C007_Concesionario1_0;

public class Trabajador extends Persona{
    

    private String numeroSS;
    private String fechaAntiguedad;

    //Constructor por defecto
    public Trabajador(){

        super();
        this.numeroSS = "";
        this.fechaAntiguedad = "";

    }

    //Constructor por parametros
    public Trabajador(String nombre, String tipoDocumento, String numeroDocumento, String numeroSS, String fechaAntiguedad){

        super(nombre, tipoDocumento, numeroDocumento);
        this.numeroSS = numeroSS;
        this.fechaAntiguedad = fechaAntiguedad;

    }

    //Constructor de copia
    public Trabajador(Trabajador t){

        super(t);
        this.numeroSS = t.numeroSS;
        this.fechaAntiguedad = t.fechaAntiguedad;

    }

    //Getters y Setters

    public String getNumeroSS() {
        return numeroSS;
    }
    public void setNumeroSS(String numeroSS) {
        this.numeroSS = numeroSS;
    }

    public String getFechaAntiguedad() {
        return fechaAntiguedad;
    }
    public void setFechaAntiguedad(String fechaAntiguedad) {
        this.fechaAntiguedad = fechaAntiguedad;
    }

    //Override de los metodos toString y equals

    @Override
    public String toString() {
        return "\n----------------------------\n|                          |\n|        Trabajador        |\n|                          |\n----------------------------\n\nNombre: " + super.getNombre() + "\nTipo de Documento: " + super.getTipoDocumento() + "\nNumero de Documento: " + super.getNumeroDocumento() + "\nNumero de la Seguridad Social: " + this.numeroSS + "\nFecha Antiguedad: " + this.fechaAntiguedad + "\n-------------------------";
    }


    @Override
    public boolean equals(Object obj) {
        if (obj == null) return false;
        if (obj == this) return true;
        if (obj.getClass() !=this.getClass()) return false;

        Trabajador o = (Trabajador) obj;
        return (super.getTipoDocumento().equals(o.getTipoDocumento()) && super.getNumeroDocumento().equals(o.getNumeroDocumento()) && this.numeroSS.equals(o.numeroSS)); //Para considerar que dos trabajadores son iguales he decidido comparar tanto el tipo de documento como el numero de documento (como en persona), pero aparte he añadido la comparacion del numero de la seguridad social (numeroSS).
    }

    //Método de la interfaz Notificable
    @Override
    public boolean notificar(String mensaje){

        System.out.println("\n-------------------------------\nMensaje para el trabajador " + this.getNombre() + ":\n-------------------------------\n");
        System.out.println(mensaje);
        return true;

    }


    //Main utilizado para comprobar el correcto funcionamiento de la clase "Trabajador.java" de forma independiente.
    //Resultado: Funciona correctamente

    /*public static void main(String[] args) {
    
        Trabajador t1 = new Trabajador();
        Trabajador t2 = new Trabajador("Victor", "DNI", "29890910H", "SS0001", null);
        Trabajador t3 = new Trabajador(t2);

        System.out.println(t1);

        System.out.println(t2);

        System.out.println(t3);

        System.out.println("¿El trabajador t2 es igual al trabajador t1?" + t2.equals(t1));
        System.out.println("¿El trabajador t2 es igual al trabajador t3?" + t2.equals(t3));
        

    }*/

}

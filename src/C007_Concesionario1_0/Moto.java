package C007_Concesionario1_0;

public class Moto extends Vehiculo{
    
    private String cilindros;//No vamos a operar ni con cilindros ni con cv, asi que los ponemos como String.
    private String cv;

    //Constructor por defecto
    public Moto(){

        super();
        this.cilindros = "";
        this.cv = "";

    }

    //Constructor por parametros
    public Moto(String matricula, String fechaMatriculacion, double capacidad_total, double carga_actual, double precio, String cilindros, String cv){

        super(matricula, fechaMatriculacion, capacidad_total, carga_actual, precio);
        this.cilindros = cilindros;
        this.cv = cv;

    }

    //Constructor de copia
    public Moto(Moto m){

        super(m);
        this.cilindros = m.cilindros;
        this.cv = m.cv;

    }

    //Getters y Setters

    public String getCilindros() {
        return cilindros;
    }
    public void setCilindros(String cilindros) {
        this.cilindros = cilindros;
    }

    public String getCv() {
        return cv;
    }
    public void setCv(String cv) {
        this.cv = cv;
    }

    //Override de los metodos toString y equals

    @Override
    public String toString() {
        return "\n----------------------\n|                    |\n|        Moto        |\n|                    |\n----------------------\n\nMatricula: " + super.getMatricula() + "\nFecha Matriculacion: " + super.getFechaMatriculacion() + "\nCapacidad total: " + super.getCapacidad_total() + "\nCarga actual: " + super.getCarga_actual() + "\nPrecio: " + super.getPrecio() + "\nCilindros: " + this.cilindros + "\nCV: " + this.cv + "\n-------------------";
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) return false;
        if (obj == this) return true;
        if (obj.getClass() !=this.getClass()) return false;

        Moto o = (Moto) obj;
        return (super.getMatricula().equals(o.getMatricula())); //Para considerar que dos vehiculos son iguales he decidido comparar la matricula, ya que es única y dos vehiculos no deberían tener la misma, por lo tanto el equals quedaría igual tanto en Moto como en Vehiculo.
    }

    //Main utilizado para comprobar el correcto funcionamiento de la clase "Moto.java" de forma independiente.
    //Resultado: Funciona correctamente
    /*
    public static void main(String[] args) {
    
        Moto m1 = new Moto();
        Moto m2 = new Moto("2848DFG", "15-12-2025", 5, 0, 18000, "4", "457");
        Moto m3 = new Moto(m2);

        System.out.println(m1);

        System.out.println(m2);

        System.out.println(m3);

        System.out.println("¿La moto m2 es igual a la moto m1?" + m2.equals(m1));
        System.out.println("¿La moto m2 es igual a la moto m3?" + m2.equals(m3));
        

    }*/
}

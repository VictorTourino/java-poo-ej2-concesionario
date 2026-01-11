package C007_Concesionario1_0;

abstract class Vehiculo {
    
    private String matricula;
    private String fechaMatriculacion;
    private double capacidad_total;
    private double carga_actual;
    private double precio;

    //Constructor por defecto
    public Vehiculo(){

        this.matricula = "";
        this.fechaMatriculacion = "";
        this.capacidad_total = 0;
        this.carga_actual = 0;
        this.precio = 0;

    }

    //Constructor por parametros
    public Vehiculo(String matricula, String fechaMatriculacion, double capacidad_total, double carga_actual, double precio){

        this.matricula = matricula;
        this.fechaMatriculacion = fechaMatriculacion;
        this.capacidad_total = capacidad_total;
        this.carga_actual = carga_actual;
        this.precio = precio;

    }

    //Construcor de copia
    public Vehiculo(Vehiculo v){

        this.matricula = v.matricula;
        this.fechaMatriculacion = v.fechaMatriculacion;
        this.capacidad_total = v.capacidad_total;
        this.carga_actual = v.carga_actual;
        this.precio = v.precio;

    }

    //Getters y Setters

    public String getMatricula() {
        return matricula;
    }
    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public String getFechaMatriculacion() {
        return fechaMatriculacion;
    }
    public void setFechaMatriculacion(String fechaMatriculacion) {
        this.fechaMatriculacion = fechaMatriculacion;
    }

    public double getCapacidad_total() {
    return capacidad_total;
    }
    public void setCapacidad_total(double capacidad_total) {
        this.capacidad_total = capacidad_total;
    }

    public double getCarga_actual() {
        return carga_actual;
    }
    public void setCarga_actual(double nueva_carga_actual) {
        this.carga_actual = nueva_carga_actual;
    }

    public double getPrecio() {
        return precio;
    }
    public void setPrecio(double precio) {
        this.precio = precio;
    }

    //Override de los metodos toString y equals

    @Override
    public String toString() {
        return "\n--------------------------\n|                        |\n|        Vehiculo        |\n|                        |\n--------------------------\n\nMatricula: " + this.matricula + "\nFecha Matriculacion: " + this.fechaMatriculacion + "\nCapacidad total: " + this.capacidad_total + "\nCarga actual: " + this.carga_actual + "\nPrecio: " + this.precio + "\n-----------------------";
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) return false;
        if (obj == this) return true;
        if (obj.getClass() !=this.getClass()) return false;

        Vehiculo o = (Vehiculo) obj;
        return (this.matricula.equals(o.matricula)); //Para considerar que dos vehiculos son iguales he decidido comparar la matricula, ya que es única y dos vehiculos no deberían tener la misma.
    }

    //Main utilizado para comprobar el correcto funcionamiento de la clase "Vehiculo.java" de forma independiente.
    //Resultado: Funciona correctamente (para la comprobación de esta clase main es necesario quitar el "abstract" en vehiculo, ya que si no no dejará crear los vehiculos v1, v2 y v3.)

    /*public static void main(String[] args) {
        
        Vehiculo v1 = new Vehiculo();
        Vehiculo v2 = new Vehiculo("2848DFG", "15-12-2025", 0, 0, 0);
        Vehiculo v3 = new Vehiculo(v2);

        System.out.println(v1);

        System.out.println(v2);

        System.out.println(v3);

        System.out.println("¿El vehiculo v2 es igual al vehiculo v1?" + v2.equals(v1));
        System.out.println("¿El vehiculo v2 es igual al vehiculo v3?" + v2.equals(v3));

    }*/

}

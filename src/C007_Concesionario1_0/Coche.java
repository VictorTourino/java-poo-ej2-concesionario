package C007_Concesionario1_0;

public class Coche extends Vehiculo implements Repostable{
    
    private String tipo;//Puede ser gasolina, diesel, hibrido o electrico.
    private int estado; //Valor del 0 al 10, dependiendo del estado en el que se encuentre el coche.

    //Constructor por defecto
    public Coche(){

        super();
        this.tipo = "";
        this.estado = 0;

    }

    //Constructor por parametros
    public Coche(String matricula, String fechaMatriculacion, double capacidad_total, double carga_actual, double precio, String tipo, int estado){

        super(matricula, fechaMatriculacion, capacidad_total, carga_actual, precio);
        this.tipo = tipo;
        this.estado = estado;

    }

    //Constructor de copia
    public Coche(Coche c){

        super(c);
        this.tipo = c.tipo;
        this.estado = c.estado;

    }

    //Getters y Setters

    public String getTipo() {
        return tipo;
    }
    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public int getEstado() {
        return estado;
    }
    public void setEstado(int estado) {
        this.estado = estado;
    }

    //Override de los metodos toString y equals

    @Override
    public String toString() {
        return "\n-----------------------\n|                     |\n|        Coche        |\n|                     |\n-----------------------\n\nMatricula: " + super.getMatricula() + "\nFecha Matriculacion: " + super.getFechaMatriculacion() + "\nCapacidad total: " + super.getCapacidad_total() + "\nCarga actual: " + super.getCarga_actual() + "\nPrecio: " + super.getPrecio() + "\nTipo: " + this.tipo + "\nEstado: " + this.estado + "\n--------------------";
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) return false;
        if (obj == this) return true;
        if (obj.getClass() !=this.getClass()) return false;

        Coche o = (Coche) obj;
        return (super.getMatricula().equals(o.getMatricula())); //Para considerar que dos vehiculos son iguales he decidido comparar la matricula, ya que es única y dos vehiculos no deberían tener la misma, por lo tanto el equals quedaría igual tanto en Coche como en Vehiculo.
    }


    //Método de la interfaz Repostable

    /*Esta función repostar, si el coche es eléctrico, le añadirá a su carga actual (dinero * 2.175) KW,
    si el coche es gasolina le añadirá (dinero * 1.45) y si es diésel (dinero * 1.25). 
    La cantidad total de carga no puede exceder la capacidad total.*/
    @Override
    public void repostar(double dinero){

        double precio;

        switch (this.tipo.toLowerCase()){
            case "gasolina":
                precio = 1.45;
                break;
            case  "diesel", "diésel":
                precio = 1.25;
                break;
            case "electrico", "eléctrico":
                precio = 2.175;
                break;
            default:
                System.out.println("No se puede calcular la cantidad de repostaje ya que no se ha podido determinar el tipo de combustible que utiliza el vehículo");
                return;
        }

        double nueva_carga_actual = super.getCarga_actual() + dinero * precio;
        if (nueva_carga_actual > super.getCapacidad_total()){
            System.out.println("Ha habido un error a la hora de repostar.\n\nError:\nLa capacidad total de la carga sumandole el respotaje esperado es mayor que la capacidad total que soporta el vehículo, pruebe a repostar otra cantidad menor.");
        }
        else{
            super.setCarga_actual(nueva_carga_actual);
        }
    }

    //Main utilizado para comprobar el correcto funcionamiento de la clase "Coche.java" de forma independiente.
    //Resultado: Funciona correctamente

    /*public static void main(String[] args) {
    
        Coche c1 = new Coche();
        Coche c2 = new Coche("2848DFG", "15-12-2025", 5, 0, 18000, "Gasolina", 8);
        Coche c3 = new Coche(c2);

        System.out.println(c1);

        System.out.println(c2);

        System.out.println(c3);

        System.out.println("¿El coche c2 es igual al coche c1?" + c2.equals(c1));
        System.out.println("¿El coche c2 es igual al coche c3?" + c2.equals(c3));
        

    }*/

}

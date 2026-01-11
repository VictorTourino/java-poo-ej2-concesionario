package C007_Concesionario1_0;

//Clase abstracta Persona, la base para Cliente y Trabajador. Implementa la interfaz Notificable
abstract class Persona implements Notificable{
    
    private String nombre;
    private String tipoDocumento; //Enumerado con DNI, NIE, PAS
    private String numeroDocumento; //Al no ser un numero con el que vayamos a operar se almacena en un String y no en un int.

    //Constructor por defecto
    public Persona(){

        this.nombre = "";
        this.tipoDocumento = "";
        this.numeroDocumento = "";
    
    }

    //Constructor por parametros
    public Persona(String nombre, String tipoDocumento, String numeroDocumento){

        this.nombre = nombre;
        this.tipoDocumento = tipoDocumento;
        this.numeroDocumento = numeroDocumento;

    }

    //Constructor de copia
    public Persona(Persona p){

        this.nombre = p.nombre;
        this.tipoDocumento = p.tipoDocumento;
        this.numeroDocumento = p.numeroDocumento;

    }

    //Getters y Setters
    
    public String getNombre() {
    return nombre;
    }
    public void setNombre(String nombre) {
    this.nombre = nombre;
    }

    public String getTipoDocumento() {
        return tipoDocumento;
    }
    public void setTipoDocumento(String tipoDocumento) {
        this.tipoDocumento = tipoDocumento;
    }

    public String getNumeroDocumento() {
        return numeroDocumento;
    }
    public void setNumeroDocumento(String numeroDocumento) {
        this.numeroDocumento = numeroDocumento;
    }

    //Override de los metodos toString y equals

    @Override
    public String toString() {
        return "\n-------------------------\n|                       |\n|        Persona        |\n|                       |\n-------------------------\n\nNombre: " + this.nombre + "\nTipo de Documento: " + this.tipoDocumento + "\nNumero de Documento: " + this.numeroDocumento + "\n----------------------";
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) return false;
        if (obj == this) return true;
        if (obj.getClass() !=this.getClass()) return false;

        Persona o = (Persona) obj;
        return (this.tipoDocumento.equals(o.tipoDocumento) && this.numeroDocumento.equals(o.numeroDocumento)); //Para considerar que dos personas son iguales he decidido comparar tanto el tipo de documento como el numero de documento.
    }

    // El método notificar() será implementado en las clases derivadas "Cliente" y "Trabajador"

    //Main utilizado para comprobar el correcto funcionamiento de la clase "Persona.java" de forma independiente.
    //Resultado: Funciona correctamente (para la comprobación de esta clase main es necesario quitar el "abstract" en persona, ya que si no no dejará crear las personas p1, p2 y p3.)

    /*public static void main(String[] args) {
    
        Persona p1 = new Persona();
        Persona p2 = new Persona("Victor", "DNI", "29090980H");
        Persona p3 = new Persona(p2);


        System.out.println(p1);

        System.out.println(p2);

        System.out.println(p3);

        System.out.println("¿La persona p2 es igual a la persona p1?" + p2.equals(p1));
        System.out.println("¿La persona p2 es igual a la persona p3?" + p2.equals(p3));
        

    }*/
}

package C007_Concesionario1_0;

public class Cliente extends Persona{
    
    private String numeroCliente;
    private String tipoPermisoConducir; //A,B,C,D,etc...

    //Constructor por defecto
    public Cliente(){

        super();
        this.numeroCliente = "";
        this.tipoPermisoConducir = "";

    }

    //Constructor por parametros
    public Cliente(String nombre, String tipoDocumento, String numeroDocumento, String numeroCliente, String tipoPermisoConducir){

        super(nombre, tipoDocumento, numeroDocumento);
        this.numeroCliente = numeroCliente;
        this.tipoPermisoConducir = tipoPermisoConducir;

    }

    //Constructor de copia
    public Cliente(Cliente c){

        super(c);
        this.numeroCliente = c.numeroCliente;
        this.tipoPermisoConducir = c.tipoPermisoConducir;

    }

    //Getters y Setters

    public String getNumeroCliente() {
        return numeroCliente;
    }
    public void setNumeroCliente(String numeroCliente) {
        this.numeroCliente = numeroCliente;
    }

    public String getTipoPermisoConducir() {
        return tipoPermisoConducir;
    }
    public void setTipoPermisoConducir(String tipoPermisoConducir) {
        this.tipoPermisoConducir = tipoPermisoConducir;
    }

    //Override de los metodos toString y equals
    @Override
    public String toString() {
        return "\n-------------------------\n|                       |\n|        Cliente        |\n|                       |\n-------------------------\n\nNombre: " + super.getNombre() + "\nTipo de Documento: " + super.getTipoDocumento() + "\nNumero de Documento: " + super.getNumeroDocumento() + "\nNumero de Cliente: " + this.numeroCliente + "\nTipo de Permiso de Conducir: " + this.tipoPermisoConducir + "\n----------------------";
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) return false;
        if (obj == this) return true;
        if (obj.getClass() !=this.getClass()) return false;

        Cliente o = (Cliente) obj;
        return (super.getTipoDocumento().equals(o.getTipoDocumento()) && super.getNumeroDocumento().equals(o.getNumeroDocumento()) && this.numeroCliente.equals(o.numeroCliente)); //Para considerar que dos trabajadores son iguales he decidido comparar tanto el tipo de documento como el numero de documento (como en persona), pero aparte he añadido la comparacion del numero único identificatorio del cliente (numeroCliente).
    }

    //Método de la interfaz Notificable
    @Override
    public boolean notificar(String mensaje){

        System.out.println("\n-------------------------------\nMensaje para el cliente " + this.getNombre() + ":\n-------------------------------\n");
        System.out.println(mensaje);
        return true;

    }

    //Main utilizado para comprobar el correcto funcionamiento de la clase "Cliente.java" de forma independiente.
    //Resultado: Funciona correctamente

    /*public static void main(String[] args) {
    
        Cliente c1 = new Cliente();
        Cliente c2 = new Cliente("Victor", "DNI", "29090980H", "CL0001", "B");
        Cliente c3 = new Cliente(c2);


        System.out.println(c1);

        System.out.println(c2);

        System.out.println(c3);

        System.out.println("¿El cliente c2 es igual al cliente c1?" + c2.equals(c1));
        System.out.println("¿El cliente c2 es igual al cliente c3?" + c2.equals(c3));
        

    }*/


}
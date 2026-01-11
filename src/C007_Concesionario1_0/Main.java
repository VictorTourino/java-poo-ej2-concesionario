package C007_Concesionario1_0;

public class Main {
 
    public static void main(String[] args) {
    
        //Creación de concesionario
        Concesionario concesionario = new Concesionario();
    
        //Utilización del método para mostrar el vehículo más barato
        System.out.println(concesionario.masBarato());

        //Utilización del método para crear un nuevo cliente.
        concesionario.crearCliente();

        //Utilización del método para crear una nueva moto.
        concesionario.crearMoto();

        //Utilización del método para crear un nuevo coche.
        concesionario.crearCoche();

        //Utilización del método para crear un nuevo trabajador.
        concesionario.crearTrabajador();
    } 
}

package C007_Concesionario1_0;

import java.util.Scanner;

public class Concesionario {

    private Scanner sc = new Scanner(System.in);
    
    //Creación de vector de clientes y de 3 clientes.
    private Cliente[] clientes = {
    new Cliente("Victor", "DNI", "12391239X", "CL010", "B"),
    new Cliente("Pedro", "DNI", "19232S", "CL011", "B"),
    new Cliente("Efren", "DNI", "10238721D", "CL012", "B")
    };

    //Creación de vector de trabajadores y de 2 trabajadores
    private Trabajador[] trabajadores = {
    new Trabajador("Ruben", "DNI", "0921832X", "SS0219320", "15-02-2020"),
    new Trabajador("Marcos", "DNI", "128732189D", "SS218309", "08-12-2025")
    };

    //Creación de vector de vehiculos, de 3 cohes y de 3 motos
    private Vehiculo[] vehiculos = {
    new Coche("2345FFF", "21-04-2022", 1100, 500, 12999.99, "Gasolina", 8),
    new Coche("0909LPK", "11-12-2000", 550, 200, 1800, "Diésel", 4),
    new Coche("9023GKH", "01-07-2004", 699, 100, 999.99, "Gasolina", 8),
    new Moto("0817FDF", "04-04-2005", 200, 10, 1900, "300", "199"),
    new Moto("9800LMN", "12-12-2025", 500, 244, 3950, "500", "249"),
    new Moto("0000GFH", "27-02-2023", 490, 239, 3000, "349", "100")
    };
    

    //Crea un nuevo cliente y lo añade al array de clientes existente
    public void crearCliente() {

        System.out.println("Introduzca los datos del cliente:\n\nNombre:");
        String nombre = sc.nextLine();
        System.out.print("Tipo de Documento: ");
        String tipoDocumento = sc.nextLine();
        System.out.print("Numero de Documento: ");
        String numeroDocumento = sc.nextLine();
        System.out.print("Numero de Cliente: ");
        String numeroCliente = sc.nextLine();
        System.out.print("Tipo de Permiso de conducir: ");
        String tipoPermisoConducir = sc.nextLine();

        
        Cliente[] nuevoClientes = new Cliente[clientes.length + 1];

        for ( int i = 0; i < clientes.length; i++){

            nuevoClientes[i] = clientes[i];

        }
        nuevoClientes[nuevoClientes.length - 1] = new Cliente(nombre, tipoDocumento, numeroDocumento, numeroCliente, tipoPermisoConducir);

        clientes = nuevoClientes;
    }

    //Crea un nuevo trabajador y lo añade al array de trabajadores existente
    public void crearTrabajador() {
        System.out.println("Introduzca datos del trabajador: \n\nNombre:");
        String nombre = sc.nextLine();
        System.out.print("Tipo de Documento: ");
        String tipoDocumento = sc.nextLine();
        System.out.print("Numero de Documento: ");
        String numeroDocumento = sc.nextLine();
        System.out.print("Numero de la Seguridad Social: ");
        String numeroSS = sc.nextLine();
        System.out.print("Fecha de Antiguedad: ");
        String fechaAntiguedad = sc.nextLine();

        Trabajador[] nuevoTrabajadores = new Trabajador[trabajadores.length + 1];

        for ( int i = 0; i < trabajadores.length; i++){

            nuevoTrabajadores[i] = trabajadores[i];

        }
        nuevoTrabajadores[nuevoTrabajadores.length - 1] = new Trabajador(nombre, tipoDocumento, numeroDocumento, numeroSS, fechaAntiguedad);

        trabajadores = nuevoTrabajadores;
    }
        
    //Crea un nuevo coche y lo añade al array de vehiculos existente
    public void crearCoche() {
        System.out.println("Introduzca datos del coche: \n\nMatricula:");
        String matricula = sc.nextLine();
        System.out.print("Fecha de Matriculacion: ");
        String fechaMatriculacion = sc.nextLine();
        System.out.print("Capacidad Total: ");
        double capacidad_total = sc.nextDouble();
        sc.nextLine(); //Limpiamos el buffer después de leer un double
        System.out.print("Carga Actual: ");
        double carga_actual = sc.nextDouble();
        sc.nextLine();
        System.out.print("Precio: ");
        double precio = sc.nextDouble();
        sc.nextLine();
        System.out.print("Tipo: ");
        String tipo = sc.nextLine();
        System.out.print("Estado: ");
        int estado = sc.nextInt();

        Vehiculo[] nuevoVehiculos = new Coche[vehiculos.length + 1];

        for ( int i = 0; i < vehiculos.length; i++){

            nuevoVehiculos[i] = vehiculos[i];

        }
        nuevoVehiculos[nuevoVehiculos.length - 1] = new Coche(matricula, fechaMatriculacion, capacidad_total, carga_actual, precio, tipo, estado);

        vehiculos = nuevoVehiculos;
    }
    
    //Crea una nueva moto y la añade al array de vehiculos existente
    public void crearMoto() {
        System.out.println("Introduzca datos de la moto: \n\nMatricula:");
        String matricula = sc.nextLine();
        System.out.print("Fecha de Matriculacion: ");
        String fechaMatriculacion = sc.nextLine();
        System.out.print("Capacidad Total: ");
        double capacidad_total = sc.nextDouble();
        sc.nextLine();
        System.out.print("Carga Actual: ");
        double carga_actual = sc.nextDouble();
        sc.nextLine();
        System.out.print("Precio: ");
        double precio = sc.nextDouble();
        sc.nextLine();
        System.out.print("Cilindros: ");
        String cilindros = sc.nextLine();
        System.out.print("CV: ");
        String cv = sc.nextLine();

        Vehiculo[] nuevoVehiculos = new Moto[vehiculos.length + 1];

        for ( int i = 0; i < vehiculos.length; i++){

            nuevoVehiculos[i] = vehiculos[i];

        }
        nuevoVehiculos[nuevoVehiculos.length - 1] = new Moto(matricula, fechaMatriculacion, capacidad_total, carga_actual, precio, cilindros, cv);

        vehiculos = nuevoVehiculos;
    }


    //Devuelve el vehiculo con menor precio del concesionario
    public Vehiculo masBarato() {

        Vehiculo barato = vehiculos[0];
        for (int i = 1; i < vehiculos.length; i++) {
            if (vehiculos[i].getPrecio() < barato.getPrecio()) {
                barato = vehiculos[i];
            }
        }

        return barato;
    }
}

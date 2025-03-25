import java.util.ArrayList;
import java.util.Scanner;
public class GestElectrodomesticos {
    public static ArrayList<Electrodomestico> listaElectrodomesticos = new ArrayList<>();
    public static Scanner scanner = new Scanner(System.in);

    // Métodos de gestión (añadir, mostrar, eliminar, etc.)
    public static void añadirLavadora() {
        System.out.print("Ingrese la marca de la lavadora: ");
        String marca = scanner.nextLine();
        System.out.print("Ingrese el modelo de la lavadora: ");
        String modelo = scanner.nextLine();
        System.out.print("Ingrese el precio de la lavadora: ");
        int precio = scanner.nextInt();
        System.out.print("Ingrese la capacidad de la lavadora (en litros): ");
        int capacidad = scanner.nextInt();
        scanner.nextLine(); // Limpiar buffer
        
        Lavadora lavadora = new Lavadora(marca, modelo, precio, capacidad);
        listaElectrodomesticos.add(lavadora);
        System.out.println("Lavadora añadida correctamente.");
    }

    public static void añadirTelevision() {
        System.out.print("Ingrese la marca de la televisión: ");
        String marca = scanner.nextLine();
        System.out.print("Ingrese el modelo de la televisión: ");
        String modelo = scanner.nextLine();
        System.out.print("Ingrese el precio de la televisión: ");
        int precio = scanner.nextInt();
        System.out.print("Ingrese las pulgadas de la televisión: ");
        int pulgadas = scanner.nextInt();
        System.out.print("¿Pantalla LED? (true/false): ");
        boolean pantallaLed = scanner.nextBoolean();
        scanner.nextLine(); // Limpiar buffer
        
        Television television = new Television(marca, modelo, precio, pulgadas, pantallaLed);
        listaElectrodomesticos.add(television);
        System.out.println("Televisión añadida correctamente.");
    }

    public static void mostrarElectrodomesticos() {
        if (listaElectrodomesticos.isEmpty()) {
            System.out.println("No hay electrodomésticos registrados.");
        } else {
            for (Electrodomestico electrodomestico : listaElectrodomesticos) {
                System.out.println(electrodomestico);
            }
        }
    }

    public static void eliminarElectrodomestico() {
        System.out.print("Ingrese el índice del electrodoméstico a eliminar: ");
        int indice = scanner.nextInt();
        if (indice >= 0 && indice < listaElectrodomesticos.size()) {
            listaElectrodomesticos.remove(indice);
            System.out.println("Electrodoméstico eliminado correctamente.");
        } else {
            System.out.println("Índice no válido.");
        }
    }

    public static void buscarPorMarca() {
        System.out.print("Ingrese la marca a buscar: ");
        String marcaBuscada = scanner.nextLine();
        boolean encontrado = false;
        for (Electrodomestico electrodomestico : listaElectrodomesticos) {
            if (electrodomestico.marca.equalsIgnoreCase(marcaBuscada)) {
                System.out.println(electrodomestico);
                encontrado = true;
            }
        }
        if (!encontrado) {
            System.out.println("No se encontraron electrodomésticos de la marca " + marcaBuscada);
        }
    }
}

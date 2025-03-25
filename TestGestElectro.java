import java.util.Scanner;

public class TestGestElectro {
    public static void main(String[] args) {
        int opcion;

        do {
            System.out.println("----MENU OPCIONES----");
            System.out.println("1. Añadir lavadora");
            System.out.println("2. Añadir television");
            System.out.println("3. Mostrar electrodomesticos");
            System.out.println("4. Eliminar electrodomestico");
            System.out.println("5.Buscar electrodomestico por marca");
            System.out.println("6. Salir");
            System.out.println("Ingrese la opcion que desee: ");
            Scanner entrada = new Scanner(System.in);
            opcion = entrada.nextInt();
            entrada.nextLine(); // Limpiar buffer

            switch (opcion) {
                case 1:
                    GestElectrodomesticos.añadirLavadora();
                    break;
                case 2:
                    GestElectrodomesticos.añadirTelevision();
                    break;
                case 3:
                    GestElectrodomesticos.mostrarElectrodomesticos();
                    break;
                case 4:
                    GestElectrodomesticos.eliminarElectrodomestico();
                    break;
                case 5:
                    GestElectrodomesticos.buscarPorMarca();
                    break;
                case 6:
                    System.out.println("Saliendo...");
                    break;
                default:
                    System.out.println("Opcion no valida");
            }
        } while (opcion != 6);

    }
}

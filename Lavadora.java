public class Lavadora extends Electrodomestico implements FuncionesExtra {
    protected int capacidad;

    // Constructor
    public Lavadora(String marca, String modelo, int precio, int capacidad) {
        super(marca, modelo, precio);
        this.capacidad = capacidad;
    }

    // Implementación de encender
    @Override
    public void encender() {
        System.out.println("Lavadora " + marca + " " + modelo + " encendida.");
        this.estado = true;
    }

    // Método exclusivo de Lavadora
    public void lavar() {
        System.out.println("La ropa se ha lavado.");
    }

    // Implementación de mantenimiento
    @Override
    public void mantenimiento() {
        System.out.println("Lavadora " + marca + " " + modelo + " en mantenimiento.");
    }

    // ToString modificado
    @Override
    public String toString() {
        return "LAVADORA de marca: " + marca + ", modelo " + modelo +
               ", precio " + precio + " euros, capacidad de " + capacidad +
               " litros, estado: " + obtenerEstado();
    }
}

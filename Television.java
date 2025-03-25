public class Television extends Electrodomestico implements FuncionesExtra {
    protected int pulgadas;
    protected boolean pantallaLed;

    // Constructor
    public Television(String marca, String modelo, int precio, int pulgadas, boolean pantallaLed) {
        super(marca, modelo, precio);
        this.pulgadas = pulgadas;
        this.pantallaLed = pantallaLed;
    }

    // Implementación de encender
    @Override
    public void encender() {
        System.out.println("La TV " + marca + " " + modelo + " está encendida.");
        this.estado = true;
    }

    // Implementación de mantenimiento
    @Override
    public void mantenimiento() {
        System.out.println("TV " + marca + " " + modelo + " en mantenimiento.");
    }

    // Método específico de la clase Television para obtener el estado de la
    // pantalla LED
    public String obtenerPantallaLed() {
        if (pantallaLed) {
            return "sí";
        } else {
            return "no";
        }
    }

    // ToString modificado
    @Override
    public String toString() {
        return "TELEVISOR " + marca + ", modelo " + modelo +
                ", " + pulgadas + " pulgadas, pantalla LED: " + obtenerPantallaLed() +
                ", estado: " + obtenerEstado() +
                ", precio: " + precio + " euros.";
    }
}
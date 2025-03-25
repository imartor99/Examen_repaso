public abstract class Electrodomestico {
    protected String marca;
    protected String modelo;
    protected int precio;
    protected boolean estado; // Atributo agregado

    // Constructor
    public Electrodomestico(String marca, String modelo, int precio) {
        this.marca = marca;
        this.modelo = modelo;
        this.precio = precio;
        this.estado = false; // Inicialmente apagado
    }

    // Método abstracto para encender (cada electrodoméstico lo define a su manera)
    public abstract void encender();

    // Método para apagar (común para todos)
    public void apagar() {
        System.out.println(marca + " " + modelo + " está apagado.");
        this.estado = false;
    }

    // Método auxiliar para representar el estado como texto con un if-else
    protected String obtenerEstado() {
        if (estado) {
            return "encendido";
        } else {
            return "apagado";
        }
    }

    // ToString abstracto
    @Override
    public abstract String toString();
}

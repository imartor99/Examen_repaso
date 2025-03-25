public class MainElectrodomestico {
    public static void main(String[] args) {
       
        Lavadora lavadora = new Lavadora("Bosch", "Serie 6", 600, 8);
        Television television = new Television("Samsung", "QLED 2025", 1200, 55, true);

        // Imprimir los objetos antes de encenderlos
        System.out.println(lavadora);
        System.out.println(television);

        // Encender los electrodomésticos
        lavadora.encender();
        television.encender();

        // Imprimir los objetos después de encenderlos
        System.out.println(lavadora);
        System.out.println(television);

        // Apagar los electrodomésticos
        lavadora.apagar();
        television.apagar();

        // Imprimir los objetos después de apagarlos
        System.out.println(lavadora);
        System.out.println(television);

        // Probar el método de mantenimiento
        lavadora.mantenimiento();
        television.mantenimiento();
    }
}
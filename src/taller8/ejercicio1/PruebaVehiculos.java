package ejercicio1;

public class PruebaVehiculos {
    public static void main(String[] args) {
        Vehiculo v = new Vehiculo("Genérico", 120);
        Coche c = new Coche("Toyota", 180, 4);

        System.out.println("--- Vehículo ---");
        v.mostrarInfoVehiculo();

        System.out.println("--- Coche ---");
        c.mostrarInfoCoche();
    }
}

package ejercicio3;

public class PruebaEmpleados {
    public static void main(String[] args) {
        Empleado e = new Empleado("Luis", 2500);
        Gerente g = new Gerente("Ana", 5000, "Ventas");

        System.out.println("--- Empleado ---");
        e.mostrarDetalles();
        System.out.println("--- Gerente ---");
        g.mostrarDetalles();
    }
}

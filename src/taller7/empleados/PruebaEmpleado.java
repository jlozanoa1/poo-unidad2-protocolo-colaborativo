package empleados;

public class PruebaEmpleado {
    public static void main(String[] args) {
        Empleado e1 = new Empleado("Carlos", 2500);
        Empleado e2 = new Empleado("María", 3200);

        // nombre es público: acceso y modificación directa
        System.out.println("Nombre: " + e1.nombre);
        e1.nombre = "Carlos Pérez";

        // salario se maneja con get/set
        System.out.println("Salario: " + e1.getSalario());
        e1.setSalario(2800);
        System.out.println(e1.nombre + " ahora gana: " + e1.getSalario());

        // Validación: salario negativo
        try {
            e2.setSalario(-100);
        } catch (IllegalArgumentException ex) {
            System.out.println("Error: " + ex.getMessage());
        }
    }
}

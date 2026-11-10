package ejercicio2;

public class PruebaEstudiante {
    public static void main(String[] args) {
        Persona p = new Persona("Juan", 40);
        Estudiante e1 = new Estudiante("Laura", 20, "2024-001");
        Estudiante e2 = new Estudiante("Pedro", 22, "2024-002");

        p.mostrarDetalles();
        System.out.println("---");
        e1.mostrarDetalles();
        System.out.println("---");
        e2.mostrarDetalles();

        System.out.println("--- Polimorfismo ---");
        Persona ref = new Estudiante("Sofía", 19, "2024-003");
        ref.mostrarDetalles();
    }
}

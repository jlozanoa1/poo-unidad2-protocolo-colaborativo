package prueba;

import utilidades.Utilidades;

public class PruebaUtilidades {
    public static void main(String[] args) {
        Utilidades u = new Utilidades();

        System.out.println("10 + 5 = " + u.sumar(10, 5));
        System.out.println("10 - 5 = " + u.restar(10, 5));
        System.out.println("10 * 5 = " + u.multiplicar(10, 5));
        System.out.println("10 / 5 = " + u.dividir(10, 5));

        // Validación de resultados
        System.out.println("¿Suma correcta? " + (u.sumar(2, 3) == 5));
        System.out.println("¿Resta correcta? " + (u.restar(2, 3) == -1));

        // División entre cero
        try {
            u.dividir(7, 0);
        } catch (ArithmeticException ex) {
            System.out.println("Error: " + ex.getMessage());
        }
    }
}

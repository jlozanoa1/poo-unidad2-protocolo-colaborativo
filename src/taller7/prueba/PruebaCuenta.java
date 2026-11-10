package prueba;

import banco.CuentaBancaria;

public class PruebaCuenta {
    public static void main(String[] args) {
        CuentaBancaria c = new CuentaBancaria("001-234", 1000, "Ahorros");

        // System.out.println(c.numeroCuenta);
        // c.numeroCuenta = "999";

        System.out.println("Tipo: " + c.tipoCuenta);

        c.setSaldo(1500);
        System.out.println("Saldo: " + c.getSaldo());

        c.mostrarDetalles();
    }
}

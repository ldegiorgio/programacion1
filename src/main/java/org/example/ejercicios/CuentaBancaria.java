package org.example.ejercicios;

public class CuentaBancaria {

    private String titular;
    private double saldo;
    private int numeroCuenta;
    private static int ultimoNumero = 0;

    /**     * Constructor con titular y saldo inicial.
     * * @param titular Nombre del titular de la cuenta
     * * @param saldoInicial Monto inicial (debe ser >= 0)
     * */
    public CuentaBancaria(String titular, double saldoInicial) {
        this.titular = titular;
        this.saldo = saldoInicial >= 0 ? saldoInicial : 0;
        ultimoNumero++;
        this.numeroCuenta = ultimoNumero;
    }

    /**     * Deposita un monto en la cuenta.
     * * @param monto Cantidad a depositar (debe ser positivo)
     * */    public void depositar(double monto) {
         if (monto > 0) {
             saldo += monto;
         } else {
             System.out.println("Error: el monto debe ser positivo.");
         }
     }

     /**     * Retira un monto de la cuenta si hay saldo suficiente.
      * * @param monto Cantidad a retirar (debe ser positivo y <= saldo)
      * */
     public void retirar(double monto) {
         if (monto <= 0) {
             System.out.println("Error: el monto debe ser positivo.");
         } else if (monto > saldo) {
             System.out.println("Saldo insuficiente.");
         } else {
             saldo -= monto;
         }
     }

     public String getTitular() {
         return titular;
     }

     public double getSaldo() {
         return saldo;
     }

     public int getNumeroCuenta() {
         return numeroCuenta;
     }

     public static int getUltimoNumero() {
         return ultimoNumero;
     }

     /** Imprime el resumen de la cuenta. */
     public void imprimirResumen() {
         System.out.println("Cuenta #" + numeroCuenta
                 + " | Titular: " + titular
                 + " | Saldo: $" + saldo);
     }

}

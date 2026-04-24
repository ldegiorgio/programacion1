package org.example;

import org.example.ejercicios.CuentaBancaria;
import org.example.ejercicios.GestorAlumnos;


public class Main {
    public static void main(String[] args) {

        CuentaBancaria c1 = new CuentaBancaria("Ana López", 5000);
        c1.depositar(1500);
        c1.retirar(800);
        c1.imprimirResumen();

        CuentaBancaria c2 = new CuentaBancaria("Pedro Juarez", 3000);
        c2.depositar(0);
        c2.retirar(3500);
        c2.imprimirResumen();

        System.out.println("-----------------------------------------------------------");

        GestorAlumnos alumnos = new GestorAlumnos();
        alumnos.agregarAlumno("Ana Garcia");
        alumnos.agregarAlumno("Luis Perez");
        alumnos.agregarAlumno("Maria Lopez");
        alumnos.imprimirArrayList();

        System.out.println("-----------------------------------------------------------");

        alumnos.agregarNota("Ana Garcia", 8.5);
        alumnos.agregarNota("Luis Perez", 7.0);
        alumnos.agregarNota("Maria Lopez", 9.0);
        alumnos.buscarNotaYTotalHashMap("Ana Garcia");

    }
}
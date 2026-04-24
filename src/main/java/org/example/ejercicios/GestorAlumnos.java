package org.example.ejercicios;

import java.util.ArrayList;
import java.util.HashMap;

public class GestorAlumnos {

    private ArrayList<String> alumnos;
    HashMap<String, Double> notas;

    public GestorAlumnos() {
        alumnos = new ArrayList<>();
        notas = new HashMap<>();
    }

    public void agregarAlumno(String alumno) {
        alumnos.add(alumno);
    }

    public void agregarNota(String key, Double value) {
        notas.put(key, value);
    }

    public void imprimirArrayList() {
        for (String alumno : alumnos) {
            System.out.println(alumno);
        }
        System.out.println("Total de alumnos en arraylist = " + alumnos.size());
    }

    public void buscarNotaYTotalHashMap(String key) {
        double n = notas.get(key);
        System.out.println("Nota de " + key + " es " + n);
        System.out.println("Total de notas en el hashmap = " + notas.size());
    }

}

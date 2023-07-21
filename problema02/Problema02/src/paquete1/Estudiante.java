/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package paquete1;

/**
 *
 * @author Sistemas G Didactic
 */
public class Estudiante {

    private String nombre;
    private String apellido;
    private double calificacion1;
    private double calificacion2;
    private double calificacion3;        
    private double promedio;

    public Estudiante(String n, String a, double c1, double c2, double c3) {
        nombre = n;
        apellido = a;
        calificacion1 = c1;
        calificacion2 = c2;
        calificacion3 = c3;
    }
    

    public void establecerNombre(String n) {
        nombre = n;
    }

    public void establecerApellido(String a) {
        apellido = a;
    }

    public void establecerCalificacion1(double c1) {
        calificacion1 = c1;
    }

    public void establecerCalificacion2(double c2) {
        calificacion2 = c2;
    }

    public void establecerCalificacion3(double c3) {
        calificacion3 = c3;
    }


    public String obtenerNombre() {
        return nombre;
    }

    public String obtenerApellido() {
        return apellido;
    }

    public double obtenerCalificacion1() {
        return calificacion1;
    }

    public double obtenerCalificacion2() {
        return calificacion2;
    }

    public double obtenerCalificacion3() {
        return calificacion3;
    }

    public double obtenerPromedio() {
        return promedio = (calificacion1 + calificacion2 + calificacion3) / 3;
    }

    @Override
    public String toString() {
        String cadena = String.format("Nombre: %s\n"
                + "Apellido: %s\n"
                + "Calificacion 1: %.2f\n"
                + "Calificacion 2: %.2f\n"
                + "Calificacion 3: %.2f\n"
                + "Promedio: %.2f\n", 
                obtenerNombre(),
                obtenerApellido(),
                obtenerCalificacion1(),
                obtenerCalificacion2(),
                obtenerCalificacion3(),
                obtenerPromedio());
        return cadena;
    }
    
    


}

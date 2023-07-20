/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package paquete1;

/**
 *
 * @author SALA I
 */
public class sueldosTrabajadores {
    private String nombre;   
    private int cedula;
    private String correo;
    private double sueldo;
    private int mesSueldo;

    public sueldosTrabajadores(String n, int cd, String c, double s, int mS) {
        this.nombre = n;
        this.cedula = cd;
        this.correo = c;
        this.sueldo = s;
        this.mesSueldo = mS;
    }

    public void establecerCedula(int c) {
        cedula = c;
    }

    public void establecerNombre(String n) {
        nombre = n;
    }

    public void establecerCorreo(String c) {
        correo = c;
    }

    public void establecerSueldo(double s) {
        sueldo = s;
    }

    public void establecerMesSueldo(int x) {
        mesSueldo = x;
    }

    public int obtenerCedula() {
        return cedula;
    }

    public String obtenerNombre() {
        return nombre;
    }

    public String obtenerCorreo() {
        return correo;
    }

    public double obtenerSueldo() {
        return sueldo;
    }

    public int obtenerMesSueldo() {
        return mesSueldo;
    }
    
    
    
    @Override
    public String toString() {

        String mensaje = String.format("Nombre: %s\n"
                + "Cedula: %d\n"
                + "Correo: %s\n"
                + "Sueldo: %.2f\n\n"
                +"Meses Sueldo: %d\n", 
                obtenerNombre(),
                obtenerCedula(),
                obtenerCorreo(),
                obtenerSueldo(),
                obtenerMesSueldo());

        return mensaje;
    }
    
            
}

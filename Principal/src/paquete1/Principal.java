/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package paquete1;

import java.util.Scanner;
import java.sql.SQLException;
import java.util.Locale;

/**
 *
 * @author SALA I
 */
public class Principal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner entrada = new Scanner(System.in);
        entrada.useLocale(Locale.US);

        int cedula;
        String nombre;
        String correo;
        double sueldo;
        int mesSueldo;
        String continuar;
        Enlaces c = new Enlaces();

        do {
            System.out.println("Ingrese el nombre del trabajador");
            nombre = entrada.nextLine();
            System.out.println("Ingrese el numero de cedula del trabajador");
            cedula = entrada.nextInt();
            entrada.nextLine();
            System.out.println("Ingrese el correo del trabajador");
            correo = entrada.nextLine();
            System.out.println("Ingrese el sueldo del trabajador");
            sueldo = entrada.nextDouble();
            System.out.println("Ingrese los meses de trabajo del trabajador");
            mesSueldo = entrada.nextInt();

            sueldosTrabajadores traj = new sueldosTrabajadores(nombre, cedula,
                    correo, sueldo, mesSueldo);
            
            c.insertarTrabajador(traj);
            
            for (int i = 0; i < c.obtenerDataTrabajador().size(); i++) {
            System.out.printf("%s\n", c.obtenerDataTrabajador().get(i));
        }

            entrada.nextLine();
            System.out.println("Desea ingresar más tranajadores. Digite la "
                    + "letra S para continuar o digite la letra N para salir "
                    + "del proceso");
            continuar = entrada.nextLine();
        } while (continuar.equals("S"));

    }

}

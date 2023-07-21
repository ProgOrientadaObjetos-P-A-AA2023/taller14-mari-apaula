/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package paquete1;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

/**
 *
 * @author Sistemas G Didactic
 */
public class Enlaces {
    private Connection conn;

    public void establecerConexion() {

        try {
            
            
            String url = "jdbc:sqlite:bd/base001.base";
            
            conn = DriverManager.getConnection(url);
              

        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }

    }

    public Connection obtenerConexion() {
        return conn;
    }
    
    


    public ArrayList<Estudiante> obtenerDataEstudiante() {
        ArrayList<Estudiante> lista = new ArrayList<>();
        try {
            establecerConexion();
            Statement statement = obtenerConexion().createStatement();
            String data = "Select * from Estudiante;";

            ResultSet rs = statement.executeQuery(data);
            while (rs.next()) {
                Estudiante estudiante = new Estudiante(
                        rs.getString("nombre"), 
                        rs.getString("apellido"),
                        rs.getDouble("calificacion1"), 
                        rs.getDouble("calificacion2"),
                        rs.getDouble("calificacion3"));
                estudiante.obtenerPromedio();
                lista.add(estudiante);
            }

            obtenerConexion().close();
        } catch (SQLException e) {
            System.out.println("Exception: obtenerDataEstudiante");
            System.out.println(e.getMessage());

        }
        return lista;
    }

}


/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package paquete1;
import java.sql.Statement;
import java.sql.Connection;  
import java.sql.DriverManager;  
import java.sql.SQLException;
import java.sql.ResultSet;
import java.util.ArrayList;
/**
 *
 * @author SALA I
 */
public class Enlaces {
   
    private Connection conn;
       
    public void establecerConexion() {  

        try {  
            // db parameters  
            String url = "jdbc:sqlite:bd/Trabajadores.bd";  
            // create a connection to the database  
            conn = DriverManager.getConnection(url);  
            // System.out.println(conn.isClosed());
            // System.out.println("Connection to SQLite has been established.");  
              
        } catch (SQLException e) {  
            System.out.println(e.getMessage());  
        }   
        
    } 
    
    public Connection obtenerConexion(){
        return conn;
    }
    
    public void insertarTrabajador(sueldosTrabajadores trabajador) {  
  
        try{  
            establecerConexion();
            Statement statement = obtenerConexion().createStatement();
            String data = String.format("INSERT INTO sueldosTrabajadores (nombre, cedula, "
                    + "correo, sueldo, mesSueldo) values ('%s', %d, '%s', "
                    + "%.2f, %d)", trabajador.obtenerNombre(), 
                    trabajador.obtenerCedula(), trabajador.obtenerCorreo(), 
                    trabajador.obtenerSueldo(), trabajador.obtenerMesSueldo());
            statement.executeUpdate(data);
            obtenerConexion().close();
        } catch (SQLException e) {  
             System.out.println("Exception: insertarCiudad");
             System.out.println(e.getMessage());  
             
        }  
    }
    
    public ArrayList<sueldosTrabajadores>obtenerDataTrabajador() {  
        ArrayList<sueldosTrabajadores> lista = new ArrayList<>();
        try{  
            establecerConexion();
            Statement statement = obtenerConexion().createStatement();
            String data = "Select * from sueldosTrabajadores;";
            
            ResultSet rs = statement.executeQuery(data);
            while(rs.next()){
                sueldosTrabajadores miCiudad = new sueldosTrabajadores(
                        rs.getString("nombre"),rs.getInt("cedula"),
                        rs.getString("correo"),rs.getDouble("sueldo"), 
                        rs.getInt("mesSueldo"));
                lista.add(miCiudad);
            }
            
            obtenerConexion().close();
        } catch (SQLException e) {  
             System.out.println("Exception: insertarCiudad");
             System.out.println(e.getMessage());  
             
        }  
        return lista;
    }
     
}  


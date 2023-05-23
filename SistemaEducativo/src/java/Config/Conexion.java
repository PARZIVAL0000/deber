/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Config;
import java.io.FileNotFoundException;
import java.sql.Connection;
import java.sql.SQLException;
import java.sql.DriverManager;
/**
 *
 * @author denni
 */
public class Conexion {
    
    /*
        La conexion a la base de datos -> estudiantes....
        La tabla correspondiente es -> alumnos2C...
    */
    public Connection getConexion(){
       
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection conexion = DriverManager.getConnection("jdbc:mysql://localhost:3306/estudiantes", "root", "dennis07@");

            return conexion;
        }catch(SQLException e){
            System.out.println("");
            System.out.println(".........................******************...................");
            System.out.println("MENSAJE:  " + e.getMessage());
            System.out.println("ESTADO:  " + e.getSQLState());
            System.out.println("ERROR CODIGO:  " + e.getErrorCode());
            System.out.println(".........................******************...................");
            return null;
        }catch(ClassNotFoundException i){
            return null;
        }
        
    }
}

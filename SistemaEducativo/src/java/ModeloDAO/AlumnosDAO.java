/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ModeloDAO;
import java.util.List;
import java.util.ArrayList;
import Modelo.Alumnos;
import Interface.CRUD;
import java.sql.Connection;
import java.sql.SQLException;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import Config.Conexion;
/**
 *
 * @author denni
 */
public class AlumnosDAO implements CRUD{
    
    Connection con;
    
    public AlumnosDAO(){
        Conexion c = new Conexion();
        con = c.getConexion();
    }

    @Override
    public List<Alumnos> listarEstudiantes() {
        PreparedStatement ps;
        ResultSet rs;
        
        List<Alumnos> alumnos = new ArrayList<>();
        try{
            
            ps = con.prepareStatement("SELECT id, Cedula, Nombres FROM alumnos2C;");
            rs = ps.executeQuery();
            
            while(rs.next()){
                
                int id = rs.getInt("id");
                String cedula = rs.getString("Cedula");
                String nombres = rs.getString("NOmbres");
                
                
                Alumnos alumno = new Alumnos(id, cedula, nombres);
                alumnos.add(alumno);
            }
            
            
            return alumnos;
        }catch(SQLException e){
//            System.out.println(e.getInformac);
            return null;
        }
    }

    @Override
    public void editarEstudiante() {
    }

    @Override
    public void eliminarEstudiante() {
    }

    @Override
    public void agregarEstudiante() {
    }
    
}

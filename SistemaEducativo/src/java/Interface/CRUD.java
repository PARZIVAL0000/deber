/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package Interface;
import java.util.List;
import Modelo.Alumnos;
/**
 *
 * @author denni
 */
public interface CRUD {
    
    /**
     * Esta sera nuestro CRUD para nuestro MODELO DAO...
     */
    public List<Alumnos> listarEstudiantes();
    public void editarEstudiante();
    public void eliminarEstudiante();
    public void agregarEstudiante();
}

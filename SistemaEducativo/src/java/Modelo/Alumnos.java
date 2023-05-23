/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;

/**
 *
 * @author denni
 */
public class Alumnos {
    
    //atributos de nuestro tabla de Alumnos2C
    private int id;
    private String Cedula;
    private String Nombres;
    
    public Alumnos(int id, String Cedula, String Nombres){
        this.id = id;
        this.Cedula = Cedula;
        this.Nombres = Nombres;
    }
    
    //generamos nuestros setters.
    public void setId(int id){
        this.id = id;
    }
    public void setCedula(String cedula){
        this.Cedula = cedula;
    }
    public void setNombres(String nombres){
        this.Nombres = nombres;
    }
    //generamos nuestro getter...
    public int getId(){
        return id;
    }
    public String getCedula(){
        return Cedula;
    }
    public String getNombres(){
        return Nombres;
    }
}

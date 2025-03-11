/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejemplo_poo1.base;
import java.util.Date;
import java.util.List;
/**
 *
 * @author adsep
 */
public class Tarea {
    //PROPIEDADES
    private String descripcion;
private String tipo;
private Date FechaInicioEstimado;
private Date FechaInicioReal;
private int duracionEstimada;
private int duracionReal;
private List<Empleados> ListaDeEmpleados;
private Proyecto proyecto;
 private List<Documento> listaDeDocumentos;
 
 public Tarea () {
     
 }
    public Tarea (String d, String t) {
        descripcion = d;
        tipo = t;
        
    }
}

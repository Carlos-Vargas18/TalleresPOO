/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejemplo_poo1.base;
import  java.util.Date;
import java.util.List;
/**
 *
 * @author adsep
 */
public class Proyecto {
    //PROPIEDADES
    private String NombreClave;
private String Denominacion;
private Date FechaInicio;
private Date FechaFin;
private String  estado;
private Empresa  empresa;
private List<Empleados> ListaDeEmpleados;
private PROMOTOR empleadoPromotor;
private List<Tarea> listaDeTareas;

public Proyecto () {
    
}
public Proyecto (String NombreClave, String Denominacion) {
    this.NombreClave = NombreClave;
    this.Denominacion = Denominacion;
    
}
}

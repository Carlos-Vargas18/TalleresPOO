/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejemplo_poo1.base;

import java.util.Date;

/**
 *
 * @author adsep
 */
public class ManoDeObra {
    //PROPIEDADES
    private Empleados trabajador;
 private Proyecto  proyecto;
 private Date  FechaInicio;
 private Date FechaFin;
 private String rol;
 
 public ManoDeObra () {
     
 }
    public ManoDeObra (Empleados e, Proyecto p) {
        trabajador = e;
        proyecto = p;
    }
}

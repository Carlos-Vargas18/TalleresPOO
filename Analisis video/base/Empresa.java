/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejemplo_poo1.base;

import java.util.List;

/**
 *
 * @author adsep
 */
public class Empresa {
    //PROPIEDADES
    private String  nit;
private String  Nombre;
private String tipo;
private String web;
private int telefono;
private String Email;
private String direccion;
private List<Empleados> ListaDeEmpleados;
private List<Proyecto> ListaDeProyectos;
  
public Empresa () {
    
    
}
public Empresa ( String nit, String nombre) {
    this.nit = nit;
    this.Nombre = nombre;
    
}
}

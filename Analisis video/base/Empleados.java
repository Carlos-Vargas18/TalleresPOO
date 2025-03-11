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
public class Empleados {
    //PROPIEDADES
   protected String DNI;
 protected String Nombre;
protected String Apellido;
protected String direccion;
protected String Email;
protected String telefono;
protected Date FechaContrato;
protected Empresa empresa;
protected List<Proyecto> ListaDeProyectos;
protected List<Tarea> listaDeTareas;

public Empleados () {
    
}
public Empleados (String nombre, String apeliido) {
    this.Nombre = nombre;
    this.Apellido = apeliido;
    
}
}

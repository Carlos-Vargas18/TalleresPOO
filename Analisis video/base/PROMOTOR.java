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
public class PROMOTOR  extends Empleados {
    //PROPIEDADES
     private List<Proyecto> ListaDeProyectos;
     
     public PROMOTOR () {
         super(); 
         
     }
    public PROMOTOR (String n, String a) {
        super(n,a);
    }
}

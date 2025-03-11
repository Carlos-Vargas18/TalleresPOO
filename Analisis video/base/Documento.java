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
public class Documento {
    // PROPIEDADES
    private String Codigo;
private String descripcion;
private String tipo;
 private Tarea tarea;
 private List<Version> listaDeVersiones;
 
 public Documento () {
     
 }
    public Documento (String codigo, String desc) {
        this.Codigo = codigo;
        this.descripcion = desc;
        
    }
}

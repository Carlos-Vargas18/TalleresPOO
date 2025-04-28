/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Taller_1;
import javax.swing.*;
import java.awt.event.*;
/**
 *
 * @author vargas
 */
public class Ejercicio1 extends JFrame {
    JLabel etiNombre, etiCiudad;
    JButton btnOcultarNombre, btnVisuNombre, btnOcultarCiudad, btnVisuCiudad;

    public Ejercicio1() {
        setLayout(null);
        setTitle("Ejercicio 1");
        setSize(400, 300);

        etiNombre = new JLabel("carlos");
        etiNombre.setBounds(50, 30, 100, 20);
        add(etiNombre);

        etiCiudad = new JLabel("cartagena");
        etiCiudad.setBounds(50, 60, 100, 20);
        add(etiCiudad);

        btnOcultarNombre = new JButton("Ocultar Nombre");
        btnOcultarNombre.setBounds(50, 100, 100, 25);
        add(btnOcultarNombre);

        btnVisuNombre = new JButton("Visualizar Nombre");
        btnVisuNombre.setBounds(210, 100, 100, 25);
        add(btnVisuNombre);

        btnOcultarCiudad = new JButton("Ocultar Ciudad");
        btnOcultarCiudad.setBounds(50, 140, 100, 25);
        add(btnOcultarCiudad);

        btnVisuCiudad = new JButton("Visualizar Ciudad");
        btnVisuCiudad.setBounds(210, 140, 100, 25);
        add(btnVisuCiudad);

        // Eventos
        btnOcultarNombre.addActionListener(e -> etiNombre.setVisible(false));
        btnVisuNombre.addActionListener(e -> etiNombre.setVisible(true));
        btnOcultarCiudad.addActionListener(e -> etiCiudad.setVisible(false));
        btnVisuCiudad.addActionListener(e -> etiCiudad.setVisible(true));
    }

    public static void main(String[] args) {
        new Ejercicio1().setVisible(true);
    }
}

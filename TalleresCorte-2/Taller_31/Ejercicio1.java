/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Taller_31;
import javax.swing.*;
import java.awt.event.*;
/**
 *
 * @author vargas
 */
public class Ejercicio1 extends JFrame {
    private JTextField tfRadio;
    private JButton btnCalcularArea;
    private JLabel lblResultado;

    public Ejercicio1() {
        setTitle("Cálculo del Área del Círculo");
        setSize(300, 200);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(null);

        // Crear componentes de la ventana principal
        JLabel lblRadio = new JLabel("Radio:");
        lblRadio.setBounds(20, 20, 80, 25);
        add(lblRadio);

        tfRadio = new JTextField();
        tfRadio.setBounds(100, 20, 160, 25);
        add(tfRadio);

        btnCalcularArea = new JButton("Calcular Área");
        btnCalcularArea.setBounds(20, 60, 150, 30);
        add(btnCalcularArea);

        lblResultado = new JLabel("Área: ");
        lblResultado.setBounds(20, 100, 250, 25);
        add(lblResultado);

        // Acción para calcular el área
        btnCalcularArea.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    double radio = Double.parseDouble(tfRadio.getText());
                    double area = Math.PI * radio * radio;
                    lblResultado.setText("Área: " + area);
                } catch (NumberFormatException ex) {
                    JOptionPane.showMessageDialog(null, "Por favor, ingrese un número válido para el radio.");
                }
            }
        });

        // Mostrar la ventana de presentación al abrir la ventana principal
        addWindowListener(new WindowAdapter() {
            @Override
            public void windowOpened(WindowEvent e) {
                // Crear el cuadro de diálogo de presentación
                Ejercicio2 dialogo = new Ejercicio2(Ejercicio1.this);
                dialogo.setNombrePrograma("Cálculo del Área del Círculo");
                dialogo.setVersion("v 1.0");
                dialogo.setNombreProgramador("Su Nombre");
                dialogo.setVisible(true);
            }
        });
    }

    public static void main(String[] args) {
        Ejercicio1 ventana = new Ejercicio1();
        ventana.setLocationRelativeTo(null); // Centrar la ventana principal
        ventana.setVisible(true);
    }
}

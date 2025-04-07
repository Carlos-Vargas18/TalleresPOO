/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Administrator
 */
public class Main {
    public static void main(String[] args) {
        // Ejemplo con documentos
        ExportadorDocumento pdf = new ExportadorPDF();
        pdf.exportar("Contenido del informe");
        
        // Ejemplo con mensajería
        Mensajero email = new MensajeroEmail();
        email.enviarMensaje("cliente@empresa.com", "Su pedido ha sido enviado");
    }
}

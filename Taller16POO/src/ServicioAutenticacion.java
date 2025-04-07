/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Administrator
 */
// Interfaz de abstracción para el servicio de autenticación
interface ServicioAutenticacion {
    boolean autenticar(String usuario, String contrasena);
}

// Implementación concreta para autenticación local
class AutenticacionLocal implements ServicioAutenticacion {
    @Override
    public boolean autenticar(String usuario, String contrasena) {
        System.out.println("Autenticando localmente al usuario: " + usuario);
        // Lógica de autenticación local
        return usuario.equals("admin") && contrasena.equals("1234");
    }
}

// Implementación concreta para autenticación OAuth
class AutenticacionOAuth implements ServicioAutenticacion {
    @Override
    public boolean autenticar(String usuario, String contrasena) {
        System.out.println("Autenticando con OAuth al usuario: " + usuario);
        // Lógica de autenticación OAuth
        return usuario.contains("@") && contrasena.length() >= 8;
    }
}

// Clase de alto nivel que depende de la abstracción
class GestorAutenticacion {
    private ServicioAutenticacion servicio;
    
    public GestorAutenticacion(ServicioAutenticacion servicio) {
        this.servicio = servicio;
    }
    
    public boolean verificarCredenciales(String usuario, String contrasena) {
        return servicio.autenticar(usuario, contrasena);
    }
}

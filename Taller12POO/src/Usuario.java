/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Administrator
 */
// Clase Usuario (solo contiene datos del usuario)
class Usuario {
    private String username;
    private String password;
    
    public Usuario(String username, String password) {
        this.username = username;
        this.password = password;
    }
    
    public String getUsername() { return username; }
    public String getPassword() { return password; }
}

// Clase para autenticación
class AutenticacionService {
    public boolean autenticar(Usuario usuario, String password) {
        return usuario.getPassword().equals(password);
    }
}

// Clase para validación de credenciales
class ValidacionService {
    public boolean validarUsername(String username) {
        return username != null && username.length() >= 5;
    }
    
    public boolean validarPassword(String password) {
        return password != null && password.length() >= 8;
    }
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Administrator
 */
// Clase base Persona
class Persona {
    public void presentarse() {
        System.out.println("Soy una persona.");
    }
}

// Clase derivada Estudiante
class Estudiante extends Persona {
    private String carrera;
    
    public Estudiante(String carrera) {
        this.carrera = carrera;
    }
    
    @Override
    public void presentarse() {
        System.out.println("Soy un estudiante de " + carrera + ".");
    }
}

// Clase derivada Profesor
class Profesor extends Persona {
    private String materia;
    
    public Profesor(String materia) {
        this.materia = materia;
    }
    
    @Override
    public void presentarse() {
        System.out.println("Soy un profesor de " + materia + ".");
    }
}

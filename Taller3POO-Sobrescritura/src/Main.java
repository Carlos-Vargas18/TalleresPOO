public class Main {
    public static void main(String[] args) {
        // Ejercicio 1: Clase Persona, Estudiante y Profesor
        Persona persona = new Persona();
        Persona estudiante = new Estudiante();
        Persona profesor = new Profesor();

        persona.presentarse();    // Hola, soy una persona.
        estudiante.presentarse(); // Hola, soy un estudiante.
        profesor.presentarse();   // Hola, soy un profesor.

        // Ejercicio 2: Clase Vehiculo y Bicicleta
        Vehiculo vehiculo = new Vehiculo();
        Vehiculo bicicleta = new Bicicleta();

        vehiculo.moverse();    // El vehículo se está moviendo.
        bicicleta.moverse();   // La bicicleta está pedaleando.

        // Ejercicio 3: Uso Incorrecto de Sobrescritura
        Vehiculo coche = new Coche();
        // coche.acelerar(); // Esto generará un error de compilación porque el método no existe en Vehiculo
}}

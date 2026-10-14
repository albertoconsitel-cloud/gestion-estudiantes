/**
 * Clase que representa a un Estudiante dentro del sistema de gestión.
 * Contiene atributos básicos, un constructor y métodos para operar con ellos.
 */
public class Estudiante {
    // 1. Declaración de Atributos
    private String nombre;
    private int edad;
    private String carrera;
    private double calificacionFinal;

    // 2. Constructor para inicializar los objetos
    public Estudiante(String nombre, int edad, String carrera, double calificacionFinal) {
        this.nombre = nombre;
        this.edad = edad;
        this.carrera = carrera;
        this.calificacionFinal = calificacionFinal;
    }

    // 3. Métodos de la clase

    // Método para mostrar la información del estudiante
    public void mostrarInformacion() {
        System.out.println("----------------------------------------");
        System.out.println("Nombre: " + nombre);
        System.out.println("Edad: " + edad + " años");
        System.out.println("Carrera: " + carrera);
        System.out.println("Calificación Final: " + calificacionFinal);
    }

    // Método para evaluar si el estudiante está aprobado (calificación >= 70)
    public void evaluarAprobacion() {
        if (calificacionFinal >= 70.0) {
            System.out.println("Estado: APROBADO 🎓");
        } else {
            System.out.println("Estado: REPROBADO 📚");
        }
    }
}

// Clase base: contiene atributos y métodos comunes.
public class Empleado {
    protected String nombre;
    protected int identificador;

    public Empleado(String nombre, int identificador) {
        this.nombre = nombre;
        this.identificador = identificador;
    }

    // Método heredado por las clases derivadas.
    public void mostrarDatos() {
        System.out.println("Nombre: " + nombre);
        System.out.println("ID: " + identificador);
    }

    // Método que será sobrescrito por las clases derivadas.
    public double calcularPago() {
        return 0.0;
    }
}

// Clase derivada: reutiliza la estructura de Empleado.
public class EmpleadoPorHoras extends Empleado {
    private int horasTrabajadas;
    private double tarifaPorHora;

    public EmpleadoPorHoras(String nombre, int identificador, int horasTrabajadas, double tarifaPorHora) {
        super(nombre, identificador); // Reutiliza el constructor de la clase base.
        this.horasTrabajadas = horasTrabajadas;
        this.tarifaPorHora = tarifaPorHora;
    }

    // Sobrescribe el cálculo del pago para empleados por horas.
    @Override
    public double calcularPago() {
        return horasTrabajadas * tarifaPorHora;
    }

    // Método exclusivo de esta subclase.
    public void mostrarHoras() {
        System.out.println("Horas trabajadas: " + horasTrabajadas);
    }
}

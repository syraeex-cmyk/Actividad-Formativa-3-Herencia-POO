// Clase derivada: hereda los atributos y métodos de Empleado.
public class EmpleadoTiempoCompleto extends Empleado {
    private double sueldoMensual;

    public EmpleadoTiempoCompleto(String nombre, int identificador, double sueldoMensual) {
        super(nombre, identificador); // Invoca el constructor de la clase base.
        this.sueldoMensual = sueldoMensual;
    }

    // Sobrescribe el método de pago de la clase base.
    @Override
    public double calcularPago() {
        return sueldoMensual;
    }

    // Método exclusivo de esta subclase.
    public void mostrarTipoContrato() {
        System.out.println("Contrato: Tiempo completo");
    }
}

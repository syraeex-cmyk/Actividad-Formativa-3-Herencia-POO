// Programa principal: crea objetos y comprueba la herencia.
public class Main {
    public static void main(String[] args) {
        EmpleadoTiempoCompleto empleado1 =
                new EmpleadoTiempoCompleto("Ana Lopez", 101, 18000.00);

        EmpleadoPorHoras empleado2 =
                new EmpleadoPorHoras("Carlos Ruiz", 102, 80, 150.00);

        System.out.println("=== EMPLEADO DE TIEMPO COMPLETO ===");
        empleado1.mostrarDatos(); // Método heredado
        empleado1.mostrarTipoContrato(); // Método de la subclase
        System.out.printf("Pago: $%.2f%n", empleado1.calcularPago());

        System.out.println("\n=== EMPLEADO POR HORAS ===");
        empleado2.mostrarDatos(); // Método heredado
        empleado2.mostrarHoras(); // Método de la subclase
        System.out.printf("Pago: $%.2f%n", empleado2.calcularPago());
    }
}

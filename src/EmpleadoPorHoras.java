public class EmpleadoPorHoras extends Empleado {
    public EmpleadoPorHoras(String nombre, double salarioBase) {
        super(nombre, salarioBase);
    }

    @Override
    public double calcularSalario(int numeroHoras) {
        return super.calcularSalario(numeroHoras);
    }
}

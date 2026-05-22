import java.util.Scanner;

public class MainEmpleado {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Empleado[] empleados = new Empleado[3];

        EmpleadoFijo empleadoFijo = new EmpleadoFijo("Juan", 150);
        EmpleadoPorHoras empleadoPorHoras = new EmpleadoPorHoras("Lorena", 187);
        EmpleadoFijo empleadoFijo2 = new EmpleadoFijo("Paula", 218);

        empleados[0] = empleadoFijo;
        empleados[1] = empleadoFijo2;
        empleados[2] = empleadoPorHoras;

        for (Empleado empleado : empleados){
            System.out.println("Nombre: " + empleado.getNombre() + " -- Salario: " + empleado.calcularSalario(30));
        }

        Factura factura = new Factura(2000);
        factura.imprimir();
    }
}

import java.util.Scanner;

class Empleado {
    private String primerNombre;
    private String apellidoPaterno;
    private double salarioMensual;

    public Empleado(String primerNombre, String apellidoPaterno, double salarioMensual) {
        this.primerNombre = primerNombre;
        this.apellidoPaterno = apellidoPaterno;
        
        if (salarioMensual > 0) {
            this.salarioMensual = salarioMensual;
        } else {
            this.salarioMensual = 0;
        }
    }

    public void establecerPrimerNombre(String primerNombre) {
        this.primerNombre = primerNombre;
    }

    public String obtenerPrimerNombre() {
        return primerNombre;
    }

    public void establecerApellidoPaterno(String apellidoPaterno) {
        this.apellidoPaterno = apellidoPaterno;
    }

    public String obtenerApellidoPaterno() {
        return apellidoPaterno;
    }

    public void establecerSalarioMensual(double salarioMensual) {
        if (salarioMensual > 0) {
            this.salarioMensual = salarioMensual;
        }
    }

    public double obtenerSalarioMensual() {
        return salarioMensual;
    }

    public double obtenerSalarioAnual() {
        return salarioMensual * 12;
    }

    public void aplicarAumento(double porcentaje) {
        salarioMensual += salarioMensual * porcentaje / 100;
    }
}

public class PruebaEmpleado {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese el primer nombre del empleado 1:");
        String nombre1 = scanner.nextLine();
        System.out.println("Ingrese el apellido paterno del empleado 1:");
        String apellido1 = scanner.nextLine();
        System.out.println("Ingrese el salario mensual del empleado 1:");
        double salario1 = scanner.nextDouble();

        System.out.println("Ingrese el primer nombre del empleado 2:");
        String nombre2 = scanner.next();
        System.out.println("Ingrese el apellido paterno del empleado 2:");
        String apellido2 = scanner.next();
        System.out.println("Ingrese el salario mensual del empleado 2:");
        double salario2 = scanner.nextDouble();

        Empleado empleado1 = new Empleado(nombre1, apellido1, salario1);
        Empleado empleado2 = new Empleado(nombre2, apellido2, salario2);

        System.out.println("Salario anual de " + empleado1.obtenerPrimerNombre() + ": " + empleado1.obtenerSalarioAnual());
        System.out.println("Salario anual de " + empleado2.obtenerPrimerNombre() + ": " + empleado2.obtenerSalarioAnual());

        empleado1.aplicarAumento(10);
        empleado2.aplicarAumento(10);

        System.out.println("\nSalario anual de " + empleado1.obtenerPrimerNombre() + " después del aumento: " + empleado1.obtenerSalarioAnual());
        System.out.println("Salario anual de " + empleado2.obtenerPrimerNombre() + " después del aumento: " + empleado2.obtenerSalarioAnual());

        scanner.close();
    }
}



import java.util.Scanner;

class Cuenta {
    private String nombre;
    private double saldo;

    public Cuenta(String nombre, double saldo) {
        this.nombre = nombre;

        if (saldo > 0) {
            this.saldo = saldo;
        }
    }

    public void depositar(double montoDeposito) {
        if (montoDeposito > 0) {
            saldo += montoDeposito;
        }
    }

    public double obtenerSaldo() {
        return saldo;
    }

    public String obtenerNombre() {
        return nombre;
    }

    public void mostrarCuenta() {
        System.out.println("Nombre: " + nombre + ", Saldo: $" + saldo);
    }
}

public class PruebaCuenta {
    public static void mostrarCuenta(Cuenta cuentaAMostrar) {
        cuentaAMostrar.mostrarCuenta();
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese el nombre de la cuenta 1:");
        String nombreCuenta1 = scanner.nextLine();
        System.out.println("Ingrese el saldo inicial de la cuenta 1:");
        double saldoCuenta1 = scanner.nextDouble();

        System.out.println("Ingrese el nombre de la cuenta 2:");
        String nombreCuenta2 = scanner.next();
        System.out.println("Ingrese el saldo inicial de la cuenta 2:");
        double saldoCuenta2 = scanner.nextDouble();

        Cuenta cuenta1 = new Cuenta(nombreCuenta1, saldoCuenta1);
        Cuenta cuenta2 = new Cuenta(nombreCuenta2, saldoCuenta2);

        mostrarCuenta(cuenta1);
        mostrarCuenta(cuenta2);

        System.out.println("\nDepositando $100.00 en " + cuenta1.obtenerNombre() + "...");
        cuenta1.depositar(100.00);

        mostrarCuenta(cuenta1);
        mostrarCuenta(cuenta2);

        System.out.println("\nDepositando $20.00 en " + cuenta2.obtenerNombre() + "...");
        cuenta2.depositar(20.00);

        mostrarCuenta(cuenta1);
        mostrarCuenta(cuenta2);

        scanner.close();
    }
}
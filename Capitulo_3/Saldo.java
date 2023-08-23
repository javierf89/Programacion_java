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

    public void retirar(double montoRetiro) {
        if (montoRetiro > 0 && montoRetiro <= saldo) {
            saldo -= montoRetiro;
        } else {
            System.out.println("El monto a retirar excede el saldo de la cuenta.");
        }
    }

    public double obtenerSaldo() {
        return saldo;
    }

    public String obtenerNombre() {
        return nombre;
    }
}

public class Saldo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese el nombre de la cuenta:");
        String nombreCuenta = scanner.nextLine();

        System.out.println("Ingrese el saldo inicial de la cuenta:");
        double saldoInicial = scanner.nextDouble();

        Cuenta cuenta = new Cuenta(nombreCuenta, saldoInicial);

        System.out.println("Saldo inicial:");
        System.out.println("Nombre: " + cuenta.obtenerNombre());
        System.out.println("Saldo: $" + cuenta.obtenerSaldo());

        System.out.println("\nIngrese el monto a depositar:");
        double montoDeposito = scanner.nextDouble();
        cuenta.depositar(montoDeposito);

        System.out.println("Saldo después de depositar:");
        System.out.println("Nombre: " + cuenta.obtenerNombre());
        System.out.println("Saldo: $" + cuenta.obtenerSaldo());

        System.out.println("\nIngrese el monto a retirar:");
        double montoRetiro = scanner.nextDouble();
        saldo.retirar(montoRetiro);

        System.out.println("Saldo después de retirar:");
        System.out.println("Nombre: " + cuenta.obtenerNombre());
        System.out.println("Saldo: $" + cuenta.obtenerSaldo());

        scanner.close();
    }
}

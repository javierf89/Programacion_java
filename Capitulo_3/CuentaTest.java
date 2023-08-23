import java.util.Scanner;

class Cuenta {
    private double saldo;

    public Cuenta(double saldo) {
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
}

public class PruebaCuenta {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese el saldo inicial de la cuenta:");
        double saldoInicial = scanner.nextDouble();

        Cuenta cuenta = new Cuenta(saldoInicial);

        System.out.println("Saldo inicial:");
        System.out.println("Saldo: $" + cuenta.obtenerSaldo());

        System.out.println("\nIngrese el monto a depositar:");
        double montoDeposito = scanner.nextDouble();
        cuenta.depositar(montoDeposito);

        System.out.println("Saldo después de depositar:");
        System.out.println("Saldo: $" + cuenta.obtenerSaldo());

        System.out.println("\nIngrese el monto a retirar:");
        double montoRetiro = scanner.nextDouble();
        cuenta.retirar(montoRetiro);

        System.out.println("Saldo después de retirar:");
        System.out.println("Saldo: $" + cuenta.obtenerSaldo());

        scanner.close();
    }
}

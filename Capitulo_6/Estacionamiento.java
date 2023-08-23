import java.util.Scanner;

public class Estacionamiento {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double totalRecibos = 0.0;

        System.out.print("Ingrese la cantidad de clientes que se estacionaron ayer: ");
        int cantidadClientes = scanner.nextInt();

        for (int i = 1; i <= cantidadClientes; i++) {
            System.out.print("Ingrese las horas de estacionamiento para el cliente " + i + ": ");
            int horasEstacionado = scanner.nextInt();

            double cargoCliente = calcularCargos(horasEstacionado);
            totalRecibos += cargoCliente;

            System.out.println("Cargo para el cliente " + i + ": $" + cargoCliente);
        }

        System.out.println("Total de recibos de ayer: $" + totalRecibos);

        scanner.close();
    }

    public static double calcularCargos(int horasEstacionado) {
        double cargo = 2.0;

        if (horasEstacionado > 3) {
            cargo += 0.5 * (horasEstacionado - 3);
        }

        return Math.min(cargo, 10.0);
    }
}

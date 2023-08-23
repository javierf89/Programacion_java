public class PruebaCuentaDeAhorros {
    public static void main(String[] args) {
        CuentaDeAhorros.modificarTasaInteres(0.04); // Establecer la tasa de interés anual en 4%

        CuentaDeAhorros ahorrador1 = new CuentaDeAhorros(2000.0);
        CuentaDeAhorros ahorrador2 = new CuentaDeAhorros(3000.0);

        System.out.println("Saldo de ahorrador1 después de 12 meses:");
        for (int i = 1; i <= 12; i++) {
            ahorrador1.calcularInteresMensual();
            System.out.println("Mes " + i + ": " + ahorrador1.getSaldoAhorros());
        }

        System.out.println("Saldo de ahorrador2 después de 12 meses:");
        for (int i = 1; i <= 12; i++) {
            ahorrador2.calcularInteresMensual();
            System.out.println("Mes " + i + ": " + ahorrador2.getSaldoAhorros());
        }

        CuentaDeAhorros.modificarTasaInteres(0.05); // Establecer la tasa de interés anual en 5%

        ahorrador1.calcularInteresMensual();
        ahorrador2.calcularInteresMensual();

        System.out.println("Saldo de ahorrador1 después de 13 meses: " + ahorrador1.getSaldoAhorros());
        System.out.println("Saldo de ahorrador2 después de 13 meses: " + ahorrador2.getSaldoAhorros());
    }
}

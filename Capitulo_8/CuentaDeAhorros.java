public class CuentaDeAhorros {
    private static double tasaInteresAnual;
    private double saldoAhorros;

    public CuentaDeAhorros(double saldoAhorros) {
        this.saldoAhorros = saldoAhorros;
    }

    public double getSaldoAhorros() {
        return saldoAhorros;
    }

    public static void modificarTasaInteres(double nuevaTasaInteres) {
        tasaInteresAnual = nuevaTasaInteres;
    }

    public void calcularInteresMensual() {
        double interesMensual = (saldoAhorros * tasaInteresAnual) / 12;
        saldoAhorros += interesMensual;
    }
}

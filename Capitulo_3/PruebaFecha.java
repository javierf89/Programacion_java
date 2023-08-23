class Fecha {
    private int mes;
    private int dia;
    private int año;

    public Fecha(int mes, int dia, int año) {
        this.mes = mes;
        this.dia = dia;
        this.año = año;
    }

    public void establecerMes(int mes) {
        this.mes = mes;
    }

    public int obtenerMes() {
        return mes;
    }

    public void establecerDia(int dia) {
        this.dia = dia;
    }

    public int obtenerDia() {
        return dia;
    }

    public void establecerAño(int año) {
        this.año = año;
    }

    public int obtenerAño() {
        return año;
    }

    public void mostrarFecha() {
        System.out.printf("%d/%d/%d%n", mes, dia, año);
    }
}

public class PruebaFecha {
    public static void main(String[] args) {
        Fecha fecha = new Fecha(8, 23, 2023);

        System.out.println("Fecha inicial:");
        fecha.mostrarFecha();

        fecha.establecerMes(9);
        fecha.establecerDia(15);
        fecha.establecerAño(2023);

        System.out.println("\nFecha modificada:");
        fecha.mostrarFecha();
    }
}

import java.util.Scanner;

class Factura {
    private String numeroPieza;
    private String descripcionPieza;
    private int cantidad;
    private double precioPorArticulo;

    public Factura(String numeroPieza, String descripcionPieza, int cantidad, double precioPorArticulo) {
        this.numeroPieza = numeroPieza;
        this.descripcionPieza = descripcionPieza;
        this.cantidad = (cantidad > 0) ? cantidad : 0;
        this.precioPorArticulo = (precioPorArticulo > 0) ? precioPorArticulo : 0.0;
    }

    public void establecerNumeroPieza(String numeroPieza) {
        this.numeroPieza = numeroPieza;
    }

    public String obtenerNumeroPieza() {
        return numeroPieza;
    }

    public void establecerDescripcionPieza(String descripcionPieza) {
        this.descripcionPieza = descripcionPieza;
    }

    public String obtenerDescripcionPieza() {
        return descripcionPieza;
    }

    public void establecerCantidad(int cantidad) {
        this.cantidad = (cantidad > 0) ? cantidad : 0;
    }

    public int obtenerCantidad() {
        return cantidad;
    }

    public void establecerPrecioPorArticulo(double precioPorArticulo) {
        this.precioPorArticulo = (precioPorArticulo > 0) ? precioPorArticulo : 0.0;
    }

    public double obtenerPrecioPorArticulo() {
        return precioPorArticulo;
    }

    public double obtenerMontoFactura() {
        return cantidad * precioPorArticulo;
    }
}

public class PruebaFactura {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese el número de pieza de la factura 1:");
        String numeroPieza1 = scanner.nextLine();
        System.out.println("Ingrese la descripción de la pieza de la factura 1:");
        String descripcionPieza1 = scanner.nextLine();
        System.out.println("Ingrese la cantidad de la factura 1:");
        int cantidad1 = scanner.nextInt();
        System.out.println("Ingrese el precio por artículo de la factura 1:");
        double precioPorArticulo1 = scanner.nextDouble();

        System.out.println("Ingrese el número de pieza de la factura 2:");
        String numeroPieza2 = scanner.next();
        System.out.println("Ingrese la descripción de la pieza de la factura 2:");
        String descripcionPieza2 = scanner.next();
        System.out.println("Ingrese la cantidad de la factura 2:");
        int cantidad2 = scanner.nextInt();
        System.out.println("Ingrese el precio por artículo de la factura 2:");
        double precioPorArticulo2 = scanner.nextDouble();

        Factura factura1 = new Factura(numeroPieza1, descripcionPieza1, cantidad1, precioPorArticulo1);
        Factura factura2 = new Factura(numeroPieza2, descripcionPieza2, cantidad2, precioPorArticulo2);

        System.out.println("Factura 1:");
        System.out.println("Número de pieza: " + factura1.obtenerNumeroPieza());
        System.out.println("Descripción: " + factura1.obtenerDescripcionPieza());
        System.out.println("Cantidad: " + factura1.obtenerCantidad());
        System.out.println("Precio por artículo: " + factura1.obtenerPrecioPorArticulo());
        System.out.println("Monto total: " + factura1.obtenerMontoFactura());

        System.out.println("\nFactura 2:");
        System.out.println("Número de pieza: " + factura2.obtenerNumeroPieza());
        System.out.println("Descripción: " + factura2.obtenerDescripcionPieza());
        System.out.println("Cantidad: " + factura2.obtenerCantidad());
        System.out.println("Precio por artículo: " + factura2.obtenerPrecioPorArticulo());
        System.out.println("Monto total: " + factura2.obtenerMontoFactura());

        scanner.close();
    }
}

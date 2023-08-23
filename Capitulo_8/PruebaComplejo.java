public class PruebaComplejo {
    public static void main(String[] args) {
        Complejo complejo1 = new Complejo(3.0, 4.0);
        Complejo complejo2 = new Complejo(1.5, 2.5);

        Complejo suma = complejo1.sumar(complejo2);
        Complejo resta = complejo1.restar(complejo2);

        System.out.print("Complejo 1: ");
        complejo1.imprimir();
        System.out.print("Complejo 2: ");
        complejo2.imprimir();
        System.out.print("Suma: ");
        suma.imprimir();
        System.out.print("Resta: ");
        resta.imprimir();
    }
}

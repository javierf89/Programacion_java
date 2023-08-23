public class ExcepcionPropagacionDemo {
    public static void main(String[] args) {
        try {
            metodoExterno();
        } catch (Exception e) {
            System.out.println("Excepción capturada en el método main: " + e.getMessage());
        }
    }

    public static void metodoExterno() {
        try {
            metodoInterno();
        } catch (ArithmeticException e) {
            System.out.println("Excepción capturada en el método externo: " + e.getMessage());
        }
    }

    public static void metodoInterno() {
        int numerador = 10;
        int denominador = 0;
        int resultado;

        try {
            resultado = numerador / denominador; // División por cero
        } catch (NullPointerException e) {
            System.out.println("Excepción capturada en el método interno: " + e.getMessage());
        }

    }
}

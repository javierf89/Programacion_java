import java.util.Scanner;

public class ParImpar {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.print("Ingrese un número (0 para salir): ");
            int numero = scanner.nextInt();

            if (numero == 0) {
                break;
            }

            boolean esPar = esPar(numero);

            if (esPar) {
                System.out.println(numero + " es un número par.");
            } else {
                System.out.println(numero + " es un número impar.");
            }
        }

        scanner.close();
    }

    public static boolean esPar(int numero) {
        return numero % 2 == 0;
    }
}

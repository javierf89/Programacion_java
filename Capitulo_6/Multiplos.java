import java.util.Scanner;

public class Multiplos {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.print("Ingrese el primer número (0 para salir): ");
            int numero1 = scanner.nextInt();
            
            if (numero1 == 0) {
                break;
            }

            System.out.print("Ingrese el segundo número: ");
            int numero2 = scanner.nextInt();

            boolean esMultiplo = esMultiplo(numero1, numero2);

            if (esMultiplo) {
                System.out.println(numero2 + " es múltiplo de " + numero1);
            } else {
                System.out.println(numero2 + " no es múltiplo de " + numero1);
            }
        }

        scanner.close();
    }

    public static boolean esMultiplo(int numero1, int numero2) {
        return numero2 % numero1 == 0;
    }
}

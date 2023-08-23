import java.util.Scanner;

public class AreaCirculo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese el radio del círculo: ");
        double radio = scanner.nextDouble();

        double area = circuloArea(radio);

        System.out.println("El área del círculo es: " + area);

        scanner.close();
    }

    public static double circuloArea(double radio) {
        return Math.PI * Math.pow(radio, 2);
    }
}

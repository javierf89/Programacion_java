import java.util.Random;

public class TiroDados {
    public static void main(String[] args) {
        Random random = new Random();
        int[] frecuencias = new int[13]; // Índices 2 a 12 (ignoramos el 0 y 1)

        for (int tiro = 1; tiro <= 36000000; tiro++) {
            int dado1 = 1 + random.nextInt(6);
            int dado2 = 1 + random.nextInt(6);
            int suma = dado1 + dado2;
            frecuencias[suma]++;
        }

        System.out.println("Suma\tFrecuencia");

        for (int suma = 2; suma <= 12; suma++) {
            System.out.println(suma + "\t" + frecuencias[suma]);
        }
    }
}

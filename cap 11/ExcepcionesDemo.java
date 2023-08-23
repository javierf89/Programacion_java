import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class ExcepcionesDemo {
    public static void main(String[] args) {
        try {
            // División entre cero
            int numerador = 10;
            int denominador = 0;
            int resultado = numerador / denominador;
        } catch (ArithmeticException e) {
            System.out.println("Error: División entre cero no permitida.");
        }

        try {
            // Índice de arreglo fuera de límites
            int[] arreglo = {1, 2, 3};
            int indice = 5;
            int valor = arreglo[indice];
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Error: Índice fuera de límites.");
        }

        FileInputStream archivo = null;
        try {
            // Apertura de archivos
            archivo = new FileInputStream("archivo.txt");
            // Realizar operaciones de lectura/escritura en el archivo
        } catch (FileNotFoundException e) {
            System.out.println("Error: El archivo no se encontró.");
        } catch (IOException e) {
            System.out.println("Error: Problema de lectura/escritura en el archivo.");
        } finally {
            // Cerrar el archivo en el bloque finally para asegurar su liberación
            if (archivo != null) {
                try {
                    archivo.close();
                } catch (IOException e) {
                    System.out.println("Error al cerrar el archivo.");
                }
            }
        }
    }
}

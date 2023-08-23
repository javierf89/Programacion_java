import java.util.Scanner;

public class ProgramaSimpletron {
    public static void main(String[] args) {
        final int LEE = 10;
        final int BIFURCACERO = 42;
        final int CARGA = 20;
        final int SUMA = 30;
        final int ALMACENA = 21;
        final int ESCRIBE = 11;
        final int ALTO = 43;

        int[] memoria = new int[100];
        int acumulador = 0;
        int contadorInstrucciones = 0;
        int registroInstruccion;
        boolean ejecutando = true;

        Scanner scanner = new Scanner(System.in);

        // Ubicaciones de memoria
        memoria[9] = 0; // Número
        memoria[10] = 0; // Centinela

        // Programa en LMS
        memoria[0] = LEE + 9; // Lee número
        memoria[1] = BIFURCACERO + 9; // Bifurca cero a 9
        memoria[2] = CARGA + 9; // Carga número
        memoria[3] = SUMA + 8; // Suma número
        memoria[4] = ALMACENA + 8; // Almacena suma
        memoria[5] = LEE + 10; // Lee centinela
        memoria[6] = BIFURCACERO + 6; // Bifurca cero a 6
        memoria[7] = ESCRIBE + 8; // Escribe suma
        memoria[8] = ALTO; // Alto

        // Ejecución del programa
        while (ejecutando) {
            registroInstruccion = memoria[contadorInstrucciones];
            int codigoOperacion = registroInstruccion / 100;
            int operando = registroInstruccion % 100;

            switch (codigoOperacion) {
                case LEE:
                    System.out.print("Ingrese un número: ");
                    int numeroEntrada = scanner.nextInt();
                    memoria[operando] = numeroEntrada;
                    break;
                case BIFURCACERO:
                    if (acumulador == 0) {
                        contadorInstrucciones = operando;
                    }
                    break;
                case CARGA:
                    acumulador = memoria[operando];
                    break;
                case SUMA:
                    acumulador += memoria[operando];
                    break;
                case ALMACENA:
                    memoria[operando] = acumulador;
                    break;
                case ESCRIBE:
                    System.out.println("La suma es: " + memoria[operando]);
                    break;
                case ALTO:
                    ejecutando = false;
                    break;
            }

            contadorInstrucciones++;
        }
    }
}

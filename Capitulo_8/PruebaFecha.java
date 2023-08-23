import java.util.Scanner;

public class PruebaFecha {

    public static void main(String args[]) {

        int dia;
        int mes;
        int año;

        Fecha fecha = new Fecha(3,9,200);

        fecha.mostrarFecha();

        Scanner entrada = new Scanner(System.in);

        System.out.print("\nEscriba el número del dia: ");
        dia = entrada.nextInt();
        
        fecha.establecerDia(dia);

        System.out.print("\nEscriba el número del mes: ");
        mes = entrada.nextInt();
        fecha.establecerMes(mes);

        System.out.print("\nEscriba el año: ");
        año = entrada.nextInt();
        fecha.establecerAño(año);

        fecha.mostrarFecha();

        System.out.println();
        System.out.println();
        entrada.close();
    }
}

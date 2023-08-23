import java.util.Scanner;
public class Ejercico7_29{

public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    boolean salir = false;
    while (!salir) {
    
        System.out.println("Bienvenido al menú:");
        System.out.println("1. Opción 1");
        System.out.println("2. Opción 2");
        System.out.println("3. opcion 3");
        System.out.println("4. saliendo del menu");
        int opcion = scanner.nextInt();
        
        switch (opcion) {

            case 1:
                System.out.print("Ingrese la cantidad de términos de la serie Fibonacci: ");
                int n = scanner.nextInt();
                System.out.println("Serie Fibonacci:");
                for (int i = 0; i < n; i++) {
                    System.out.print(fibonacci(i) + " ");
                }
                System.out.println();
              
                break;
            case 2:
                int a = 0;
                int b = 1;
                int c = 0;
                
                while (true) {
                    c = a + b;
                    a = b;
                    b = c;
                    
                    if (c < 0) {
                        System.out.println("El número de Fibonacci más grande que se puede imprimir es: " + a);
                        break;
                    }
                }
               
                break;
            case 3:
                double d = 0;
                double e = 1;
                double f = 0;
                
                while (true) {
                    f = d + e;
                    d = e;
                    e = f;
                    
                    if (Double.isInfinite(e)) {
                        System.out.println("El número de Fibonacci más grande que se puede imprimir es: " + d);
                        break;
                    }
                    
                    
                }
                break;
            case 4 :
                System.out.println("Saliendo del menu");
                salir = true;
            break;
            default:
            
                System.out.println("El numero es incorrecto");
                break;
              

                
        }
        salir=false;
    }
        scanner.close();
        
}


public static int fibonacci(int n) {
    if (n <= 1) {
        return n;
    } else {
        return fibonacci(n - 1) + fibonacci(n - 2);
    }
}}

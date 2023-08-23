import java.util.Scanner;

public class SistemaReservaciones {
    public static void main(String[] args) {
        boolean[] asientos = new boolean[10]; 
        Scanner scanner = new Scanner(System.in);
        
        while (true) {
            System.out.println("Por favor escriba 1 para Primera Clase o 2 para Económico:");
            int opcion = scanner.nextInt();
            
            if (opcion == 1) {
                int asiento = asignarAsientoPrimeraClase(asientos);
                if (asiento != -1) {
                    imprimirPaseDeAbordar(asiento, "Primera Clase");
                } else {
                    System.out.println("La sección de Primera Clase está llena.");
                    System.out.println("¿Acepta ser colocado en la sección Económico? (1: Sí, 2: No)");
                    int aceptar = scanner.nextInt();
                    if (aceptar == 1) {
                        asiento = asignarAsientoEconomico(asientos);
                        if (asiento != -1) {
                            imprimirPaseDeAbordar(asiento, "Económico");
                        } else {
                            System.out.println("La sección Económico también está llena.");
                            System.out.println("El próximo vuelo sale en 3 horas.");
                            break;
                        }
                    } else {
                        System.out.println("El próximo vuelo sale en 3 horas.");
                        break;
                    }
                }
            } else if (opcion == 2) {
                int asiento = asignarAsientoEconomico(asientos);
                if (asiento != -1) {
                    imprimirPaseDeAbordar(asiento, "Económico");
                } else {
                    System.out.println("La sección Económico está llena.");
                    System.out.println("¿Acepta ser colocado en la sección de Primera Clase? (1: Sí, 2: No)");
                    int aceptar = scanner.nextInt();
                    if (aceptar == 1) {
                        asiento = asignarAsientoPrimeraClase(asientos);
                        if (asiento != -1) {
                            imprimirPaseDeAbordar(asiento, "Primera Clase");
                        } else {
                            System.out.println("La sección de Primera Clase también está llena.");
                            System.out.println("El próximo vuelo sale en 3 horas.");
                            break;
                        }
                    } else {
                        System.out.println("El próximo vuelo sale en 3 horas.");
                        break;
                    }
                }
            } else {
                System.out.println("Opción inválida. Por favor, seleccione 1 o 2.");
            }
        }
        scanner.close();
    }
    
    public static int asignarAsientoPrimeraClase(boolean[] asientos) {
        for (int i = 0; i < 5; i++) {
            if (!asientos[i]) {
                asientos[i] = true;
                return i + 1;
            }
        }
        return -1; 
    }
    
    public static int asignarAsientoEconomico(boolean[] asientos) {
        for (int i = 5; i < 10; i++) {
            if (!asientos[i]) {
                asientos[i] = true;
                return i + 1;
            }
        }
        return -1; 
    }
    
    public static void imprimirPaseDeAbordar(int asiento, String seccion) {
        System.out.println("\n************ PASE DE ABORDAR ************");
        System.out.printf("Asiento: %d\n", asiento);
        System.out.printf("Sección: %s\n", seccion);
        System.out.println("*****************************************");
    }
}

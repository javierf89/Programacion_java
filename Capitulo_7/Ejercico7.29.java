
public class ejercicio7.29{

public static void main(String[] args) {
    private int menu;
    



    if (menu==1) {
        
        int n = 10; // Número de términos de la serie Fibonacci a generar

        System.out.println("Serie Fibonacci:");
        for (int i = 0; i < n; i++) {
            System.out.print(fibonacci(i) + " ");
        }
        public static int fibonacci(int n) {
            if (n <= 1) {
                return n;
            } else {
                return fibonacci(n - 1) + fibonacci(n - 2);
            }
        }
    }
    } 
    if (menu==2){
        System.out.println("Mes inválido");
    }
    if (menu==3){


    }
    else{
        System.out.println("Numero invalido");
    }
}
}
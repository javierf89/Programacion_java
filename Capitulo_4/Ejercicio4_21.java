import java.util.Scanner;
public class Ejercicio4_21 {
    public static void main(String args[]) {
         Scanner z=new Scanner(System.in);
        
         int numero;
         int contador=1;
         int mayor;
        
         System.out.printf("\nIngrese un valor entero %d: ", contador++);
         mayor=z.nextInt();

         while (10>=contador){

             System.out.printf("\nIngrese un valor entero %d: ", contador++);
             numero=z.nextInt();

             if (numero>mayor){
                mayor=numero;
             }
         }

         System.out.printf("\nNúmero mayor: %d\n", mayor);
         
    }
}

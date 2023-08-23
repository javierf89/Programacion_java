import java.util.Scanner;
public class Ejercicio2_28 {
    public static void main(String args[]) {
         int rd;
         Scanner z=new Scanner(System.in);
        
         System.out.print("Ingrese el radio del circulo: ");
         rd=z.nextInt();
         
         System.out.printf("Diametro: %d \nCircunferencia: %f \nÁrea: %f", 2*rd,2*(Math.PI*rd),Math.PI*(rd^2));
    }
}

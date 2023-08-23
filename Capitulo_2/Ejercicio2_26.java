import java.util.Scanner;
public class Ejercicio2_26 {
    public static void main(String args[]) {
         int x1,x2;
         Scanner z=new Scanner(System.in);
       
         System.out.println("Valor 1: ");
         x1=z.nextInt();
         System.out.println("Valor 2: ");
         x2=z.nextInt();
         
         if (x1%x2!=0){
             System.out.printf("%d%s%d",x2," no es un múltiplo de ",x1);
         }else{
             System.out.printf("%d%s%d",x2," es un múltiplo de ",x1);
         }
    }
}

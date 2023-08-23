import java.util.Scanner;
public class Ejercicio2_16 {
    public static void main(String args[]) {
         Scanner z=new Scanner(System.in);
         int x1,x2;
         
         System.out.println("Valor 1: ");
         x1=z.nextInt();
         System.out.println("Valor 2: ");
         x2=z.nextInt();
         
         if (x1>x2){
             System.out.printf("%d%s",x1," Es más grande.");
         }else if(x1==x2){
             System.out.printf("Estos números son iguales");
         }   
    }
}

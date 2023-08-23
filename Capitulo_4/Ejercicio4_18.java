import java.util.Scanner;
public class Ejercicio4_18 {
    public static void main(String args[]) {
         Scanner z=new Scanner(System.in);
        
         
         System.out.println("Número de cuenta del cliente: ");
         int cta=z.nextInt();
         System.out.println("Saldo iniclal : ");
         int sldi=z.nextInt();
         System.out.println("Total de artículos cargados en el mes: ");
         int ta=z.nextInt();
         System.out.println("Total de créditos ingresados en el mes: ");
         int tc=z.nextInt();
         System.out.println("Límite de créditos: ");
         int lt=z.nextInt();
         
         int slt=sldi+ta-tc;
         
         if (slt>lt){
             System.out.printf("Saldo actualizado: %d ",slt);
             System.out.println("");
             System.out.println("Se excedio el límite de su credito");
         }else{
             System.out.printf("Saldo actualizado: %d",slt);
         }
    }
}

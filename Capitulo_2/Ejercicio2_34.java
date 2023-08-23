import java.util.Scanner;
public class Ejercicio2_34 {
    public static void main(String args[]) {
         Scanner z=new Scanner(System.in);
         double tp,pm;
        
         System.out.println("Ingrese la Población mundial actual: ");
         pm=z.nextFloat();
         System.out.println("Ingrese la tasa de crecimiento de la población (Ej: 1.3): ");
         tp=z.nextFloat();
       
         double a1=pm*((tp/100)+1);
         double a2=a1*((tp/100)+1);
         double a3=a2*((tp/100)+1);
         double a4=a3*((tp/100)+1);
         double a5=a4*((tp/100)+1);
         
         System.out.printf("Población mundial en 1 año: %f\n",a1);
         System.out.printf("Población mundial en 2 año: %f\n",a2);
         System.out.printf("Población mundial en 3 año: %f\n",a3);
         System.out.printf("Población mundial en 4 año: %f\n",a4);
         System.out.printf("Población mundial en 5 año: %f\n",a5);
    }
}

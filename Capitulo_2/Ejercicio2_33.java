import java.util.Scanner;
import java.text.DecimalFormat;
public class Ejercicio2_33 {
    public static void main(String args[]) {
         DecimalFormat v=new DecimalFormat("0.00");
         Scanner z=new Scanner(System.in);
        
         System.out.println("---------------------------------------------------------------------------------"); 
         System.out.println("---------------------------------------------------------------------------------"); 
         System.out.println("---------Calculadora del Índice de Masa Corporal---------");
         System.out.println("---------------------------------------------------------------------------------"); 
         System.out.println("---------------------------------------------------------------------------------"); 
         System.out.println(""); 
        
        
         System.out.println("Ingrese su peso actual (Kg): ");
         double kg=z.nextDouble();
         System.out.println("Ingrese su altura (Metros): ");
         double hg=z.nextDouble();
        
         double bmi=kg/(hg*hg);
        
         System.out.println(""); 
         System.out.println("---------------------------------------------------------------------------------");
         System.out.println("-----------------------------Valores de BMI-----------------------------"); 
         System.out.println("---------------------------------------------------------------------------------"); 
         System.out.println("--------------------Bajo peso: menos de 18.5--------------------");
         System.out.println("--------------------Normal: entre 18.5 y 14.9----------------------");
         System.out.println("--------------------Sobrepeso: entre 28 y 29.9-------------------");
         System.out.println("--------------------Obeso: 30 o más-----------------------------------");
         System.out.println("----------------------------------------------------------------------------------");
         System.out.println("");
         System.out.println("Su Indice de Masa Corporal: "+v.format(bmi));
         
    }
}
